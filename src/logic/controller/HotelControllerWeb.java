package logic.controller;

import java.time.LocalDate;

import logic.dao.ReviewDao;
import logic.model.Review;
import logic.bean.HotelBeanWeb;
import logic.bean.ReviewBean;
import logic.model.Hotel;
import logic.dao.ExperienceDao;
import logic.dao.HotelDao;
import logic.model.Reservation;
import logic.dao.ReservationDao;
import logic.model.Room;
import logic.model.UserWeb;
import logic.dao.RoomDao;


public class HotelControllerWeb {
	
	private Hotel hotel1Web;
	private Room room1Web;
	private Hotel hotel2Web;
	private Room room2Web;
	private Hotel hotel3Web;
	private Room room3Web;

	
	private int step = 1;
	private int page = 0;
	private int hotelSelected;
	
	private int indiceWeb;
	
	private static HotelControllerWeb istance = null;
	
	
	public static HotelControllerWeb getIstance() {
		if (istance == null) {
			istance = new HotelControllerWeb();
		}
		return istance;
	}


	 private HotelControllerWeb() {
	
		this.hotel1Web = new Hotel();
		this.room1Web = new Room();
		this.hotel2Web = new Hotel();
		this.room2Web = new Room();
		this.hotel3Web = new Hotel();
		this.room3Web = new Room();
	 }
	
