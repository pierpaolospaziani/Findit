/*
 * Author: Simone Sinceri
 * */
package exception;

public class ExistingUsernameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExistingUsernameException() {
		
	}
	
	public  ExistingUsernameException(Throwable cause) {
		super(cause);
		
	}
	
	public  ExistingUsernameException(String message) {
		super("ExistingUsernameException: " + message);
		
	}

}
