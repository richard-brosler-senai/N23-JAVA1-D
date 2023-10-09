package br.com.senaisp.bauru.richard.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {

	@Override
	public void start(Stage stage01) throws Exception {
		
		Button btn = new Button("Olá Mundo!");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Olá Mundo!");
			}
		});
		Button btn2 = new Button("222");
		
		//Crio painel principal
		Group noRoot = new Group();
		btn.setLayoutY(100);
		//Adiciono o botão no painel principal
		noRoot.getChildren().addAll(btn,btn2);
		//Criando a scena com 800x600
		Scene scene = new Scene(noRoot,800,600);
		//Amarrando a scena ao stage
		stage01.setScene(scene);
		stage01.setTitle("Minha primeira app com JFX");
		stage01.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
