package br.com.senaisp.bauru.richard.secao03;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image imgDuke;
	private ImageView imgVwDuke;
	
	private Image imgLuva;
	private ImageView imgVwLuva;
	
	private AudioClip audio;
	
	public Duke() {
		imgDuke = new Image(getClass()
				.getResource("Imagens/Duke.png").toString());
		imgVwDuke = new ImageView(imgDuke);

		imgLuva = new Image(getClass()
				.getResource("Imagens/Glove.png").toString());
		imgVwLuva = new ImageView(imgLuva);
		
		audio = new AudioClip(getClass()
				.getResource("Audios/Note5.wav").toString());
		
		//Dimensionando a imagem
		imgVwDuke.setFitHeight(80);
		imgVwDuke.setPreserveRatio(true);
		imgVwDuke.setLayoutY(5);
		
		imgVwLuva.setFitWidth(30);
		imgVwLuva.setPreserveRatio(true);
		imgVwLuva.setLayoutX(15);
		//Adicionando eventos
		adicionarEventos();
		//Amarrando o group com a imagem
		getChildren().addAll(imgVwDuke,imgVwLuva);
	}

	private void adicionarEventos() {
		setOnMouseClicked( (evt) -> {
			audio.play();
		});
		
		setOnMouseDragged( (evt)->{
			double comp = this.getBoundsInLocal().getWidth()/2;
			double larg = this.getBoundsInLocal().getHeight()/2;
			
			setLayoutX(evt.getSceneX()-comp);
			setLayoutY(evt.getSceneY()-larg);
		});
	}
}






