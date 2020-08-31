package logic.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.bean.LoginBeanWeb;
import logic.controller.LoginControllerWeb;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Register() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LoginBeanWeb bean = new LoginBeanWeb();
		LoginControllerWeb  controller = LoginControllerWeb.getIstance();
		
		String usernameReg = request.getParameter("username");
		String passwordReg = request.getParameter("password");
		
		bean.setUsername(usernameReg);
		bean.setPassword(passwordReg);
		
		RequestDispatcher viewReg = request.getRequestDispatcher("registerView.jsp");
		
		if((request.getParameter("registerUser") == null) && (request.getParameter("registerOwner") == null)) {
			request.setAttribute("radio", "not");
			
			viewReg.forward(request, response);
		}
		
		RequestDispatcher viewLog = request.getRequestDispatcher("loginView.jsp");
		
		if(request.getParameter("registerUser") != null) {
			if(controller.registerUser(bean)) {
				request.setAttribute("reg1", "ok");
				viewLog.forward(request, response);
			}else {
				request.setAttribute("reg", "fail");
				viewReg.forward(request, response);
			}
		}
		if(request.getParameter("registerOwner") != null) {
			if(controller.registerOwner(bean)) {
				request.setAttribute("reg1", "ok");
				viewLog.forward(request, response);
			}else {
				request.setAttribute("reg", "fail");
				viewReg.forward(request, response);
			}
		}

	}

}