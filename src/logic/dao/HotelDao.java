package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import logic.model.Hotel;

public class HotelDao {
	private static String name = "progettoFindit";
    private static String pass = "passwfindit2020";
    private static String url = "jdbc:mysql://localhost:3306/findit?useTimezone=true&serverTimezone=UTC";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    
	public static Hotel getHotel(String hotelName){

    	String nameQuery = "select name from hotels where name = '" + hotelName + "'";
    	String ownerQuery = "select owner from hotels where name = '" + hotelName + "'";
    	String typeQuery = "select type from hotels where name = '" + hotelName + "'";
    	String cityQuery = "select city from hotels where name = '" + hotelName + "'";
    	String addressQuery = "select address from hotels where name = '" + hotelName + "'";
    	String ratingQuery = "select rating from hotels where name = '" + hotelName + "'";
    	String parkingQuery = "select parking from hotels where name = '" + hotelName + "'";
    	String restaurantQuery = "select restaurant from hotels where name = '" + hotelName + "'";
    	String roomServiceQuery = "select roomService from hotels where name = '" + hotelName + "'";
    	String gymQuery = "select gym from hotels where name = '" + hotelName + "'";
    	String roomsQuery = "select rooms from hotels where name = '" + hotelName + "'";
    	String agendaQuery = "select agenda from hotels where name = '" + hotelName + "'";
    	String reviewsQuery = "select reviews from hotels where name = '" + hotelName + "'";
    	String descriptionQuery = "select description from hotels where name = '" + hotelName + "'";
    	
    	Hotel hotel = new Hotel();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(nameQuery);
    		
    			rs.next();
    			
    			if (!rs.first()) {
    				return hotel;
    			}
    		
    			String nome = rs.getNString("name");
    			hotel.setHotelName(nome);			
    			rs.close();
    			
    			ResultSet rs1 = st.executeQuery(ownerQuery);			
    			rs1.next();		
    			String owner = rs1.getNString("owner");
    			hotel.setHotelOwner(owner);		
    			rs1.close();
    			
    			ResultSet rs2 = st.executeQuery(typeQuery);			
    			rs2.next();		
    			String type = rs2.getNString("type");			
    			hotel.setHotelType(type);		
    			rs2.close();
    			
    			ResultSet rs3 = st.executeQuery(cityQuery);			
    			rs3.next();		
    			String city = rs3.getNString("city");			
    			hotel.setHotelCity(city);		
    			rs3.close();
    			
    			ResultSet rs4 = st.executeQuery(addressQuery);			
    			rs4.next();		
    			String address = rs4.getNString("address");
    			hotel.setHotelAddress(address);
    			rs4.close();
    			
    			ResultSet rs5 = st.executeQuery(ratingQuery);
    			rs5.next();
    			int rating = rs5.getInt("rating");
    			hotel.setHotelRating(rating);
    			rs5.close();
    			
    			ResultSet rs6 = st.executeQuery(parkingQuery);
    			rs6.next();
    			boolean parking = rs6.getBoolean("parking");
    			hotel.setHotelParking(parking);
    			rs6.close();
    			
    			ResultSet rs7 = st.executeQuery(restaurantQuery);
    			rs7.next();
    			boolean restaurant = rs7.getBoolean("restaurant");
    			hotel.setHotelRestaurant(restaurant);
    			rs7.close();
    			
    			ResultSet rs8 = st.executeQuery(roomServiceQuery);
    			rs8.next();
    			boolean roomService = rs8.getBoolean("roomService");
    			hotel.setHotelRoomService(roomService);
    			rs8.close();
    			
    			ResultSet rs9 = st.executeQuery(gymQuery);
    			rs9.next();
    			boolean gym = rs9.getBoolean("gym");
    			hotel.setHotelGym(gym);
    			rs9.close();
    			
    			ResultSet rs10 = st.executeQuery(roomsQuery);
    			rs10.next();
    			String rooms = rs10.getNString("rooms");
    			hotel.setHotelRooms(rooms);
    			rs10.close();
    			
    			ResultSet rs11 = st.executeQuery(agendaQuery);
    			rs11.next();
    			String agenda = rs11.getNString("agenda");
    			hotel.setHotelAgenda(agenda);
    			rs11.close();
    			
    			ResultSet rs12 = st.executeQuery(reviewsQuery);
    			rs12.next();
    			String reviews = rs12.getNString("reviews");
    			hotel.setHotelReviews(reviews);
    			rs12.close();
    			
    			ResultSet rs14 = st.executeQuery(descriptionQuery);
    			rs14.next();
    			String description = rs14.getString("description");
    			hotel.setHotelDescription(description);
    			rs14.close();
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	
		return hotel;
    }
	
