package javafx;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFields extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Name:");
		TextField textField = new TextField();
		Button button = new Button("Greet!");
		button.setOnAction(e -> {
			String s = "Hello " + textField.getText() + "!";
			System.out.println(s);
		});
		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(5));
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(label);
		hBox.getChildren().add(textField);
		hBox.getChildren().add(button);
		
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

/****************************
 * Output:					*
 * Hello Java Learnings!	*
 ****************************/
