package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import logic.model.Login;
import logic.model.Owner;
import logic.model.User;

/*
 *  Author: Pierpaolo Spaziani
 */

public class LoginTestPierpaoloApp {
	
	@Test
	void testCheckUserRegisteredUser() {
		
		Login login = new Login();
		String username = "Pierpaolo";
		
		User user = login.checkUser(username);
		
		assertEquals(username, user.getUserName());
	}
	
	@Test
	void testCheckUserNotRegisteredUser() {
		
		Login login = new Login();
		String username = "Francesco";
		
		User user = login.checkUser(username);
		
		assertNotEquals(username, user.getUserName());
	}
	

	
	@Test
	void testCheckOwnerRegisteredOwner() {
		
		Login login = new Login();
		String usernameOwner = "owner";
		
		Owner owner = login.checkOwner(usernameOwner);
		
		assertEquals(usernameOwner, owner.getOwnerUsername());
	}
	
	@Test
	void testCheckOwnerNotRegisteredOwner() {
		
		Login login = new Login();
		String usernameOwner = "Proprietario";
		
		Owner owner = login.checkOwner(usernameOwner);
		
		assertNotEquals(usernameOwner, owner.getOwnerUsername());
	}
	
	@Test
	void testRegisterUserStringUserExisting() {
		
		Login login = new Login();
		String username = "Pierpaolo";
		String password = "pier";
		
		boolean result = login.registerUserString(username, password); 
		
		assertEquals(false,result);
	}
	
	@Test
	void testRegisterOwnerStringOwnerExisting() {
		
		Login login = new Login();
		String usernameOwner = "owner";
		String password = "owner";
		
		boolean result = login.registerOwnerString(usernameOwner, password); 
		
		assertEquals(false,result);
	}
}
