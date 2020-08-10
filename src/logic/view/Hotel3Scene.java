package logic.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.controller.HotelController;
import logic.model.Hotel;
import logic.model.Room;


public class Hotel3Scene extends VBox{
	
	protected VBox vBox;
    protected HBox hBoxHotelName;
    protected ImageView imageViewHotel;
    protected VBox vBoxHotelInfo;
    protected Text textName;
    protected Text textAddress;
    protected Text textNStars;
    protected VBox vBoxReview;
    protected Button btnReview;
    protected VBox vBoxDescription;
    protected Text textDescription;
    protected HBox hBoxBtn;
    protected Button btnBack;
    protected Button btnBook;

    public Hotel3Scene(HotelController controller, Hotel hotel, Room room) {

        
        vBox = new VBox();
        hBoxHotelName = new HBox();
        imageViewHotel = new ImageView();
        vBoxHotelInfo = new VBox();
        textName = new Text();
        textAddress = new Text();
        textNStars = new Text();
        vBoxReview = new VBox();
        btnReview = new Button();
        vBoxDescription = new VBox();
        textDescription = new Text();
        hBoxBtn = new HBox();
        btnBack = new Button();
        btnBook = new Button();

        setAlignment(javafx.geometry.Pos.TOP_CENTER);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);
        setSpacing(30.0);

     
        vBox.setLayoutX(104.5);
        vBox.setLayoutY(24.0);
        vBox.setPrefHeight(477.0);
        vBox.setPrefWidth(841.0);
        

        hBoxHotelName.setPrefHeight(138.0);
        hBoxHotelName.setPrefWidth(841.0);
        hBoxHotelName.setSpacing(30.0);
        
        

        imageViewHotel.setFitHeight(162.0);
        imageViewHotel.setFitWidth(200.0);
        imageViewHotel.setPickOnBounds(true);
        imageViewHotel.setPreserveRatio(true);

        vBoxHotelInfo.setAlignment(javafx.geometry.Pos.CENTER);
        vBoxHotelInfo.setPrefHeight(150.0);
        vBoxHotelInfo.setPrefWidth(342.0);
        vBoxHotelInfo.setSpacing(10.0);

        textName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textName.setStrokeWidth(0.0);
        textName.setText(hotel.getName());
        textName.setWrappingWidth(342);
        textName.setFont(new Font(24.0));

        textAddress.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textAddress.setStrokeWidth(0.0);
        textAddress.setText(hotel.getAddress());
        textAddress.setWrappingWidth(342);
        textAddress.setFont(new Font(24.0));

        textNStars.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textNStars.setStrokeWidth(0.0);
        textNStars.setText(String.valueOf(hotel.getRating())+" stars");
        textNStars.setFont(new Font(24.0));
        textNStars.setWrappingWidth(342);

        vBoxReview.setAlignment(javafx.geometry.Pos.CENTER);
        vBoxReview.setPrefHeight(162.0);
        vBoxReview.setPrefWidth(239.0);

        btnReview.setMnemonicParsing(false);
        btnReview.setStyle("-fx-background-color: transparent;");
        btnReview.setText("View Reviews");
        btnReview.setUnderline(true);
        btnReview.setFont(new Font(24.0));

        vBoxDescription.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxDescription.setMinHeight(280.0);
        vBoxDescription.setPrefWidth(841.0);

        textDescription.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textDescription.setStrokeWidth(0.0);
        textDescription.setText("Breve descrizione dell'hotel");
        textDescription.setFont(new Font(24.0));
        vBoxDescription.setPadding(new Insets(30.0, 0.0, 0.0, 0.0));

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxBtn.setPrefHeight(75.0);
        hBoxBtn.setPrefWidth(841.0);
        hBoxBtn.setSpacing(30.0);

        btnBack.setMnemonicParsing(false);
        btnBack.setText("Back");
        btnBack.setFont(new Font(24.0));
        btnBack.setMinWidth(86.0);
        
        btnBack.setOnMouseEntered(evt -> btnBack.setUnderline(true));
    	btnBack.setOnMouseExited(evt -> btnBack.setUnderline(false));

        btnBook.setMnemonicParsing(false);
        btnBook.setStyle("-fx-background-color: #1B59D7;");
        btnBook.setText("Book");
        btnBook.setTextFill(javafx.scene.paint.Color.WHITE);
        btnBook.setFont(new Font(24.0));

        btnBook.setOnMouseEntered(evt -> btnBook.setUnderline(true));
        btnBook.setOnMouseExited(evt -> btnBook.setUnderline(false));
        setOpaqueInsets(new Insets(0.0));

     
        hBoxHotelName.getChildren().add(imageViewHotel);
        vBoxHotelInfo.getChildren().add(textName);
        vBoxHotelInfo.getChildren().add(textAddress);
        vBoxHotelInfo.getChildren().add(textNStars);
        hBoxHotelName.getChildren().add(vBoxHotelInfo);
        vBoxReview.getChildren().add(btnReview);
        hBoxHotelName.getChildren().add(vBoxReview);
        vBox.getChildren().add(hBoxHotelName);
        vBoxDescription.getChildren().add(textDescription);
        vBox.getChildren().add(vBoxDescription);
        hBoxBtn.getChildren().add(btnBack);
        hBoxBtn.getChildren().add(btnBook);
        vBox.getChildren().add(hBoxBtn);
        getChildren().add(vBox);
        
        
        btnReview.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnBack.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				controller.returnBackList();
 			}
 		});
        
        btnBook.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				controller.goToBook(hotel, room);
 			}
 		});
        

    }
}

