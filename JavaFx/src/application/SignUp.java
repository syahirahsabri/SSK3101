package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SignUp {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	

	public SignUp() {
		
	}
	public SignUp (String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	public boolean isValidPassword() {
		if (password.length()>=8 && password.length()<=15) { 
			return true;
			
		}
		else {
			
			return false;
		}
		
		
	}	
	
	public void setUsername(String username)  {
			this.username = username;
	}
	public void setPassword(String password) {
			this.password=password;
			
	}
	

	public BorderPane getSignUpPane() throws FileNotFoundException {
		// WeGram image
		Image weGram= new Image (new FileInputStream("C:\\Users\\isaac choong\\Downloads\\wePage-wegram.png"));
		ImageView viewWeGram=new ImageView(weGram);
		viewWeGram.setFitWidth(310);
		viewWeGram.setFitHeight(100);
		
		
		// add all pane to sign up border pane
		BorderPane signUpPane= new BorderPane();
		signUpPane.setTop(viewWeGram);
		
		signUpPane.setStyle("-fx-background-color: #000000");
		signUpPane.setStyle("-fx-border-color: #97a8c6; -fx-border-width: 5px;");
		
		return signUpPane;
	}
	
	public BorderPane getSucessfulPane() {
		BorderPane sucessful= new BorderPane ();
		Text registered= new Text ("Account successfully registered"); 
		registered.setFont(Font.font("Sans Serif",20));
		
		
		sucessful.setCenter(registered);
		
		return sucessful;
	}
}
