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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ChoiceBoxes extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Direction");
		ChoiceBox<String> cb = new ChoiceBox<>();
		cb.getItems().add("Left");
		cb.getItems().add("Right");
		Button button = new Button("Done!");
		button.setOnAction(ev -> System.out.println(
				cb.getSelectionModel().getSelectedItem()));
		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(5));
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(label, cb, button);
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

/************
 * Output:	*
 * Left		*
 ************/
