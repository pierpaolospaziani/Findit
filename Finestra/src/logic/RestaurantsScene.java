package logic;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public class RestaurantsScene extends VBox{

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
    
    public RestaurantsScene(){
    	setUp();
    }
    
    public void setUp() {
    	
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
        
        setAlignment(javafx.geometry.Pos.TOP_CENTER);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);
        setSpacing(30.0);

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
        setPadding(new Insets(50.0, 0.0, 0.0, 0.0));

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
        getChildren().add(restHBox0);
        getChildren().add(restSearchButton);
    }
}
