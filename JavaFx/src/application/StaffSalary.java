package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StaffSalary extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TextField monthlyPayment= new TextField();
		TextField totalPay= new TextField();
		TextField net= new TextField();
		TextField years= new TextField();
		TextField loan= new TextField();
		net.setStyle("-fx-text-fill: #FF0000");
		net.setEditable(false);
		
		RadioButton edu= new RadioButton ("Education");
		RadioButton personal= new RadioButton ("Personal");
		
		GridPane grid=new GridPane();
		grid.setPadding(new Insets(20,20,20,20));
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(new Label("Number of Years: "), 0, 0);
		grid.add(years, 1, 0);
		grid.add(new Label("Loan Amount (RM)"), 0, 1);
		grid.add(loan, 1, 1);
		grid.add(new Label("Monthly Payment: "), 0, 2);
		grid.add(monthlyPayment, 1, 2);
		grid.add(new Label("Total Payment: "), 0, 3);
		grid.add(totalPay, 1, 3);

		Button calc= new Button ("Calculate ");
		calc.setStyle("-fx-border-colour: #add8e6");
		
		calc.setOnMouseClicked(e-> {
		//calculateSalary(grossSal,deduc,net);
		Double year= Double.parseDouble(years.getText());
		Double amount= Double.parseDouble(loan.getText());
		Double ans= year-deduction;
		net.setText(String.format("RM%.2f", ans));
		}
		);
		grid.add(calc, 0, 4);
		grid.add(net, 1, 4);
		
		
		Scene scene= new Scene (grid,350,200);
		
		primaryStage.setTitle("Salary Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**private Object calculateSalary(TextField grossSal, TextField deduc, TextField net) {
		// TODO Auto-generated method stub
		//String gS= grossSal.getText();
		Double gS= Double.parseDouble(grossSal.getText());
		Double deduction= Double.parseDouble(deduc.getText());
		Double ans= gS-deduction;
		//net.setText(String.format("RM%.2f", ans.toString()));
		net.setText(String.format("RM%.2f", ans));
		return net;
	}*/

	public static void main (String[] args) {
		launch(args);
	}
	

}
