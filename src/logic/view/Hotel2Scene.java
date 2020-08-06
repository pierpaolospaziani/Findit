package logic.view;

import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.bean.HotelBean;
import logic.controller.HotelController;
import logic.model.Hotel;
import logic.model.Room;


public class Hotel2Scene extends VBox{

	protected  VBox vBoxListHotel;
    protected  HBox hBoxHotel1;
    protected  ImageView imageViewHotel1;
    protected  VBox vBoxInfo1;
    protected  Button btnHotel1;
    protected  Label labelAddress1;
    protected  Label labelStar1;
    protected  VBox vBoxPrezzo1;
    protected  Label labelPrezzo1;
    protected  HBox hBoxHotel2;
    protected  ImageView imageViewHotel2;
    protected  VBox vBoxInfo2;
    protected  Button btnHotel2;
    protected  Label labelAddress2;
    protected  Label labelStar2;
    protected  VBox vBoxPrezzo2;
    protected  Label labelPrezzo2;
    protected  HBox hBoxHotel3;
    protected  ImageView imageViewHotel3;
    protected  VBox vBoxInfo3;
    protected  Button btnHotel3;
    protected  Label labelAddress3;
    protected  Label labelStar3;
    protected  VBox vBoxPrezzo3;
    protected  Label labelPrezzo3;
    protected  HBox hBoxBtn;
    protected  Button btnBack;
    protected  Button btnPrecedent;
    protected  Button btnNext;
    protected  HBox hBoxNumbPage;
    protected  Text txtNumberPage;
    
    protected Separator separatorHotel1;
    protected Separator separatorHotel2;
    protected Separator separatorHotel3;
    protected Separator separatorBtnBack;
    protected Separator separatorBtnFrecce;
    
   
    
	public Hotel2Scene(HotelController controller, HotelBean bean, Hotel hotel1, Room room1, Hotel hotel2, Room room2, Hotel hotel3, Room room3) {

		
    	vBoxListHotel = new VBox();
        hBoxHotel1 = new HBox();
        imageViewHotel1 = new ImageView();
        vBoxInfo1 = new VBox();
        btnHotel1 = new Button();
        labelAddress1 = new Label();
        labelStar1 = new Label();
        vBoxPrezzo1 = new VBox();
        labelPrezzo1 = new Label();
        hBoxHotel2 = new HBox();
        imageViewHotel2 = new ImageView();
        vBoxInfo2 = new VBox();
        btnHotel2 = new Button();
        labelAddress2 = new Label();
        labelStar2 = new Label();
        vBoxPrezzo2 = new VBox();
        labelPrezzo2 = new Label();
        hBoxHotel3 = new HBox();
        imageViewHotel3 = new ImageView();
        vBoxInfo3 = new VBox();
        btnHotel3 = new Button();
        labelAddress3 = new Label();
        labelStar3 = new Label();
        vBoxPrezzo3 = new VBox();
        labelPrezzo3 = new Label();
        hBoxBtn = new HBox();
        btnBack = new Button();
        btnPrecedent = new Button();
        btnNext = new Button();
        hBoxNumbPage = new HBox();
        txtNumberPage = new Text();
        
        separatorHotel1 = new Separator();
        separatorHotel2 = new Separator();
        separatorHotel3 = new Separator();
        
        separatorBtnBack = new Separator();
        separatorBtnFrecce = new Separator();

        setAlignment(javafx.geometry.Pos.TOP_CENTER);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);
        setSpacing(30.0);

        vBoxListHotel.setLayoutX(104.5);
        vBoxListHotel.setLayoutY(24.0);
        vBoxListHotel.setPrefHeight(477.0);
        vBoxListHotel.setPrefWidth(841.0);

        hBoxHotel1.setPrefHeight(136.0);
        hBoxHotel1.setPrefWidth(200.0);
        hBoxHotel1.setSpacing(10.0);
        
        separatorHotel1.setOpacity(0.0);
        separatorHotel1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorHotel1.setPrefHeight(57.0);
        separatorHotel1.setPrefWidth(50.0);
      

        imageViewHotel1.setFitHeight(136.0);
        imageViewHotel1.setFitWidth(171.0);
        imageViewHotel1.setPickOnBounds(true);
        imageViewHotel1.setPreserveRatio(true);

        vBoxInfo1.setPrefHeight(136.0);
        vBoxInfo1.setPrefWidth(427.0);

        btnHotel1.setMnemonicParsing(false);
        btnHotel1.setStyle("-fx-background-color: transparent;");
        btnHotel1.setText(hotel1.getName());
        
        btnHotel1.setUnderline(true);
        btnHotel1.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnHotel1.setFont(new Font(24.0));

        labelAddress1.setText(hotel1.getAddress());
        labelAddress1.setFont(new Font(18.0));
        
