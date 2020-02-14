package logic.controller;

import javafx.scene.layout.AnchorPane;
import logic.view.RestaurantsScene;

public class RestaurantsController {

	private RestaurantsScene restaurantsScene;
	
	public void changeScene(AnchorPane pane) {
		
		restaurantsScene = new RestaurantsScene();
		
		pane.getChildren().clear();
		pane.getChildren().add(restaurantsScene);
	}
}
