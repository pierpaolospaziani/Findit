package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import logic.model.Reservation;

public class ReservationDao {
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
    public static Reservation getReservation(String reservationTable, int id, int date){

    	String idQuery = "select id from " + reservationTable + " where id = '" + id + "' and date = '" + date + "'";
    	String userQuery = "select user from " + reservationTable + " where id = '" + id + "' and date = '" + date + "'";
    	
    	Reservation reservation = new Reservation();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(idQuery);
    		
    			rs.next();
    			
    			if (!rs.first()) {
    				return reservation;
    			}
    			
    			int reservationID = rs.getInt("id");
    			reservation.setReservationId(reservationID);
    			rs.close();
    			
    			reservation.setDate(date);
    			
    			ResultSet rs2 = st.executeQuery(userQuery);
    			rs2.next();
    			String user = rs2.getNString("user");
    			reservation.setUserBooked(user);
    			rs2.close();
    			
        
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	
		return reservation;
    }
	
    public static void setReservation(String reservationTable, int id, int date, String user){		

    	String searchQuery = "select id from " + reservationTable + " where id = '" + id + "' and date = '" + date + "'";
        
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(searchQuery);
    			
    			if (!rs.first()) {

    				rs.close();

    				String insertQuery = "insert into " + reservationTable + " value ('" + id + "','" + date + "','" + user + "')";

    				st.executeUpdate(insertQuery);
    			}
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    }
    
    public static Reservation searchReservation(String reservationTable, int id, int date){

    	String searchQuery = "select * from " + reservationTable + " where id = '" + id + "' and date = '" + date + "'";
    	
    	Reservation reservation = new Reservation();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    			
    			ResultSet rs = st.executeQuery(searchQuery);
    		
    			rs.next();
    			
    			if (!rs.first()) {
    				return reservation;
    			}
    			reservation.setReservationId(id);
    			rs.close();
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	
		return reservation;
    }
}
