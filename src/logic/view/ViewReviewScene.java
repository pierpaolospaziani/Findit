package logic.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ViewReviewScene extends VBox {

    protected VBox vBox;
    protected HBox hBoxReview1;
    protected VBox vBox0;
    protected Button btnNameUser1;
    protected Label labelNumberStar1;
    protected VBox vBox1;
    protected TextFlow textFlow;
    protected Text txtReview1;
    protected HBox hBoxReview2;
    protected VBox vBox2;
    protected Button btnNameUser2;
    protected Label labelNumberStar2;
    protected VBox vBox3;
    protected TextFlow textFlow0;
    protected Text txtReview2;
    protected HBox hBoxReview3;
    protected VBox vBox4;
    protected Button btnNameUser3;
    protected Label labelNumberStar3;
    protected VBox vBox5;
    protected TextFlow textFlow1;
    protected Text txtReview3;
    protected HBox hBoxBtn;
    protected Button btnBack;
    protected Separator separator;
    protected Separator separator1;
    protected Button btnPreview;
    protected Button btnNext;
    
    protected Separator separatorUser1;
    protected Separator separatorUser2;
    protected Separator separatorUser3;
    

    public ViewReviewScene() {  // bean  e controller

        vBox = new VBox();
        hBoxReview1 = new HBox();
        vBox0 = new VBox();
        btnNameUser1 = new Button();
        labelNumberStar1 = new Label();
        vBox1 = new VBox();
        textFlow = new TextFlow();
        txtReview1 = new Text();
        hBoxReview2 = new HBox();
        vBox2 = new VBox();
        btnNameUser2 = new Button();
        labelNumberStar2 = new Label();
        vBox3 = new VBox();
        textFlow0 = new TextFlow();
        txtReview2 = new Text();
        hBoxReview3 = new HBox();
        vBox4 = new VBox();
        btnNameUser3 = new Button();
        labelNumberStar3 = new Label();
        vBox5 = new VBox();
        textFlow1 = new TextFlow();
        txtReview3 = new Text();
        hBoxBtn = new HBox();
        btnBack = new Button();
        separator = new Separator();
        separator1 = new Separator();
        btnPreview = new Button();
        btnNext = new Button();
        
        separatorUser1 = new Separator();
        separatorUser2 = new Separator();
        separatorUser3 = new Separator();

        setAlignment(javafx.geometry.Pos.TOP_CENTER);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);
        setSpacing(30.0);
       
        
        vBox.setLayoutX(126.0);
        vBox.setLayoutY(2.0);
        vBox.setPrefHeight(525.0);
        vBox.setPrefWidth(850.0);

        hBoxReview1.setPrefHeight(144.0);
        hBoxReview1.setPrefWidth(200.0);
        hBoxReview1.setSpacing(10.0);
        
        separatorUser1.setOpacity(0.0);
        separatorUser1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorUser1.setPrefHeight(57.0);
        separatorUser1.setPrefWidth(50.0);

        vBox0.setPrefHeight(136.0);
        vBox0.setPrefWidth(240.0);
        vBox0.setSpacing(15.0);

        btnNameUser1.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        btnNameUser1.setMnemonicParsing(false);
        btnNameUser1.setPrefWidth(240.0);
        btnNameUser1.setStyle("-fx-background-color: transparent;");
        btnNameUser1.setText("Nome Utente 1");
        btnNameUser1.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnNameUser1.setFont(new Font(24.0));
        
        btnNameUser1.setOnMouseEntered(evt -> btnNameUser1.setUnderline(true));
        btnNameUser1.setOnMouseExited(evt -> btnNameUser1.setUnderline(false));

        labelNumberStar1.setPrefWidth(230.0);
        labelNumberStar1.setText("stelle recensione");
        labelNumberStar1.setFont(new Font(18.0));

        vBox1.setPrefHeight(136.0);
        vBox1.setPrefWidth(650.0);

        textFlow.setPrefHeight(200.0);
        textFlow.setPrefWidth(200.0);

        txtReview1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtReview1.setStrokeWidth(0.0);
        txtReview1.setText("testo recensione 1");
        txtReview1.setFont(new Font(18.0));
        hBoxReview1.setPadding(new Insets(5.0));

        hBoxReview2.setPrefHeight(144.0);
        hBoxReview2.setPrefWidth(200.0);
        hBoxReview2.setSpacing(10.0);
        
        separatorUser2.setOpacity(0.0);
        separatorUser2.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorUser2.setPrefHeight(57.0);
        separatorUser2.setPrefWidth(50.0);

        vBox2.setPrefHeight(136.0);
        vBox2.setPrefWidth(240.0);
        vBox2.setSpacing(15.0);

        btnNameUser2.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        btnNameUser2.setMnemonicParsing(false);
        btnNameUser2.setPrefWidth(240.0);
        btnNameUser2.setStyle("-fx-background-color: transparent;");
        btnNameUser2.setText("Nome Utente2");
        btnNameUser2.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnNameUser2.setFont(new Font(24.0));
        
        btnNameUser2.setOnMouseEntered(evt -> btnNameUser2.setUnderline(true));
        btnNameUser2.setOnMouseExited(evt -> btnNameUser2.setUnderline(false));

        labelNumberStar2.setPrefWidth(230.0);
        labelNumberStar2.setText("stelle recensione");
        labelNumberStar2.setFont(new Font(18.0));

        vBox3.setPrefHeight(136.0);
        vBox3.setPrefWidth(650.0);
        vBox3.setOpaqueInsets(new Insets(0.0));

        textFlow0.setPrefHeight(200.0);
        textFlow0.setPrefWidth(200.0);

        txtReview2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtReview2.setStrokeWidth(0.0);
        txtReview2.setText("testo recensione 2");
        txtReview2.setFont(new Font(18.0));
        hBoxReview2.setPadding(new Insets(5.0));

        hBoxReview3.setPrefHeight(144.0);
        hBoxReview3.setPrefWidth(200.0);
        hBoxReview3.setSpacing(10.0);
        
        separatorUser3.setOpacity(0.0);
        separatorUser3.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separatorUser3.setPrefHeight(57.0);
        separatorUser3.setPrefWidth(50.0);

        vBox4.setPrefHeight(136.0);
        vBox4.setPrefWidth(240.0);
        vBox4.setSpacing(15.0);

        btnNameUser3.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        btnNameUser3.setMnemonicParsing(false);
        btnNameUser3.setPrefHeight(36.0);
        btnNameUser3.setPrefWidth(240.0);
        btnNameUser3.setStyle("-fx-background-color: transparent;");
        btnNameUser3.setText("Nome Utente3");
        btnNameUser3.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        btnNameUser3.setFont(new Font(24.0));
        
        btnNameUser3.setOnMouseEntered(evt -> btnNameUser3.setUnderline(true));
        btnNameUser3.setOnMouseExited(evt -> btnNameUser3.setUnderline(false));

        labelNumberStar3.setPrefHeight(27.0);
        labelNumberStar3.setPrefWidth(230.0);
        labelNumberStar3.setText("stelle recensione");
        labelNumberStar3.setFont(new Font(18.0));

        vBox5.setPrefHeight(136.0);
        vBox5.setPrefWidth(650.0);

        textFlow1.setPrefHeight(200.0);
        textFlow1.setPrefWidth(200.0);

        txtReview3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtReview3.setStrokeWidth(0.0);
        txtReview3.setText("testo recensione 3");
        txtReview3.setWrappingWidth(615.9999694824219);
        txtReview3.setFont(new Font(18.0));
        hBoxReview3.setPadding(new Insets(5.0));

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBoxBtn.setPrefHeight(57.0);
        hBoxBtn.setPrefWidth(850.0);
        hBoxBtn.setSpacing(10.0);
        
        separator1.setOpacity(0.0);
        separator1.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator1.setPrefHeight(57.0);
        separator1.setPrefWidth(50.0);

        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(39.0);
        btnBack.setPrefWidth(118.0);
        btnBack.setStyle("-fx-background-color: #1B59D7;");
        btnBack.setText("<< back");
        btnBack.setTextFill(javafx.scene.paint.Color.WHITE);
        btnBack.setFont(new Font(24.0));
        
        btnBack.setOnMouseEntered(evt -> btnBack.setUnderline(true));
    	btnBack.setOnMouseExited(evt -> btnBack.setUnderline(false));

        separator.setOpacity(0.0);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(57.0);
        separator.setPrefWidth(270.0);

        btnPreview.setMnemonicParsing(false);
        btnPreview.setPrefHeight(51.0);
        btnPreview.setPrefWidth(51.0);
        btnPreview.setStyle("-fx-background-color: #1B59D7;");
        btnPreview.setText("<");
        btnPreview.setTextFill(javafx.scene.paint.Color.WHITE);
        btnPreview.setFont(new Font(24.0));
        
        btnPreview.setOnMouseEntered(evt -> btnPreview.setUnderline(true));
        btnPreview.setOnMouseExited(evt -> btnPreview.setUnderline(false));

        btnNext.setMnemonicParsing(false);
        btnNext.setPrefHeight(51.0);
        btnNext.setPrefWidth(51.0);
        btnNext.setStyle("-fx-background-color: #1B59D7;");
        btnNext.setText(">");
        btnNext.setTextFill(javafx.scene.paint.Color.WHITE);
        btnNext.setFont(new Font(24.0));
        
        btnNext.setOnMouseEntered(evt -> btnNext.setUnderline(true));
        btnNext.setOnMouseExited(evt -> btnNext.setUnderline(false));

        vBox0.getChildren().add(btnNameUser1);
        vBox0.getChildren().add(labelNumberStar1);
        hBoxReview1.getChildren().add(separatorUser1);
        hBoxReview1.getChildren().add(vBox0);
        textFlow.getChildren().add(txtReview1);
        vBox1.getChildren().add(textFlow);
        hBoxReview1.getChildren().add(vBox1);
        vBox.getChildren().add(hBoxReview1);
        vBox2.getChildren().add(btnNameUser2);
        vBox2.getChildren().add(labelNumberStar2);
        hBoxReview2.getChildren().add(separatorUser2);
        hBoxReview2.getChildren().add(vBox2);
        textFlow0.getChildren().add(txtReview2);
        vBox3.getChildren().add(textFlow0);
        hBoxReview2.getChildren().add(vBox3);
        vBox.getChildren().add(hBoxReview2);
        vBox4.getChildren().add(btnNameUser3);
        vBox4.getChildren().add(labelNumberStar3);
        hBoxReview3.getChildren().add(separatorUser3);
        hBoxReview3.getChildren().add(vBox4);
        textFlow1.getChildren().add(txtReview3);
        vBox5.getChildren().add(textFlow1);
        hBoxReview3.getChildren().add(vBox5);
        vBox.getChildren().add(hBoxReview3);
        hBoxBtn.getChildren().add(separator1);
        hBoxBtn.getChildren().add(btnBack);
        hBoxBtn.getChildren().add(separator);
        hBoxBtn.getChildren().add(btnPreview);
        hBoxBtn.getChildren().add(btnNext);
        vBox.getChildren().add(hBoxBtn);
        getChildren().add(vBox);
        
        btnNameUser1.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnNameUser2.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnNameUser3.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});

        
        btnBack.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 			
 			}
 		});
        
        btnPreview.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        btnNext.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				
 			}
 		});
        
        
    }
}
