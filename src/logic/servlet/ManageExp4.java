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
import logic.model.Experience;
import logic.model.Review;
import logic.model.UserWeb;

/**
 * Servlet implementation class ManageExp4
 */
@WebServlet("/ManageExp4")
public class ManageExp4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageExp4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		LoginBeanWeb bean = (LoginBeanWeb)session.getAttribute("beanLog");
		UserWeb user =(UserWeb)session.getAttribute("userLog");
		
		Experience experience4 = bean.getExpList().get(3);
		
		Review review = new Review();
		review.setReviewUser(user.getUsername());
		review.setReviewText(experience4.getReview());
		review.setReviewVote(experience4.getRating());
		
		request.setAttribute("reviewExp", review);
		session.setAttribute("exp", experience4);
		//request era
		
		if (experience4.getReview().equals("")) {
			//controller.review(bean.getExpList().get(0));
			RequestDispatcher view = request.getRequestDispatcher("writeReviewPage.jsp");
			view.forward(request, response);
		}else{
			//controller.review(bean.getExpList().get(0));
			RequestDispatcher view1 = request.getRequestDispatcher("viewMyReview.jsp");
			view1.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
