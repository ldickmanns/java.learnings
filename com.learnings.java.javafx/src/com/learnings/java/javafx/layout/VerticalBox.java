package com.learnings.java.javafx.layout;

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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VerticalBox extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Label");
		Button button = new Button("Button");
		VBox vBox = new VBox(10);
		vBox.setAlignment(Pos.CENTER);
		vBox.setPadding(new Insets(5));
		vBox.getChildren().add(label);
		vBox.getChildren().add(button);
		Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
