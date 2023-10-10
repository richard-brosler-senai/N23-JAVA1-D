package br.com.senaisp.bauru.richard.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TelaFormas extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage01) throws Exception {
		Group noRoot = new Group();
		
		Polygon trg = new Polygon(new double[] {
				200.0, 50.0,
				200.0, 200.0,
				50.0, 200.0
		});
		
		trg.setFill(Color.BLUE);
		trg.setLayoutX(50);
		trg.setLayoutY(50);
		noRoot.getChildren().addAll(trg);
		
		
		Scene scene = new Scene(noRoot,800,600,Color.BLACK);
		stage01.setTitle("Formas Geométricas");
		stage01.setScene(scene);
		stage01.show();
	}

}
