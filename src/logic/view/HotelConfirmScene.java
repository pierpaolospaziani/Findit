package logic.view;

import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.bean.HotelBean;
import logic.controller.HotelController;


public class HotelConfirmScene extends VBox{

	 	protected VBox vBox;
	    protected HBox hBoxNameHotel;
	    protected Text text;
	    protected Text txtNameHotel;
	    protected HBox hBoxLabelCheck;
	    protected Label label;
	    protected Label label0;
	    protected HBox hBoxDate;
	    protected Label labelCheckIn;
	    protected Label labelCheckOut;
	    protected HBox hBoxGuests;
	    protected Label labelGuests;
	    protected Text txtNumberGuests;
	    protected HBox hBoxPrice;
	    protected Label labelTotalP;
	    protected Label labelPrice;
	    protected HBox hBoxBtn;
	    protected Button btnUndo;
	    protected Button btnConfirm;

	    public HotelConfirmScene(HotelController controller, HotelBean bean) {
	   
	     
	        vBox = new VBox();
	        hBoxNameHotel = new HBox();
	        text = new Text();
	        txtNameHotel = new Text();
	        hBoxLabelCheck = new HBox();
	        label = new Label();
	        label0 = new Label();
	        hBoxDate = new HBox();
	        labelCheckIn = new Label();
	        labelCheckOut = new Label();
	        hBoxGuests = new HBox();
	        labelGuests = new Label();
	        txtNumberGuests = new Text();
	        hBoxPrice = new HBox();
	        labelTotalP = new Label();
	        labelPrice = new Label();
	        hBoxBtn = new HBox();
	        btnUndo = new Button();
	        btnConfirm = new Button();

	        setAlignment(javafx.geometry.Pos.TOP_CENTER);
	        setPrefHeight(525.0);
	        setPrefWidth(1050.0);
	        setSpacing(30.0);


	        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
	        vBox.setLayoutX(104.5);
	        vBox.setLayoutY(24.0);
	        vBox.setPrefHeight(477.0);
	        vBox.setPrefWidth(841.0);
	        vBox.setSpacing(20.0);

	        hBoxNameHotel.setAlignment(javafx.geometry.Pos.TOP_CENTER);
	        hBoxNameHotel.setPrefHeight(67.0);
	        hBoxNameHotel.setPrefWidth(841.0);

	        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
	        text.setStrokeWidth(0.0);
	        text.setText("Confirm the booking at:");
	        text.setWrappingWidth(294.3333969116211);
	        text.setFont(new Font(24.0));
	        HBox.setMargin(text, new Insets(0.0, 0.0, 0.0, 40.0));

	        txtNameHotel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
	        txtNameHotel.setStrokeWidth(0.0);
	        txtNameHotel.setText("' Nome Hotel '");
	        txtNameHotel.setWrappingWidth(358.71221923828125);
	        txtNameHotel.setFont(new Font(24.0));

	        hBoxLabelCheck.setAlignment(javafx.geometry.Pos.TOP_CENTER);
	        hBoxLabelCheck.setPrefHeight(35.0);
	        hBoxLabelCheck.setPrefWidth(497.0);
	        hBoxLabelCheck.setSpacing(105.0);

	        label.setText("Check-in");
	        label.setFont(new Font(24.0));

	        label0.setText("Check-out");
	        label0.setFont(new Font(24.0));

	        hBoxDate.setAlignment(javafx.geometry.Pos.CENTER);
	        hBoxDate.setMinHeight(45.0);
	        hBoxDate.setPrefHeight(45.0);
	        hBoxDate.setPrefWidth(462.0);
	        hBoxDate.setSpacing(30.0);

	        labelCheckIn.setPrefHeight(35.0);
	        labelCheckIn.setPrefWidth(183.0);
	        labelCheckIn.setText(bean.getLocalDateIn().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	        labelCheckIn.setFont(new Font(24.0));

	        labelCheckOut.setPrefHeight(35.0);
	        labelCheckOut.setPrefWidth(126.0);
	        labelCheckOut.setText(bean.getLocalDateOut().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	        labelCheckOut.setFont(new Font(24.0));

	        hBoxGuests.setAlignment(javafx.geometry.Pos.CENTER);
	        hBoxGuests.setPrefHeight(34.0);
	        hBoxGuests.setPrefWidth(402.0);
	        hBoxGuests.setSpacing(15.0);

	        labelGuests.setText("Number of Guests: ");
	        labelGuests.setFont(new Font(24.0));
	        HBox.setMargin(labelGuests, new Insets(0.0));

	        txtNumberGuests.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
	        txtNumberGuests.setStrokeWidth(0.0);
	        txtNumberGuests.setText(String.valueOf(bean.getNumPeople()));
	        txtNumberGuests.setWrappingWidth(38.2708740234375);
	        txtNumberGuests.setFont(new Font(24.0));

	        hBoxPrice.setAlignment(javafx.geometry.Pos.CENTER);
	        hBoxPrice.setPrefHeight(100.0);
	        hBoxPrice.setPrefWidth(200.0);

	        labelTotalP.setPrefHeight(35.0);
	        labelTotalP.setPrefWidth(151.0);
	        labelTotalP.setText("Total price:");
	        labelTotalP.setFont(new Font(24.0));

	        labelPrice.setPrefHeight(35.0);
	        labelPrice.setPrefWidth(104.0);
	        labelPrice.setText("3245�");
	        labelPrice.setFont(new Font(24.0));

	        hBoxBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
	        hBoxBtn.setPrefHeight(86.0);
	        hBoxBtn.setPrefWidth(841.0);
	        hBoxBtn.setSpacing(30.0);

	        btnUndo.setMaxWidth(117.0);
	        btnUndo.setMnemonicParsing(false);
	        btnUndo.setPrefHeight(51.0);
	        btnUndo.setPrefWidth(117.0);
	        btnUndo.setText("Undo");
	        btnUndo.setFont(new Font(24.0));

	        btnConfirm.setMnemonicParsing(false);
	        btnConfirm.setStyle("-fx-background-color: #1B59D7;");
	        btnConfirm.setText("Confirm");
	        btnConfirm.setTextFill(javafx.scene.paint.Color.WHITE);
	        btnConfirm.setFont(new Font(24.0));
	        setOpaqueInsets(new Insets(0.0));

	        
	        hBoxNameHotel.getChildren().add(text);
	        hBoxNameHotel.getChildren().add(txtNameHotel);
	        vBox.getChildren().add(hBoxNameHotel);
	        hBoxLabelCheck.getChildren().add(label);
	        hBoxLabelCheck.getChildren().add(label0);
	        vBox.getChildren().add(hBoxLabelCheck);
	        hBoxDate.getChildren().add(labelCheckIn);
	        hBoxDate.getChildren().add(labelCheckOut);
	        vBox.getChildren().add(hBoxDate);
	        hBoxGuests.getChildren().add(labelGuests);
	        hBoxGuests.getChildren().add(txtNumberGuests);
	        vBox.getChildren().add(hBoxGuests);
	        hBoxPrice.getChildren().add(labelTotalP);
	        hBoxPrice.getChildren().add(labelPrice);
	        vBox.getChildren().add(hBoxPrice);
	        hBoxBtn.getChildren().add(btnUndo);
	        hBoxBtn.getChildren().add(btnConfirm);
	        vBox.getChildren().add(hBoxBtn);
	        getChildren().add(vBox);
	        
	        
	        btnUndo.setOnAction(new EventHandler<ActionEvent>(){
	 			public void handle(ActionEvent event) {
	 				
	 				controller.returnBackHotelPage();
	 			}
	 		});
	        
	        btnConfirm.setOnAction(new EventHandler<ActionEvent>(){
	 			public void handle(ActionEvent event) {
	 				
	 				//dopo la conferma si potrbbe aprire una piccola dialog che dice 
	 				// prenotazione effettuata e ritornare alla home-page oppure aprire resoconto 
	 				// della prenotazione con un bottone per tornare alla home
	 			}
	 		});
	        

	    }
	}