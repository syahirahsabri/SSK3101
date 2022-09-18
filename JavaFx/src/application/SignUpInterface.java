package application;


import java.beans.PropertyChangeListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.Action;

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

public class SignUpInterface extends Application  {
	
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	private String username;
	private String password;
	TextField text= new TextField();
	
	public SignUpInterface() {
		
	}
	public SignUpInterface (String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPhoneNo(String phoneNo) throws InputMismatchException{
		if (phoneNo.contains("a")||phoneNo.contains("b")||phoneNo.contains("c")||phoneNo.contains("d")
				||phoneNo.contains("e")||phoneNo.contains("f")||phoneNo.contains("g")|| phoneNo.contains("h")
				||phoneNo.contains("i")||phoneNo.contains("j")||phoneNo.contains("k")||phoneNo.contains("l")
				||phoneNo.contains("m")||phoneNo.contains("n")||phoneNo.contains("o")||phoneNo.contains("p")
				||phoneNo.contains("q")||phoneNo.contains("r")||phoneNo.contains("s")||phoneNo.contains("t")
				||phoneNo.contains("u")||phoneNo.contains("v")||phoneNo.contains("w")||phoneNo.contains("x")
				||phoneNo.contains("y")||phoneNo.contains("z"))
			System.out.println("Please input valid phone number!");
		else
			this.phoneNo=phoneNo;
	}
	public void setEmail(String email) {
			this.email = email;
		
	}
	public void setUsername(String username)  {
			this.username = username;
	}
	public void setPassword(String password) {
		if (password.length()>=8 && password.length()<=15) {
			  if ((password.contains("@") || password.contains("#")
		           || password.contains("!") || password.contains("~")
		           || password.contains("$") || password.contains("%")
		           || password.contains("^") || password.contains("&")
		           || password.contains("*") || password.contains("(")
		           || password.contains(")") || password.contains("-")
		           || password.contains("+") || password.contains("/")
		           || password.contains(":") || password.contains(".")
		           || password.contains(", ") || password.contains("<")
		           || password.contains(">") || password.contains("?")
		           || password.contains("|"))) 
				  		this.password=password;
			  else
				  text.setText("Password must contain special characters!");

		}
		else
			text.setText("Password length need to more than 8 and less than 15");
		
	}
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	Scene sceneSignUp,sceneRegDone,sceneLogin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch (args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		PrintWriter output= new PrintWriter ("UserData.txt"); 
		SignUp signUp= new SignUp();
		
		TextField fname =new TextField();
		TextField lname= new TextField();
		TextField phoneNo= new TextField();
		TextField email= new TextField();
		TextField username= new TextField ();
		PasswordField password=new PasswordField();
		
		GridPane grid= new GridPane ();
		grid.setVgap(6.5);
		grid.setPadding(new Insets(50,10,10,10));
		grid.add(new Label ("First Name: "), 0, 0);
		grid.add(fname, 1, 0);
		grid.add(new Label ("Last Name: "), 0, 1);
		grid.add(lname, 1, 1);
		grid.add(new Label ("Phone Number: "), 0, 2);
		grid.add(phoneNo, 1, 2);
		grid.add(new Label ("Email: "), 0, 3);
		grid.add(email, 1, 3);
		grid.add(new Label ("Username: "), 0, 4);
		grid.add(username, 1, 4);
		grid.add(new Label ("Password"), 0, 5);
		grid.add(password, 1, 5);
		
	
		//System.out.println(fname.getText());
		
		
		
		
		
		//button signUp and cancel
		Button signBt= new Button("Sign Up");
		Button cancel= new Button("Cancel");
		signBt.setStyle("-fx-background-color: LightBlue");
		signBt.setStyle("-fx-border-color: Black");
		cancel.setStyle("-fx-background-color: LightBlue");
		cancel.setStyle("-fx-border-color: #ff0f0f");

		//pane for button signBt and cancel
		BorderPane pane=new BorderPane();
		pane.setRight(signBt);
		pane.setLeft(cancel);
		pane.setPadding(new Insets(10,10,10,10));
		
		//mainPane for layout 1
		BorderPane mainPane= new BorderPane();
		mainPane.setTop(getHBox());
		mainPane.setCenter(grid);
		mainPane.setBottom(pane);
		mainPane.setStyle("-fx-background-color: white");
		mainPane.setStyle("-fx-border-color: #97a8c6; -fx-border-width: 5px;");
		sceneSignUp= new Scene(mainPane,300,400);
		
		//Layout Scene 2
		BorderPane layout2= new BorderPane ();
		layout2.setPadding(new Insets (10,10,10,10));
		Text registered= new Text ("Account already registered"); 
		registered.setFont(Font.font("Times New Roman",16));
		layout2.setCenter(registered);
		Button back=new Button ("Back To Login");
		layout2.setBottom(back);
		sceneRegDone= new Scene (layout2,300,400);
		
		//sceneLogin=user.sceneLoginPage;
		//button setOnAction
		signBt.setOnAction(e -> {
		signUp.setFirstName(fname.getText());
		signUp.setLastName(lname.getText());
		//signUp.setPhoneNo(phoneNo.getText());
		//signUp.setEmail(email.getText());
		signUp.setUsername(username.getText());
		signUp.setPassword(password.getText());
		
		output.print(fname.getText()+"\t"
				+lname.getText()+"\t"
				+phoneNo.getText()+"\t"
				+email.getText()+"\t"
				+username.getText()+"\t"
				+password.getText());
		output.close();
		primaryStage.setScene(sceneRegDone);
		
		
		});
		cancel.setOnAction(e-> primaryStage.setScene(sceneSignUp));
		back.setOnAction(e -> primaryStage.setScene(sceneSignUp));
		//cancel.setOnAction(e -> primaryStage.setScene(user));
		
		//display 
		primaryStage.setTitle("Sign Up");
		primaryStage.setScene(sceneSignUp);
		primaryStage.show();
		
		
		
}
	private StackPane getHBox() throws FileNotFoundException {//method for image
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle(25,10,100,50);
		rect.setArcHeight(20);
		rect.setArcWidth(20);
		rect.setStroke(Color.BLACK);
		rect.setFill(Color.LIGHTGREY);
		Image image= new Image (new FileInputStream("C:\\Users\\User\\Downloads\\title1.png"));
		ImageView image1=new ImageView(image);
		image1.setFitWidth(100);
		image1.setFitHeight(40);
		
		StackPane stack=new StackPane();
		stack.getChildren().addAll(rect,image1);
		stack.setPadding(new Insets (10,10,10,10));
		
		return stack;//return stack
	}//end method


	
	




}


