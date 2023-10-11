package br.com.senaisp.bauru.richard.secao03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TesteDuke extends Application {

	@Override
	public void start(Stage stage01) throws Exception {
		Group noRoot = new Group();
		
		Duke dk = new Duke();
		dk.setLayoutX(10);
		dk.setLayoutY(10);
		
		noRoot.getChildren().addAll(dk);
		Scene scene = new Scene(noRoot,800,600,Color.BEIGE);
		stage01.setTitle("Duke com eventos");
		stage01.setScene(scene);
		stage01.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
