package logic.controller;

import javafx.scene.layout.AnchorPane;
import logic.view.HotelScene;

public class HotelController {
	
	private HotelScene hotelScene;
	
	public void changeScene(AnchorPane pane){
		
		hotelScene = new HotelScene();
		
		pane.getChildren().clear();
		pane.getChildren().add(hotelScene);
	}

}
