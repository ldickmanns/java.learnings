package javafx;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckingTextFields extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Enter a double:");
		TextField textField = new TextField();
		textField.setOnKeyReleased(e -> {
			boolean test = true;
			try {
				Double.parseDouble(textField.getText());
			} catch (NumberFormatException nfe){
				test = false;
			}
			if(!test && !textField.getText().trim().isEmpty()) {
				textField.setStyle("-fx-text-inner-color: red;");
			} else {
				textField.setStyle("");
			}
		});
		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(5));
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(label);
		hBox.getChildren().add(textField);
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
