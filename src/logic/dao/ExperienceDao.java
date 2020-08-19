package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logic.model.Experience;

public class ExperienceDao {
	
	private static String name = "root";
    private static String pass = "Pier1997";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    /*
    public static void main(String[] args) {
    	
    	Experience experience = new Experience();
    	
    	try {
    		
			setExperience("PierpaoloReviews", "Tor Vergata", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata1", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata2", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata3", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata4", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata5", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata6", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata7", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata8", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata9", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata10", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata11", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata12", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata13", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata14", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata15", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata16", 20200818, 20200819);
			setExperience("PierpaoloReviews", "Tor Vergata17", 20200818, 20200819);
			
    		experience = getExperience("PierpaoloReviews", 3);
    		
    		System.out.println("--- " + experience.getName());
    		
		} catch (Exception e) {
	        System.out.println("# DB error! #");
	        System.out.println(e);
		}
    }*/
    
	public static Experience getExperience(String reviewTable, int index) throws Exception{
		
		String nameQuery = "select structure from " + reviewTable;
		String dayInQuery = "select dateIn from " + reviewTable;
		String dayOutQuery = "select dateOut from " + reviewTable;

		Experience experience = new Experience();
		
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
		
			ResultSet rs = st.executeQuery(nameQuery);
			
			// CHECK SE NON C'E'
			if (!rs.first()) {
				return experience;
			}
			
			for (int i=1; i<index; i++) {
				if (!rs.next()) {
					return experience;
				}
			}
		
			String nome = rs.getNString("structure");
			experience.setName(nome);
			rs.close();
			
			ResultSet rs1 = st.executeQuery(dayInQuery);
			rs1.next();
			int dateIn = rs1.getInt("dateIn");
			experience.setDayIn(dateIn);
			rs1.close();
			
			ResultSet rs2 = st.executeQuery(dayOutQuery);
			rs2.next();
			int dateOut = rs2.getInt("dateOut");
			experience.setDayIn(dateOut);
			rs2.close();
			
    	} finally {
    		
    		st.close();
    		con.close();
			
    	}
		return experience;
	}
	
	public static void setExperience(String reviewTable, String experienceName, int dayIn, int dayOut) throws Exception{
        
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
			
			String insertQuery = "insert into " + reviewTable + " value ('" + experienceName + "','" + null + "','" + dayIn + "','" + dayOut + "')";
				    	
			st.executeUpdate(insertQuery);
			
    	} finally {
    		
    		st.close();
    		con.close();
    		
    	}
    }
	
	public static int getBooked(String reviewTable) throws Exception {
		
		String numQuery = "select count(*) from " + reviewTable;
		
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
				    	
			ResultSet rs = st.executeQuery(numQuery);
			rs.next();
			int i = rs.getInt("count(*)");
			rs.close();
			
			return i;
			
    	} finally {
    		
    		st.close();
    		con.close();
    		
    	}
	}
	
	public static int getReview(String reviewTable) throws Exception {
		
		String numQuery = "select count(*) from " + reviewTable + " where review != 'null'";
		
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
				    	
			ResultSet rs = st.executeQuery(numQuery);
			rs.next();
			int i = rs.getInt("count(*)");
			rs.close();
			
			return i;
			
    	} finally {
    		
    		st.close();
    		con.close();
    		
    	}
	}
}
