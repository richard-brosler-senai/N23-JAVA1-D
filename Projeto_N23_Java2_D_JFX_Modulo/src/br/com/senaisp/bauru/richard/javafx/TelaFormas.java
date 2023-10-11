package br.com.senaisp.bauru.richard.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
		
		Ellipse redondo = new Ellipse(200,200);
		redondo.setLayoutX(500);
		redondo.setLayoutY(300);
		
		Rectangle rect = new Rectangle(300,200);
		rect.setLayoutX(50);
		rect.setLayoutY(300);
		
		
		Stop[] stops = new Stop[] {
			new Stop(0,Color.BLACK),
			new Stop(0.5,Color.GOLD),
			new Stop(1,Color.BLUE)
		};
		                                         
		LinearGradient lnGrd = new LinearGradient(
				    0, //posição X inicial 
				    0, //posição Y inicial
				    1, //posição X Final
				    0, //posição Y Final
				    true, //proporcional
					CycleMethod.NO_CYCLE, //ciclo de repetição 
					stops); //paradas de cor
		
		RadialGradient rdGrd = new RadialGradient(
				0, //posição x inicial 
				0, //posição y inicial
				0.5, //posição x final
				0.5, //posição y final
				0.5, //raio da circunferência
				true, //proporcional
				CycleMethod.NO_CYCLE, //ciclo de repetição
				stops); //paradas de cor
		
		trg.setFill(lnGrd);
		trg.setLayoutX(50);
		trg.setLayoutY(50);
		
		redondo.setFill(rdGrd);
		
		rect.setFill(Color.rgb(255,255,0,0.5));
		
		noRoot.getChildren().addAll(trg, redondo, rect);
		
		
		Scene scene = new Scene(noRoot,800,600,Color.BLACK);
		stage01.setTitle("Formas Geométricas");
		stage01.setScene(scene);
		stage01.show();
	}

}
