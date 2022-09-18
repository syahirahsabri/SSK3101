package application;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.*;
import javafx.event.*;
public class Post1 {

	private String description;
	private int like;
	private String comment;
	private Image image;
	private Media video;
	private String name = "Isaac Choong";
	public User username;
	
	TextArea postDescription = new TextArea();
	
	// no-arg constructor
	public Post1() {
		
	}
	
	// constructor with argument description only
		public Post1(String description,int like, String comment) {
			this.description = description;
			this.like = like;
			this.comment = comment;
			
		}
	// constructor with argument image
	public Post1(String description,int like, String comment,Image image) {
		this.description = description;
		this.like = like;
		this.comment = comment;
		this.image = image;
	}
	
	// constructor with argument video
		public Post1(String description,int like, String comment,Media video) {
			this.description = description;
			this.like = like;
			this.comment = comment;
			this.video = video;
		}
		
		// share post (should be in class WeGram) using event handler
		
		// get and set method
		public String getDescription() {
			return description;
		}
		
		public void setDescription(String description) {
			postDescription.setText(description);
			this.description = description;
		}
		
		public int getLike() {
			return like;
		}
		
		public void setLike(int like) {
			this.like = like;
		}
		
		public String getComment() {
			return comment;
		}
		
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Image getImage() {
			return image;
		}
		
		public void setImage(Image image) {
			this.image = image;
		}
		
		
		public VBox publishPost() throws FileNotFoundException {
		
			VBox post = new VBox(30);
			
			// user profile icon and name 
		    InputStream stream1 = new FileInputStream("C:\\Users\\User\\Downloads\\profile.png");
			Image icon = new Image(stream1);
			ImageView imageView1 = new ImageView(icon);
			imageView1.setFitHeight(50);
			imageView1.setFitWidth(50);
		    Label userIcon = new Label(name,
					imageView1);
			userIcon.setContentDisplay(ContentDisplay.LEFT);
			
			// write description
			Label description1 = new Label(description);
			// allow the description to be wrapped next line
			postDescription.setWrapText(true);
			// allow the user to edit
			postDescription.setEditable(true);
			
			// image 
			
			ImageView viewImage = new ImageView(image);
			
			
			
			// like and comment
			HBox hBox = new HBox(20);
			InputStream stream2 = new FileInputStream("C:\\Users\\User\\Downloads\\love.png");
			Image likeBt = new Image (stream2);
			ImageView viewLikeBt = new ImageView(likeBt);
			viewLikeBt.setFitHeight(30);
			viewLikeBt.setFitWidth(30);
			
			Button like = new Button("Like "+ Integer.toString(this.getLike()),viewLikeBt);
			TextField comment = new TextField();
			comment.setPromptText("comment");
			
			
			hBox.getChildren().addAll(like,comment);
			
			// create and register with handler for like button
			like.setOnAction((ActionEvent e) -> {
				like.setText("Liked " + Integer.toString(this.getLike()+1));
				this.like ++;
				System.out.println(comment.getText());
				
			});
			// add all node into post vbox
			post.getChildren().addAll(userIcon,description1,viewImage,hBox);
			
			return post;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
