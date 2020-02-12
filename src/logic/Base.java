package logic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class Base extends Application{
	
	//##########   (BASE)   ##########
	
    protected Button b_findit;
    protected HBox baseScene;;
    protected HBox baseHBox;
    protected Button b_hotel;
    protected Button b_rest;
    protected Button b_events;
    protected Button b_map;
    protected Button b_profile;
    protected AnchorPane pane;
    
    protected static User user = new User();
    
    //##########   (HOME)   ##########

    protected HBox homeScene;
    protected VBox homeVbox1;
    protected Text homeText;
    protected Text homeText0;
    protected Text homeText1;
    protected Text homeText2;
    protected Text homeText3;
    protected Text homeText4;
    protected Text homeText5;
    protected VBox homeVbox2;
    protected Text homeText6;
    protected Text homeText7;
    protected Text homeText8;
    protected ImageView punti;
    
    //##########   (RESTAURANTS)   ##########

    protected VBox restaurantsScene;
    protected HBox restHBox0;
    protected VBox restaurantsBox0;
    protected Label restLabel;
    protected TextField restText;
    protected Label restLabel0;
    protected TextField restText0;
    protected HBox restHBox1;
    protected Label restLabel1;
    protected TextField restText1;
    protected Line restLine;
    protected VBox restaurantsBox1;
    protected HBox restHBox2;
    protected Label restLabel2;
    //protected Rating rating;
    protected HBox restHBox3;
    protected Label restLabel3;
    protected MenuButton restPriceMenu;
    protected MenuItem restPrice1;
    protected MenuItem restPrice2;
    protected MenuItem restPrice3;
    protected Label restLabel4;
    protected HBox restHBox4;
    protected VBox restaurantsBox2;
    protected CheckBox pizzaCheck;
    protected CheckBox sushiCheck;
    protected CheckBox hamburgerCheck;
    protected CheckBox pastaCheck;
    protected VBox restaurantsBox3;
    protected CheckBox meatCheck;
    protected CheckBox fishCheck;
    protected CheckBox veganCheck;
    protected CheckBox gurmetCheck;
    protected Button restSearchButton;
    
    //##########   (EVENTS)   ##########
    
    protected VBox eventsScene;
	protected HBox eventsHBox;
	protected VBox eventsVBox0;
	protected Label eventsLabel;
	protected TextField eventsText;
	protected Label eventsLabel0;
	protected TextField eventsText0;
	protected HBox eventsHBox0;
	protected Label eventsLabel1;
	protected TextField eventsText1;
	protected Line eventsLine;
	protected VBox eventsVBox1;
	protected Label eventsLabel2;
	protected HBox eventsHBox1;
	protected DatePicker eventsDatePicker;
	protected TextField eventsText2;
	protected Label eventsLabel3;
	protected HBox eventsHBox2;
	protected VBox eventsVBox2;
	protected CheckBox concertCheck;
	protected CheckBox theatreCheck;
	protected VBox eventsVBox3;
	protected CheckBox cinemaCheck;
	protected CheckBox museumCheck;
	protected Button eventsSearchButton;
    
	protected WebView webView;
	protected WebEngine engine;
	
	//##########   (PROFILE)   ##########
	
	protected VBox profileScene;
    protected HBox profileHBox;
    protected VBox profileVBox0;
    protected Label profileLabel;
    protected Label profileLabel0;
    protected Label profileLabel1;
    protected Label profileLabel2;
    protected Label profileLabel3;
    protected Button profileLoginButton;
    protected Line profileLine;
    protected VBox profileVBox1;
    protected Label profileLabel4;
    protected Label profileLabel5;
    protected Label profileLabel6;
    protected Label profileLabel7;
    protected Label profileLabel8;
    protected Button profileRegisterButton;
    
    protected boolean isLogged = false;
	
    public void start(Stage stage) throws Exception {
    	
    	// --- BASE ---
    	
    	b_findit = new Button();
        baseScene = new HBox();
        baseHBox = new HBox();
        b_hotel = new Button();
        b_rest = new Button();
        b_events = new Button();
        b_map = new Button();
        b_profile = new Button();
    	pane = new AnchorPane();
    	
        // --- HOME ---
        
        homeScene = new HBox();
        homeVbox1 = new VBox();
        homeText = new Text();
        homeText0 = new Text();
        homeText1 = new Text();
        homeText2 = new Text();
        homeText3 = new Text();
        homeText4 = new Text();
        homeText5 = new Text();
        homeVbox2 = new VBox();
        homeText6 = new Text();
        homeText7 = new Text();
        homeText8 = new Text();
        punti = new ImageView();
    	
    	// --- RESTAURANTS ---
        
        restaurantsScene = new VBox();
        restHBox0 = new HBox();
        restaurantsBox0 = new VBox();
        restLabel = new Label();
        restText = new TextField();
        restLabel0 = new Label();
        restText0 = new TextField();
        restHBox1 = new HBox();
        restLabel1 = new Label();
        restText1 = new TextField();
        restLine = new Line();
        restaurantsBox1 = new VBox();
        restHBox2 = new HBox();
        restLabel2 = new Label();
        //rating = new Rating();
        restHBox3 = new HBox();
        restLabel3 = new Label();
        restPriceMenu = new MenuButton();
        restPrice1 = new MenuItem();
        restPrice2 = new MenuItem();
        restPrice3 = new MenuItem();
        restLabel4 = new Label();
        restHBox4 = new HBox();
        restaurantsBox2 = new VBox();
        pizzaCheck = new CheckBox();
        sushiCheck = new CheckBox();
        hamburgerCheck = new CheckBox();
        pastaCheck = new CheckBox();
        restaurantsBox3 = new VBox();
        meatCheck = new CheckBox();
        fishCheck = new CheckBox();
        veganCheck = new CheckBox();
        gurmetCheck = new CheckBox();
        restSearchButton = new Button();
        
        // --- EVENTS ---
        
        eventsScene = new VBox();
		eventsHBox = new HBox();
		eventsVBox0 = new VBox();
		eventsLabel = new Label();
		eventsText = new TextField();
		eventsLabel0 = new Label();
		eventsText0 = new TextField();
		eventsHBox0 = new HBox();
		eventsLabel1 = new Label();
		eventsText1 = new TextField();
		eventsLine = new Line();
		eventsVBox1 = new VBox();
		eventsLabel2 = new Label();
		eventsHBox1 = new HBox();
		eventsDatePicker = new DatePicker();
		eventsText2 = new TextField();
		eventsLabel3 = new Label();
		eventsHBox2 = new HBox();
		eventsVBox2 = new VBox();
		concertCheck = new CheckBox();
		theatreCheck = new CheckBox();
		eventsVBox3 = new VBox();
		cinemaCheck = new CheckBox();
		museumCheck = new CheckBox();
		eventsSearchButton = new Button();
		
		// --- PROFILE ---
		
		profileScene = new VBox();
        profileHBox = new HBox();
        profileVBox0 = new VBox();
        profileLabel = new Label();
        profileLabel0 = new Label();
        profileLabel1 = new Label();
        profileLabel2 = new Label();
        profileLabel3 = new Label();
        profileLoginButton = new Button();
        profileLine = new Line();
        profileVBox1 = new VBox();
        profileLabel4 = new Label();
        profileLabel5 = new Label();
        profileLabel6 = new Label();
        profileLabel7 = new Label();
        profileLabel8 = new Label();
        profileRegisterButton = new Button();
    	
    	//##########   (BASE)   ##########
    	
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
        
        baseScene.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        baseScene.setLayoutX(0.0);
        baseScene.setLayoutY(0.0);
        baseScene.setPrefHeight(145.0);
        baseScene.setPrefWidth(1015.0);
        
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
        
        //***************************************
        
        b_findit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				homeScene();
			}
		});
        
        b_hotel.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				hotelScene();
			}
		});
        
        b_rest.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				restScene();
			}
		});
        
        b_events.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				eventsScene();
			}
		});
        
        b_map.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				mapScene();
			}
		});
        
        b_profile.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				profileScene();
			}
		});

        baseScene.getChildren().add(b_findit);
        baseScene.getChildren().add(baseHBox);
        baseHBox.getChildren().add(b_hotel);
        baseHBox.getChildren().add(b_rest);
        baseHBox.getChildren().add(b_events);
        baseHBox.getChildren().add(b_map);
        baseHBox.getChildren().add(b_profile);
        pane.getChildren().add(baseScene);
        
        //##########   (HOME)   ##########
        
        homeScene.setAlignment(javafx.geometry.Pos.CENTER);
        homeScene.setLayoutY(155.0);
        homeScene.setPrefHeight(525.0);
        homeScene.setPrefWidth(1050.0);

        VBox.setVgrow(homeText, javafx.scene.layout.Priority.ALWAYS);
        homeText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText.setStrokeWidth(0.0);
        homeText.setText("Welcome in Findit!");
        homeText.setWrappingWidth(465.0);
        homeText.setFont(new Font(60.0));

        VBox.setVgrow(homeText0, javafx.scene.layout.Priority.ALWAYS);
        homeText0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText0.setStrokeWidth(0.0);
        homeText0.setText("Are you looking for an hotel,");
        homeText0.setWrappingWidth(405.11102294921875);
        homeText0.setFont(new Font(35.0));
        VBox.setMargin(homeText0, new Insets(35.0, 0.0, 0.0, 0.0));

        VBox.setVgrow(homeText1, javafx.scene.layout.Priority.ALWAYS);
        homeText1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText1.setStrokeWidth(0.0);
        homeText1.setText("a restaurant, or an event?");
        homeText1.setFont(new Font(35.0));
        VBox.setMargin(homeText1, new Insets(0.0));

        homeText2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText2.setStrokeWidth(0.0);
        homeText2.setText("Or are your an owner?");
        homeText2.setFont(new Font(35.0));
        VBox.setMargin(homeText2, new Insets(0.0));

        VBox.setVgrow(homeText3, javafx.scene.layout.Priority.ALWAYS);
        homeText3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText3.setStrokeWidth(0.0);
        homeText3.setText("That’s the right place!");
        homeText3.setFont(new Font(35.0));
        VBox.setMargin(homeText3, new Insets(20.0, 0.0, 0.0, 0.0));

        homeText4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText4.setStrokeWidth(0.0);
        homeText4.setText("Find what you are looking for ");
        homeText4.setFont(new Font(35.0));
        VBox.setMargin(homeText4, new Insets(0.0));

        homeText5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText5.setStrokeWidth(0.0);
        homeText5.setText("or register your business!");
        homeText5.setFont(new Font(35.0));
        VBox.setMargin(homeText5, new Insets(0.0));
        HBox.setMargin(homeVbox1, new Insets(50.0, 200.0, 0.0, 0.0));

        homeVbox2.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        homeVbox2.setPrefHeight(317.0);
        homeVbox2.setPrefWidth(137.0);

        homeText6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText6.setStrokeWidth(0.0);
        homeText6.setText("Search");
        homeText6.setFont(new Font(45.0));

        homeText7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText7.setStrokeWidth(0.0);
        homeText7.setText("Book");
        homeText7.setFont(new Font(45.0));
        VBox.setMargin(homeText7, new Insets(115.0, 0.0, 120.0, 0.0));

        homeText8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        homeText8.setStrokeWidth(0.0);
        homeText8.setText("Review");
        homeText8.setWrappingWidth(136.16455078125);
        homeText8.setFont(new Font(45.0));
        HBox.setMargin(homeVbox2, new Insets(0.0, 10.0, 0.0, 0.0));

        punti.setFitHeight(405.0);
        punti.setFitWidth(49.0);
        punti.setPickOnBounds(true);
        punti.setPreserveRatio(true);
        punti.setImage(new Image(getClass().getResource("Punti.jpg").toExternalForm()));
        pane.setOpaqueInsets(new Insets(0.0));
        
        homeVbox1.getChildren().add(homeText);
        homeVbox1.getChildren().add(homeText0);
        homeVbox1.getChildren().add(homeText1);
        homeVbox1.getChildren().add(homeText2);
        homeVbox1.getChildren().add(homeText3);
        homeVbox1.getChildren().add(homeText4);
        homeVbox1.getChildren().add(homeText5);
        homeScene.getChildren().add(homeVbox1);
        homeVbox2.getChildren().add(homeText6);
        homeVbox2.getChildren().add(homeText7);
        homeVbox2.getChildren().add(homeText8);
        homeScene.getChildren().add(homeVbox2);
        homeScene.getChildren().add(punti);
        
        pane.getChildren().add(homeScene);
        
        //##########   (RESTAURANTS)   ##########
        
        restaurantsScene.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        restaurantsScene.setLayoutY(155.0);
        restaurantsScene.setPrefHeight(525.0);
        restaurantsScene.setPrefWidth(1050.0);
        restaurantsScene.setSpacing(30.0);

        restHBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        restHBox0.setPrefHeight(100.0);
        restHBox0.setPrefWidth(200.0);
        restHBox0.setSpacing(65.0);

        restaurantsBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        restaurantsBox0.setMaxHeight(300.0);

        restLabel.setText("Which restaurant are you looking for?");
        restLabel.setFont(new Font(24.0));

        restText.setAlignment(javafx.geometry.Pos.CENTER);
        restText.setPromptText("Type restaurant name");
        restText.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
        restText.setFont(new Font(24.0));
        VBox.setMargin(restText, new Insets(15.0, 0.0, 0.0, 0.0));

        restLabel0.setText("Where do you wanna go?");
        restLabel0.setFont(new Font(24.0));
        VBox.setMargin(restLabel0, new Insets(35.0, 0.0, 0.0, 0.0));

        restText0.setAlignment(javafx.geometry.Pos.CENTER);
        restText0.setPromptText("Es.  Rome");
        restText0.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
        restText0.setFont(new Font(24.0));
        VBox.setMargin(restText0, new Insets(15.0, 0.0, 0.0, 0.0));

        restHBox1.setAlignment(javafx.geometry.Pos.CENTER);
        restHBox1.setPrefHeight(34.0);
        restHBox1.setPrefWidth(402.0);
        restHBox1.setSpacing(15.0);

        restLabel1.setText("How many people?");
        restLabel1.setFont(new Font(24.0));

        restText1.setAlignment(javafx.geometry.Pos.CENTER);
        restText1.setPrefHeight(45.0);
        restText1.setPrefWidth(80.0);
        restText1.setPromptText("Es. 4");
        restText1.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
        restText1.setFont(new Font(24.0));
        VBox.setMargin(restHBox1, new Insets(35.0, 0.0, 0.0, 0.0));
        HBox.setMargin(restaurantsBox0, new Insets(20.0, 0.0, 0.0, 0.0));

        restLine.setEndY(180.0);
        restLine.setStartY(-180.0);

        restaurantsBox1.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        restaurantsBox1.setSpacing(35.0);

        restHBox2.setAlignment(javafx.geometry.Pos.CENTER);
        restHBox2.setSpacing(15.0);

        restLabel2.setText("Rated:");
        restLabel2.setFont(new Font(24.0));

        VBox.setMargin(restHBox2, new Insets(0.0));

        restHBox3.setAlignment(javafx.geometry.Pos.CENTER);
        restHBox3.setSpacing(15.0);

        restLabel3.setText("Price range:");
        restLabel3.setFont(new Font(24.0));
        HBox.setMargin(restLabel3, new Insets(0.0));

        restPriceMenu.setMnemonicParsing(false);
        restPriceMenu.setPrefWidth(160.0);
        restPriceMenu.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");

        restPrice1.setMnemonicParsing(false);
        restPrice1.setText("€ - €€");

        restPrice2.setMnemonicParsing(false);
        restPrice2.setText("€€ - €€€");

        restPrice3.setMnemonicParsing(false);
        restPrice3.setText("€€€ - €€€€");
        restPriceMenu.setFont(new Font(18.0));
        VBox.setMargin(restHBox3, new Insets(0.0));

        restLabel4.setText("Check your preferences:");
        restLabel4.setFont(new Font(24.0));

        restHBox4.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        restHBox4.setSpacing(30.0);

        restaurantsBox2.setSpacing(5.0);
        HBox.setMargin(restaurantsBox2, new Insets(0.0));

        pizzaCheck.setMnemonicParsing(false);
        pizzaCheck.setText("Pizza");
        pizzaCheck.setFont(new Font(18.0));

        sushiCheck.setMnemonicParsing(false);
        sushiCheck.setText("Sushi");
        sushiCheck.setFont(new Font(18.0));

        hamburgerCheck.setMnemonicParsing(false);
        hamburgerCheck.setText("Hamburger");
        hamburgerCheck.setFont(new Font(18.0));

        pastaCheck.setMnemonicParsing(false);
        pastaCheck.setText("Pasta");
        pastaCheck.setFont(new Font(18.0));

        restaurantsBox3.setSpacing(5.0);

        meatCheck.setMnemonicParsing(false);
        meatCheck.setText("Meat");
        meatCheck.setFont(new Font(18.0));

        fishCheck.setMnemonicParsing(false);
        fishCheck.setText("Fish");
        fishCheck.setFont(new Font(18.0));

        veganCheck.setMnemonicParsing(false);
        veganCheck.setText("Vegan");
        veganCheck.setFont(new Font(18.0));

        gurmetCheck.setMnemonicParsing(false);
        gurmetCheck.setText("Gurmet");
        gurmetCheck.setFont(new Font(18.0));
        VBox.setMargin(restHBox4, new Insets(-20.0, 0.0, 0.0, 0.0));
        HBox.setMargin(restaurantsBox1, new Insets(20.0, 54.0, 0.0, 54.0));

        restSearchButton.setMnemonicParsing(false);
        restSearchButton.setStyle("-fx-background-color: #1B59D7;");
        restSearchButton.setText("Search");
        restSearchButton.setTextFill(javafx.scene.paint.Color.WHITE);
        restSearchButton.setFont(new Font(24.0));
        restaurantsScene.setPadding(new Insets(50.0, 0.0, 0.0, 0.0));
        pane.setOpaqueInsets(new Insets(0.0));

        restaurantsBox0.getChildren().add(restLabel);
        restaurantsBox0.getChildren().add(restText);
        restaurantsBox0.getChildren().add(restLabel0);
        restaurantsBox0.getChildren().add(restText0);
        restHBox1.getChildren().add(restLabel1);
        restHBox1.getChildren().add(restText1);
        restaurantsBox0.getChildren().add(restHBox1);
        restHBox0.getChildren().add(restaurantsBox0);
        restHBox0.getChildren().add(restLine);
        restHBox2.getChildren().add(restLabel2);
        //restHBox2.getChildren().add(rating);
        restaurantsBox1.getChildren().add(restHBox2);
        restHBox3.getChildren().add(restLabel3);
        restPriceMenu.getItems().add(restPrice1);
        restPriceMenu.getItems().add(restPrice2);
        restPriceMenu.getItems().add(restPrice3);
        restHBox3.getChildren().add(restPriceMenu);
        restaurantsBox1.getChildren().add(restHBox3);
        restaurantsBox1.getChildren().add(restLabel4);
        restaurantsBox2.getChildren().add(pizzaCheck);
        restaurantsBox2.getChildren().add(sushiCheck);
        restaurantsBox2.getChildren().add(hamburgerCheck);
        restaurantsBox2.getChildren().add(pastaCheck);
        restHBox4.getChildren().add(restaurantsBox2);
        restaurantsBox3.getChildren().add(meatCheck);
        restaurantsBox3.getChildren().add(fishCheck);
        restaurantsBox3.getChildren().add(veganCheck);
        restaurantsBox3.getChildren().add(gurmetCheck);
        restHBox4.getChildren().add(restaurantsBox3);
        restaurantsBox1.getChildren().add(restHBox4);
        restHBox0.getChildren().add(restaurantsBox1);
        restaurantsScene.getChildren().add(restHBox0);
        restaurantsScene.getChildren().add(restSearchButton);
        
        //##########   (EVENTS)   ##########
        
        eventsScene.setAlignment(javafx.geometry.Pos.TOP_CENTER);
		eventsScene.setLayoutY(155.0);
		eventsScene.setPrefHeight(525.0);
		eventsScene.setPrefWidth(1050.0);
		eventsScene.setSpacing(30.0);

		eventsHBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
		eventsHBox.setPrefHeight(100.0);
		eventsHBox.setPrefWidth(200.0);
		eventsHBox.setSpacing(65.0);

		eventsVBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
		eventsVBox0.setMaxHeight(300.0);

		eventsLabel.setText("Which event are you looking for?");
		eventsLabel.setFont(new Font(24.0));

		eventsText.setAlignment(javafx.geometry.Pos.CENTER);
		eventsText.setPromptText("Es. Muse or Joker or Festival name");
		eventsText.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
		eventsText.setFont(new Font(24.0));
		VBox.setMargin(eventsText, new Insets(15.0, 0.0, 0.0, 0.0));

		eventsLabel0.setText("Where is located the event?");
		eventsLabel0.setFont(new Font(24.0));
		VBox.setMargin(eventsLabel0, new Insets(35.0, 0.0, 0.0, 0.0));

		eventsText0.setAlignment(javafx.geometry.Pos.CENTER);
		eventsText0.setPromptText("Es.  Rome");
		eventsText0.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
		eventsText0.setFont(new Font(24.0));
		VBox.setMargin(eventsText0, new Insets(15.0, 0.0, 0.0, 0.0));

		eventsHBox0.setAlignment(javafx.geometry.Pos.CENTER);
		eventsHBox0.setPrefHeight(34.0);
		eventsHBox0.setPrefWidth(402.0);
		eventsHBox0.setSpacing(15.0);

		eventsLabel1.setText("How many people?");
		eventsLabel1.setFont(new Font(24.0));

		eventsText1.setAlignment(javafx.geometry.Pos.CENTER);
		eventsText1.setPrefHeight(45.0);
		eventsText1.setPrefWidth(80.0);
		eventsText1.setPromptText("Es. 4");
		eventsText1.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
		eventsText1.setFont(new Font(24.0));
		VBox.setMargin(eventsHBox0, new Insets(35.0, 0.0, 0.0, 0.0));
		HBox.setMargin(eventsVBox0, new Insets(20.0, 0.0, 0.0, 0.0));

		eventsLine.setEndY(180.0);
		eventsLine.setStartY(-180.0);

		eventsVBox1.setAlignment(javafx.geometry.Pos.TOP_CENTER);
		eventsVBox1.setMinWidth(294.5);
		eventsVBox1.setSpacing(35.0);

		eventsLabel2.setText("When?");
		eventsLabel2.setFont(new Font(24.0));
		VBox.setMargin(eventsLabel2, new Insets(30.0, 0.0, 0.0, 0.0));

		eventsHBox1.setAlignment(javafx.geometry.Pos.CENTER);
		eventsHBox1.setPrefWidth(294.5);
		eventsHBox1.setSpacing(15.0);

		eventsDatePicker.setPrefHeight(45.0);

		eventsText2.setAlignment(javafx.geometry.Pos.CENTER);
		eventsText2.setPrefHeight(45.0);
		eventsText2.setPrefWidth(95.0);
		eventsText2.setPromptText("00:00");
		eventsText2.setStyle("-fx-background-color: #e2e8ff; -fx-background-radius: 20;");
		eventsText2.setFont(new Font(24.0));
		VBox.setMargin(eventsHBox1, new Insets(-20.0, 0.0, 0.0, 0.0));

		eventsLabel3.setText("Check your preferences:");
		eventsLabel3.setFont(new Font(24.0));
		VBox.setMargin(eventsLabel3, new Insets(20.0, 0.0, 0.0, 0.0));

		eventsHBox2.setAlignment(javafx.geometry.Pos.TOP_CENTER);
		eventsHBox2.setSpacing(30.0);

		eventsVBox2.setSpacing(5.0);
		HBox.setMargin(eventsVBox2, new Insets(0.0));

		concertCheck.setMnemonicParsing(false);
		concertCheck.setText("Concert");
		concertCheck.setFont(new Font(18.0));

		theatreCheck.setMnemonicParsing(false);
		theatreCheck.setText("Theatre");
		theatreCheck.setFont(new Font(18.0));

		eventsVBox3.setSpacing(5.0);

		cinemaCheck.setMnemonicParsing(false);
		cinemaCheck.setText("Cinema");
		cinemaCheck.setFont(new Font(18.0));

		museumCheck.setMnemonicParsing(false);
		museumCheck.setText("Museum");
		museumCheck.setFont(new Font(18.0));
		VBox.setMargin(eventsHBox2, new Insets(-20.0, 0.0, 0.0, 0.0));
		HBox.setMargin(eventsVBox1, new Insets(20.0, 54.0, 0.0, 54.0));

		eventsSearchButton.setMnemonicParsing(false);
		eventsSearchButton.setStyle("-fx-background-color: #1B59D7;");
		eventsSearchButton.setText("Search");
		eventsSearchButton.setTextFill(javafx.scene.paint.Color.WHITE);
		eventsSearchButton.setFont(new Font(24.0));
		eventsScene.setPadding(new Insets(50.0, 0.0, 0.0, 0.0));

		eventsVBox0.getChildren().add(eventsLabel);
		eventsVBox0.getChildren().add(eventsText);
		eventsVBox0.getChildren().add(eventsLabel0);
		eventsVBox0.getChildren().add(eventsText0);
		eventsHBox0.getChildren().add(eventsLabel1);
		eventsHBox0.getChildren().add(eventsText1);
		eventsVBox0.getChildren().add(eventsHBox0);
		eventsHBox.getChildren().add(eventsVBox0);
		eventsHBox.getChildren().add(eventsLine);
		eventsVBox1.getChildren().add(eventsLabel2);
		eventsHBox1.getChildren().add(eventsDatePicker);
		eventsHBox1.getChildren().add(eventsText2);
		eventsVBox1.getChildren().add(eventsHBox1);
		eventsVBox1.getChildren().add(eventsLabel3);
		eventsVBox2.getChildren().add(concertCheck);
		eventsVBox2.getChildren().add(theatreCheck);
		eventsHBox2.getChildren().add(eventsVBox2);
		eventsVBox3.getChildren().add(cinemaCheck);
		eventsVBox3.getChildren().add(museumCheck);
		eventsHBox2.getChildren().add(eventsVBox3);
		eventsVBox1.getChildren().add(eventsHBox2);
		eventsHBox.getChildren().add(eventsVBox1);
		eventsScene.getChildren().add(eventsHBox);
		eventsScene.getChildren().add(eventsSearchButton);
		
		//##########   (MAP)   ##########
		
		webView = new WebView();
		engine = webView.getEngine();
		//engine.load("https://www.google.com/maps/@41.8620127,12.6331147,15z");
		engine.load("https://www.google.com");
		
		//##########   (PROFILE)   ##########
		
		profileScene.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        profileScene.setLayoutY(155.0);
        profileScene.setPrefHeight(525.0);
        profileScene.setPrefWidth(1050.0);
        profileScene.setSpacing(30.0);

        profileHBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        profileHBox.setPrefHeight(100.0);
        profileHBox.setPrefWidth(200.0);
        profileHBox.setSpacing(65.0);

        profileVBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        profileVBox0.setMaxHeight(300.0);
        profileVBox0.setPrefWidth(402.0);
        profileVBox0.setSpacing(10.0);
        HBox.setMargin(profileVBox0, new Insets(20.0, 0.0, 0.0, 0.0));

        profileLabel.setText("Do you already have ");
        profileLabel.setFont(new Font(36.0));

        profileLabel0.setText("a profile? Log in to ");
        profileLabel0.setFont(new Font(36.0));

        profileLabel1.setText("organize your programs");
        profileLabel1.setFont(new Font(36.0));

        profileLabel2.setText("and book the facilities");
        profileLabel2.setFont(new Font(36.0));

        profileLabel3.setText("you prefer!");
        profileLabel3.setFont(new Font(36.0));

        profileLoginButton.setMnemonicParsing(false);
        profileLoginButton.setPrefWidth(115.0);
        profileLoginButton.setStyle("-fx-background-color: #1B59D7;");
        profileLoginButton.setText("Login");
        profileLoginButton.setTextFill(javafx.scene.paint.Color.WHITE);
        profileLoginButton.setFont(new Font(24.0));
        VBox.setMargin(profileLoginButton, new Insets(30.0, 0.0, 0.0, 0.0));

        profileLine.setEndY(180.0);
        profileLine.setStartY(-180.0);

        profileVBox1.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        profileVBox1.setMaxHeight(300.0);
        profileVBox1.setPrefWidth(402.0);
        profileVBox1.setSpacing(10.0);

        profileLabel4.setText("Are you new in our ");
        profileLabel4.setFont(new Font(36.0));

        profileLabel5.setText("system? You can create");
        profileLabel5.setFont(new Font(36.0));

        profileLabel6.setText("your own profile or your");
        profileLabel6.setFont(new Font(36.0));

        profileLabel7.setText("business profile to reserve ");
        profileLabel7.setFont(new Font(36.0));

        profileLabel8.setText("or get reserved!");
        profileLabel8.setFont(new Font(36.0));

        profileRegisterButton.setMnemonicParsing(false);
        profileRegisterButton.setPrefWidth(115.0);
        profileRegisterButton.setStyle("-fx-background-color: #1B59D7;");
        profileRegisterButton.setText("Register");
        profileRegisterButton.setTextFill(javafx.scene.paint.Color.WHITE);
        profileRegisterButton.setFont(new Font(24.0));
        VBox.setMargin(profileRegisterButton, new Insets(30.0, 0.0, 0.0, 0.0));
        HBox.setMargin(profileVBox1, new Insets(20.0, 0.0, 0.0, 0.0));
        profileScene.setPadding(new Insets(50.0, 0.0, 0.0, 0.0));

        profileVBox0.getChildren().add(profileLabel);
        profileVBox0.getChildren().add(profileLabel0);
        profileVBox0.getChildren().add(profileLabel1);
        profileVBox0.getChildren().add(profileLabel2);
        profileVBox0.getChildren().add(profileLabel3);
        profileVBox0.getChildren().add(profileLoginButton);
        profileHBox.getChildren().add(profileVBox0);
        profileHBox.getChildren().add(profileLine);
        profileVBox1.getChildren().add(profileLabel4);
        profileVBox1.getChildren().add(profileLabel5);
        profileVBox1.getChildren().add(profileLabel6);
        profileVBox1.getChildren().add(profileLabel7);
        profileVBox1.getChildren().add(profileLabel8);
        profileVBox1.getChildren().add(profileRegisterButton);
        profileHBox.getChildren().add(profileVBox1);
        profileScene.getChildren().add(profileHBox);
        
        profileLoginButton.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				user = LogWindow.Login();
				if (user.getName() == null) {
					isLogged = false;
				} else if (!(user.getName().equals(""))) {
					isLogged = true;
				}
		        if (isLogged == true) {
		        	b_profile.setText(user.getName());
		        }
			}
		});
        
        profileRegisterButton.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				if (LogWindow.Register()) {
					user = LogWindow.Login();
					if (user.getName() == null) {
						isLogged = false;
					} else if (!(user.getName().equals(""))) {
						isLogged = true;
					}
			        if (isLogged == true) {
			        	b_profile.setText(user.getName());
			        }
				}
			}
		});
        
        //#######################################
    	
        pane.setId("pane");
        b_findit.setId("b_selected");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");
        
        Scene scene = new Scene(pane,1050,680);
        
        stage.setResizable(false);
        
        scene.getStylesheets().addAll(this.getClass().getResource("home_style.css").toExternalForm());
        
        stage.setTitle("FindIT");
        stage.setScene(scene);
        stage.show();
    }
    
    public void homeScene() {
    	b_findit.setId("b_selected");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");

        pane.getChildren().clear();
		pane.getChildren().add(baseScene);
		pane.getChildren().add(homeScene);
    }
    
    public void hotelScene() {
    	b_findit.setId("b_menu");
        b_hotel.setId("b_selected");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");

        pane.getChildren().clear();
		pane.getChildren().add(baseScene);
		//pane.getChildren().add(hotelScene);
    }
    
    public void restScene() {

    	b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_selected");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");

        pane.getChildren().clear();
		pane.getChildren().add(baseScene);
		pane.getChildren().add(restaurantsScene);
    }
    
    public void eventsScene() {

    	b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_selected");
        b_map.setId("b_menu");
        b_profile.setId("b_menu");

        pane.getChildren().clear();
		pane.getChildren().add(baseScene);
		pane.getChildren().add(eventsScene);
    }
    
    public void mapScene() {
		b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_selected");
        b_profile.setId("b_menu");

        pane.getChildren().clear();
		pane.getChildren().add(baseScene);
		webView.setLayoutY(155.0);
		webView.setPrefHeight(525.0);
		webView.setPrefWidth(1050.0);
		pane.getChildren().add(webView);
		//pane.getChildren().add(mapScene);
    }
    
    public void profileScene() {
		b_findit.setId("b_menu");
        b_hotel.setId("b_menu");
        b_rest.setId("b_menu");
        b_events.setId("b_menu");
        b_map.setId("b_menu");
        b_profile.setId("b_selected");

        pane.getChildren().clear();
		pane.getChildren().add(baseScene);
		pane.getChildren().add(profileScene);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
