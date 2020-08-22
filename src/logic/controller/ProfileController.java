package logic.controller;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import logic.bean.HotelBean;
import logic.bean.LoginBean;
import logic.dao.ExperienceDao;
import logic.dao.HotelDao;
import logic.dao.OwnerDao;
import logic.dao.ReviewDao;
import logic.dao.RoomDao;
import logic.dao.StructureDao;
import logic.model.Experience;
import logic.model.Hotel;
import logic.model.Login;
import logic.model.Owner;
import logic.model.Review;
import logic.model.Structure;
import logic.model.User;
import logic.view.AddRoomScene;
import logic.view.AddDescriptionScene;
import logic.view.HotelRegistrationScene;
import logic.view.LogWindow;
import logic.view.ProfileScene;
import logic.view.StructureScene;
import logic.view.User2Scene;
import logic.view.ViewReviewWindow;
import logic.view.WriteReviewWindow;


public class ProfileController {

	private ProfileScene profileScene;
	private User2Scene userScene;
	private LogWindow window;
	private AnchorPane pane;
	private Login login;
	private LoginBean bean;
	private User user;
	private Owner owner;

	private int page = 0;
	private int indice;
	
	private boolean booking = false;
	
	public void setBooking(boolean booking) {
		this.booking = booking;
	}

	private static ProfileController istance = null;
	
	public static ProfileController getIstance(AnchorPane pane) {
		if (istance == null) {
			istance = new ProfileController(pane);
		}
		return istance;
	}

	private ProfileController(AnchorPane pane) {
		this.login = new Login();
		this.bean = new LoginBean();
		this.user = User.getIstance();
		this.owner = Owner.getIstance();
		this.pane = pane;
	}
	