	public static boolean setHotel(
			String nome, 
			String owner, 
			String type,
			String city,
			String address,
			int rating,
			boolean parking,
			boolean restaurant,
			boolean roomService,
			boolean gym){

		String rooms = (nome + "Rooms").replaceAll("\\s+","");
		String agenda = (nome + "Agenda").replaceAll("\\s+","");
		String reviewsTable = (nome + "Reviews").replaceAll("\\s+","");

    	String searchQuery = "select name from hotels where name = '" + nome + "'";
    	
    	Connection con = null;
		Statement st = null;
		
		boolean result = false;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    		
    			ResultSet rs = st.executeQuery(searchQuery);
    			
    			if (!rs.first()) {

    				rs.close();
    				
    				java.sql.DatabaseMetaData meta = con.getMetaData();
    				
    				String variableRooms = rooms;
    				String variableAgenda = agenda;
    				String variableReviewsTable = reviewsTable;
    				
    				boolean exist = true;
    				
    				int i=0;
    				
    				while (exist) {
    					ResultSet res = meta.getTables(null, null, variableRooms, null);
    					if (res.next()) {
    						variableRooms = rooms + i;
    						variableAgenda = agenda + i;
    						variableReviewsTable = reviewsTable + i;
    						i++;
    					} else {
    						exist = false;
    						rooms = variableRooms;
    						agenda = variableAgenda;
    						reviewsTable = variableReviewsTable;
    						
    				    	String createRoomsTable = "create table " + rooms + " (id int, price int, beds int)";
    				    	String createAgendaTable = "create table " + agenda + " (id int, date varchar(10), user varchar(20))";	
    				    	String createReviewsQuery = "create table " + reviewsTable + " (user varchar(20),review text, stars int)";
    				    	String insertQuery = "insert into hotels value ("
    				    			+ "'" + nome + "',"
    				    			+ "'" + owner + "',"
    				    	    	+ "'" + type + "',"
    				    	    	+ "'" + city + "',"
    				    	    	+ "'" + address + "',"
    				    	    	+ "" + rating + ","
    				    	    	+ "" + parking + ","
    				    	    	+ "" + restaurant + ","
    				    	    	+ "" + roomService + ","
    				    	    	+ "" + gym + ","
    				    	    	+ "'" + rooms + "',"
    				    			+ "'" + agenda + "',"
    		    					+ "'" + reviewsTable + "',"
    		    					+ "'" + null + "')";
    				    	
    						st.executeUpdate(insertQuery);
    						st.executeUpdate(createRoomsTable);
    						st.executeUpdate(createAgendaTable);
    						st.executeUpdate(createReviewsQuery);
    					}
    				}
    				
    				result = true;
    				
    			} else {
    				
    				result = false;
    				
    			}
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	return result;
    }
	
	public static Hotel searchHotel(String city, String type, Boolean parking, Boolean restaurant, Boolean roomService, Boolean gym, int stars, int index){

		String serachQuery = "select * from hotels where city = '" + city + "'";
		
    	String nameQuery = "select name from hotels where city = '" + city + "'";
    	
    	Hotel hotel = new Hotel();
    	
    	Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);

    			if (type != null) {
    				serachQuery = serachQuery + " and type = '" + type + "'";
    				nameQuery = nameQuery + " and type = '" + type + "'";
    			}

    			if (parking == true) {
    				serachQuery = serachQuery + " and parking = '" + true + "'";
    				nameQuery = nameQuery + " and parking = '" + true + "'";
    			}
    			
    			if (restaurant == true) {
    				serachQuery = serachQuery + " and restaurant = '" + true + "'";
    				nameQuery = nameQuery + " and restaurant = '" + true + "'";
    			}
    			
    			if (roomService == true) {
    				serachQuery = serachQuery + " and roomService = '" + true + "'";
    				nameQuery = nameQuery + " and roomService = '" + true + "'";
    			}
    			
    			if (gym == true) {
    				serachQuery = serachQuery + " and gym = '" + true + "'";
    				nameQuery = nameQuery + " and gym = '" + true + "'";
    			}
    			
    			if (stars != 0) {
    				serachQuery = serachQuery + " and rating >= '" + stars + "'";
    				nameQuery = nameQuery + " and rating >= '" + stars + "'";
    			}
    			
    			ResultSet rs = st.executeQuery(serachQuery);
    		
    			rs.next();
    			
    			if (!rs.first()) {
    				return hotel;
    			}
    			
    			ResultSet rs1 = st.executeQuery(nameQuery);
    			rs1.next();
    			
    			for (int i=1; i<index; i++) {
    				if (!rs1.next()) {
    					return hotel;
    				}
    			}
    			
    			String hotelName = rs1.getNString("name");
    			hotel = getHotel(hotelName);
    			rs1.close();
        
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
    	
		return hotel;
    }
	
	public static void setDescription(String description, String structure){
		
		String insertQuery = "update hotels set description = '" + description + "' where name = '" + structure + "'";
		
		Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    				    	
    			st.executeUpdate(insertQuery);
    			
        	} finally {
        		
        		st.close();
        		con.close();
        		
        	}
		} catch(Exception e){
	        System.exit(1);
	    }
	}
	
	public static void setRating(int avg, String structure){
		
		String insertQuery = "update hotels set rating = '" + avg + "' where name = '" + structure + "'";
		
		Connection con = null;
		Statement st = null;
		
    	try {
        	try {
            	Class.forName(driverClassName);
    			con = DriverManager.getConnection(url,name,pass);
    			
    			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
    	                ResultSet.CONCUR_READ_ONLY);
    				    	
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
