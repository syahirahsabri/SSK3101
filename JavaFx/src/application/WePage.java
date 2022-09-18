package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WePage extends Application {
	    //create wePage pane
		BorderPane wePagePane = new BorderPane();
			
		// create a pane to view post
		GridPane postPane = new GridPane();
		// scroll pane to scroll the post
		ScrollPane scrollPost = new ScrollPane();
		
		//create pane for friend request
		GridPane friendReqPage = new GridPane();
		ScrollPane scrollFriendReq = new ScrollPane();
		
		// create pane for profile page
		GridPane ProfilePage = new GridPane();
		
		SignUp signUp = new SignUp();
		
		User user = new User();

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// create file for user login and sign up
		File userList = new File("C:\\Users\\User\\Downloads\\profile");
		FileWriter newWriter = new FileWriter(userList,true);
		PrintWriter writer = new PrintWriter(newWriter);

		//set up the WePage
		
		Image imagex = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\lawSchool.png"));
		ImageView image2 = new ImageView(imagex);
		image2.setFitWidth(279);
		image2.setFitHeight(200);
		Label welcomeLbl = new Label("Welcome to Wegram!");
		welcomeLbl.setLayoutX(20);
		welcomeLbl.setStyle("-fx-font-size: 15px; -fx-font-weight: bold");
		
		
		// welcome post
	  	VBox welcomePane = new VBox(20);
	   	welcomePane.getChildren().addAll(welcomeLbl,image2);
	  	welcomePane.setStyle("-fx-background-color:#ffffff; -fx-font-size: 13px;");
		welcomePane.setPadding(new Insets(15, 15, 15, 15));
	  	welcomePane.setAlignment(Pos.CENTER);
	  	
	  	postPane.add(welcomePane, 0, 1);
	  	
	  	// add post pane into the scroll pane
	  	scrollPost.setContent(postPane);
	    //set scroll pane background as white
		scrollPost.setStyle("-fx-background : #FFFFFF; -fx-border-color : #F0F0F0");
		scrollPost.setHbarPolicy(ScrollBarPolicy.NEVER);//hide scroll bar(hbar)
		scrollPost.setVbarPolicy(ScrollBarPolicy.NEVER);//hide scroll bar(vbar)
		
	  	// add all pane to we Page
		wePagePane.setCenter(scrollPost);
		wePagePane.setBottom(getBottomPage());
		wePagePane.setTop(getHeader());
		wePagePane.setStyle("-fx-background-color : #FFFFFF");
		
		// create login page
		TextField tf1 = new TextField();
		PasswordField tf2 = new PasswordField();
        FlowPane loginPage = new FlowPane();
		
		Label userNameLbl = new Label("Username:");
		tf1.setPromptText("Enter your username");
		Label passwordLbl = new Label("Password:"); 
	    tf2.setPromptText("Enter your password");
			    
		//image1 we gram image
		Image weGramImage = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\title.png"));
		ImageView weGramView = new ImageView(weGramImage);
		weGramView.setFitWidth(300);
		weGramView.setFitHeight(100);
		weGramView.setLayoutY(505);
				
		// add all nodes into the login page pane	
		loginPage.setStyle("-fx-border-color: #97a8c6; -fx-border-width: 5px;" + 
						         "-fx-background-color:#ffffff; -fx-font-size: 13px;");
		loginPage.setAlignment(Pos.CENTER);
		loginPage.setPadding(new Insets(0, 26.5, 10.5, 25.5));
		loginPage.setHgap(8);
		loginPage.setVgap(10);
			    
		
		Button signUpBt = new Button("Sign Up");
		signUpBt.setLayoutY(100);
		Label label2 = new Label("\t\t\t\t\t\t\t\t\t");
	  	Button loginBt = new Button("Login");
	  	loginBt.setLayoutY(100);
	  	

	  	loginPage.getChildren().addAll(weGramView,userNameLbl,tf1,passwordLbl,tf2,label2,signUpBt,loginBt);
	  	
	  	
		// sign up pane
		 BorderPane signUpPane = new SignUp().getSignUpPane();
		 TextField fname =new TextField();
		 TextField lname= new TextField();
		 TextField username1= new TextField ();
		 PasswordField password1=new PasswordField();

		// grid pane with text field and label
		GridPane text= new GridPane ();
		text.setVgap(6.5);
		text.setPadding(new Insets(50,10,10,10));
				
		text.add(new Label ("First Name: "), 0, 0);
		text.add(fname, 1, 0);
		text.add(new Label ("Last Name: "), 0, 1);
		text.add(lname, 1, 1);
		text.add(new Label ("UserName: "), 0, 2);
		text.add(username1, 1, 2);
		text.add(new Label ("Password:"), 0, 3);
		text.add(password1, 1, 3);
		text.setPadding(new Insets(50,20,20,50));
		text.setStyle("-fx-background-color: #ffffff");
				
		signUpPane.setCenter(text);

		//button signUp and cancel
		Button signUpBt2= new Button("Sign Up");
		Button cancel= new Button("Cancel");
		signUpBt2.setStyle("-fx-background-color: LightBlue");
		signUpBt2.setStyle("-fx-border-color: Black");
		cancel.setStyle("-fx-background-color: LightBlue");
		cancel.setStyle("-fx-border-color: #ff0f0f");

		//pane for button signBt2 and cancel
		BorderPane cancelBtpane=new BorderPane();
	
		cancelBtpane.setRight(signUpBt2);
		cancelBtpane.setLeft(cancel);
		cancelBtpane.setPadding(new Insets(10,10,10,10));
		signUpPane.setBottom(cancelBtpane);
		cancelBtpane.setStyle("-fx-background-color: #ffffff");
		
		//pane for successful page
		BorderPane sucessful= new SignUp().getSucessfulPane();
		Button back=new Button ("Back To Login");
		sucessful.setBottom(back);
		sucessful.setStyle("-fx-background-color : #FFFFFF");
		sucessful.setAlignment(back, Pos.CENTER);
		sucessful.setPadding(new Insets(5,5,10,5));
		
		// set up friend request Pane
		
		friendReqPage.setAlignment(Pos.TOP_LEFT); // Set center alignment
	    friendReqPage.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		friendReqPage.setHgap(5.5);
		friendReqPage.setVgap(5.5); 
		friendReqPage.setStyle("-fx-background-color:#ce9f95; -fx-font-size: 13px;");
		    
		 //DP syahirah
		 Image imageFriendRequestSyahirah = new Image(new FileInputStream("C:\\Users\\isaac choong\\Downloads\\syahirah.jpeg"));
	     ImageView imageSyahirah = new ImageView(imageFriendRequestSyahirah);
	     imageSyahirah.setFitWidth(40);
		 imageSyahirah.setFitHeight(40);
			
	     //DP Aisyah
	     Image imageFriendRequestAisyah = new Image(new FileInputStream("C:\\Users\\isaac choong\\Downloads\\aisyahx.jpeg"));
		 ImageView imageAisyah = new ImageView(imageFriendRequestAisyah);
		 imageAisyah.setFitWidth(40);
		 imageAisyah.setFitHeight(40);
			
		 //Dp Hajar
		 Image imageFriendRequestH = new Image(new FileInputStream("C:\\Users\\isaac choong\\Downloads\\hajarx.jpeg"));
		 ImageView imageHajar = new ImageView(imageFriendRequestH);
		 imageHajar.setFitWidth(40);
		 imageHajar.setFitHeight(40);
			
		 //friend request search
		 Label lblSearch = new Label("Search : ");
		 TextField tfSearch = new TextField();
		 tfSearch.setPromptText("Find friends!");
		 tfSearch.setPrefColumnCount(7);
		    
		 //friend request line syahirah
		 Button btGraphicSyahirah = new Button();
		 btGraphicSyahirah.setGraphic(imageSyahirah);
		 btGraphicSyahirah.setPadding(new Insets(0.5, 1.5, 0.5, 1.5));
		 Button btFriendReqSyahirah = new Button("Add Friend");
		 Button btCancelSyahirah = new Button("  Cancel  ");
		    
		 //friend request line Aisyah
		 Button btGraphicAisyah = new Button();
		 btGraphicAisyah.setGraphic(imageAisyah);
		 btGraphicAisyah.setPadding(new Insets(0.5, 1.5, 0.5, 1.5));
		 Button btFriendReqAisyah = new Button("Add Friend");
		 Button btCancelAisyah = new Button("  Cancel  ");
		    
		 //friend request line Hajar
		 Button btGraphicHajar = new Button();
		 btGraphicHajar.setGraphic(imageHajar);
		 btGraphicHajar.setPadding(new Insets(0.5, 1.5, 0.5, 1.5));
		 Button btFriendReqHajar = new Button("   Accept   ");
		 Button btCancelHajar = new Button("  Cancel  ");
		   
		 
		 //Friend request - Place nodes in the pane using label and text field
		 //search
		 friendReqPage.add(lblSearch, 2, 2);
		 friendReqPage.add(tfSearch, 3, 2);
		 //syahirah's line		    
		 friendReqPage.add(btGraphicSyahirah,2,5);
		 friendReqPage.add(new Label("@syahirah.co"), 3, 5);
		 friendReqPage.add(btFriendReqSyahirah, 4, 5);
		 friendReqPage.add(btCancelSyahirah, 5, 5);
		 //Aisyah's line
		 friendReqPage.add(btGraphicAisyah,2,6);
		 friendReqPage.add(new Label("@aisyxh_23"), 3, 6); 
		 friendReqPage.add(btFriendReqAisyah, 4, 6);
		 friendReqPage.add(btCancelAisyah, 5, 6);
		 //hajar's line
		 friendReqPage.add(btGraphicHajar,2,7);
	     friendReqPage.add(new Label("@hajarsk_"), 3, 7); 
		 friendReqPage.add(btFriendReqHajar, 4, 7);
		 friendReqPage.add(btCancelHajar, 5, 7);
		    
		 friendReqPage.setStyle("-fx-backgroud-color : #97a8c6");
		   
		 scrollFriendReq.setContent(friendReqPage);
		 scrollFriendReq.setStyle("-fx-background : #FFFFFF; -fx-border-color : #97a8c6");
	
	     scrollFriendReq.setVbarPolicy(ScrollBarPolicy.NEVER);//hide scroll bar(vbar)
	     
	     
	     // user profile page
	     //profile page - DP isaac
		  Image imageProfile = new Image(new FileInputStream("C:\\Users\\isaac choong\\Downloads\\isaacx.jpg"));
	      ImageView imageProfileIsaac = new ImageView(imageProfile);
	      imageProfileIsaac.setFitWidth(60);
		  imageProfileIsaac.setFitHeight(60);
			
		//profile page - feed post
		Image imageProfileFeed = new Image(new FileInputStream("C:\\Users\\isaac choong\\Downloads\\feed.png"));
		ImageView imageFeed = new ImageView(imageProfileFeed);
		imageFeed.setFitWidth(300);
		imageFeed.setFitHeight(100);
		
	   
		//profile page - button to log out
		 Button btLogout1 = new Button("Logout");
		
		//profile page - user name,bio,followers
		 
		Label lblProfileName = new Label("syahirah.co");
		lblProfileName.setStyle("-fx-font-weight: bold; -fx-font-size: 14px; ");
		Label lblProfileBio = new Label("Future software developer!");
		lblProfileBio.setStyle("-fx-font-size: 12px; ");
		Label lblProfileFollowers = new Label("\n\t\t\t\t\t\tFollower : 345803\n\t\t\t\t\t\tFollowing : 24314");
		lblProfileFollowers.setStyle(" -fx-font-size: 13px; -fx-font-weight: bold; ");
		lblProfileFollowers.setTextFill(Color.web("#97a8c6"));
	
		
		//profile page - add all nodes to pane
	
		ProfilePage.add(imageProfileIsaac,2,2);
		ProfilePage.add(lblProfileName,2,3);
		ProfilePage.add(lblProfileBio, 2, 4);
		ProfilePage.add(lblProfileFollowers,2, 2);
		ProfilePage.add(btLogout1, 2, 11);
		ProfilePage.add(imageFeed, 2, 6);
		
		    


		//create scene
		Scene loginScene = new Scene(loginPage,320,370);
		Scene wePageScene = new Scene(wePagePane, 320, 370);
		Scene signUpScene = new Scene(signUpPane,320,370);
		Scene sucessfulScene= new Scene (sucessful,320,370);
		Scene sceneProfilePage = new Scene(ProfilePage, 360,370);
		
		
		 //Action handler for friend request syahirah
        btFriendReqSyahirah.setOnAction( e -> {btFriendReqSyahirah.setText("Requested");});
        btCancelSyahirah.setOnAction( e -> {btFriendReqSyahirah.setText("Add Friend");});
        
        //Action handler for friend request Aisyah
        btFriendReqAisyah.setOnAction( e -> {btFriendReqAisyah.setText("Requested");});
        btCancelAisyah.setOnAction( e -> {btFriendReqAisyah.setText("Add Friend");});
        
        //Action handler for friend request Hajar
        btFriendReqHajar.setOnAction( e -> {btFriendReqHajar.setText("  Accepted  ");});
        btCancelHajar.setOnAction( e -> {btFriendReqHajar.setText("   Accept    ");});
        
      //profile page - action handler for button main page, logout and profile page
        btLogout1.setOnAction(e -> {
        	primaryStage.setScene(loginScene);
		    primaryStage.setTitle("Login");
		    tf1.setText("");
		    tf2.setText("");});
        
		// register login button with event handle
		loginBt.setOnAction(e -> {
			try {
			
			Scanner input = new Scanner (userList);
			boolean found  = false;
			
			String firstName = input.next();
			String lastName = input.next();
			String username = input.next();
			String password = input.next();
			
			while(input.hasNext()) {
				
			if(tf1.getText().equals(username) && tf2.getText().equals(password)) {
					found =  true;
					break;
				}
				
					
			}
			
			if (found) {
				user.setUsername(username);
				primaryStage.setScene(wePageScene);//go to the next scene
				primaryStage.setTitle("Wegram Main Page");
			}
			else
			      new AlertBox().display("Warning","Wrong Username or Password");
			
			}
			catch (FileNotFoundException ex) {
				System.out.println("file not found!");
			}
		});
		// register sign up button that turn to sign up page
		signUpBt.setOnAction(e -> {
			primaryStage.setScene(signUpScene);
			primaryStage.setTitle("SignUp");
			});
		
		//register the handler for sign up successful page
		signUpBt2.setOnAction(e -> {
			
			String username = username1.getText();
			String password = password1.getText();
			String firstName1 = fname.getText();
			String lastName1 = lname.getText();
		
		writer.printf("%s %s %s %s", firstName1,lastName1,username,password);
			
			
			writer.flush();
			writer.close();
			signUp.setUsername(username);
			signUp.setPassword(password);
			
			//reset to empty field
			fname.setText(null);
			lname.setText(null);
			username1.setText(null);
			password1.setText(null);
			
			primaryStage.setScene(sucessfulScene);//go to the next scene
			});
		
		// handler that back to login scene
		back.setOnAction(e -> {primaryStage.setScene(loginScene);
							primaryStage.setTitle("login");});
		cancel.setOnAction(e -> {primaryStage.setScene(loginScene);
		primaryStage.setTitle("login");});
		
	
		
		//set default scene
		primaryStage.setScene(loginScene);
		primaryStage.setTitle("Login");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	//method to create header
		public HBox getHeader() throws FileNotFoundException {
			//create object for HBox
			HBox hbox = new HBox(65);
			hbox.setPadding(new Insets(4,4,4,4));
			
			//create object to get image
			Image friendReq = new Image(new FileInputStream
					("C:\\Users\\User\\Downloads\\friend_Request.png"));
			Image wegram = new Image(new FileInputStream
					("C:\\Users\\User\\Downloads\\title.png"));
			ImageView request = new ImageView(friendReq);
			ImageView viewWegram = new ImageView(wegram);
			
			//set height and width for the images
			request.setFitHeight(28);
			request.setFitWidth(28);
			viewWegram.setFitHeight(23);
			viewWegram.setFitWidth(95);
			
			//create button for icon
			Button friendReqBt = new Button();
			Button wegramBt = new Button();
			
		friendReqBt.setPrefSize(30, 30);//set preferred size for the friend request button
		friendReqBt.setGraphic(request);//insert graphic into the friend request button
		wegramBt.setPrefSize(120,30);//set preferred size for the wegram button
		wegramBt.setGraphic(viewWegram);//insert graphic into the wegram button
			
			//set background color for both of the buttons
			friendReqBt.setStyle("-fx-background-color : #FFFFFF");
			wegramBt.setStyle("-fx-background-color : #FFFFFF");
			
	hbox.getChildren().addAll(wegramBt,friendReqBt);//add all buttons into hbox
		
hbox.setAlignment(Pos.BASELINE_RIGHT);//set alignment for the hbox to baseline right
			
			// register friend Request button
			friendReqBt.setOnAction(e -> {
				wePagePane.setCenter(scrollFriendReq);
			});
			return hbox;
		}


		//method to put all icon in horizontal
		public HBox getBottomPage() throws FileNotFoundException {
			//create hbox object
			HBox hbox = new HBox(10);
			hbox.setPadding(new Insets(4,4,4,4));
			
			//create object to get image
			Image home = new Image(new FileInputStream
					("C:\\Users\\User\\Downloads\\home.png"));
			Image search = new Image(new FileInputStream
					("C:\\Users\\User\\Downloads\\search.png"));
			Image camera = new Image(new FileInputStream
					("C:\\Users\\User\\Downloads\\camera.png"));
			Image profile = new Image(new FileInputStream
					("C:\\Users\\User\\Downloads\\profile.png"));
			
			//array to view all icon
		ImageView[] allIcon = {new ImageView(home),new ImageView(search),
					new ImageView(camera),new ImageView(profile)};
			




			//create botton for icon
			Button homeBt = new Button();
			Button searchBt = new Button();
			Button cameraBt = new Button();
			Button profileBt = new Button();
					
			//create array for button
			Button[] allButton = {homeBt,searchBt,cameraBt,profileBt};
					
			for(int i=0; i< allButton.length; i++) {
				//set preferred size, graphic and background for all button
				allButton[i].setPrefSize(30, 30);
				allButton[i].setGraphic(allIcon[i]);
				allButton[i].setStyle("-fx-background-color : #FFFFFF");
				//set icon image width and height
				for(ImageView icon : allIcon) {
					icon.setFitWidth(28);
					icon.setFitHeight(28);
				}
			}
			//add all button into hbox
			hbox.getChildren().addAll(homeBt,searchBt,cameraBt,profileBt);
			//set alignment for hbox to baseline center
			hbox.setAlignment(Pos.BASELINE_CENTER);
			
			
			// register handler for profile button
			 profileBt.setOnAction(e -> {
		        	wePagePane.setCenter(ProfilePage);
		        	
				   });
			// register the handler for home button
			homeBt.setOnAction(e-> {
				
				wePagePane.setCenter(scrollPost);
			
			});
	
			// register search button with event handler
			searchBt.setOnAction(e-> {
				try {
				
				wePagePane.setCenter(user.getSearchPane());
				
				}

				catch (Exception ex) {
					System.out.println("error");
				}
			});

			// register the handler for camera button to add post
			cameraBt.setOnAction(e ->{
				try {
				
				VBox newPost =  user.addPost();
				
				//add the post to post pane
				
					postPane.add(newPost, 0, 2);
			  
				}
					
				catch(Exception ex) {
					System.out.println("No image is found");
				}
			});
			
			
			
			return hbox;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
