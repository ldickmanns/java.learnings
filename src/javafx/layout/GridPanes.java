package javafx.layout;

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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPanes extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(5));
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Label 1"), 0, 0);
		gridPane.add(new Label("Label 2"), 0, 1);
		gridPane.add(new Button("Button 1"), 1, 0);
		gridPane.add(new Button("Button 2"), 1, 1);
		primaryStage.setScene(new Scene(gridPane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
