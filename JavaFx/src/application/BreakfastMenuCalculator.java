package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BreakfastMenuCalculator extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	public void start (Stage primaryStage) {
		VBox vbox= new VBox();
		vbox.setPadding(new Insets(5,5,5,5));
		vbox.setStyle("-fx-border-color: green");
		Label name= new Label("Your name ");
		Label matric= new Label("Your matric number");
		vbox.getChildren().addAll(matric,name);
		
		GridPane grid= new GridPane ();
		TextField nasi= new TextField();
		TextField coffee= new TextField();
		TextField muffin = new TextField();
		grid.setPadding(new Insets (5,5,5,5));
		grid.setStyle("-fx-border-color: green");
		grid.add(new Label("Price (RM)"), 1	, 0);
		grid.add(new Label("Nasi Lemak "), 0, 1);
		grid.add(nasi, 1, 1);
		grid.add(new Label ("Coffee "), 0, 2);
		grid.add(coffee, 1, 2);
		grid.add(new Label ("Muffin "), 0, 3);
		grid.add(muffin, 1, 3);
		
		VBox vboxDown= new VBox();
		vboxDown.setPadding(new Insets(5,5,5,5));
		vboxDown.setStyle("-fx-border-color: green");
		CheckBox gst= new CheckBox(" GST 6% ");
		TextField tprice = new TextField();
		tprice.setEditable(false);
	
		Button total= new Button ("Total");
		total.setOnAction(e->{
			Double rice= Double.parseDouble(nasi.getText());
			Double kopi = Double.parseDouble(coffee.getText());
			Double mufin = Double.parseDouble(muffin.getText());
			double price= rice+kopi+mufin;
			tprice.setText(String.format("%.2f", price));
			
			gst.setOnAction(a->{
				double newPrice= (price*0.06)+price;
				tprice.setText(String.format("%.2f", newPrice));
			});
		
		});
		
	
		
		vboxDown.getChildren().addAll(gst,total,tprice);
		
		BorderPane pane= new BorderPane();
		pane.setPadding(new Insets(5,5,5,5));
		pane.setStyle("-fx-border-color: green");
		pane.setTop(vbox);
		pane.setCenter(grid);
		pane.setBottom(vboxDown);
		
		Scene scene = new Scene (pane ,400,450);
		primaryStage.setTitle("Breakfast Menu Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
		
		
		
		
	}

}