        labelStar1.setText(String.valueOf(hotel1.getRating()) + " Stars");
        labelStar1.setFont(new Font(18.0));

        vBoxPrezzo1.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxPrezzo1.setPrefHeight(136.0);
        vBoxPrezzo1.setPrefWidth(213.0);

        labelPrezzo1.setText(String.valueOf(room1.getPrice()) + "€");
        labelPrezzo1.setFont(new Font(18.0));
        vBoxPrezzo1.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        hBoxHotel1.setPadding(new Insets(5.0));
        
        if (hotel1.getName() == null) {
        	btnHotel1.setText("Hotel not found!");
        	labelStar1.setText("");
        	labelPrezzo1.setText("");
        }

        hBoxHotel2.setPrefHeight(136.0);
        hBoxHotel2.setPrefWidth(200.0);
        hBoxHotel2.setSpacing(10.0);
        
        separatorHotel2.setOpacity(0.0);
        separatorHotel2.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorHotel2.setPrefHeight(57.0);
        separatorHotel2.setPrefWidth(50.0);

        imageViewHotel2.setFitHeight(136.0);
        imageViewHotel2.setFitWidth(171.0);
        imageViewHotel2.setPickOnBounds(true);
        imageViewHotel2.setPreserveRatio(true);

        vBoxInfo2.setPrefHeight(200.0);
        vBoxInfo2.setPrefWidth(427.0);

        btnHotel2.setMnemonicParsing(false);
        btnHotel2.setStyle("-fx-background-color: transparent;");
        btnHotel2.setText("Hotel2");
        btnHotel2.setText(hotel2.getName());
                
        btnHotel2.setUnderline(true);
        btnHotel2.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnHotel2.setFont(new Font(24.0));

        labelAddress2.setText(hotel2.getAddress());
        labelAddress2.setFont(new Font(18.0));
        
        labelStar2.setText(String.valueOf(hotel2.getRating()) + " Stars");
        labelStar2.setFont(new Font(18.0));

        vBoxPrezzo2.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxPrezzo2.setPrefHeight(136.0);
        vBoxPrezzo2.setPrefWidth(213.0);

        labelPrezzo2.setText(String.valueOf(room2.getPrice()) + "€");
        labelPrezzo2.setFont(new Font(18.0));
        vBoxPrezzo2.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        hBoxHotel2.setPadding(new Insets(5.0));
        
        if (hotel2.getName() == null) {
        	btnHotel2.setText("Hotel not found!");
        	labelStar2.setText("");
        	labelPrezzo2.setText("");
        }

        hBoxHotel3.setPrefHeight(136.0);
        hBoxHotel3.setPrefWidth(200.0);
        hBoxHotel3.setSpacing(10.0);
        
        separatorHotel3.setOpacity(0.0);
        separatorHotel3.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorHotel3.setPrefHeight(57.0);
        separatorHotel3.setPrefWidth(50.0);

        imageViewHotel3.setFitHeight(136.0);
        imageViewHotel3.setFitWidth(171.0);
        imageViewHotel3.setPickOnBounds(true);
        imageViewHotel3.setPreserveRatio(true);

        vBoxInfo3.setPrefHeight(200.0);
        vBoxInfo3.setPrefWidth(427.0);

        btnHotel3.setMnemonicParsing(false);
        btnHotel3.setStyle("-fx-background-color: transparent;");
        btnHotel3.setText(hotel3.getName());
          
        btnHotel3.setUnderline(true);
        btnHotel3.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnHotel3.setFont(new Font(24.0));
        
        labelAddress3.setText(hotel3.getAddress());
        labelAddress3.setFont(new Font(18.0));
        
        labelStar3.setText(String.valueOf(hotel3.getRating()) + " Stars");
        labelStar3.setFont(new Font(18.0));

        vBoxPrezzo3.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxPrezzo3.setPrefHeight(136.0);
        vBoxPrezzo3.setPrefWidth(213.0);

        labelPrezzo3.setText(String.valueOf(room3.getPrice()) + "€");
        labelPrezzo3.setFont(new Font(18.0));
        vBoxPrezzo3.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        hBoxHotel3.setPadding(new Insets(5.0));
        
        if (hotel3.getName() == null) {
        	btnHotel3.setText("Hotel not found!");
        	labelStar3.setText("");
        	labelPrezzo3.setText("");
        }

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBoxBtn.setPrefHeight(63.0);
        hBoxBtn.setPrefWidth(841.0);
        hBoxBtn.setSpacing(10.0);
        
        separatorBtnBack.setOpacity(0.0);
        separatorBtnBack.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorBtnBack.setPrefHeight(57.0);
        separatorBtnBack.setPrefWidth(50.0);
        
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(39.0);
        btnBack.setPrefWidth(118.0);
        btnBack.setStyle("-fx-background-color: #1B59D7;");
        btnBack.setText("<<back");
        btnBack.setTextFill(javafx.scene.paint.Color.WHITE);
        btnBack.setFont(new Font(24.0));
        
