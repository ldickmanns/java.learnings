package com.learnings.java.javafx;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxes extends Application {

	@Override
	public void start(Stage primaryStage) {
		CheckBox unselected = new CheckBox("Unselected");
		CheckBox selected = new CheckBox("Selected");
		System.out.println(unselected.isSelected());
		selected.setSelected(true);
		VBox vBox = new VBox(5);
		vBox.setPadding(new Insets(5));
		vBox.getChildren().add(unselected);
		vBox.getChildren().add(selected);
		primaryStage.setScene(new Scene(vBox));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
/************
 * Output:	*
 * false	*
 ************/
