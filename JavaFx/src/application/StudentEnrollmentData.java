/**NAME: NOOR SYAHIRAH BINTI MOHD SABRI
 *  MATRIC NO: 207542
 *  ASSIGNMENT: LAB WEEK 11
 *  
 *  *CREATE SCENE USING DIFFERENT TYPE OF PANE AND TEXTFIELD*
 */

package application;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.collections.*;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;


public class StudentEnrollmentData extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		//create BorderPane 
		BorderPane pane=new BorderPane();
		pane.setRight(getVBox());
		pane.setTop(getHBox());
		pane.setCenter(textBox());
		pane.setPadding(new Insets(5,5,5,5));
		
		//create mainpane to combine all the pane
		BorderPane mainpane= new BorderPane();
		mainpane.setRight(pane);
		mainpane.setLeft(getLeftBox());
		
		
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(mainpane, 1150, 400);
	    primaryStage.setTitle("Student Enrollment Data"); // Set the stage titles
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  

		
	}//end start method

	private GridPane textBox() {
		// TODO Auto-generated method stub
		//create gridPane class
		GridPane grid=new GridPane();
		
		//create comboBox for listing
		ComboBox<String> deg= new ComboBox<>();
		ComboBox<String> maj=new ComboBox<>();
		ComboBox<String> min=new ComboBox<>();
		ComboBox<String> bA=new ComboBox<>();
		ComboBox<String> mA= new ComboBox<>();
		ComboBox<String> certificate= new ComboBox<>();
		
		//set gridPane details
		grid.setPadding(new Insets (5,5,5,5));
		grid.setVgap(5.5);
		grid.setHgap(10);
				
		// declare array of string degree, major, ba, ma and cert
		String[] degree= {"Foundation","Bachelor","Master","PHD"};
		String[] major= {"BA-Software Engineering","BA-Computer Science","BA-Computer Network",
				"BA-Computer Security"};
		String[] minor= {"Mathematics"};
		String[] ba= {"BA-Computer Specialist"};
		String[] ma= {"MA-Language"};
		String[] cert= {"Honour"};
		

		//place nodes in the pane
		grid.add(new Label ("First Name: "), 0, 0);
		grid.add(new TextField (),1, 0);
		grid.add(new Label ("Middle Name: "), 0, 1);
		grid.add(new TextField(),1, 1);
		grid.add(new Label ("Last Name: "), 0, 2);
		grid.add(new TextField(), 1, 2);

		//add combo box
		grid.add(new Label("Degree Program: "), 0, 4);
		grid.add(deg, 1, 4);
		deg.setPrefWidth(100);
		grid.add(new Label ("Major:"), 3, 4);
		grid.add(maj, 4, 4);
		maj.setPrefWidth(200);
		grid.add(new Label ("AAS Minor: "), 1, 5);
		grid.add(min, 2, 5);
		min.setPrefWidth(200);
		grid.add(new Label ("BA: "),1,6);
		grid.add(bA, 2, 6);
		bA.setPrefWidth(200);
		grid.add(new Label("MA: "), 1, 7);
		grid.add(mA, 2, 7);
		mA.setPrefWidth(200);
		grid.add(new Label ("Certificates"), 0, 8);
		grid.add(certificate, 1, 8);
		certificate.setPrefWidth(100);
		
		//add listing into the gridPane
		ObservableList<String> degItems = FXCollections.observableArrayList(degree);
		deg.getItems().addAll(degItems); 
		ObservableList<String> majItems= FXCollections.observableArrayList(major);
		maj.getItems().addAll(majItems);
		ObservableList<String> minItems = FXCollections.observableArrayList(minor);
		min.getItems().addAll(minItems);
		ObservableList<String> baItems= FXCollections.observableArrayList(ba);
		bA.getItems().addAll(baItems);
		ObservableList<String> maItems= FXCollections.observableArrayList(ma);
		mA.getItems().addAll(maItems);
		ObservableList<String> certItems= FXCollections.observableArrayList(cert);
		certificate.getItems().addAll(certItems);
		
		return grid;	
	}//end textBox 

	private Node getLeftBox() {
		// TODO Auto-generated method stub

		//create button objects
		Button close = new Button("Close");
		Button info = new Button("Enrollment Info");
		Button schedule = new Button("Class Schedules");
		Button stud = new Button ("Student Grades");
		Button data = new Button ("Financial Data");
		
		//set button style
		close.setStyle("-fx-background-color: LightBlue");
		info.setStyle("-fx-background-color: LightGreen");
		schedule.setStyle("-fx-background-color: #CBC3E3");
		stud.setStyle("-fx-background-color: LightPink");
		data.setStyle("-fx-background-color: 	#40E0D0");

		//set flowPane details
		FlowPane leftBox = new FlowPane(Orientation.VERTICAL);
		leftBox.setPadding(new Insets(5,5,5,5));
		leftBox.setVgap(10);
		
		//add button into flowPane
		leftBox.getChildren().add(close);
		leftBox.getChildren().add(info);
		leftBox.getChildren().add(schedule);
		leftBox.getChildren().add(stud);
		leftBox.getChildren().add(data);
		
		leftBox.setPadding(new Insets(20,10,10,10));
		
		return leftBox;
	}//end getLeftBox

	private StackPane getHBox()  {
		// TODO Auto-generated method stub
		//creating rectangle and set rectangle details
				Rectangle rect = new Rectangle(1000,50,1000,50);
				rect.setFill(Color.AQUAMARINE);
				rect.setStroke(Color.BLACK);
				rect.setArcHeight(10);
				rect.setArcWidth(10);
				
				//pane on left
				FlowPane leftBox = new FlowPane();
				leftBox.setPadding(new Insets(10,10,10,10));
			    leftBox.getChildren().add(new Label("Student Enrollment Data"));
			    
			   //create pane on right side
			    FlowPane rightBox = new FlowPane(Orientation.HORIZONTAL);
			    rightBox.setPadding(new Insets(10,10,10,10));
			    rightBox.getChildren().addAll(new Label("Student ID "),new TextField(),new Label("    SS# "),new TextField());
			    
			    //creating border pane leftBox and rightBox
				BorderPane hbox = new BorderPane();
			    hbox.setLeft(leftBox);
			    hbox.setRight(rightBox);
			    
			    //stacking hBox into rectangle
			    StackPane hBoxInRect = new StackPane();
			    hBoxInRect.setPadding(new Insets(5,5,5,5));
			    hBoxInRect.getChildren().addAll(rect,hbox);
			    
			    return hBoxInRect;
	}//end getHbox

	private StackPane getVBox() throws FileNotFoundException {
		// TODO Auto-generated method stub
		//create rectangle
				Rectangle rect = new Rectangle(120,300,120,300);
				rect.setFill(Color.WHITE);
				rect.setStroke(Color.BLACK);
				rect.setArcHeight(10);
				rect.setArcWidth(10);
				
				//pane on right 
				FlowPane vbox = new FlowPane(Orientation.VERTICAL);
				

				//inserting images
				Image pencil = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\pencil.png"));
				Image folder = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\folder.png"));
				Image arrowRight = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\arrowright.png"));
				Image arrowLeft = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\arrowleft.png"));
				Image magnify = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\magnifier.png"));
				Image recycle = new Image(new FileInputStream("C:\\Users\\User\\Downloads\\trash.png"));
				
				//create image array
				ImageView[] image1 = {new ImageView(pencil),new ImageView(folder),new ImageView(recycle),
						new ImageView(magnify),new ImageView(arrowLeft),new ImageView(arrowRight)};
				//set image size
				for (ImageView image: image1) {
					image.setFitWidth(40);
					image.setFitHeight(40);
					}
			
				//create gridpane class to arrange the image
				GridPane icon=new GridPane();
				icon.setVgap(5);
				
				//add image into gridpane
				icon.add(image1[0],2, 0);
				icon.add(image1[1],2,1);
				icon.add(image1[2], 2, 2);
				icon.setPrefHeight(10);
				icon.add(new Label ("Enter StdID"), 1, 2, 5, 7);
				icon.add(new TextField(), 2, 8);
				icon.setPrefWidth(1);
				icon.add(image1[3], 3, 8);
				icon.add(image1[4], 2, 9);
				icon.add(image1[5], 3, 9);
				
					
				//add icon gridPane into flowPane
				vbox.getChildren().add(icon);
				vbox.setPadding(new Insets(5,5,5,25));
				
				
				//stack flowPane and rectangle box
				StackPane vBoxInRect = new StackPane();
				vBoxInRect.setPadding(new Insets(5,20,20,20));
				vBoxInRect.getChildren().addAll(rect,vbox);
				
				
				//end of class VBOX
				return vBoxInRect;
	}//end getVBox

	public static void main (String[] args) {
		launch(args);
	}

}
