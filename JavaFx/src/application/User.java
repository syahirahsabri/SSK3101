package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class User {

	
	private SignUp signUp = new SignUp();
	private Post post = new Post();
	private String username ;
	private String password ;


	//constructor with no-arg
	public User() {
		
	}
	// constructor with username and password
	public User(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	// getter and setter method
	public String getUsername() {
       
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
		
	public VBox addPost() throws FileNotFoundException {
		
		VBox postVBox = new VBox(30);
		
		// user profile icon and name 
	    InputStream stream1 = new FileInputStream("C:\\Users\\isaac choong\\Downloads\\Sample_User_Icon.PNG");
		Image icon = new Image(stream1);
		ImageView imageView1 = new ImageView(icon);
		imageView1.setFitHeight(50);
		imageView1.setFitWidth(50);
	    Label userIcon = new Label(username,
				imageView1);
		userIcon.setContentDisplay(ContentDisplay.LEFT);
		
		// write description
		Scanner input = new Scanner(System.in);
		System.out.print("Your post description:");
		// prompt user to enter description
		String description = input.nextLine();
		post.setDescription(description);
		Label description1 = new Label(post.getDescription());
		
		// add image to the post by input the photo directory
		System.out.print("Your photo directory:" );
		String photoDirect = input.nextLine();
		post.setImage(new Image(new FileInputStream(photoDirect)));
		ImageView viewImage = new ImageView(post.getImage());
		viewImage.setFitWidth(279);
		viewImage.setFitHeight(200);
		
		
		
		// like and comment
		HBox hBox = new HBox(20);
		InputStream stream2 = new FileInputStream("C:\\Users\\User\\Downloads\\love.png");
		Image likeBt = new Image (stream2);
		ImageView viewLikeBt = new ImageView(likeBt);
		viewLikeBt.setFitHeight(30);
		viewLikeBt.setFitWidth(30);
		
		Button like = new Button("Like "+ Integer.toString(post.getLike()),viewLikeBt);
		TextField comment = new TextField();
		comment.setPromptText("comment");
		
		
		hBox.getChildren().addAll(like,comment);
		
		// create and register with handler for like button
		like.setOnAction((ActionEvent e) -> {
			//inform the user the post is liked and show the number of like
			like.setText("Liked " + Integer.toString(post.getLike()+1));
	
			post.setLike(post.getLike() +1);
		
		    });
		
		// add all node into post vbox
		postVBox.getChildren().addAll(userIcon,description1,viewImage,hBox);
		
		postVBox.setPadding(new Insets (20,20,20,5));
		postVBox.setStyle("-fx-background-color:#ffffff; -fx-font-size: 11px;");
		
		return postVBox;
		

	}
	
	public BorderPane getSearchPane() throws FileNotFoundException {
		//create file object and insert file location
		File userProfile = new File
		("C:\\Users\\isaac choong\\Documents\\UserProfile.txt");
		//create Scanner object to read the file
		Scanner input = new Scanner(userProfile);
		//create array list to store input from file
		ArrayList<String> userNameArray = new ArrayList<String>();
		ArrayList<String> otherInfoArray = new ArrayList<String>();

		//loop to all elements in file
		while(input.hasNext()) {
			otherInfoArray.add(input.next());//add first name to other info array
			otherInfoArray.add(input.next());//add last name to other info array
			userNameArray.add(input.next());//add user name to user name array
			otherInfoArray.add(input.next());//add password to other info array
				
                              //sort userName array alphabetically
				Collections.sort(userNameArray);
			}
				//create search pane
				BorderPane searchPane = new BorderPane();
				searchPane.setPadding(new Insets(1,4,0,4));
				searchPane.setStyle("-fx-background-color : #FFFFFF");
						
				//text field to search user name
				TextField inputText = new TextField();
				inputText.setPromptText("Search");//set prompt text "search"
				inputText.setPrefWidth(200);//set preferred width
				
				/**************************************************************************/
		/*- add a listener to listen to the changes in the text field              */
	             /*- old value, new value explanation :                     */
/*  if you input "a" into the console, " " will be the oldValue and "a" will be the newValue */
		/*- observable is to observe the list of item            */
		/*- the value will be read character by character   */
				/**************************************************************************/
		        inputText.textProperty().addListener((observable, oldValue, newValue) -> {
		            try {
		            	//set drop down getUserProfile() method at the center
						ScrollPane scroll = new ScrollPane();
				//set scroll pane background as white
		scroll.setStyle("-fx-background : #FFFFFF; -fx-border-color : #F0F0F0");
				scroll.setMaxSize(225, 300);//set max size for scroll pane
						 scroll.setHbarPolicy(ScrollBarPolicy.NEVER);//hide scroll bar(hbar)
						scroll.setVbarPolicy(ScrollBarPolicy.NEVER);//hide scroll bar(vbar)

				//set getUserProfile() method into scroll pane
				scroll.setContent(searchUser(newValue, userNameArray));
				searchPane.setCenter(scroll);//set scroll pane to the center
						
					} 
		            catch (FileNotFoundException e) {
						e.printStackTrace();
					}
		        });
		        
		        //create hbox for search header
		      	HBox searchBox = new HBox(5);
		      	//set search box alignment
		      	searchBox.setAlignment(Pos.BASELINE_CENTER);
		      	//create object to get image
				Image search = new Image(new FileInputStream
						("C:\\Users\\User\\Downloads\\seacrh.png"));

				//create object to view image
				ImageView viewSearch = new ImageView(search);

				//set preferred size for the image
				viewSearch.setFitWidth(23);
				viewSearch.setFitHeight(23);

				//create object for search button
				Button searchBt = new Button();

				//set graphic from view search into search button
				searchBt.setGraphic(viewSearch);
				searchBt.setPrefSize(23, 23);//set preferred size for the button

		searchBt.setStyle("-fx-background-color : #FFFFFF"); //set background button

				//add text field and search button to searchBox(hbox)
				searchBox.getChildren().addAll(inputText, searchBt);
				searchPane.setTop(searchBox);//set search box at the top of pane
				
				return searchPane;
			
	}
public VBox searchUser(String text,ArrayList<String> userName) throws  FileNotFoundException {
		//create object for vbox
		VBox userProfile = new VBox();
		//set background to white
		userProfile.setStyle("-fx-background-color : #FFFFFF ");
		//set alignment to baseline left
		userProfile.setAlignment(Pos.BASELINE_LEFT);
		//loop to show user name arraylist
		for(String name : userName) {
			/********************************************************************/
			/*if the input text is not empty and doesn't consists of spaces only*/
			/*as well as it's a part of one (or more) of the options            */
			/*and add it to the button                                          */
			/********************************************************************/
			if(!text.replace(" ", "").isEmpty()&&name.toUpperCase().contains(text.toUpperCase())) {
				Button userNameBt = new Button(name);
				userNameBt.setMaxWidth(225);
				userNameBt.setAlignment(Pos.BASELINE_LEFT);
				userNameBt.setStyle("-fx-background-color : #FFFFFF");
				userProfile.getChildren().add(userNameBt);
			}
		}
		return userProfile;
	}
}
