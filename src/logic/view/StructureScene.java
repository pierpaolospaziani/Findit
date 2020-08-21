package logic.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import logic.controller.ProfileController;
import logic.dao.RoomDao;
import logic.model.Hotel;

public class StructureScene {

    protected static HBox hBox;
    protected static VBox vBox1;
    protected static VBox vBox2;
    protected static Stage window;
    protected Label label1;
    protected Button btnAddRoom;
    protected Button btnViewReviews;
    protected Button btnOpenAgenda;
    
    protected Button btnAddDescription;

    public StructureScene(ProfileController profileController, Hotel hotel) {

		hBox = new HBox();
		vBox1 = new VBox();
		vBox2 = new VBox();
        window = new Stage();
        label1 = new Label();
        btnAddRoom = new Button();
        btnViewReviews = new Button();
        btnOpenAgenda = new Button();
        btnAddDescription = new Button();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(250);
        window.setTitle(hotel.getName());

        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setPrefWidth(500.0);
        hBox.setPrefHeight(274.0);
        hBox.setSpacing(25.0);

        vBox1.setAlignment(javafx.geometry.Pos.CENTER);
        vBox1.setPrefWidth(250.0);
        vBox1.setPrefHeight(274.0);
        vBox1.setSpacing(25.0);

        vBox2.setAlignment(javafx.geometry.Pos.CENTER);
        vBox2.setPrefWidth(250.0);
        vBox2.setPrefHeight(274.0);
        vBox2.setSpacing(25.0);

        try {
			label1.setText("Rooms number: " + RoomDao.getRoomsNumber(hotel.getRooms()));
		} catch (Exception e) {
			e.printStackTrace();
		}
        label1.setFont(new Font(24.0));
        
        btnViewReviews.setMnemonicParsing(false);
        btnViewReviews.setText("View Reviews");
        btnViewReviews.setFont(new Font(24.0));
        btnViewReviews.setStyle("-fx-background-color: #1B59D7;");
        btnViewReviews.setTextFill(javafx.scene.paint.Color.WHITE);

        btnViewReviews.setOnMouseEntered(evt -> btnViewReviews.setUnderline(true));
        btnViewReviews.setOnMouseExited(evt -> btnViewReviews.setUnderline(false));
        
        btnAddRoom.setMnemonicParsing(false);
        btnAddRoom.setText("Add Room");
        btnAddRoom.setFont(new Font(24.0));
        btnAddRoom.setStyle("-fx-background-color: #1B59D7;");
        btnAddRoom.setTextFill(javafx.scene.paint.Color.WHITE);

        btnAddRoom.setOnMouseEntered(evt -> btnAddRoom.setUnderline(true));
        btnAddRoom.setOnMouseExited(evt -> btnAddRoom.setUnderline(false));
        
        btnOpenAgenda.setMnemonicParsing(false);
        btnOpenAgenda.setText("Open Agenda");
        btnOpenAgenda.setFont(new Font(24.0));
        btnOpenAgenda.setStyle("-fx-background-color: #1B59D7;");
        btnOpenAgenda.setTextFill(javafx.scene.paint.Color.WHITE);

        btnOpenAgenda.setOnMouseEntered(evt -> btnOpenAgenda.setUnderline(true));
        btnOpenAgenda.setOnMouseExited(evt -> btnOpenAgenda.setUnderline(false));
        
        btnAddDescription.setMnemonicParsing(false);
        btnAddDescription.setText("Add Description");
        btnAddDescription.setFont(new Font(24.0));
        btnAddDescription.setStyle("-fx-background-color: #1B59D7;");
        btnAddDescription.setTextFill(javafx.scene.paint.Color.WHITE);

        btnAddDescription.setOnMouseEntered(evt -> btnAddDescription.setUnderline(true));
        btnAddDescription.setOnMouseExited(evt -> btnAddDescription.setUnderline(false));

        vBox1.getChildren().add(label1);
        vBox1.getChildren().add(btnAddRoom);
        vBox2.getChildren().add(btnViewReviews);
        vBox2.getChildren().add(btnOpenAgenda);
        vBox2.getChildren().add(btnAddDescription);
        hBox.getChildren().add(vBox1);
        hBox.getChildren().add(vBox2);

        Scene scene = new Scene(hBox,500,274);
        window.setScene(scene);
        window.setResizable(false);
        
        btnAddRoom.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				profileController.addRoomScene(window,hotel.getRooms(),hotel.getName());
 				
 			}
 		});
        
        btnAddDescription.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				profileController.addDescriptionScene(window,hotel.getName());
 				
 			}
 		});
        
        window.show();
    }
}
