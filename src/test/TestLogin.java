/*
 * Autore: Simone Sinceri
 * */

package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import logic.model.Login;
import logic.model.Owner;
import logic.model.User;

class TestLogin {

	@Test
	void testCheckUserRegisteredUser() {
		
		Login login = new Login();
		String username = "simone";
		
		User user = login.checkUser(username);
		
		assertEquals(username, user.getUserName());
	}
	
	@Test
	void testCheckUserNotRegisteredUser() {
		
		Login login = new Login();
		String username = "franco89";
		
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
		String usernameOwner = "ownermario";
		
		Owner owner = login.checkOwner(usernameOwner);
		
		assertNotEquals(usernameOwner, owner.getOwnerUsername());
	}
	
	@Test
	void testRegisterUserStringUserExisting() {
		
		Login login = new Login();
		String username = "simone";
		String password = "asfsvf";
		
		boolean result = login.registerUserString(username, password); 
		
		assertEquals(false,result);
	}
	
	@Test
	void testRegisterOwnerStringOwnerExisting() {
		
		Login login = new Login();
		String usernameOwner = "owner";
		String password = "asfsvf";
		
		boolean result = login.registerOwnerString(usernameOwner, password); 
		
		assertEquals(false,result);
	}
	
	

}
