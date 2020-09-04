/*
 * Autore: Simone Sinceri
 * */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.bean.HotelBean;
import logic.dao.HotelDao;
import logic.model.Hotel;

class TestHotelDao {

	@Test
	void testGetHotelHotelPresentInDB() {
		
		Hotel hotelPresentInDb = HotelDao.getHotel("Casa Sinceri");
		assertEquals("Casa Sinceri",hotelPresentInDb.getHotelName() );

	}
	
	@Test
	void testGetHotelHotelNotExistInDb() {
		
		Hotel hotelNotExist = HotelDao.getHotel("hotel vergine");
		assertNotEquals("hotel vergine", hotelNotExist.getHotelName());

	}
	
	@Test
	void testSetHotelHotelExisting() {
		
		HotelBean bean = new HotelBean();
		String owner = "mario98";
		int rating = 3;
		
		bean.setName("Hotel Adventure");
		bean.setCity("Verona");
		bean.setAddress("via Marconi 45");
		bean.setHostel(true);
		bean.setApartment(false);
		bean.setBeb(false);
		bean.setHostel(false);
		bean.setType();
		bean.setParking(true);
		bean.setRestaurant(true);
		bean.setRoomService(false);
		bean.setGym(true);
		
		boolean result = HotelDao.setHotel(bean, owner, rating);
		assertEquals(false, result);
	}
	
	@Test
	void testSetDescpriptionNewDescription() {
		 
		String description = "Hotel situato a pochi passi dal centro";
		
		HotelDao.setDescription(description, "Hotel Adventure");
		Hotel adventure = HotelDao.getHotel("Hotel Adventure");
		
		assertEquals(description, adventure.getHotelDescription());
	}
	
	@Test
	void testSetRatingNewRating() {
		 
		int rating = 4;
		
		HotelDao.setRating(rating, "Hotel Adventure");
		Hotel adventure = HotelDao.getHotel("Hotel Adventure");
		
		assertEquals(rating, adventure.getHotelRating());
	}
	
	

}
