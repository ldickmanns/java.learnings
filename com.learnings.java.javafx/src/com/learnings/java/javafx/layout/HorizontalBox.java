package com.learnings.java.javafx.layout;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HorizontalBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("This is a Label");
		Button button = new Button("Button");
		HBox hBox = new HBox(20);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(label);
		hBox.getChildren().add(button);
		Scene scene = new Scene(hBox, 200, 30);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
