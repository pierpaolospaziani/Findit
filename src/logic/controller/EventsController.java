package logic.controller;

import javafx.scene.layout.AnchorPane;
import logic.bean.EventBean;
import logic.view.EventsScene;

public class EventsController {

	private EventsScene eventsScene;
	private EventBean bean;
	private AnchorPane pane;
	
	private static EventsController istance = null;
	
	public static EventsController getIstance(AnchorPane pane) {
		if (istance == null) {
			istance = new EventsController(pane);
		}
		return istance;
	}

	private EventsController(AnchorPane pane) {
		
		this.bean = new EventBean();
		this.pane = pane;
	}
	
	public void changeScene() {
		
		eventsScene = new EventsScene(this, bean);
		
		pane.getChildren().clear();
		pane.getChildren().add(eventsScene);
	}
	
	public void changeScene2(){
		
		//eventScene2 = new EventScene2(this,bean,event1,event2,event3);
		
		pane.getChildren().clear();
		//pane.getChildren().add(eventScene2);
	}
}