	public void login() {
		
		String username = bean.getUsername();
		String password = bean.getPassword();
		
		this.user = login.checkUser(username, password);
		
		if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
			bean.setResult(true);
		} else {
			this.owner = login.checkOwner(username, password);
			if (owner.getUsername().equals(username) && owner.getPassword().equals(password)) {
				bean.setResult(true);
			} else {			
				bean.setResult(false);
			}
		}
	}
	
	public boolean registerUser() {
		
		String username = bean.getUsername();
		String password = bean.getPassword();
		
		boolean result = false;
		
		if (login.registerUserString(username, password)) {
			result = true;
		}		
		
		return result;
	}
	
	public boolean registerOwner() {
		
		String username = bean.getUsername();
		String password = bean.getPassword();
		
		boolean result = false;
		
		if (login.registerOwnerString(username, password)) {
			result = true;
		}		
		
		return result;
	}
	
	public void changeScene() {
		if (!user.getLogged()) {
			if (!owner.getLogged()) {
				
				profileScene = new ProfileScene(this);
				
				pane.getChildren().clear();
				pane.getChildren().add(profileScene);
			} else {
				this.loggedScene();
			}
		} else {
			this.loggedScene();
		}
	}
	
	public void openLogWindow() {
		window = new LogWindow();
		window.Log(this,bean);
	}
	
	public boolean openRegisterWindow() {
		window = new LogWindow();
		return window.Register(this,bean);
	}
	
	public void loggedScene() {
		
		if (booking) {
			
			setBooking(false);
			
		} else {
			
			setIndice(0);
			setPage(0);

			if (user.getLogged()) {
				
				changeExperiences(0,0);
				
			} else {

				changeExperiences(0,1);
			}
			
			pane.getChildren().clear();
			pane.getChildren().add(userScene);
		}
	}
	
	public void changeExperiences(int index, int tipo) {
		
        try {
	        	boolean newPage = false;
	        	
	        	if (index == 0) {
	        		newPage = true;
	        	}
	        
	        	String table;
	        
	        	if (tipo == 0) {
	        		
	        		table = user.getReviewsTable();
	        	
	        		index++;
					
					Experience experience1 = ExperienceDao.getExperience(table, index);
					
					if (experience1.getName() != null) {
						
						if (indice < index) {
							setPage(page+1);
						} else {
							setPage(page-1);
						}
						
						setIndice(index);
						
						newPage = true;
					}
					
					if (newPage) {
						
						index++;
						Experience experience2 = ExperienceDao.getExperience(table, index);
						if (experience2.getName() != null) {
							setIndice(index);
						}
						index++;
						Experience experience3 = ExperienceDao.getExperience(table, index);
						if (experience3.getName() != null) {
							setIndice(index);
						}
						index++;
						Experience experience4 = ExperienceDao.getExperience(table, index);
						if (experience4.getName() != null) {
							setIndice(index);
						}
						index++;
						Experience experience5 = ExperienceDao.getExperience(table, index);
						if (experience5.getName() != null) {
							setIndice(index);
						}
						index++;
						Experience experience6 = ExperienceDao.getExperience(table, index);
						if (experience6.getName() != null) {
							setIndice(index);
						}
						
						int booked = ExperienceDao.getBooked(table);
						int review = ExperienceDao.getReviewsNumber(table);
						
						userScene = new User2Scene(this,user,experience1,experience2,experience3,experience4,experience5,experience6,booked,review);

						pane.getChildren().clear();
						pane.getChildren().add(userScene);
					}
	        	
	        	} else {
	        		
	        		table = owner.getStructures();
	        		
	        		index++;
					
					Structure structure1 = StructureDao.getStructure(table, index);
					
					if (structure1.getName() != null) {
						
						if (indice < index) {
							setPage(page+1);
						} else {
							setPage(page-1);
						}
						
						setIndice(index);
						
						newPage = true;
					}
					
					if (newPage) {
						
						index++;
						Structure structure2 = StructureDao.getStructure(table, index);
						if (structure2.getName() != null) {
							setIndice(index);
						}
						index++;
						Structure structure3 = StructureDao.getStructure(table, index);
						if (structure3.getName() != null) {
							setIndice(index);
						}
						index++;
						Structure structure4 = StructureDao.getStructure(table, index);
						if (structure4.getName() != null) {
							setIndice(index);
						}
						index++;
						Structure structure5 = StructureDao.getStructure(table, index);
						if (structure5.getName() != null) {
							setIndice(index);
						}
						index++;
						Structure structure6 = StructureDao.getStructure(table, index);
						if (structure6.getName() != null) {
							setIndice(index);
						}
						
						int structures = StructureDao.getStructures(table);
						
						userScene = new User2Scene(this,owner,structure1,structure2,structure3,structure4,structure5,structure6,structures);

						pane.getChildren().clear();
						pane.getChildren().add(userScene);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	}
	
	public void setStructure(String name) {
		
		HotelBean bean = new HotelBean();
		
		HotelRegistrationScene registerScene = new HotelRegistrationScene(this,name,bean);

		pane.getChildren().clear();
		pane.getChildren().add(registerScene);
		
	}
	
	public void registerStructure(String ownerName, HotelBean bean) {
		
		try {
			HotelDao.setHotel(bean.getName(), ownerName, bean.getType(), bean.getCity(), bean.getAddress(), 0, bean.getParking(), bean.getRestaurant(), bean.getRoomService(), bean.getGym());
			OwnerDao.setStructure(ownerName, bean.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openStructureWindow(String structure) {
		
		HotelController hotelController = HotelController.getIstance(pane);
		
		try {
			Hotel hotel = HotelDao.getHotel(structure);
			new StructureScene(this,hotel,hotelController);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addRoomScene(Stage window, String roomsTable, String structure) {
		
		new AddRoomScene(window,this,roomsTable,structure);
		
	}
	
	public boolean addRoom(String roomsTable, int id, int beds, int price) {
		
		Boolean setted = null;
		try {
			setted = RoomDao.setRoom(roomsTable, id, beds, price);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (setted) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addDescriptionScene(Stage window, String structure) {
		
		new AddDescriptionScene(window,this,structure);
		
	}
	
	public void addDescription(String description, String structure) {
		
		try {
			HotelDao.setDescription(description,structure);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void review(boolean bool,Experience experience) {
		
		Review review = new Review();
		review.setUser(user.getUsername());
		review.setReview(experience.getReview());
		review.setVote(experience.getRating());
		
		if (bool) {
			new WriteReviewWindow(this,review,experience.getName(),experience.getDayIn(),experience.getDayOut());
		} else {
			new ViewReviewWindow(this,review,experience.getName());
		}
	}
	
	public void addReview(Review review, String structure, int dayIn, int dayOut) {
		
		try {
			Hotel hotel = HotelDao.getHotel(structure);
			ExperienceDao.addReview(review, structure, dayIn, dayOut);
			int avg = ReviewDao.setReview(review.getReview(), review.getVote(), user.getUsername(),hotel.getReviews());
			HotelDao.setRating(avg, structure);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
}