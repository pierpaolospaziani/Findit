package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import logic.model.Review;

public class ReviewDao {
	
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
	public static Review getReview(String reviewTable, int index){
		
		String userQuery = "select user from " + reviewTable;
		String reviewQuery = "select review from " + reviewTable;
		String ratingQuery = "select stars from " + reviewTable;

		Review review = new Review();
		
		Connection con = null;
		Statement st = null;
		
    	try {
        	try{
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(userQuery);
    			
    			if (!rs.first()) {
    				return review;
    			}
    			
    			for (int i=1; i<index; i++) {
    				if (!rs.next()) {
    					return review;
    				}
    			}
    			
    			String nome = rs.getNString("user");
    			review.setReviewUser(nome);
    			rs.close();
    			
    			ResultSet rs3 = st.executeQuery(reviewQuery);
    			rs3.first();
    			for (int i=1; i<index; i++) {
    				rs3.next();
    			}
    			String reviewText = rs3.getNString("review");
    			review.setReviewText(reviewText);
    			rs3.close();
    			
    			ResultSet rs4 = st.executeQuery(ratingQuery);
    			rs4.first();
    			for (int i=1; i<index; i++) {
    				rs4.next();
    			}
    			int vote = rs4.getInt("stars");
    			review.setReviewVote(vote);
    			rs4.close();
    			
        	} finally {
        		
        		st.close();
        		con.close();
    			
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
		return review;
	}
	
	public static int setReview(String review, int stars, String user, String table) {
		
		String insertQuery = "insert into " + table + " value ('" + user + "','" + review + "','" + stars + "')";
		
		Connection con = null;
		Statement st = null;
		
    	int avg = 0;
		try {
        	try{
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    				    	
    			st.executeUpdate(insertQuery);
        	
        	String avgQuery = "select AVG(stars) from " + table;

        	ResultSet rs = st.executeQuery(avgQuery);
        	rs.next();
        	avg = rs.getInt("AVG(stars)");
    		rs.close();
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	        }
    	
		return avg;
	}
}
