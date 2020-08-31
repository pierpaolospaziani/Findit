package logic.model;

import logic.dao.OwnerDao;

import logic.dao.UserDao;
import logic.dao.UserWebDao;


public class Login {
	
	private User userLoggato;
	private Owner ownerLoggato;
	private OwnerWeb ownerLoggatoWeb;
	private UserWeb userLoggatoWeb;
	
	public Login() {
		userLoggato = User.getIstance();
		ownerLoggato = Owner.getIstance();
		ownerLoggatoWeb = new OwnerWeb();
		userLoggatoWeb = new UserWeb();
		
	}
		
	public boolean registerUserString(String username, String password ){
		
		boolean result = false;
		
		try {
			result = UserDao.setUser(username, password);
		} catch (Exception e) {
			System.err.print("Error register user in login class");
		} 
		return result;			
	}
	
	public boolean registerOwnerString(String username, String password ){
		
		boolean result = false;
		
		try {
			result = OwnerDao.setOwner(username, password);
		} catch (Exception e) {
			System.err.print("Error register owner in login class");
		} 
		return result;			
	}
	
	public User checkUser(String username) {
		 
		try {
			userLoggato = UserDao.getUser(username);
		} catch (Exception e) {
			System.err.print("Error check user in login class");
		}
		 return userLoggato;
	}
	
	public Owner checkOwner(String username) {
		 
		try {
			ownerLoggato = OwnerDao.getOwner(username);
		} catch (Exception e) {
			System.err.print("Error check owner in login class");
		}
		 return ownerLoggato;
	}
	public OwnerWeb checkOwnerWeb(String username) {
		 
		try {
			ownerLoggatoWeb = OwnerDao.getOwnerWeb(username);
		} catch (Exception e) {
			System.err.print("Error check ownerWeb in login class");
		}
		 return ownerLoggatoWeb;
	}
	
	public UserWeb checkUserWeb(String username) {
		 
		try {
			userLoggatoWeb = UserWebDao.getUserWeb(username);
		} catch (Exception e) {
			System.err.print("Error check userWeb in login class");
			
		}
		 return userLoggatoWeb;
	}
}