package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculateTotalMarks extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch (args);

	}
	public void start (Stage primaryStage) {
	

		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		hbox.setPrefHeight(20);
		Label w= new Label ("Coursework: ");
		TextField work= new TextField();
		Label f= new Label ("Final Examination: ");
		TextField finalMark= new TextField();
		hbox.getChildren().addAll(w,work,f,finalMark);
		hbox.setPadding(new Insets(10,20,10,10));
		
		GridPane grid= new GridPane();
		grid.setHgap(20);
		grid.setVgap(20);
		grid.add(new Label ("Total Mark"), 0, 0);
		TextField totalMark= new TextField();
		Button calc= new Button ("Calculate Mark");
		
		calc.setOnAction(e-> {
			Double workMark= Double.parseDouble(work.getText());
			Double markFinal= Double.parseDouble(finalMark.getText());
			double total= ((workMark/150)*60)+ ((markFinal/60)*40);
			totalMark.setText(String.format("%.2f", total));
		});
		
		grid.add(totalMark, 0, 1);
		grid.add(calc, 1, 1);
		
		BorderPane pane= new BorderPane();
		pane.setTop(hbox);
		pane.setCenter(grid);
		
		Scene scene = new Scene (pane,750,350);
		primaryStage.setTitle("Calculate Final Mark");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
