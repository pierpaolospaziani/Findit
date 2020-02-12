package logic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
	
    protected AnchorPane pane;
    protected AnchorPane scenePane;
    protected MainMenu baseScene;
    protected HomeScene homeScene;
    
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage stage) throws Exception {
		
    	pane = new AnchorPane();
    	scenePane = new AnchorPane();
    	
    	baseScene = new MainMenu(scenePane);
    	homeScene = new HomeScene();

    	scenePane.setLayoutX(0.0);
    	scenePane.setLayoutY(155.0);
    	scenePane.setPrefWidth(1050.0);
    	scenePane.prefHeight(525.0);
    	
        pane.getChildren().add(baseScene);
        pane.getChildren().add(scenePane);
        scenePane.getChildren().add(homeScene);
        
        pane.setId("pane");
        
		Scene scene = new Scene(pane,1050,680);
	    
	    stage.setResizable(false);
	    
	    scene.getStylesheets().addAll(this.getClass().getResource("home_style.css").toExternalForm());
	    
	    stage.setTitle("FindIT");
	    stage.setScene(scene);
	    stage.show();	
	}
}
