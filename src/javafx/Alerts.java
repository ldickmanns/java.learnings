package javafx;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Alerts extends Application {

	@Override
	public void start(Stage primaryStage) {
		Alert info = new Alert(AlertType.INFORMATION);
		info.setTitle("This is an Information");
		info.setContentText("This is the content!");
		info.show();
		
		Alert warn = new Alert(AlertType.WARNING);
		warn.setTitle("This is a Warning");
		warn.setContentText("Use this to warn!");
		warn.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
