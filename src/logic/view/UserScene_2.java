package logic.view;

import java.io.File;
import java.io.FileInputStream;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import logic.controller.LoginController;
import logic.dao.OwnerDao;
import logic.dao.UserDao;
import logic.model.Owner;
import logic.model.User;

public class UserScene_2 extends HBox{

    protected VBox vBox;
    protected Label nameLabel;
    protected ImageView userImage;
    protected Button btnChangeImage;
    protected HBox hBox0;
    protected Label bookedLabel;
    protected Label numBookedLabel;
    protected HBox hBox1;
    protected Label reviewsLabel;
    protected Label numReviewsLabel;
    protected Button btnLogout;
    
    protected VBox vBox0;
    protected Label experienceLable;
    protected HBox hBox2;
    protected ImageView imageView1;
    protected ImageView imageView2;
    protected ImageView imageView3;
    protected HBox hBox3;
    protected ImageView imageView4;
    protected ImageView imageView5;
    protected ImageView imageView6;
    protected HBox hBoxBtn;
    protected Button btnPrecedent;
    protected Button btnNext;

    protected static Stage window;
    
    public UserScene_2(LoginController controller, User user) {
    	
    	vBox = new VBox();
        nameLabel = new Label();
        userImage = new ImageView();
        btnChangeImage = new Button();
        hBox0 = new HBox();
        bookedLabel = new Label();
        numBookedLabel = new Label();
        hBox1 = new HBox();
        reviewsLabel = new Label();
        numReviewsLabel = new Label();
        btnLogout = new Button();

        vBox0 = new VBox();
        experienceLable = new Label();
        hBox2 = new HBox();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        hBox3 = new HBox();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        hBoxBtn = new HBox();
        btnPrecedent = new Button();
        btnNext = new Button();
        
        window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Login");
        window.setMinWidth(250);
        
        setAlignment(javafx.geometry.Pos.TOP_LEFT);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(525.0);
        vBox.setPrefWidth(350.0);
        vBox.setSpacing(10.0);

        nameLabel.setText(user.getUsername());
        nameLabel.setFont(new Font(48.0));
        VBox.setMargin(nameLabel, new Insets(30.0, 0.0, 0.0, 0.0));

        userImage.setFitHeight(200.0);
        userImage.setFitWidth(200.0);
        userImage.setPickOnBounds(true);
        userImage.setPreserveRatio(true);
        
        Image photo = user.getImage();
        
        if (photo == null) {
        	userImage.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));
        } else {
            userImage.setImage(photo);
        }
        
        VBox.setMargin(userImage, new Insets(0.0));

        btnChangeImage.setMnemonicParsing(false);
        btnChangeImage.setStyle("-fx-background-color: transparent;");
        btnChangeImage.setText("Change your profile image");

        btnChangeImage.setOnMouseEntered(evt -> btnChangeImage.setUnderline(true));
        btnChangeImage.setOnMouseExited(evt -> btnChangeImage.setUnderline(false));
        
        btnChangeImage.setFont(new Font(18.0));
        btnChangeImage.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        VBox.setMargin(btnChangeImage, new Insets(-10.0, 0.0, 0.0, 0.0));

        hBox0.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox0.setPrefWidth(200.0);
        hBox0.setSpacing(30.0);

        bookedLabel.setText("Booked:");
        bookedLabel.setFont(new Font(36.0));

        numBookedLabel.setText("000");
        numBookedLabel.setFont(new Font(36.0));
        HBox.setMargin(numBookedLabel, new Insets(0.0, 55.0, 0.0, 0.0));
        VBox.setMargin(hBox0, new Insets(20.0, 0.0, 0.0, 0.0));

        hBox1.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox1.setPrefWidth(200.0);
        hBox1.setSpacing(30.0);

        reviewsLabel.setText("Reviews:");
        reviewsLabel.setFont(new Font(36.0));

        numReviewsLabel.setText("000");
        numReviewsLabel.setFont(new Font(36.0));
        HBox.setMargin(numReviewsLabel, new Insets(0.0, 55.0, 0.0, 0.0));
        VBox.setMargin(hBox1, new Insets(10.0, 0.0, 0.0, 0.0));

        btnLogout.setMnemonicParsing(false);
        btnLogout.setStyle("-fx-background-color: transparent;");
        btnLogout.setText("Logout");
        
        btnLogout.setOnMouseEntered(evt -> btnLogout.setUnderline(true));
        btnLogout.setOnMouseExited(evt -> btnLogout.setUnderline(false));
        
        btnLogout.setFont(new Font(18.0));
        btnLogout.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        VBox.setMargin(btnLogout, new Insets(10.0, 0.0, 0.0, 0.0));
        setOpaqueInsets(new Insets(0.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(700.0);
        vBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        
        experienceLable.setText("Here are your experiences!");
        experienceLable.setFont(new Font(36.0));
        VBox.setMargin(experienceLable, new Insets(20.0, 0.0, 0.0, 0.0));

        hBox2.setAlignment(javafx.geometry.Pos.CENTER);
        hBox2.setPrefHeight(200.0);
        hBox2.setPrefWidth(682.0);
        hBox2.setSpacing(20.0);
        
        imageView1.setFitHeight(180.0);
        imageView1.setFitWidth(180.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView2.setFitHeight(180.0);
        imageView2.setFitWidth(180.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView3.setFitHeight(180.0);
        imageView3.setFitWidth(180.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));
        
        hBox3.setAlignment(javafx.geometry.Pos.CENTER);
        hBox3.setPrefHeight(200.0);
        hBox3.setPrefWidth(682.0);
        hBox3.setSpacing(20.0);

        imageView4.setFitHeight(180.0);
        imageView4.setFitWidth(180.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView5.setFitHeight(180.0);
        imageView5.setFitWidth(180.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView6.setFitHeight(180.0);
        imageView6.setFitWidth(180.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxBtn.setPrefHeight(63.0);
        hBoxBtn.setPrefWidth(841.0);
        hBoxBtn.setSpacing(10.0);
        
        btnPrecedent.setMnemonicParsing(false);
        btnPrecedent.setText("<");
        btnPrecedent.setFont(new Font(18.0));
        btnPrecedent.setStyle("-fx-background-color: #1B59D7;");
        btnPrecedent.setTextFill(javafx.scene.paint.Color.WHITE);

        btnPrecedent.setOnMouseEntered(evt -> btnPrecedent.setUnderline(true));
        btnPrecedent.setOnMouseExited(evt -> btnPrecedent.setUnderline(false));

        btnNext.setMnemonicParsing(false);
        btnNext.setText(">");
        btnNext.setFont(new Font(18.0));
        btnNext.setStyle("-fx-background-color: #1B59D7;");
        btnNext.setTextFill(javafx.scene.paint.Color.WHITE);

        btnNext.setOnMouseEntered(evt -> btnNext.setUnderline(true));
        btnNext.setOnMouseExited(evt -> btnNext.setUnderline(false));
        
        vBox.getChildren().add(nameLabel);
        vBox.getChildren().add(userImage);
        vBox.getChildren().add(btnChangeImage);
        hBox0.getChildren().add(bookedLabel);
        hBox0.getChildren().add(numBookedLabel);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(reviewsLabel);
        hBox1.getChildren().add(numReviewsLabel);
        vBox.getChildren().add(hBox1);
        vBox.getChildren().add(btnLogout);
        getChildren().add(vBox);

        vBox0.getChildren().add(experienceLable);
        hBox2.getChildren().add(imageView1);
        hBox2.getChildren().add(imageView2);
        hBox2.getChildren().add(imageView3);
        vBox0.getChildren().add(hBox2);
        hBox3.getChildren().add(imageView4);
        hBox3.getChildren().add(imageView5);
        hBox3.getChildren().add(imageView6);
        vBox0.getChildren().add(hBox3);
        hBoxBtn.getChildren().add(btnPrecedent);
        hBoxBtn.getChildren().add(btnNext);
        vBox0.getChildren().add(hBoxBtn);
        getChildren().add(vBox0);
        
        btnLogout.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				user.setLogged(false);
 				
 				controller.changeScene();
 			}
 		});
        
        btnChangeImage.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				FileChooser fileChooser = new FileChooser();
 				
 				window.setTitle("Select Image");
 				
 				final File file = fileChooser.showOpenDialog(window);
 				
 	            if (file != null) {

 	                Image image = new Image(file.toURI().toString());
 	                
 	                user.setImage(image);
 	                
 	                try {
 	                	FileInputStream inputStream = new FileInputStream(file);
						UserDao.setImage(user.getUsername(), inputStream);
					} catch (Exception e) {
						e.printStackTrace();
					}
 	                
 	                userImage.setImage(image);
 	            }
 			}
 		});
    }
    
    public UserScene_2(LoginController controller, Owner owner) {
    	
    	vBox = new VBox();
        nameLabel = new Label();
        userImage = new ImageView();
        btnChangeImage = new Button();
        hBox0 = new HBox();
        bookedLabel = new Label();
        numBookedLabel = new Label();
        hBox1 = new HBox();
        reviewsLabel = new Label();
        numReviewsLabel = new Label();
        btnLogout = new Button();

        vBox0 = new VBox();
        experienceLable = new Label();
        hBox2 = new HBox();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        hBox3 = new HBox();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        hBoxBtn = new HBox();
        btnPrecedent = new Button();
        btnNext = new Button();
        
        window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Login");
        window.setMinWidth(250);
        
        setAlignment(javafx.geometry.Pos.TOP_LEFT);
        setPrefHeight(525.0);
        setPrefWidth(1050.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(525.0);
        vBox.setPrefWidth(350.0);
        vBox.setSpacing(10.0);

        nameLabel.setText(owner.getUsername());
        nameLabel.setFont(new Font(48.0));
        VBox.setMargin(nameLabel, new Insets(30.0, 0.0, 0.0, 0.0));

        userImage.setFitHeight(200.0);
        userImage.setFitWidth(200.0);
        userImage.setPickOnBounds(true);
        userImage.setPreserveRatio(true);
        
        Image photo = owner.getImage();
        
        if (photo == null) {
        	userImage.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));
        } else {
            userImage.setImage(photo);
        }
        
        VBox.setMargin(userImage, new Insets(0.0));

        btnChangeImage.setMnemonicParsing(false);
        btnChangeImage.setStyle("-fx-background-color: transparent;");
        btnChangeImage.setText("Change your profile image");

        btnChangeImage.setOnMouseEntered(evt -> btnChangeImage.setUnderline(true));
        btnChangeImage.setOnMouseExited(evt -> btnChangeImage.setUnderline(false));
        
        btnChangeImage.setFont(new Font(18.0));
        btnChangeImage.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        VBox.setMargin(btnChangeImage, new Insets(-10.0, 0.0, 0.0, 0.0));

        hBox0.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox0.setPrefWidth(200.0);
        hBox0.setSpacing(30.0);

        bookedLabel.setText("Booked:");
        bookedLabel.setFont(new Font(36.0));

        numBookedLabel.setText("000");
        numBookedLabel.setFont(new Font(36.0));
        HBox.setMargin(numBookedLabel, new Insets(0.0, 55.0, 0.0, 0.0));
        VBox.setMargin(hBox0, new Insets(20.0, 0.0, 0.0, 0.0));

        hBox1.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox1.setPrefWidth(200.0);
        hBox1.setSpacing(30.0);

        reviewsLabel.setText("Reviews:");
        reviewsLabel.setFont(new Font(36.0));

        numReviewsLabel.setText("000");
        numReviewsLabel.setFont(new Font(36.0));
        HBox.setMargin(numReviewsLabel, new Insets(0.0, 55.0, 0.0, 0.0));
        VBox.setMargin(hBox1, new Insets(10.0, 0.0, 0.0, 0.0));

        btnLogout.setMnemonicParsing(false);
        btnLogout.setStyle("-fx-background-color: transparent;");
        btnLogout.setText("Logout");
        
        btnLogout.setOnMouseEntered(evt -> btnLogout.setUnderline(true));
        btnLogout.setOnMouseExited(evt -> btnLogout.setUnderline(false));
        
        btnLogout.setFont(new Font(18.0));
        btnLogout.setPadding(new Insets(1.0, 0.0, 0.0, 0.0));
        VBox.setMargin(btnLogout, new Insets(10.0, 0.0, 0.0, 0.0));
        setOpaqueInsets(new Insets(0.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(700.0);
        vBox0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        
        experienceLable.setText("Here are your experiences!");
        experienceLable.setFont(new Font(36.0));
        VBox.setMargin(experienceLable, new Insets(20.0, 0.0, 0.0, 0.0));

        hBox2.setAlignment(javafx.geometry.Pos.CENTER);
        hBox2.setPrefHeight(200.0);
        hBox2.setPrefWidth(682.0);
        hBox2.setSpacing(20.0);
        
        imageView1.setFitHeight(180.0);
        imageView1.setFitWidth(180.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView2.setFitHeight(180.0);
        imageView2.setFitWidth(180.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView3.setFitHeight(180.0);
        imageView3.setFitWidth(180.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));
        
        hBox3.setAlignment(javafx.geometry.Pos.CENTER);
        hBox3.setPrefHeight(200.0);
        hBox3.setPrefWidth(682.0);
        hBox3.setSpacing(20.0);

        imageView4.setFitHeight(180.0);
        imageView4.setFitWidth(180.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView5.setFitHeight(180.0);
        imageView5.setFitWidth(180.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        imageView6.setFitHeight(180.0);
        imageView6.setFitWidth(180.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("account.jpg").toExternalForm()));

        hBoxBtn.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxBtn.setPrefHeight(63.0);
        hBoxBtn.setPrefWidth(841.0);
        hBoxBtn.setSpacing(10.0);
        
        btnPrecedent.setMnemonicParsing(false);
        btnPrecedent.setText("<");
        btnPrecedent.setFont(new Font(18.0));
        btnPrecedent.setStyle("-fx-background-color: #1B59D7;");
        btnPrecedent.setTextFill(javafx.scene.paint.Color.WHITE);

        btnPrecedent.setOnMouseEntered(evt -> btnPrecedent.setUnderline(true));
        btnPrecedent.setOnMouseExited(evt -> btnPrecedent.setUnderline(false));

        btnNext.setMnemonicParsing(false);
        btnNext.setText(">");
        btnNext.setFont(new Font(18.0));
        btnNext.setStyle("-fx-background-color: #1B59D7;");
        btnNext.setTextFill(javafx.scene.paint.Color.WHITE);

        btnNext.setOnMouseEntered(evt -> btnNext.setUnderline(true));
        btnNext.setOnMouseExited(evt -> btnNext.setUnderline(false));
        
        vBox.getChildren().add(nameLabel);
        vBox.getChildren().add(userImage);
        vBox.getChildren().add(btnChangeImage);
        hBox0.getChildren().add(bookedLabel);
        hBox0.getChildren().add(numBookedLabel);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(reviewsLabel);
        hBox1.getChildren().add(numReviewsLabel);
        vBox.getChildren().add(hBox1);
        vBox.getChildren().add(btnLogout);
        getChildren().add(vBox);

        vBox0.getChildren().add(experienceLable);
        hBox2.getChildren().add(imageView1);
        hBox2.getChildren().add(imageView2);
        hBox2.getChildren().add(imageView3);
        vBox0.getChildren().add(hBox2);
        hBox3.getChildren().add(imageView4);
        hBox3.getChildren().add(imageView5);
        hBox3.getChildren().add(imageView6);
        vBox0.getChildren().add(hBox3);
        hBoxBtn.getChildren().add(btnPrecedent);
        hBoxBtn.getChildren().add(btnNext);
        vBox0.getChildren().add(hBoxBtn);
        getChildren().add(vBox0);
        
        btnLogout.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				
 				owner.setLogged(false);
 				
 				controller.changeScene();
 			}
 		});
        
        btnChangeImage.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event) {
 				FileChooser fileChooser = new FileChooser();
 				
 				window.setTitle("Select Image");
 				
 				final File file = fileChooser.showOpenDialog(window);
 				
 	            if (file != null) {
 	            	
 	                Image image = new Image(file.toURI().toString());
 	                
 	                owner.setImage(image);
 	                
 	                try {
 	                	FileInputStream inputStream = new FileInputStream(file);
						OwnerDao.setImage(owner.getUsername(), inputStream);
					} catch (Exception e) {
						e.printStackTrace();
					}
 	                
 	                userImage.setImage(image);
 	            }
 			}
 		});
    }
}
