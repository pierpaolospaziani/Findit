package logic.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import logic.controller.EventsController;
import logic.controller.HomeController;
import logic.controller.HotelController;
import logic.controller.LoginController;
import logic.controller.MapController;
import logic.controller.RestaurantsController;

public class Main extends Application{
	
    protected AnchorPane pane;
    protected AnchorPane scenePane;
    protected MainMenu baseScene;
    
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage stage) throws Exception {
		
    	pane = new AnchorPane();
    	scenePane = new AnchorPane();
    	
		HomeController homeController = new HomeController();
		HotelController hotelController = new HotelController(scenePane);
		RestaurantsController restaurantsController = new RestaurantsController(scenePane);
		EventsController eventsController = new EventsController(scenePane);
    	MapController mapController = new MapController();
		LoginController loginController = new LoginController(scenePane);
    	
    	baseScene = new MainMenu(scenePane,homeController,hotelController,restaurantsController,eventsController,mapController,loginController);

    	scenePane.setLayoutX(0.0);
    	scenePane.setLayoutY(155.0);
    	scenePane.setPrefWidth(1050.0);
    	scenePane.prefHeight(525.0);
    	
        pane.getChildren().add(baseScene);
        pane.getChildren().add(scenePane);
        
        homeController.changeScene(scenePane);
        
        pane.setId("pane");
        
		Scene scene = new Scene(pane,1050,680);
	    
	    stage.setResizable(false);
	    
	    scene.getStylesheets().addAll(this.getClass().getResource("home_style.css").toExternalForm());
	    
	    stage.setTitle("FindIT");
	    stage.setScene(scene);
	    stage.show();	
	}
}
