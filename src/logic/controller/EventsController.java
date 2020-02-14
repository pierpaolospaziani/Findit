package logic.controller;

import javafx.scene.layout.AnchorPane;
import logic.view.EventsScene;

public class EventsController {

	private EventsScene eventsScene;
	
	public void changeScene(AnchorPane pane) {
		
		eventsScene = new EventsScene();
		
		pane.getChildren().clear();
		pane.getChildren().add(eventsScene);
		
	}
}
