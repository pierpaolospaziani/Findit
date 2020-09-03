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
import logic.model.UserWeb;

public class UserWebDao {
	
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
    private UserWebDao() {
    	
    }
	
    public static UserWeb getUserWeb(String username){
    	
    	String nameUserQuery = "select name from users where name = '" + username + "'";
    	String psswUserQuery = "select pssw from users where name = '" + username + "'";
    	String reviewsTableUserQuery = "select reviews from users where name = '" + username + "'";
    	String imageUserQuery = "select photo from users where name = '" + username + "'";
    	
    	UserWeb user = new UserWeb();
    	
    	Connection userWebConn = null;
		Statement userWebSt = null;
		InputStream userWebBinaryStream = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			userWebConn = DriverManager.getConnection(url,name,pass);
    			
    			userWebSt = userWebConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = userWebSt.executeQuery(nameUserQuery);
    		
    			rs.next();
    			
    			if (!rs.first()) {
    				
    				return user;
    			}
    		
    			String nome = rs.getNString("name");
    			
    			user.setUsername(nome);
    			
    			rs.close();
    			
    			ResultSet rs1 = userWebSt.executeQuery(psswUserQuery);
    		
    			rs1.next();
    		
    			String pssw = rs1.getNString("pssw");
    			
    			user.setPassword(pssw);
    		
    			rs1.close();
    			
    			ResultSet rs3 = userWebSt.executeQuery(reviewsTableUserQuery);
    		
    			rs3.next();
    		
    			String reviewsTable = rs3.getNString("reviews");
    			
    			user.setReviewsTable(reviewsTable);
    		
    			rs3.close();
    			
    			ResultSet rs2 = userWebSt.executeQuery(imageUserQuery);
    			
    			rs2.next();
    			
    			Blob blob = rs2.getBlob("photo");
    			
    			if (blob.length() > 4) {

    				byte[] imageByte = blob.getBytes(1, (int) blob.length());
    				
    				userWebBinaryStream = new ByteArrayInputStream(imageByte);
    				
    				BufferedImage bf = ImageIO.read(userWebBinaryStream);
    				
    				Image  img = SwingFXUtils.toFXImage(bf, null);
    				
    				user.setImage(img);
    				
    			} else {
    				user.setImage(null);
    			}
    		
    			rs2.close();
        		
    			user.setLogged(true);
        
        	} finally {
        		
        		if (userWebSt != null) {
        			userWebSt.close();
        		}
        		
        		if (userWebConn != null) {
        			userWebConn.close();
        		}
        		
        		if (userWebBinaryStream != null) {
        			userWebBinaryStream.close();
        		}
        		
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
    	
    	
    	Connection userWebConn = null;
		Statement userWebSt = null;
		
    	try {
        	try{
            	Class.forName(driverClassName);
    			userWebConn = DriverManager.getConnection(url,name,pass);
    			
    			userWebSt = userWebConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = userWebSt.executeQuery(searchUserQuery);
    			
    			if (!rs.first()) {

    				rs.close();
    				
    				ResultSet rs2 = userWebSt.executeQuery(searchOwnerQuery);
    				
    				if (!rs2.first()) {

    					rs2.close();
    					
    					java.sql.DatabaseMetaData meta = userWebConn.getMetaData();

    					String variableReviewsTable = reviewsTable;
    					
    					boolean exist = true;
    					
    					int i=0;
    					
    					while (exist) {
    						ResultSet res = meta.getTables(null, null, variableReviewsTable, null);
    						if (res.next()) {
    							variableReviewsTable = reviewsTable + i;
    							i++;
    						} else {
    							exist = false;
    							reviewsTable = variableReviewsTable;

    							String insertQuery = "insert into users value ('" + username + "','" + password + "','" + reviewsTable + "','" + null + "')";
    					    	String createReviewsQuery = "create table " + reviewsTable + " (structure varchar(20),review text,stars int,dateIn int,dateOut int)";
    				
    					    	userWebSt.executeUpdate(insertQuery);
    							userWebSt.executeUpdate(createReviewsQuery);
    						}
    					}

    					return true;
    				}
    			} else {
    				
    				return false;
    				
    			}
        	} finally {
        		
        		if (userWebSt != null) {
        			userWebSt.close();
        		}
        		
        		if (userWebConn != null) {
        			userWebConn.close();
        		}
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
		return false;
    }
	
	public static void setImage(String username, FileInputStream image){
		
    	String insertQuery = "UPDATE users SET photo = ? WHERE name = '" + username + "'";
		
		Connection userWebConn = null;
		PreparedStatement ps = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			userWebConn = DriverManager.getConnection(url,name,pass);
    			
        		userWebConn.setAutoCommit(false);
        		
        		ps = userWebConn.prepareStatement(insertQuery);
        		
        		ps.setBinaryStream(1, image);
        		
        		ps.executeUpdate();
        		
        		userWebConn.commit();
        		
        	} finally {
        		
        		if (userWebConn != null) {
        			userWebConn.close();
        		}
        		
        		if (ps != null) {
        			ps.close();
        		}
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
	}
}


