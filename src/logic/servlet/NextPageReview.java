package logic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.bean.HotelBeanWeb;
import logic.bean.ReviewBean;
import logic.controller.HotelControllerWeb;
import logic.model.Hotel;

/**
 * Servlet implementation class NextPageReview
 */
@WebServlet("/NextPageReview")
public class NextPageReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NextPageReview() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HotelBeanWeb hotelBean = new HotelBeanWeb();
		HotelControllerWeb controller = HotelControllerWeb.getIstance();
		ReviewBean reviewBean = new ReviewBean();
	
		HttpSession session = request.getSession();
		
		hotelBean = (HotelBeanWeb)session.getAttribute("bean");
		reviewBean = (ReviewBean)session.getAttribute("reviewBean");
		
		if(session.getAttribute("type") == "1") {
			
			
			controller.viewReviews(true, hotelBean.getBookHotel().getHotelReviews(), reviewBean.getIndex(), reviewBean);
			session.setAttribute("reviewBean", reviewBean);
		
		}else if(session.getAttribute("type") == "2") {
			
			Hotel str = (Hotel)session.getAttribute("struct");
			controller.viewReviews(true, str.getHotelReviews(), reviewBean.getIndex(), reviewBean);
			session.setAttribute("reviewBean", reviewBean); // per owner struct	
		}
 		
		RequestDispatcher view = request.getRequestDispatcher("viewReview.jsp");
		view.forward(request, response);
	
	}



}
