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
	
	private Hotel hotel1;
	private Room room1;
	private Hotel hotel2;
	private Room room2;
	private Hotel hotel3;
	private Room room3;

	
	private int step = 1;
	private int page = 0;
	private int hotelSelected;
	
	private int indice;
	
	private static HotelControllerWeb istance = null;
	
	
	public static HotelControllerWeb getIstance() {
		if (istance == null) {
			istance = new HotelControllerWeb();
		}
		return istance;
	}


	 private HotelControllerWeb() {
	
		this.hotel1 = new Hotel();
		this.room1 = new Room();
		this.hotel2 = new Hotel();
		this.room2 = new Room();
		this.hotel3 = new Hotel();
		this.room3 = new Room();
	 }
	
	public void changeScene2(int index, HotelBeanWeb bean){
		
		int budget = 1000;
		
			if (bean.isBudget1()){
				budget = 100;
			}
			if (bean.isBudget2()){
				budget = 150;
			}
			if (bean.isBudget3()){
				budget = 200;
			}
			if (bean.isBudget4()){
				budget = 1000;
			}
		
			int stars = 0;
		
			if (bean.getStar5()){
				stars = 5;
			}
			if (bean.getStar4()){
				stars = 4;
			}
			if (bean.getStar3()){
				stars = 3;
			}
			if (bean.getStar2()){
				stars = 2;
			}
			if (bean.getStar1()){
				stars = 1;
			}

			boolean valid = true;
			
		
			try {
				
				while (valid) {
					
					index++;
					hotel1 = HotelDao.searchHotel(bean, stars, index);

					if (hotel1.getHotelName() != null) {
						int roomIndex = 1;
						
						try {
							while (true) {
								room1 = RoomDao.searchRoom(hotel1.getHotelRooms(), bean.getNumPeople(), budget, roomIndex);
								if (room1.getRoomId() == 0) {
									break;
								}
								
								LocalDate day = bean.getLocalDateIn();
								day = day.plusDays(-1);
								
								int dayIndex = 0;
								
								boolean validRoom = false;
								
								while (dayIndex<=bean.getDays()) {
									
									day = day.plusDays(1);
									
									int date = (day.getYear()*10000) + (day.getMonth().getValue()*100) + (day.getDayOfMonth());
									
									Reservation reservation1 = ReservationDao.searchReservation(hotel1.getHotelAgenda(), room1.getRoomId(), date);
									if (room1.getRoomId() == reservation1.getReservationId()) {
										validRoom = false;
										break;
									
									} else {
										dayIndex++;
										validRoom = true;
									}
								}
								
								if (!validRoom) {
									roomIndex++;
								} else {
									valid = false;
									
									if (indice < index) {
										setPage(page+1);
									} else {
										setPage(page-1);
									}
									
									setIndice(index);
									break;							
								}
							} 
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					} else {
						
						if (index != 1) {
							//change = false;
						}
						break;
					}	
				}  
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			valid = true;
			
			try {
				
				while (valid) {
					
					index++;
					
					hotel2 = HotelDao.searchHotel(bean, stars, index);
					
					if (hotel2.getHotelName() != null) {
						
						int roomIndex = 1;
						
						try {
							while (true) {
								room2 = RoomDao.searchRoom(hotel2.getHotelRooms(), bean.getNumPeople(), budget, roomIndex);
								if (room2.getRoomId() == 0) {
									break;
								}
								
								LocalDate day = bean.getLocalDateIn();
								day = day.plusDays(-1);
								
								int dayIndex = 0;
								
								boolean validRoom = false;
								
								while (dayIndex<=bean.getDays()) {
									
									day = day.plusDays(1);
									
									int date = (day.getYear()*10000) + (day.getMonth().getValue()*100) + (day.getDayOfMonth());
									
									Reservation reservation2 = ReservationDao.searchReservation(hotel2.getHotelAgenda(), room2.getRoomId(), date);
									if (room2.getRoomId() == reservation2.getReservationId()) {
										validRoom = false;
										break;
									
									} else {
										dayIndex++;
										validRoom = true;
									}
								}
								
								if (!validRoom) {
									roomIndex++;
								} else {
									valid = false;
									setIndice(index);
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
			
			valid = true;
			
			try {
				
				while (valid) {
					
					index++;
					
					hotel3 = HotelDao.searchHotel(bean, stars, index);
					
					if (hotel3.getHotelName() != null) {
						
						int roomIndex = 1;
						
						try {
							while (true) {
								room3 = RoomDao.searchRoom(hotel3.getHotelRooms(), bean.getNumPeople(), budget, roomIndex);
								if (room3.getRoomId() == 0) {
									break;
								}
								
								LocalDate day = bean.getLocalDateIn();
								day = day.plusDays(-1);
								
								int dayIndex = 0;
								
								boolean validRoom = false;
								
								while (dayIndex<=bean.getDays()) {
									
									day = day.plusDays(1);
									
									int date = (day.getYear()*10000) + (day.getMonth().getValue()*100) + (day.getDayOfMonth());
									
									Reservation reservation3 = ReservationDao.searchReservation(hotel3.getHotelAgenda(), room3.getRoomId(), date);
									if (room3.getRoomId() == reservation3.getReservationId()) {
										validRoom = false;
										break;
									
									} else {
										dayIndex++;
										validRoom = true;
									}
								}
								
								if (!validRoom) {
									roomIndex++;
								} else {
									valid = false;
									setIndice(index);
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
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	
	public void viewReviews(String reviewTable, int indice, ReviewBean reviewBean) {
		
		//ProfileController profileController = ProfileController.getIstance(pane);
		
		Review r1 = null;
		Review r2 = null;
		Review r3 = null;
		
		
		try {
			indice++;
			r1 = ReviewDao.getReview(reviewTable, indice);
			reviewBean.getReviewList().add(0,r1);
			indice++;
			r2 = ReviewDao.getReview(reviewTable, indice);
			reviewBean.getReviewList().add(1,r2);
			indice++;
			r3 = ReviewDao.getReview(reviewTable, indice);
			reviewBean.getReviewList().add(2, r3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		reviewBean.setIndex(indice);
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
		return hotel1;
	}

	public void setHotel1(Hotel hotel1) {
		this.hotel1 = hotel1;
	}
	
	public Hotel getHotel2() {
		return hotel2;
	}

	public void setHotel2(Hotel hotel2) {
		this.hotel2 = hotel2;
	}
	
	public Hotel getHotel3() {
		return hotel3;
	}

	public void setHotel3(Hotel hotel3) {
		this.hotel3 = hotel3;
	}

	public Room getRoom1() {
		return room1;
	}

	public void setRoom1(Room room1) {
		this.room1 = room1;
	}

	public Room getRoom2() {
		return room2;
	}

	public void setRoom2(Room room2) {
		this.room2 = room2;
	}

	public Room getRoom3() {
		return room3;
	}

	public void setRoom3(Room room3) {
		this.room3 = room3;
	}
	

}
