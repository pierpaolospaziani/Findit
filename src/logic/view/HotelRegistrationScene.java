package logic.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class HotelRegistrationScene extends VBox {

    
    protected VBox vBox;
    protected HBox hBox0;
    protected Text text;
    protected HBox hBox1;
    protected VBox vBoxSx;
    protected HBox hBox2;
    protected Text text0;
    protected Text text1;
    protected HBox hBox3;
    protected TextField textFieldName;
    protected TextField textFieldStar;
    protected HBox hBox4;
    protected Text text2;
    protected Text text3;
    protected HBox hBox5;
    protected TextField textFieldCity;
    protected TextField textFieldaddress;
    protected HBox hBox6;
    protected VBox vBoxFacilities;
    protected Label label;
    protected CheckBox checkBoxParking;
    protected CheckBox checkBoxRestaurant;
    protected CheckBox checkBoxRoomService;
    protected CheckBox checkBoxFitnessCenter;
    protected VBox vBoxType;
    protected Label label0;
    protected CheckBox checkBoxapartaments;
    protected CheckBox checkBoxHotels;
    protected CheckBox checkBoxBeB;
    protected CheckBox checkBoxHostels;
    protected VBox vBoxDx;
    protected HBox hBox7;
    protected Text textNumber;
    protected Text textPrice;
    protected HBox hBox8;
    protected Text text6;
    protected TextField tfNumbSingleRoom;
    protected Separator separator;
    protected TextField tfPriceSingleRoom;
    protected HBox hBox9;
    protected Text text7;
    protected TextField tfNumbDoubleRoom;
    protected Separator separator0;
    protected TextField tfPriceDoubleRoom;
    protected HBox hBox10;
    protected Text text8;
    protected TextField tfNumbTripleRoom;
    protected Separator separator1;
    protected TextField tfPriceTripleRoom;
    protected HBox hBox11;
    protected Text text9;
    protected TextField tfNumbQuadrupleRoom;
    protected Separator separator2;
    protected TextField tfPriceQuadrupleRoom;
    protected HBox hBoxBtn;
    protected Button btnUndo;
    protected Button btnRegister;

    
    public HotelRegistrationScene() {  // manca controller e bean

        
        vBox = new VBox();
        hBox0 = new HBox();
        text = new Text();
        hBox1 = new HBox();
        vBoxSx = new VBox();
        hBox2 = new HBox();
        text0 = new Text();
        text1 = new Text();
        hBox3 = new HBox();
        textFieldName = new TextField();
        textFieldStar = new TextField();
        hBox4 = new HBox();
        text2 = new Text();
        text3 = new Text();
        hBox5 = new HBox();
        textFieldCity = new TextField();
        textFieldaddress = new TextField();
        hBox6 = new HBox();
        vBoxFacilities = new VBox();
        label = new Label();
        checkBoxParking = new CheckBox();
        checkBoxRestaurant = new CheckBox();
        checkBoxRoomService = new CheckBox();
        checkBoxFitnessCenter = new CheckBox();
        vBoxType = new VBox();
        label0 = new Label();
        checkBoxapartaments = new CheckBox();
        checkBoxHotels = new CheckBox();
        checkBoxBeB = new CheckBox();
        checkBoxHostels = new CheckBox();
        vBoxDx = new VBox();
        hBox7 = new HBox();
        textNumber = new Text();
        textPrice = new Text();
        hBox8 = new HBox();
        text6 = new Text();
        tfNumbSingleRoom = new TextField();
        separator = new Separator();
        tfPriceSingleRoom = new TextField();
        hBox9 = new HBox();
        text7 = new Text();
        tfNumbDoubleRoom = new TextField();
        separator0 = new Separator();
        tfPriceDoubleRoom = new TextField();
        hBox10 = new HBox();
        text8 = new Text();
        tfNumbTripleRoom = new TextField();
        separator1 = new Separator();
        tfPriceTripleRoom = new TextField();
        hBox11 = new HBox();
        text9 = new Text();
        tfNumbQuadrupleRoom = new TextField();
        separator2 = new Separator();
        tfPriceQuadrupleRoom = new TextField();
        hBoxBtn = new HBox();
        btnUndo = new Button();
        btnRegister = new Button();

        setAlignment(javafx.geometry.Pos.TOP_CENTER);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);
        setSpacing(30.0);


        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setLayoutX(15.0);
        vBox.setLayoutY(24.0);
        vBox.setPrefHeight(485.0);
        vBox.setPrefWidth(1020.0);

        hBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Registration of the structure");
        text.setWrappingWidth(320.64129638671875);
        text.setFont(new Font(24.0));

        hBox1.setPrefHeight(452.0);
        hBox1.setPrefWidth(1017.0);

        vBoxSx.setPrefHeight(433.0);
        vBoxSx.setPrefWidth(510.0);

        hBox2.setAlignment(javafx.geometry.Pos.CENTER);
        hBox2.setPrefHeight(37.0);
        hBox2.setPrefWidth(510.0);
        hBox2.setSpacing(200.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Name");
        text0.setFont(new Font(24.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Star");
        text1.setFont(new Font(24.0));

        hBox3.setAlignment(javafx.geometry.Pos.CENTER);
        hBox3.setPrefHeight(60.0);
        hBox3.setPrefWidth(500.0);
        hBox3.setSpacing(30.0);

        textFieldName.setAlignment(javafx.geometry.Pos.CENTER);
        textFieldName.setPromptText("Name Structure");
        textFieldName.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        textFieldName.setFont(new Font(24.0));
        HBox.setMargin(textFieldName, new Insets(0.0, 0.0, 0.0, 10.0));

        textFieldStar.setAlignment(javafx.geometry.Pos.CENTER);
        textFieldStar.setPromptText("1 to 5 star");
        textFieldStar.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        textFieldStar.setFont(new Font(24.0));
        HBox.setMargin(textFieldStar, new Insets(0.0, 10.0, 0.0, 0.0));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 0.0, 10.0));

        hBox4.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        hBox4.setPrefHeight(27.0);
        hBox4.setPrefWidth(510.0);
        hBox4.setSpacing(200.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("City");
        text2.setFont(new Font(24.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Address");
        text3.setFont(new Font(24.0));
        hBox4.setPadding(new Insets(0.0, 0.0, 0.0, 30.0));

        hBox5.setAlignment(javafx.geometry.Pos.CENTER);
        hBox5.setPrefHeight(61.0);
        hBox5.setPrefWidth(500.0);
        hBox5.setSpacing(30.0);

        textFieldCity.setAlignment(javafx.geometry.Pos.CENTER);
        textFieldCity.setPromptText("City Structure");
        textFieldCity.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        textFieldCity.setFont(new Font(24.0));
        HBox.setMargin(textFieldCity, new Insets(0.0, 0.0, 0.0, 10.0));

        textFieldaddress.setAlignment(javafx.geometry.Pos.CENTER);
        textFieldaddress.setPromptText("Address structure");
        textFieldaddress.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        textFieldaddress.setFont(new Font(24.0));
        HBox.setMargin(textFieldaddress, new Insets(0.0, 10.0, 0.0, 0.0));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 0.0, 10.0));

        hBox6.setPrefHeight(100.0);
        hBox6.setPrefWidth(200.0);

        vBoxFacilities.setPrefHeight(180.0);
        vBoxFacilities.setPrefWidth(285.0);
        vBoxFacilities.setSpacing(5.0);

        label.setText("Facilities");
        label.setFont(new Font(24.0));
        VBox.setMargin(label, new Insets(0.0, 0.0, 0.0, 60.0));

        checkBoxParking.setMnemonicParsing(false);
        checkBoxParking.setText("Parking");
        checkBoxParking.setFont(new Font(18.0));

        checkBoxRestaurant.setMnemonicParsing(false);
        checkBoxRestaurant.setText("Restaurant");
        checkBoxRestaurant.setFont(new Font(18.0));

        checkBoxRoomService.setMnemonicParsing(false);
        checkBoxRoomService.setText("Room service");
        checkBoxRoomService.setFont(new Font(18.0));

        checkBoxFitnessCenter.setMnemonicParsing(false);
        checkBoxFitnessCenter.setText("Fitness centre");
        checkBoxFitnessCenter.setFont(new Font(18.0));

        vBoxType.setPrefHeight(396.0);
        vBoxType.setPrefWidth(231.0);
        vBoxType.setSpacing(5.0);

        label0.setPrefHeight(35.0);
        label0.setPrefWidth(203.0);
        label0.setText("Property type");
        label0.setFont(new Font(24.0));
        VBox.setMargin(label0, new Insets(0.0));
        label0.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        checkBoxapartaments.setMnemonicParsing(false);
        checkBoxapartaments.setText("Apartamnets");
        checkBoxapartaments.setFont(new Font(18.0));

        checkBoxHotels.setMnemonicParsing(false);
        checkBoxHotels.setText("Hotels");
        checkBoxHotels.setFont(new Font(18.0));

        checkBoxBeB.setMnemonicParsing(false);
        checkBoxBeB.setText("B&B");
        checkBoxBeB.setFont(new Font(18.0));

        checkBoxHostels.setMnemonicParsing(false);
        checkBoxHostels.setText("Hostels");
        checkBoxHostels.setFont(new Font(18.0));
        hBox6.setPadding(new Insets(0.0, 0.0, 0.0, 25.0));

        vBoxDx.setPrefHeight(418.0);
        vBoxDx.setPrefWidth(510.0);
        vBoxDx.setSpacing(15.0);

        hBox7.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox7.setPrefHeight(70.0);
        hBox7.setPrefWidth(510.0);
        hBox7.setSpacing(120.0);

        textNumber.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textNumber.setStrokeWidth(0.0);
        textNumber.setText("Number of ");
        textNumber.setFont(new Font(24.0));

        textPrice.setLineSpacing(20.0);
        textPrice.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textPrice.setStrokeWidth(0.0);
        textPrice.setText("Price for Night");
        textPrice.setFont(new Font(24.0));
        hBox7.setPadding(new Insets(0.0, 0.0, 0.0, 80.0));

        hBox8.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox8.setPrefHeight(50.0);
        hBox8.setPrefWidth(510.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Single Room");
        text6.setWrappingWidth(203.5728759765625);
        text6.setFont(new Font(24.0));

        tfNumbSingleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfNumbSingleRoom.setPrefHeight(45.0);
        tfNumbSingleRoom.setPrefWidth(90.0);
        tfNumbSingleRoom.setPromptText("Es. 4");
        tfNumbSingleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfNumbSingleRoom.setFont(new Font(24.0));

        separator.setOpacity(0.0);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(51.0);
        separator.setPrefWidth(65.0);

        tfPriceSingleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfPriceSingleRoom.setPrefHeight(45.0);
        tfPriceSingleRoom.setPrefWidth(90.0);
        tfPriceSingleRoom.setPromptText("50€");
        tfPriceSingleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfPriceSingleRoom.setFont(new Font(24.0));

        hBox9.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox9.setPrefHeight(50.0);
        hBox9.setPrefWidth(510.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Double Room");
        text7.setWrappingWidth(204.5728759765625);
        text7.setFont(new Font(24.0));

        tfNumbDoubleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfNumbDoubleRoom.setPrefHeight(45.0);
        tfNumbDoubleRoom.setPrefWidth(90.0);
        tfNumbDoubleRoom.setPromptText("Es. 4");
        tfNumbDoubleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfNumbDoubleRoom.setFont(new Font(24.0));

        separator0.setOpacity(0.0);
        separator0.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator0.setPrefHeight(51.0);
        separator0.setPrefWidth(65.0);

        tfPriceDoubleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfPriceDoubleRoom.setPrefHeight(45.0);
        tfPriceDoubleRoom.setPrefWidth(90.0);
        tfPriceDoubleRoom.setPromptText("100€");
        tfPriceDoubleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfPriceDoubleRoom.setFont(new Font(24.0));

        hBox10.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox10.setPrefHeight(50.0);
        hBox10.setPrefWidth(200.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Triple Room");
        text8.setWrappingWidth(205.90631103515625);
        text8.setFont(new Font(24.0));

        tfNumbTripleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfNumbTripleRoom.setPrefHeight(45.0);
        tfNumbTripleRoom.setPrefWidth(90.0);
        tfNumbTripleRoom.setPromptText("Es. 4");
        tfNumbTripleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfNumbTripleRoom.setFont(new Font(24.0));

        separator1.setOpacity(0.0);
        separator1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator1.setPrefHeight(51.0);
        separator1.setPrefWidth(65.0);

        tfPriceTripleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfPriceTripleRoom.setPrefHeight(45.0);
        tfPriceTripleRoom.setPrefWidth(90.0);
        tfPriceTripleRoom.setPromptText("150€");
        tfPriceTripleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfPriceTripleRoom.setFont(new Font(24.0));

        hBox11.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox11.setPrefHeight(50.0);
        hBox11.setPrefWidth(200.0);

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Quadruple Room");
        text9.setWrappingWidth(206.2396240234375);
        text9.setFont(new Font(24.0));

        tfNumbQuadrupleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfNumbQuadrupleRoom.setPrefHeight(45.0);
        tfNumbQuadrupleRoom.setPrefWidth(90.0);
        tfNumbQuadrupleRoom.setPromptText("Es. 4");
        tfNumbQuadrupleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfNumbQuadrupleRoom.setFont(new Font(24.0));

        separator2.setOpacity(0.0);
        separator2.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator2.setPrefHeight(51.0);
        separator2.setPrefWidth(65.0);

        tfPriceQuadrupleRoom.setAlignment(javafx.geometry.Pos.CENTER);
        tfPriceQuadrupleRoom.setPrefHeight(45.0);
        tfPriceQuadrupleRoom.setPrefWidth(90.0);
        tfPriceQuadrupleRoom.setPromptText("200€");
        tfPriceQuadrupleRoom.setStyle("-fx-background-color: #e2e8ff#e2e8ff; -fx-background-radius: 20;");
        tfPriceQuadrupleRoom.setFont(new Font(24.0));
        vBoxDx.setPadding(new Insets(0.0, 0.0, 0.0, 10.0));

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxBtn.setPrefHeight(63.0);
        hBoxBtn.setPrefWidth(841.0);
        hBoxBtn.setSpacing(30.0);

        btnUndo.setMnemonicParsing(false);
        btnUndo.setPrefHeight(51.0);
        btnUndo.setPrefWidth(119.0);
        btnUndo.setText("Undo");
        btnUndo.setFont(new Font(24.0));

        btnRegister.setMnemonicParsing(false);
        btnRegister.setStyle("-fx-background-color: #1B59D7;");
        btnRegister.setText("Register");
        btnRegister.setTextFill(javafx.scene.paint.Color.WHITE);
        btnRegister.setFont(new Font(24.0));
        setOpaqueInsets(new Insets(0.0));

        hBox0.getChildren().add(text);
        vBox.getChildren().add(hBox0);
        hBox2.getChildren().add(text0);
        hBox2.getChildren().add(text1);
        vBoxSx.getChildren().add(hBox2);
        hBox3.getChildren().add(textFieldName);
        hBox3.getChildren().add(textFieldStar);
        vBoxSx.getChildren().add(hBox3);
        hBox4.getChildren().add(text2);
        hBox4.getChildren().add(text3);
        vBoxSx.getChildren().add(hBox4);
        hBox5.getChildren().add(textFieldCity);
        hBox5.getChildren().add(textFieldaddress);
        vBoxSx.getChildren().add(hBox5);
        vBoxFacilities.getChildren().add(label);
        vBoxFacilities.getChildren().add(checkBoxParking);
        vBoxFacilities.getChildren().add(checkBoxRestaurant);
        vBoxFacilities.getChildren().add(checkBoxRoomService);
        vBoxFacilities.getChildren().add(checkBoxFitnessCenter);
        hBox6.getChildren().add(vBoxFacilities);
        vBoxType.getChildren().add(label0);
        vBoxType.getChildren().add(checkBoxapartaments);
        vBoxType.getChildren().add(checkBoxHotels);
        vBoxType.getChildren().add(checkBoxBeB);
        vBoxType.getChildren().add(checkBoxHostels);
        hBox6.getChildren().add(vBoxType);
        vBoxSx.getChildren().add(hBox6);
        hBox1.getChildren().add(vBoxSx);
        hBox7.getChildren().add(textNumber);
        hBox7.getChildren().add(textPrice);
        vBoxDx.getChildren().add(hBox7);
        hBox8.getChildren().add(text6);
        hBox8.getChildren().add(tfNumbSingleRoom);
        hBox8.getChildren().add(separator);
        hBox8.getChildren().add(tfPriceSingleRoom);
        vBoxDx.getChildren().add(hBox8);
        hBox9.getChildren().add(text7);
        hBox9.getChildren().add(tfNumbDoubleRoom);
        hBox9.getChildren().add(separator0);
        hBox9.getChildren().add(tfPriceDoubleRoom);
        vBoxDx.getChildren().add(hBox9);
        hBox10.getChildren().add(text8);
        hBox10.getChildren().add(tfNumbTripleRoom);
        hBox10.getChildren().add(separator1);
        hBox10.getChildren().add(tfPriceTripleRoom);
        vBoxDx.getChildren().add(hBox10);
        hBox11.getChildren().add(text9);
        hBox11.getChildren().add(tfNumbQuadrupleRoom);
        hBox11.getChildren().add(separator2);
        hBox11.getChildren().add(tfPriceQuadrupleRoom);
        vBoxDx.getChildren().add(hBox11);
        hBox1.getChildren().add(vBoxDx);
        vBox.getChildren().add(hBox1);
        hBoxBtn.getChildren().add(btnUndo);
        hBoxBtn.getChildren().add(btnRegister);
        vBox.getChildren().add(hBoxBtn);
        getChildren().add(vBox);
       


/*
        btnUndo.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnRegister.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
 */

        
        // gestione check box
        
    }
}