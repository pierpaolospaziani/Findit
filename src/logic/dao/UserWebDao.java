package logic.dao;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import logic.model.User;
import logic.model.UserWeb;

public class UserWebDao {
	
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
	public static UserWeb getUserWeb(String username){
    	
    	String nameUserQuery = "select name from users where name = '" + username + "'";
    	String psswUserQuery = "select pssw from users where name = '" + username + "'";
    	String reviewsTableUserQuery = "select reviews from users where name = '" + username + "'";
    	String imageUserQuery = "select photo from users where name = '" + username + "'";
    	
    	UserWeb user = new UserWeb();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(nameUserQuery);
    		
    			rs.next();
    			
    			if (!rs.first()) {
    				
    				return user;
    			}
    		
    			String nome = rs.getNString("name");
    			
    			user.setUsername(nome);
    			
    			rs.close();
    			
    			ResultSet rs1 = st.executeQuery(psswUserQuery);
    		
    			rs1.next();
    		
    			String pssw = rs1.getNString("pssw");
    			
    			user.setPassword(pssw);
    		
    			rs1.close();
    			
    			ResultSet rs3 = st.executeQuery(reviewsTableUserQuery);
    		
    			rs3.next();
    		
    			String reviewsTable = rs3.getNString("reviews");
    			
    			user.setReviewsTable(reviewsTable);
    		
    			rs3.close();
    			
    			ResultSet rs2 = st.executeQuery(imageUserQuery);
    			
    			rs2.next();
    			
    			Blob blob = rs2.getBlob("photo");
    			
    			if (blob.length() > 4) {

    				byte[] imageByte = blob.getBytes(1, (int) blob.length());
    				
    				InputStream binaryStream = new ByteArrayInputStream(imageByte);
    				
    				BufferedImage bf = ImageIO.read(binaryStream);
    				
    				Image  img = SwingFXUtils.toFXImage(bf, null);
    				
    				user.setImage(img);
    				
    			} else {
    				user.setImage(null);
    			}
    		
    			rs2.close();
        		
    			user.setLogged(true);
        
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	
		return user;
    }
	
	public static boolean setUser(String username, String password){

		String reviewsTable = (username + "Reviews").replaceAll("\\s+","");
    	String searchUserQuery = "select name from users where name = '" + username + "'";
    	String searchOwnerQuery = "select name from owners where name = '" + username + "'";
    	
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try{
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(searchUserQuery);
    			
    			if (!rs.first()) {

    				rs.close();
    				
    				ResultSet rs2 = st.executeQuery(searchOwnerQuery);
    				
    				if (!rs2.first()) {

    					rs2.close();
    					
    					java.sql.DatabaseMetaData meta = con.getMetaData();

    					String variableReviewsTable = reviewsTable;
    					
    					boolean exist = true;
    					
    					int i=0;
    					
    					while (exist == true) {
    						ResultSet res = meta.getTables(null, null, variableReviewsTable, null);
    						if (res.next()) {
    							variableReviewsTable = reviewsTable + i;
    							i++;
    						} else {
    							exist = false;
    							reviewsTable = variableReviewsTable;

    							String insertQuery = "insert into users value ('" + username + "','" + password + "','" + reviewsTable + "','" + null + "')";
    					    	String createReviewsQuery = "create table " + reviewsTable + " (structure varchar(20),review text,stars int,dateIn int,dateOut int)";
    				
    					    	st.executeUpdate(insertQuery);
    							st.executeUpdate(createReviewsQuery);
    						}
    					}

    					return true;
    				}
    			} else {
    				
    				return false;
    				
    			}
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
		return false;
    }
	
	public static void setImage(String username, FileInputStream image){
		
    	String insertQuery = "UPDATE users SET photo = ? WHERE name = '" + username + "'";
		
		Connection con = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
        		con.setAutoCommit(false);
        		
        		PreparedStatement ps = con.prepareStatement(insertQuery);
        		
        		ps.setBinaryStream(1, image);
        		
        		ps.executeUpdate();
        		
        		con.commit();
        		
        	} finally {
        		
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
	}
}

