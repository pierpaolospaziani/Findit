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
import logic.model.OwnerWeb;
import logic.model.UserWeb;

/**
 * Servlet implementation class PreExperience
 */
@WebServlet("/PreExperience")
public class PreExperience extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PreExperience() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginControllerWeb  controller = LoginControllerWeb.getIstance();
		HttpSession session = request.getSession();
		LoginBeanWeb bean = (LoginBeanWeb)session.getAttribute("beanLog");
		
		UserWeb user = (UserWeb)session.getAttribute("userLog");
		OwnerWeb owner = (OwnerWeb)session.getAttribute("ownerLog");
		String profilePage = "profilePage2.jsp";
		String ownerPage = "ownerPage.jsp";
		
		int indice = controller.getIndice();
		
		if(indice == 6) {
			if(user != null) {
				controller.changeExperiences(0,bean);
			
				RequestDispatcher view = request.getRequestDispatcher(profilePage);
				view.forward(request, response);
				
			}else if(owner != null) {
				controller.changeStructures(0,bean);
				
				RequestDispatcher view1 = request.getRequestDispatcher(ownerPage);
				view1.forward(request, response);
				}
		}
		

		if (indice > 6  ){
			
			if(user != null) {
				
				bean.getExpList().clear();
				pre(indice,controller,bean);
			
				RequestDispatcher view2 = request.getRequestDispatcher(profilePage);
				view2.forward(request, response);
			
			}else if(owner != null) {
				
				bean.getStructList().clear();
				pre1(indice,controller,bean);
				
				RequestDispatcher view1 = request.getRequestDispatcher(ownerPage);
				view1.forward(request, response);
			}
		}
		
		if(user != null && indice < 6) {
			RequestDispatcher view = request.getRequestDispatcher(profilePage);
			view.forward(request, response);
		}else if(owner != null && indice < 6) {
			RequestDispatcher view1 = request.getRequestDispatcher(ownerPage);
			view1.forward(request, response);
		}
	}
	
	private void pre(int indice, LoginControllerWeb controller, LoginBeanWeb bean) {
		
		int modIndice = indice%6;
		
		if (modIndice == 0) {
			indice = indice - 12;
			controller.changeExperiences(indice,bean);
		} else if (modIndice== 1) {
			indice = indice - 7;
			controller.changeExperiences(indice,bean);
		} else if (modIndice == 2){
			indice = indice - 8;
			controller.changeExperiences(indice,bean);
		} else if (modIndice == 3){
			indice = indice - 9;
			controller.changeExperiences(indice,bean);
		} else if (modIndice == 4){
			indice = indice - 10;
			controller.changeExperiences(indice,bean);
		} else {
			indice = indice - 11;
			controller.changeExperiences(indice,bean);
		}
	}


	private void pre1(int indice, LoginControllerWeb controller, LoginBeanWeb bean) {

		int modIndiceOwn = indice%6;
		
		if (modIndiceOwn == 0) {
			indice = indice - 12;
			controller.changeStructures(indice,bean);
		} else if (modIndiceOwn== 1) {
			indice = indice - 7;
			controller.changeStructures(indice,bean);
		} else if (modIndiceOwn == 2){
			indice = indice - 8;
			controller.changeStructures(indice,bean);
		} else if (modIndiceOwn == 3){
			indice = indice - 9;
			controller.changeStructures(indice,bean);
		} else if (modIndiceOwn == 4){
			indice = indice - 10;
			controller.changeStructures(indice,bean);
		} else {
			indice = indice - 11;
			controller.changeStructures(indice,bean);
		}
	}
	
}