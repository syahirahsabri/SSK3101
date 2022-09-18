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
public class Post {

	private String description;
	private int like;
	private String comment;
	private Image image;
	private ImageView imageView;
		
		
	// no-arg constructor
	public Post() {
		
	}
	
	// constructor with argument description only
		public Post(String description,int like, String comment) {
			this.description = description;
			this.like = like;
			this.comment = comment;
			
		}
	// constructor with argument image
	public Post(String description,int like, String comment,Image image) {
		this.description = description;
		this.like = like;
		this.comment = comment;
		this.image = image;
	}
	
	
		// get and set method
		public String getDescription() {
			return description;
		}
		
		public void setDescription(String description) {
			
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
		
		public ImageView getImageView() {
			return imageView;
		}
		public void setImageView(ImageView imageView) {
			this.imageView = imageView;
		}
		
		
		

}