        separatorBtnFrecce.setOpacity(0.0);
        separatorBtnFrecce.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorBtnFrecce.setPrefHeight(57.0);
        separatorBtnFrecce.setPrefWidth(270.0);

        btnPrecedent.setMnemonicParsing(false);
        btnPrecedent.setPrefHeight(51.0);
        btnPrecedent.setPrefWidth(51.0);
        btnPrecedent.setStyle("-fx-background-color: #1B59D7;");
        btnPrecedent.setText("<");
        btnPrecedent.setTextFill(javafx.scene.paint.Color.WHITE);
        btnPrecedent.setFont(new Font(24.0));

        btnNext.setMnemonicParsing(false);
        btnNext.setPrefHeight(51.0);
        btnNext.setPrefWidth(51.0);
        btnNext.setStyle("-fx-background-color: #1B59D7;");
        btnNext.setText(">");
        btnNext.setTextFill(javafx.scene.paint.Color.WHITE);
        btnNext.setFont(new Font(24.0));;
        
        hBoxNumbPage.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        hBoxNumbPage.setPrefHeight(17.0);
        hBoxNumbPage.setPrefWidth(850.0);

        txtNumberPage.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtNumberPage.setStrokeWidth(0.0);
        txtNumberPage.setText("1");
        txtNumberPage.setFont(new Font(18.0));
        setOpaqueInsets(new Insets(0.0));

        hBoxHotel1.getChildren().add(separatorHotel1);
        hBoxHotel1.getChildren().add(imageViewHotel1);
        vBoxInfo1.getChildren().add(btnHotel1);
        vBoxInfo1.getChildren().add(labelAddress1);
        vBoxInfo1.getChildren().add(labelStar1); 
        hBoxHotel1.getChildren().add(vBoxInfo1);
        vBoxPrezzo1.getChildren().add(labelPrezzo1); 
        hBoxHotel1.getChildren().add(vBoxPrezzo1);
        vBoxListHotel.getChildren().add(hBoxHotel1);
        hBoxHotel2.getChildren().add(separatorHotel2);
        hBoxHotel2.getChildren().add(imageViewHotel2);
        vBoxInfo2.getChildren().add(btnHotel2);
        vBoxInfo2.getChildren().add(labelAddress2);
        vBoxInfo2.getChildren().add(labelStar2);
        hBoxHotel2.getChildren().add(vBoxInfo2);
        vBoxPrezzo2.getChildren().add(labelPrezzo2); 
        hBoxHotel2.getChildren().add(vBoxPrezzo2);
        vBoxListHotel.getChildren().add(hBoxHotel2);
        hBoxHotel3.getChildren().add(separatorHotel3);
        hBoxHotel3.getChildren().add(imageViewHotel3);
        vBoxInfo3.getChildren().add(btnHotel3);
        vBoxInfo3.getChildren().add(labelAddress3);
        vBoxInfo3.getChildren().add(labelStar3);
        hBoxHotel3.getChildren().add(vBoxInfo3);
        vBoxPrezzo3.getChildren().add(labelPrezzo3);
        hBoxHotel3.getChildren().add(vBoxPrezzo3); 
        vBoxListHotel.getChildren().add(hBoxHotel3);
        hBoxBtn.getChildren().add(separatorBtnBack);
        hBoxBtn.getChildren().add(btnBack);
        hBoxBtn.getChildren().add(separatorBtnFrecce);
        hBoxBtn.getChildren().add(btnPrecedent);
        hBoxBtn.getChildren().add(btnNext);
        vBoxListHotel.getChildren().add(hBoxBtn);
        hBoxNumbPage.getChildren().add(txtNumberPage);
        vBoxListHotel.getChildren().add(hBoxNumbPage);
        getChildren().add(vBoxListHotel);
        
        btnHotel1.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnHotel2.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnHotel3.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnBack.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				controller.changeScene();
 			}
 		});
        
        btnPrecedent.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				int indice = controller.getIndice();
 			
 				
 				if (indice > 3) {
 					if ((indice%3) == 0) {
 	 					indice = indice - 3;
 	 					controller.changeScene2(indice);
 					} else if ((indice%3) == 1) {
 	 	 				indice = indice - 4;
 	 	 				controller.changeScene2(indice);
 	 				} else {
 	 					indice = indice - 5;
 	 	 				controller.changeScene2(indice);
 	 				}
 				}		
 					
 				
 			}
 		});
        
        btnNext.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 			
 				int indice = controller.getIndice();
 			
 				controller.changeScene2(indice);
 				
 			}
 		});

    }
}

