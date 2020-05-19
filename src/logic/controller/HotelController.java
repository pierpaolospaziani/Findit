package logic.controller;

import java.nio.Buffer;
import java.time.LocalDate;

import javafx.scene.layout.AnchorPane;
import logic.bean.HotelBean;
import logic.model.Hotel;
import logic.model.HotelDao;
import logic.model.Reservation;
import logic.model.ReservationDao;
import logic.model.Room;
import logic.model.RoomDao;
import logic.view.Hotel2Scene;
import logic.view.HotelScene;

public class HotelController {
	
	private HotelScene hotelScene;
	private Hotel2Scene hotel2Scene;
	private HotelBean bean;
	private Hotel hotel1;
	private Room room1;
	private Reservation reservation1;
	private Hotel hotel2;
	private Room room2;
	private Reservation reservation2;
	private Hotel hotel3;
	private Room room3;
	private Reservation reservation3;
	private AnchorPane pane;
	
	public HotelController(AnchorPane pane) {
	
		this.bean = new HotelBean();
		this.hotel1 = new Hotel();
		this.room1 = new Room();
		this.hotel2 = new Hotel();
		this.room2 = new Room();
		this.hotel3 = new Hotel();
		this.room3 = new Room();
		this.pane = pane;
	}
	
	public void changeScene(){
		
		hotelScene = new HotelScene(this,bean);
		
		pane.getChildren().clear();
		pane.getChildren().add(hotelScene);
	}
	
	public void changeScene2(){
		
		int budget = 1000;
		
		if (bean.isBudget3()){
			budget = 200;
		} else if (bean.isBudget2()){
			budget = 150;
		} else if (bean.isBudget1()){
			budget = 100;
		}
		
		try {
			hotel1 = HotelDao.searchHotel(bean.getCity(), 1);
			
			if (hotel1.getName() != null) {
				
				int roomIndex = 1;
				
				try {
					while (true) {
						room1 = RoomDao.searchRoom(hotel1.getRooms(), bean.getNumPeople(), budget, roomIndex);
						System.out.println("Proviamo la stanza con ID: " + room1.getRoomId());
						if (room1.getRoomId() == 0) {
							System.out.println("Non c'ho stanze!");
							break;
						}
						
						LocalDate day = bean.getLocalDateIn();
						day = day.plusDays(-1);
						
						int dayIndex = 0;
						
						boolean validRoom = false;
						
						while (dayIndex<=bean.getDays()) {
							
							day = day.plusDays(1);
							System.out.println(day);
							
							int date = (day.getYear()*10000) + (day.getMonth().getValue()*100) + (day.getDayOfMonth());
							
							reservation1 = ReservationDao.searchReservation(hotel1.getAgenda(), room1.getRoomId(), date);
							if (room1.getRoomId() == reservation1.getReservationId()) {
								System.out.println("E' prenotata, prova un'altra");
								validRoom = false;
								break;
							
							} else {
								System.out.println("Non è prenotata");
								dayIndex++;
								validRoom = true;
							}
						}
						
						if (validRoom == false) {
							System.out.println("Stanza non buona");
							roomIndex++;
						} else {
							System.out.println("Stanza buona");
							break;							
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			hotel2 = HotelDao.searchHotel(bean.getCity(), 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			hotel3 = HotelDao.searchHotel(bean.getCity(), 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * devo passarci gli hotel per popolare le righe
		 */
		hotel2Scene = new Hotel2Scene(this,bean);
		
		pane.getChildren().clear();
		pane.getChildren().add(hotel2Scene);
	}

	public void hotelUpdate(String city, int index) {
		/*
		 * qua farei la parte di aggiornamento 
		 * della schermata hotel2 quando clicki 
		 * per girare pagina
		 */
	}
}
