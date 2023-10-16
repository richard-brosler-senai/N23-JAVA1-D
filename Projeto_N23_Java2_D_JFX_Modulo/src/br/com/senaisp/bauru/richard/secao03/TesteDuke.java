package br.com.senaisp.bauru.richard.secao03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TesteDuke extends Application {

	@Override
	public void start(Stage stage01) throws Exception {
		Group noRoot = new Group();
		
		Duke dk = new Duke();
		Button btnMedia = new Button("Chamar Media Player");
		
		dk.setLayoutX(10);
		dk.setLayoutY(10);
		
		btnMedia.setLayoutX(600);
		btnMedia.setLayoutY(10);
		
		noRoot.getChildren().addAll(dk, btnMedia);
		Scene scene = new Scene(noRoot,800,600,Color.BEIGE);
		//Colocando o evento do botão
		btnMedia.setOnAction( (evt)->{
			TelaMediaPlayer media = new TelaMediaPlayer();
			stage01.setScene(media.getScena());
		});
		
		
		stage01.setTitle("Duke com eventos");
		stage01.setScene(scene);
		stage01.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
