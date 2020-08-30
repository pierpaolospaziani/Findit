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
import logic.controller.LoginControllerWeb;
import logic.model.Experience;
import logic.model.Review;
import logic.model.UserWeb;

/**
 * Servlet implementation class WriteReview
 */
@WebServlet("/ManageExp1")
public class ManageExp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageExp1() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forse non mi serve??
		LoginControllerWeb  controller = LoginControllerWeb.getIstance();
		
		HttpSession session = request.getSession();
		LoginBeanWeb bean = (LoginBeanWeb)session.getAttribute("beanLog");
		UserWeb user =(UserWeb)session.getAttribute("userLog");
		
		Experience experience1 = bean.getExpList().get(0);
		
		Review review = new Review();
		review.setReviewUser(user.getUsername());
		review.setReviewText(experience1.getReview());
		review.setReviewVote(experience1.getRating());
		
		request.setAttribute("reviewExp", review);
		session.setAttribute("exp", experience1);
		//request era
		
		if (experience1.getReview().equals("")) {
			//controller.review(bean.getExpList().get(0));
			RequestDispatcher view = request.getRequestDispatcher("writeReviewPage.jsp");
			view.forward(request, response);
		}else{
			//controller.review(bean.getExpList().get(0));
			RequestDispatcher view1 = request.getRequestDispatcher("viewMyReview.jsp");
			view1.forward(request, response);
		}
		
	}



}
