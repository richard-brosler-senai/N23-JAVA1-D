package br.com.senaisp.bauru.richard.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TelaBotoesFX extends Application {

	@Override
	public void start(Stage stage01) throws Exception {
		Group noRoot = new Group();
		
		adicionarComponentes(noRoot);
		
		Scene scene = new Scene(noRoot,800,600,Color.BEIGE);
		stage01.setTitle("Janela Demo JavaFX");
		stage01.setScene(scene);
		stage01.show();
	}

	private void adicionarComponentes(Group noRoot) {
		HBox pnlBtn = new HBox();
		pnlBtn.setLayoutY(500);
		
		Rectangle rect = new Rectangle(200,200,Color.BLUE);
		rect.setLayoutX(50);
		rect.setLayoutY(50);
		//Colocando o contorno laranja
		rect.setStroke(Color.ORANGE);
		rect.setStrokeWidth(8);
		
		Text txt = new Text("Dorm 6:\n200");
		txt.setFill(Color.RED); //cor da fonte em vermelho
		txt.setFont(Font.font("Verdana",FontWeight.BOLD,32));
		txt.setLayoutX(300);
		txt.setLayoutY(200);
		//Colocando o contorno
		txt.setStroke(Color.BLACK);
		txt.setStrokeWidth(8);
		txt.setStrokeType(StrokeType.OUTSIDE);
		txt.setStrokeLineJoin(StrokeLineJoin.ROUND);
		
		Image img = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Duke_%28Java_mascot%29_waving.svg/1137px-Duke_%28Java_mascot%29_waving.svg.png");
		ImageView imgVw = new ImageView(img);
		imgVw.setFitHeight(200);
		imgVw.setPreserveRatio(true);
		imgVw.setLayoutX(600);
		imgVw.setLayoutY(100);
		
		//Criando os botões do HBox
		Button btnSayHello = new Button("Say 'Hello world'");
		Button btn222 = new Button("222");
		Button btn33333 = new Button("33333");
		//Ajustando os botões para se auto-ajustarem
		HBox.setHgrow(btnSayHello, Priority.ALWAYS);
		HBox.setHgrow(btn222, Priority.ALWAYS);
		HBox.setHgrow(btn33333, Priority.ALWAYS);
		//Forçar o tamanho dos botões
		btnSayHello.setPrefWidth(10_000);
		btn222.setPrefWidth(10_000);
		btn33333.setPrefWidth(10_000);
		
		pnlBtn.getChildren().addAll(btnSayHello,btn222,btn33333);
		pnlBtn.setMaxWidth(799);
		
		//amarrando os componentes ao nó root
		noRoot.getChildren().addAll(pnlBtn,rect,txt,imgVw);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
