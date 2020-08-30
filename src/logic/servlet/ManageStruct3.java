package logic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.bean.LoginBeanWeb;
import logic.dao.HotelDao;
import logic.dao.RoomDao;
import logic.model.Hotel;
import logic.model.Structure;

/**
 * Servlet implementation class ManageStruct3
 */
@WebServlet("/ManageStruct3")
public class ManageStruct3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageStruct3() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		LoginBeanWeb bean = (LoginBeanWeb)session.getAttribute("beanLog");
		Hotel hotel = new Hotel();
		int roomsNumb = 0;
		Structure struct = bean.getStructList().get(2);
		
		try {
			hotel = HotelDao.getHotel(struct.getName());
			roomsNumb = RoomDao.getRoomsNumber(hotel.getHotelRooms());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		session.setAttribute("roomsNumb", roomsNumb);
		session.setAttribute("struct", hotel);
		
		RequestDispatcher view = request.getRequestDispatcher("structPage.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