	public void changeScene2(int indexWeb, HotelBeanWeb beanWeb){
		
		int budgetWeb = 1000;
		
			if (beanWeb.isBudget1()){
				budgetWeb = 100;
			}
			if (beanWeb.isBudget2()){
				budgetWeb = 150;
			}
			if (beanWeb.isBudget3()){
				budgetWeb = 200;
			}
			if (beanWeb.isBudget4()){
				budgetWeb = 1000;
			}
		
			int starsWeb = 0;
		
			if (beanWeb.getStar5()){
				starsWeb = 5;
			}
			if (beanWeb.getStar4()){
				starsWeb = 4;
			}
			if (beanWeb.getStar3()){
				starsWeb = 3;
			}
			if (beanWeb.getStar2()){
				starsWeb = 2;
			}
			if (beanWeb.getStar1()){
				starsWeb = 1;
			}

			boolean validWeb = true;
			
		
			try {
				
				while (validWeb) {
					
					indexWeb++;
					
					hotel1Web = HotelDao.searchHotel(beanWeb, starsWeb, indexWeb);

					if (hotel1Web.getHotelName() != null) {
						int roomIndexWeb1 = 1;
						
						try {
							while (true) {
								room1Web = RoomDao.searchRoom(hotel1Web.getHotelRooms(), beanWeb.getNumPeople(), budgetWeb, roomIndexWeb1);
								if (room1Web.getRoomId() == 0) {
									break;
								}
								
								LocalDate dayWeb = beanWeb.getLocalDateIn();
								dayWeb = dayWeb.plusDays(-1);
								
								int dayIndexWeb = 0;
								
								boolean validRoomWeb = false;
								
								while (dayIndexWeb<=beanWeb.getDays()) {
									
									dayWeb = dayWeb.plusDays(1);
									
									int dateWeb = (dayWeb.getYear()*10000) + (dayWeb.getMonth().getValue()*100) + (dayWeb.getDayOfMonth());
									
									Reservation reservation1Web = ReservationDao.searchReservation(hotel1Web.getHotelAgenda(), room1Web.getRoomId(), dateWeb);
									if (room1Web.getRoomId() == reservation1Web.getReservationId()) {
										validRoomWeb = false;
										break;
									
									} else {
										dayIndexWeb++;
										validRoomWeb = true;
									}
								}
								
								if (!validRoomWeb) {
									roomIndexWeb1++;
								} else {
									validWeb = false;
									
									if (indiceWeb < indexWeb) {
										setPage(page+1);
									} else {
										setPage(page-1);
									}
									
									setIndice(indexWeb);
									break;							
								}
							} 
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					} else {
						
						if (indexWeb != 1) {
							//change = false;
						}
						break;
					}	
				}  
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			validWeb = true;
			
			try {
				
				while (validWeb) {
					
					indexWeb++;
					
					hotel2Web = HotelDao.searchHotel(beanWeb, starsWeb, indexWeb);
					
					if (hotel2Web.getHotelName() != null) {
						
						int roomIndexWeb2 = 1;
						
						try {
							while (true) {
								room2Web = RoomDao.searchRoom(hotel2Web.getHotelRooms(), beanWeb.getNumPeople(), budgetWeb, roomIndexWeb2);
								if (room2Web.getRoomId() == 0) {
									break;
								}
								
								LocalDate dayWeb = beanWeb.getLocalDateIn();
								dayWeb = dayWeb.plusDays(-1);
								
								int dayIndexWeb = 0;
								
								boolean validRoomWeb = false;
								
								while (dayIndexWeb<=beanWeb.getDays()) {
									
									dayWeb = dayWeb.plusDays(1);
									
									int date = (dayWeb.getYear()*10000) + (dayWeb.getMonth().getValue()*100) + (dayWeb.getDayOfMonth());
									
									Reservation reservation2Web = ReservationDao.searchReservation(hotel2Web.getHotelAgenda(), room2Web.getRoomId(), date);
									if (room2Web.getRoomId() == reservation2Web.getReservationId()) {
										validRoomWeb = false;
										break;
									
									} else {
										dayIndexWeb++;
										validRoomWeb = true;
									}
								}
								
								if (!validRoomWeb) {
									roomIndexWeb2++;
								} else {
									validWeb = false;
									setIndice(indexWeb);
									break;							
								}
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					} else {
						break;				
					}	
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			validWeb = true;
			
			try {
				
				while (validWeb) {
					
					indexWeb++;
					
					hotel3Web = HotelDao.searchHotel(beanWeb, starsWeb, indexWeb);
					
					if (hotel3Web.getHotelName() != null) {
						
						int roomIndexWeb3 = 1;
						
						try {
							while (true) {
								room3Web = RoomDao.searchRoom(hotel3Web.getHotelRooms(), beanWeb.getNumPeople(), budgetWeb, roomIndexWeb3);
								if (room3Web.getRoomId() == 0) {
									break;
								}
								
								LocalDate dayWeb = beanWeb.getLocalDateIn();
								dayWeb = dayWeb.plusDays(-1);
								
								int dayIndexWeb = 0;
								
								boolean validRoomWeb = false;
								
								while (dayIndexWeb<=beanWeb.getDays()) {
									
									dayWeb = dayWeb.plusDays(1);
									
									int dateWeb = (dayWeb.getYear()*10000) + (dayWeb.getMonth().getValue()*100) + (dayWeb.getDayOfMonth());
									
									Reservation reservation3Web = ReservationDao.searchReservation(hotel3Web.getHotelAgenda(), room3Web.getRoomId(), dateWeb);
									if (room3Web.getRoomId() == reservation3Web.getReservationId()) {
										validRoomWeb = false;
										break;
									
									} else {
										dayIndexWeb++;
										validRoomWeb = true;
									}
								}
								
								if (!validRoomWeb) {
									roomIndexWeb3++;
								} else {
									validWeb = false;
									setIndice(indexWeb);
									break;							
								}
							}
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					} else {
						break;				
					}	
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	public int getIndice() {
		return indiceWeb;
	}

	public void setIndice(int indice) {
		this.indiceWeb = indice;
	}
	
	
	public void viewReviews(String reviewTable, int indice, ReviewBean reviewBeanWeb) {
		
		//ProfileController profileController = ProfileController.getIstance(pane);
		
		Review r1Web = null;
		Review r2Web = null;
		Review r3Web = null;
		
		
		try {
			indice++;
			r1Web = ReviewDao.getReview(reviewTable, indice);
			reviewBeanWeb.getReviewList().add(0,r1Web);
			indice++;
			r2Web = ReviewDao.getReview(reviewTable, indice);
			reviewBeanWeb.getReviewList().add(1,r2Web);
			indice++;
			r3Web = ReviewDao.getReview(reviewTable, indice);
			reviewBeanWeb.getReviewList().add(2, r3Web);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		reviewBeanWeb.setIndex(indice);
	}
	
	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getHotelSelected() {
		return hotelSelected;
	}

	public void setHotelSelected(int hotelSelected) {
		this.hotelSelected = hotelSelected;
	}

	
	public boolean setReservation(Hotel hotel, Room room, HotelBeanWeb bean, UserWeb user) {	
		
			LocalDate day = bean.getLocalDateIn();
			day = day.plusDays(-1);
			
			int dayIndex = 0; 
			
			try {

				while (dayIndex<=bean.getDays()) {
					
					day = day.plusDays(1);
					
					int date = (day.getYear()*10000) + (day.getMonth().getValue()*100) + (day.getDayOfMonth());
					
					ReservationDao.setReservation(hotel.getHotelAgenda(), room.getRoomId(), date, user.getUsername());
					
					dayIndex++;
					
				}

				LocalDate dayIn = bean.getLocalDateIn();
				int dateIn = (dayIn.getYear()*10000) + (dayIn.getMonth().getValue()*100) + (dayIn.getDayOfMonth());
				LocalDate dayOut = bean.getLocalDateOut();
				int dateOut = (dayOut.getYear()*10000) + (dayOut.getMonth().getValue()*100) + (dayOut.getDayOfMonth());
				
				ExperienceDao.setExperienceRow(user.getReviewsTable(), hotel.getHotelName(), dateIn, dateOut);
				
				return true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		return false;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Hotel getHotel1() {
		return hotel1Web;
	}

	public void setHotel1(Hotel hotel1) {
		this.hotel1Web = hotel1;
	}
	
	public Hotel getHotel2() {
		return hotel2Web;
	}

	public void setHotel2(Hotel hotel2) {
		this.hotel2Web = hotel2;
	}
	
	public Hotel getHotel3() {
		return hotel3Web;
	}

	public void setHotel3(Hotel hotel3) {
		this.hotel3Web = hotel3;
	}

	public Room getRoom1() {
		return room1Web;
	}

	public void setRoom1(Room room1) {
		this.room1Web = room1;
	}

	public Room getRoom2() {
		return room2Web;
	}

	public void setRoom2(Room room2) {
		this.room2Web = room2;
	}

	public Room getRoom3() {
		return room3Web;
	}

	public void setRoom3(Room room3) {
		this.room3Web = room3;
	}
	

}
