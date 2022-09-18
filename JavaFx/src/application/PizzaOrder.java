package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PizzaOrder extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch (args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hbox= new HBox(20);
		hbox.setPadding(new Insets (10,5,10,5));
		hbox.setStyle("-fx-border-color: green");
		Label name= new Label ("Your Name");
		Label matric = new Label ("Your matric number");
		hbox.getChildren().addAll(matric, name);
		
		VBox vboxleft= new VBox(20);
		vboxleft.setPadding(new Insets (10,5,10,5));
		vboxleft.setStyle("-fx-border-color: green");
		Label pizza= new Label("Tempahan Pizza");
		Label kotak= new Label ("Bilangan kotak");
		TextField k= new TextField();
		Label harga= new Label ("Harga sekotak (RM)");
		TextField h= new TextField();
		CheckBox cheese= new CheckBox("Extra Cheese (RM2 sekotak)");
		vboxleft.getChildren().addAll(pizza,kotak,k,harga,h,cheese);
		
		VBox vboxright= new VBox(20);
		vboxright.setPadding(new Insets (10,5,10,5));
		vboxright.setStyle("-fx-border-color: green");
		Button total= new Button ("Jumlah Harga (RM) ");
		TextField jumlah= new TextField();
		jumlah.setEditable(false);
		vboxright.getChildren().addAll(total,jumlah);
		
		
		total.setOnAction(e->{
			Double piza= Double.parseDouble(k.getText());
			Double box= Double.parseDouble(h.getText());
			double price= piza*box;
			jumlah.setText(String.format("%.2f", price));
			cheese.setOnAction(a->{
				if(cheese.isSelected()) {
					Double box2= Double.parseDouble(h.getText());
					double newPrice= price+(2*box2);
					jumlah.setText(String.format("%.2f", newPrice));
				}
				});
			
		
		});
		
		BorderPane pane = new BorderPane ();
		pane.setPadding(new Insets (10,5,10,5));
		pane.setStyle("-fx-border-color: green");
		pane.setTop(hbox);
		pane.setLeft(vboxleft);
		pane.setRight(vboxright);
		
		Scene scene = new Scene(pane,350,300);
		primaryStage.setTitle("Pizza Order");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}

}
