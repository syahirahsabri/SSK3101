package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	
	public static void display (String title,String message) {
		Stage window= new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(350);
		
		Label text=new Label();
		text.setText(message);
		Button closeBt=new Button("close");
		closeBt.setOnAction(e-> window.close());
		
		VBox layout= new VBox();
		layout.getChildren().addAll(text,closeBt);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene= new Scene (layout);
		window.setScene(scene);
		window.show();
	}

}
