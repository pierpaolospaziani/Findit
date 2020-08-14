package logic.controller;

import javafx.scene.layout.AnchorPane;
import logic.bean.RestaurantsBean;
import logic.view.RestaurantsScene;

public class RestaurantsController{

	private RestaurantsScene restaurantsScene;
	private AnchorPane pane;
	private RestaurantsBean bean;
	
	private static RestaurantsController istance = null;
	
	public static RestaurantsController getIstance(AnchorPane pane) {
		if (istance == null) {
			istance = new RestaurantsController(pane);
		}
		return istance;
	}

	private RestaurantsController(AnchorPane pane) {
		
		this.pane = pane;
		this.bean = new RestaurantsBean();
		
	}
	
	public void changeScene() {
		
		restaurantsScene = new RestaurantsScene(this,bean);
		
		pane.getChildren().clear();
		pane.getChildren().add(restaurantsScene);
	}
	
	public void changeScene2(){
		
		//restaurantScene2 = new RestaurantScene2(this,bean,hotel1,hotel2,hotel3);
		
		pane.getChildren().clear();
		//pane.getChildren().add(restaurantScene2);
	}
}
