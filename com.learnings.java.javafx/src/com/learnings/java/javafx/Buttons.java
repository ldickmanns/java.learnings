package com.learnings.java.javafx;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Buttons extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("Say Hello!");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello!");
			}
		});
		Scene scene = new Scene(button);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

/************
 * Output:	*
 * Hello!	*
 ************/
