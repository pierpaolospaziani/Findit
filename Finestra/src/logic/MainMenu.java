package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class MainMenu extends HBox{
	
	protected Button b_findit;
    protected HBox baseScene;;
    protected HBox baseHBox;
    protected Button b_hotel;
    protected Button b_rest;
    protected Button b_events;
    protected Button b_map;
    protected Button b_profile;
    
    protected HomeScene homeScene;
    protected HotelScene hotelScene;
    protected RestaurantsScene restaurantsScene;
    protected EventsScene eventsScene;
    protected ProfileScene profileScene;

	public MainMenu(AnchorPane scenePane){
		setUp(scenePane);
	}
	
	public void setUp(AnchorPane scenePane) {
		
		b_findit = new Button();
        baseHBox = new HBox();
        b_hotel = new Button();
        b_rest = new Button();
        b_events = new Button();
        b_map = new Button();
        b_profile = new Button();
    	
    	b_findit.setLayoutX(0.0);
    	b_findit.setLayoutY(0.0);
    	b_findit.setMnemonicParsing(false);
    	b_findit.setPrefHeight(82.0);
    	b_findit.setPrefWidth(215.0);
    	b_findit.setMinWidth(215.0);
    	b_findit.setText("FindIT");
    	b_findit.setUnderline(true);
    	b_findit.setFont(new Font(72.0));
        b_findit.setPadding(new Insets(0.0, 0.0, 0.0, 0.0));
        HBox.setMargin(b_findit, new Insets(25.0, 0.0, 20.0, 0.0));
        
        setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        setLayoutX(0.0);
        setLayoutY(0.0);
        setPrefHeight(145.0);
        setPrefWidth(1015.0);
        
        baseHBox.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        baseHBox.setLayoutX(0.0);
        baseHBox.setLayoutY(0.0);
        baseHBox.setPrefHeight(145.0);
        baseHBox.setPrefWidth(764.0);
        
        b_hotel.setMnemonicParsing(false);
        b_hotel.setText("Hotels");
        b_hotel.setTextFill(javafx.scene.paint.Color.WHITE);
        b_hotel.setUnderline(true);
        b_hotel.setFont(new Font(24.0));
        
        b_rest.setMnemonicParsing(false);
        b_rest.setText("Restaurants");
        b_rest.setTextFill(javafx.scene.paint.Color.WHITE);
        b_rest.setUnderline(true);
        b_rest.setFont(new Font(24.0));

        b_events.setMnemonicParsing(false);
        b_events.setText("Events");
        b_events.setTextFill(javafx.scene.paint.Color.WHITE);
        b_events.setUnderline(true);
        b_events.setFont(new Font(24.0));

        b_map.setMnemonicParsing(false);
        b_map.setText("Map");
        b_map.setTextFill(javafx.scene.paint.Color.WHITE);
        b_map.setUnderline(true);
        b_map.setFont(new Font(24.0));

        b_profile.setMnemonicParsing(false);
        b_profile.setText("Profile");
        b_profile.setTextFill(javafx.scene.paint.Color.WHITE);
        b_profile.setUnderline(true);
        b_profile.setFont(new Font(24.0));
        
        b_findit.setId("b_selected");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");
        
        b_findit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				homeScene(scenePane);
			}
		});
        
        b_hotel.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				hotelScene(scenePane);
			}
		});
        
        b_rest.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				restScene(scenePane);
			}
		});
        
        b_events.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				eventsScene(scenePane);
			}
		});
        
        b_map.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				mapScene(scenePane);
			}
		});
        
        b_profile.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				profileScene(scenePane);
			}
		});
        
        getChildren().add(b_findit);
        getChildren().add(baseHBox);
        baseHBox.getChildren().add(b_hotel);
        baseHBox.getChildren().add(b_rest);
        baseHBox.getChildren().add(b_events);
        baseHBox.getChildren().add(b_map);
        baseHBox.getChildren().add(b_profile);
	}

	public void homeScene(AnchorPane scenePane) {
    	b_findit.setId("b_selected");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");
        
        homeScene = new HomeScene();

        scenePane.getChildren().clear();
        scenePane.getChildren().add(homeScene);
    }
    
    public void hotelScene(AnchorPane scenePane) {
    	b_findit.setId("b_menu");
        b_hotel.setId("b_selected");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");
        
        hotelScene = new HotelScene();

        scenePane.getChildren().clear();
		scenePane.getChildren().add(hotelScene);
    }
    
    public void restScene(AnchorPane scenePane) {

    	b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_selected");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");
        
        restaurantsScene = new RestaurantsScene();

        scenePane.getChildren().clear();
        scenePane.getChildren().add(restaurantsScene);
    }
    
    public void eventsScene(AnchorPane scenePane) {

    	b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_selected");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");
        
        eventsScene = new EventsScene();

        scenePane.getChildren().clear();
        scenePane.getChildren().add(eventsScene);
    }
    
    public void mapScene(AnchorPane scenePane) {
		b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_selected");
        b_profile.setId("b_menu");
        
        scenePane.getChildren().clear();
        /*
		webView.setLayoutY(155.0);
		webView.setPrefHeight(525.0);
		webView.setPrefWidth(1050.0);
		scenePane.getChildren().add(webView);
		//getChildren().add(mapScene);
		*/
    }
    
    public void profileScene(AnchorPane scenePane) {
		b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_selected");
        
        profileScene = new ProfileScene(b_profile);

        scenePane.getChildren().clear();
        scenePane.getChildren().add(profileScene);
    }
    

}
