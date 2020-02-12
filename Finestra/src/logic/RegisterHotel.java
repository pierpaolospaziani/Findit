package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterHotel {
	
	private static String name = "root";
    private static String pass = "Pier1997";
    private static String url = "jdbc:mysql://localhost:3306/adc";
    private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
public static Hotel getHotel(String name) throws Exception{
    	
    	String hotelQuery = "select name from hotels where name = '" + name + "'";
    	//String psswQuery = "select pssw from student where name = '" + hotelName + "'";
    	
    	Hotel hotel = new Hotel();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
    		Class.forName(DRIVER_CLASS_NAME);
    		try{
				con = DriverManager.getConnection(url,name,pass);
			} catch(SQLException e){
		        System.out.println("Couldn't connect: exit.");
		        System.exit(1);
		        }
			
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	                ResultSet.CONCUR_READ_ONLY);
		
			ResultSet rs = st.executeQuery(hotelQuery);
		
			rs.next();
			
			// CHECK SE NON C'E' L'UTENTE
			if (!rs.first()) {
				//System.out.println("# Utente non presente nel database! #");
				return hotel;
			}
		
			String nome = rs.getNString("name");
			
			//System.out.println("Username: " + nome);
			Hotel.name = nome;
			
			rs.close();
			
			//ResultSet rs1 = st.executeQuery(psswQuery);
		
			//rs1.next();
		
			//String pssw = rs1.getNString("pssw");
			//System.out.println("Password: " + pssw);
			//User.password = pssw;
		
			//rs1.close();
    		
    
    	} finally {
    		
    		st.close();
    		con.close();
    		
    	}
    	
		return hotel;
    }
	
public static boolean registerHotel(Hotel hotel) throws Exception{
    	
    	String hotelRegisterQuery = "insert into hotels value ('" + hotel.getName() + "',"
    														+ "'" + hotel.getOwner() + "',"
    														+ "'" + hotel.getAddress() + "',"
    														+ "'" + hotel.getRooms() + "',"
    														+ "'" + hotel.getAgenda() + "')";
    	String searchHotelQuery = "select name from hotels where name = '" + hotel.getName() + "'";
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
    		Class.forName(DRIVER_CLASS_NAME);
    		try{
				con = DriverManager.getConnection(url,name,pass);
			} catch(SQLException e){
		        System.out.println("Couldn't connect: exit.");
		        System.exit(1);
		        }
			
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	                ResultSet.CONCUR_READ_ONLY);
		
			ResultSet rs = st.executeQuery(searchHotelQuery);
			
			if (!rs.first()) {

				rs.close();
				
				st.executeUpdate(hotelRegisterQuery);
				System.out.println("# Abilitato alla registrazione! #");
				//User.username = username;
				//User.password = password;
				return true;
			} else {
				System.out.println("# Hotel già registrato! #");
				//User.username = username;
				//User.password = password;
				return false;
			}
    	} finally {
    		
    		st.close();
    		con.close();
    		
    	}
    }

public static boolean registerRoom(String rooms) throws Exception{
	
	String roomRegisterQuery = "create table " + rooms + "(id int, beds int, type varchar(10), price int);";
	String searchHotelQuery = "select name from hotels where name = '" + hotel.getName() + "'";
	
	Connection con = null;
	Statement st = null;
	/*
svn: E170009: Commit non riuscito (seguono dettagli):
svn: E170009: Repository UUID '498d22c3-a429-479e-9f5d-474da5dbf92f' doesn't match expected UUID '873ddf2d-266e-4c72-be5a-140828730105'
	 */
	try {
		Class.forName(DRIVER_CLASS_NAME);
		try{
			con = DriverManager.getConnection(url,name,pass);
		} catch(SQLException e){
	        System.out.println("Couldn't connect: exit.");
	        System.exit(1);
	        }
		
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
	
		ResultSet rs = st.executeQuery(searchHotelQuery);
		
		if (!rs.first()) {

			rs.close();
			
			st.executeUpdate(roomRegisterQuery);
			System.out.println("# Abilitato alla registrazione! #");
			//User.username = username;
			//User.password = password;
			return true;
		} else {
			System.out.println("# Hotel già registrato! #");
			//User.username = username;
			//User.password = password;
			return false;
		}
	} finally {
		
		st.close();
		con.close();
		
	}
}
}
