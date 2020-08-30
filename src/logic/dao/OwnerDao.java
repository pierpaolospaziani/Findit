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
import logic.model.Owner;
import logic.model.OwnerWeb;

public class OwnerDao {
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
    public static Owner getOwner(String username) throws Exception{
    	
    	Owner owner = Owner.getIstance();
    	
    	OwnerWeb ownerApp = getOwnerWeb(username) ;
    	
    	if(ownerApp != null) {
    		owner.setOwnerUsername(ownerApp.getUsername());
    		owner.setOwnerPassword(ownerApp.getPassword());
    		owner.setOwnerImage(ownerApp.getImage());
    		owner.setOwnerStructures(ownerApp.getStructures());
    		owner.setOwnerLogged(true);
    	}
    	
    	return owner;
    }
    
    public static OwnerWeb getOwnerWeb(String username){
    	
    	String nameOwnerQuery = "select name from owners where name = '" + username + "'";
    	String psswOwnerQuery = "select pssw from owners where name = '" + username + "'";
    	String structuresOwnerQuery = "select structures from owners where name = '" + username + "'";
    	String imageUserQuery = "select photo from owners where name = '" + username + "'";
    	
    	OwnerWeb owner = new OwnerWeb();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(nameOwnerQuery);
    		
    			rs.next();
    		
    			if (!rs.first()) {
    				return owner;
    			}
    		
    			String nome = rs.getNString("name");
    			
    			owner.setUsername(nome);
    			
    			rs.close();
    			
    			ResultSet rs1 = st.executeQuery(psswOwnerQuery);
    		
    			rs1.next();
    		
    			String pssw = rs1.getNString("pssw");

    			owner.setPassword(pssw);
    		
    			rs1.close();
    			
    			ResultSet rs2 = st.executeQuery(structuresOwnerQuery);
    			
    			rs2.next();
    		
    			String structures = rs2.getNString("structures");

    			owner.setStructures(structures);
    		
    			rs2.close();
    			
    			ResultSet rs3 = st.executeQuery(imageUserQuery);
    			
    			rs3.next();
    			
    			Blob blob = rs3.getBlob("photo");
    			
    			if (blob.length() > 4) {
    				
    				byte[] imageByte = blob.getBytes(1, (int) blob.length());
    				
    				InputStream binaryStream = new ByteArrayInputStream(imageByte);
    				
    				BufferedImage bf = ImageIO.read(binaryStream);
    				
    				Image  img = SwingFXUtils.toFXImage(bf, null);
    				
    				owner.setImage(img);
    			} else {
    				owner.setImage(null);
    			}
    		
    			rs3.close();
        		
    			owner.setLogged(true);
        
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	
		return owner;
    }
	
	public static boolean setOwner(String username, String password){
		
		String structuresTable = (username + "Structures").replaceAll("\\s+","");

    	String searchOwnerQuery = "select name from owners where name = '" + username + "'";
    	String searchUserQuery = "select name from users where name = '" + username + "'";
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(searchOwnerQuery);
    			
    			if (!rs.first()) {

    				rs.close();
    				
    				ResultSet rs2 = st.executeQuery(searchUserQuery);
    				
    				if (!rs2.first()) {

    					rs2.close();
    					
    					java.sql.DatabaseMetaData meta = con.getMetaData();

    					String variableStructuresTable = structuresTable;
    					
    					boolean exist = true;
    					
    					int i=0;
    					
    					while (exist == true) {
    						ResultSet res = meta.getTables(null, null, variableStructuresTable, null);
    						if (res.next()) {
    							variableStructuresTable = structuresTable + i;
    							i++;
    						} else {
    							exist = false;
    							structuresTable = variableStructuresTable;

    					    	String insertQuery = "insert into owners value ('" + username + "','" + password + "','" + structuresTable + "','" + null + "')";
    					    	String createStructureQuery = "create table " + structuresTable + " (name varchar(20))";
    							
    							st.executeUpdate(insertQuery);

    							st.executeUpdate(createStructureQuery);
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
		
    	String insertQuery = "UPDATE owners SET photo = ? WHERE name = '" + username + "'";
		
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
	
	public static void setStructure(String username, String structure){
		
		String table = (username + "Structures").replaceAll("\\s+","");
		
		Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);

        		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
        		
            	String insertQuery = "insert into " + table + " value ('" + structure + "')";
    		
    			st.executeUpdate(insertQuery);
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
	}
}
