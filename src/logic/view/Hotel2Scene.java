package logic.view;

import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import logic.bean.HotelBean;
import logic.controller.HotelController;
import logic.model.Hotel;


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
    protected  ImageView imageVieHotel2;
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
    protected  Button btnPrecedent;
    protected  Button btnNext;

    public Hotel2Scene(HotelController controller, HotelBean bean, Hotel hotel1, Hotel hotel2, Hotel hotel3) {


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
        imageVieHotel2 = new ImageView();
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
        btnPrecedent = new Button();
        btnNext = new Button();

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

        imageViewHotel1.setFitHeight(136.0);
        imageViewHotel1.setFitWidth(171.0);
        imageViewHotel1.setPickOnBounds(true);
        imageViewHotel1.setPreserveRatio(true);

        vBoxInfo1.setPrefHeight(136.0);
        vBoxInfo1.setPrefWidth(427.0);

        btnHotel1.setMnemonicParsing(false);
        btnHotel1.setStyle("-fx-background-color: transparent;");
        //btnHotel1.setText("Hotel1");
        btnHotel1.setText(hotel1.getName());
        
        if (hotel1.getName() == null) {
        	btnHotel1.setText("Hotel not found!");
        }
        
        btnHotel1.setUnderline(true);
        btnHotel1.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnHotel1.setFont(new Font(24.0));

        //labelAddress1.setText("Indirizzo");
        labelAddress1.setText(hotel1.getAddress());
        labelAddress1.setFont(new Font(18.0));
        
        labelStar1.setText("numero stelle");
        labelStar1.setFont(new Font(18.0));

        vBoxPrezzo1.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxPrezzo1.setPrefHeight(136.0);
        vBoxPrezzo1.setPrefWidth(213.0);

        labelPrezzo1.setText("prezzo �");
        labelPrezzo1.setFont(new Font(18.0));
        vBoxPrezzo1.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        hBoxHotel1.setPadding(new Insets(5.0));

        hBoxHotel2.setPrefHeight(136.0);
        hBoxHotel2.setPrefWidth(200.0);
        hBoxHotel2.setSpacing(10.0);

        imageVieHotel2.setFitHeight(136.0);
        imageVieHotel2.setFitWidth(171.0);
        imageVieHotel2.setPickOnBounds(true);
        imageVieHotel2.setPreserveRatio(true);

        vBoxInfo2.setPrefHeight(200.0);
        vBoxInfo2.setPrefWidth(427.0);

        btnHotel2.setMnemonicParsing(false);
        btnHotel2.setStyle("-fx-background-color: transparent;");
        btnHotel2.setText("Hotel2");
        btnHotel2.setText(hotel2.getName());
        
        if (hotel2.getName() == null) {
        	btnHotel2.setText("Hotel not found!");
        }
                
        btnHotel2.setUnderline(true);
        btnHotel2.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnHotel2.setFont(new Font(24.0));

        //labelAddress2.setText("Indirizzo");
        labelAddress2.setText(hotel2.getAddress());
        labelAddress2.setFont(new Font(18.0));
        
        labelStar2.setText("numero stelle");
        labelStar2.setFont(new Font(18.0));

        vBoxPrezzo2.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxPrezzo2.setPrefHeight(136.0);
        vBoxPrezzo2.setPrefWidth(213.0);

        labelPrezzo2.setText("prezzo �");
        labelPrezzo2.setFont(new Font(18.0));
        vBoxPrezzo2.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        hBoxHotel2.setPadding(new Insets(5.0));

        hBoxHotel3.setPrefHeight(136.0);
        hBoxHotel3.setPrefWidth(200.0);
        hBoxHotel3.setSpacing(10.0);

        imageViewHotel3.setFitHeight(136.0);
        imageViewHotel3.setFitWidth(171.0);
        imageViewHotel3.setPickOnBounds(true);
        imageViewHotel3.setPreserveRatio(true);

        vBoxInfo3.setPrefHeight(200.0);
        vBoxInfo3.setPrefWidth(427.0);

        btnHotel3.setMnemonicParsing(false);
        btnHotel3.setStyle("-fx-background-color: transparent;");
        btnHotel3.setText("Hotel3");
        btnHotel3.setText(hotel3.getName());
        
        if (hotel3.getName() == null) {
        	btnHotel3.setText("Hotel not found!");
        }
          
        btnHotel3.setUnderline(true);
        btnHotel3.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnHotel3.setFont(new Font(24.0));

        //labelAddress3.setText("Indirizzo");
        labelAddress3.setText(hotel3.getAddress());
        labelAddress3.setFont(new Font(18.0));
        
        labelStar3.setText("numero stelle");
        labelStar3.setFont(new Font(18.0));

        vBoxPrezzo3.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxPrezzo3.setPrefHeight(136.0);
        vBoxPrezzo3.setPrefWidth(213.0);

        labelPrezzo3.setText("prezzo �");
        labelPrezzo3.setFont(new Font(18.0));
        vBoxPrezzo3.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));
        hBoxHotel3.setPadding(new Insets(5.0));

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxBtn.setPrefHeight(63.0);
        hBoxBtn.setPrefWidth(841.0);
        hBoxBtn.setSpacing(10.0);

        btnPrecedent.setMnemonicParsing(false);
        btnPrecedent.setText("<");
        btnPrecedent.setFont(new Font(18.0));

        btnNext.setMnemonicParsing(false);
        btnNext.setText(">");
        btnNext.setFont(new Font(18.0));
        setOpaqueInsets(new Insets(0.0));

        
        hBoxHotel1.getChildren().add(imageViewHotel1);
        vBoxInfo1.getChildren().add(btnHotel1);
        vBoxInfo1.getChildren().add(labelAddress1);
        vBoxInfo1.getChildren().add(labelStar1); 
        hBoxHotel1.getChildren().add(vBoxInfo1);
        vBoxPrezzo1.getChildren().add(labelPrezzo1); 
        hBoxHotel1.getChildren().add(vBoxPrezzo1); 
        vBoxListHotel.getChildren().add(hBoxHotel1);
        hBoxHotel2.getChildren().add(imageVieHotel2);
        vBoxInfo2.getChildren().add(btnHotel2);
        vBoxInfo2.getChildren().add(labelAddress2);
        vBoxInfo2.getChildren().add(labelStar2);
        hBoxHotel2.getChildren().add(vBoxInfo2);
        vBoxPrezzo2.getChildren().add(labelPrezzo2); 
        hBoxHotel2.getChildren().add(vBoxPrezzo2);
        vBoxListHotel.getChildren().add(hBoxHotel2);
        hBoxHotel3.getChildren().add(imageViewHotel3);
        vBoxInfo3.getChildren().add(btnHotel3);
        vBoxInfo3.getChildren().add(labelAddress3);
        vBoxInfo3.getChildren().add(labelAddress3);
        hBoxHotel3.getChildren().add(vBoxInfo3);
        vBoxPrezzo3.getChildren().add(labelPrezzo3);
        hBoxHotel3.getChildren().add(vBoxPrezzo3); 
        vBoxListHotel.getChildren().add(hBoxHotel3);
        hBoxBtn.getChildren().add(btnPrecedent);
        hBoxBtn.getChildren().add(btnNext);
        vBoxListHotel.getChildren().add(hBoxBtn);
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
        
        btnPrecedent.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnNext.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});

    }
}

