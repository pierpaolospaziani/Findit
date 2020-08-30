package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import logic.model.Structure;

public class StructureDao {
	
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
    public static Structure getStructure(String structureTable, int index){

		String nameQuery = "select name from " + structureTable;

		Structure structure = new Structure();
		
		Connection con = null;
		Statement st = null;

    	try {
        	try{
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(nameQuery);
    			
    			if (!rs.first()) {
    				return structure;
    			}
    			
    			for (int i=1; i<index; i++) {
    				if (!rs.next()) {
    					return structure;
    				}
    			}
    		
    			String nome = rs.getNString("name");
    			structure.setName(nome);
    			rs.close();
    			
        	} finally {
        		
        		st.close();
        		con.close();
    			
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
		return structure;
	}
	
	public static void setStructure(String structureTable, String structureName, String type){
        
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try{
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    			
    			String insertQuery = "insert into " + structureTable + " value ('" + structureName + "','" + type + "')";
    				    	
    			st.executeUpdate(insertQuery);
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	        }
    }
	
	public static int getStructures(String structureTable){
		
		String numQuery = "select count(*) from " + structureTable;
		
		Connection con = null;
		Statement st = null;
		
    	int i = 0;
		try {
        	try{
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    				    	
    			ResultSet rs = st.executeQuery(numQuery);
    			rs.next();
    			i = rs.getInt("count(*)");
    			rs.close();
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	        }
		
		return i;
	}
}
