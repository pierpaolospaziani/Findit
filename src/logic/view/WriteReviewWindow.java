package logic.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WriteReviewWindow {
	
	protected VBox wReviewScene;
	protected Label label;
    protected TextArea textAreaReview;
    protected HBox hBox;
    protected HBox hBox0;
    protected Text textVote;
    protected Text txtStars;
    protected ChoiceBox<Integer> choiceBoxVote;
    protected Button btnSubmit;
    protected Stage window;
    
  

    public WriteReviewWindow() {

    	wReviewScene = new VBox();
        label = new Label();
        textAreaReview = new TextArea();
        hBox = new HBox();
        hBox0 = new HBox();
        textVote = new Text();
        txtStars = new Text();
        choiceBoxVote = new ChoiceBox<Integer>();
        btnSubmit = new Button();
        
        window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Write Review");
        window.setMinWidth(250);


        wReviewScene.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        wReviewScene.setPrefHeight(274.0);
        wReviewScene.setPrefWidth(500.0);
        wReviewScene.setSpacing(10.0);

        label.setPrefHeight(35.0);
        label.setPrefWidth(193.0);
        label.setText("Write your review");
        label.setFont(new Font(24.0));

        textAreaReview.setPrefHeight(119.0);
        textAreaReview.setPrefWidth(450.0);
        textAreaReview.setFont(new Font(18.0));
        textAreaReview.setWrapText(true);
        textAreaReview.setMaxWidth(452.0);
        hBox.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox.setPrefHeight(86.0);
        hBox.setPrefWidth(500.0);

        hBox0.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox0.setPrefHeight(86.0);
        hBox0.setPrefWidth(341.0);
        hBox0.setSpacing(10.0);

        textVote.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        textVote.setStrokeWidth(0.0);
        textVote.setText("Vote");
        textVote.setFont(new Font(24.0));

        choiceBoxVote.setPrefHeight(51.0);
        choiceBoxVote.setPrefWidth(45.0);
        choiceBoxVote.getItems().add(1);
        choiceBoxVote.getItems().add(2);
        choiceBoxVote.getItems().add(3);
        choiceBoxVote.getItems().add(4);
        choiceBoxVote.getItems().add(5);
        
        txtStars.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtStars.setStrokeWidth(0.0);
        txtStars.setText("Stars");
        txtStars.setFont(new Font(24.0));
        
        btnSubmit.setMnemonicParsing(false);
        btnSubmit.setStyle("-fx-background-color: #1B59D7;");
        btnSubmit.setText("Submit");
        btnSubmit.setTextFill(javafx.scene.paint.Color.WHITE);
        btnSubmit.setFont(new Font(24.0));
        
        btnSubmit.setOnMouseEntered(evt -> btnSubmit.setUnderline(true));
        btnSubmit.setOnMouseExited(evt -> btnSubmit.setUnderline(false));
        
        hBox.setPadding(new Insets(0.0, 25.0, 0.0, 0.0));
        wReviewScene.setOpaqueInsets(new Insets(0.0));
        wReviewScene.setPadding(new Insets(5.0, 0.0, 0.0, 0.0));

        wReviewScene.getChildren().add(label);
        wReviewScene.getChildren().add(textAreaReview);
        hBox0.getChildren().add(textVote);
        hBox0.getChildren().add(choiceBoxVote);
        hBox0.getChildren().add(txtStars);
        hBox.getChildren().add(hBox0);
        hBox.getChildren().add(btnSubmit);
        wReviewScene.getChildren().add(hBox);
        
        Scene scene = new Scene(wReviewScene,500,274);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
        
        btnSubmit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				
		       // prende il valore del choiceobx
				Integer voto = choiceBoxVote.getValue();
				
			}
		});
        
        
        
    }
}

