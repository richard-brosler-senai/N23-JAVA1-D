package br.com.senaisp.bauru.richard.secao03;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;

public class TelaMediaPlayer extends Group {
	private Scene scena;
	private Media video;
	private MediaPlayer videoPlayer;
	private MediaView videoVw;
	
	public TelaMediaPlayer() {
		scena = new Scene(this,800,600,Color.BEIGE);
		video = new Media(getClass()
				.getResource("Videos/VideoJava02.mp4").toString());
		videoPlayer = new MediaPlayer(video);
		videoVw = new MediaView(videoPlayer);
		HBox pnlBtns = new HBox();
		Button btnPlay = new Button("Play");
		Button btnPause = new Button("Pause");
		Button btnStop = new Button("Stop");
		
		videoVw.setFitWidth(600);
		videoVw.setFitHeight(400);
		videoVw.setPreserveRatio(true);
		//800-600 => 200/2 => 100
		videoVw.setLayoutX(100);
		videoVw.setLayoutY(50);
		//Ajustando botoes
		HBox.setHgrow(btnPlay, Priority.ALWAYS);
		HBox.setHgrow(btnPause, Priority.ALWAYS);
		HBox.setHgrow(btnStop, Priority.ALWAYS);
		
		btnPlay.setPrefWidth(10_000);
		btnPause.setPrefWidth(10_000);
		btnStop.setPrefWidth(10_000);
		
		//ajustando o HBox (pnlBtns)
		pnlBtns.setLayoutX(0);
		pnlBtns.setLayoutY(500);
		pnlBtns.setSpacing(10); //espaço entre botoes
		pnlBtns.setMaxWidth(800);
		//adicionando os botões ao painel
		pnlBtns.getChildren().addAll(btnPlay,btnPause,btnStop);
		//Adicionando os componentes ao group
		getChildren().addAll(videoVw,pnlBtns);
		//Adicionar os eventos
		btnPlay.setOnAction( (evt)->{
			videoPlayer.play();
		});
		
		btnPause.setOnAction( (evt)->{
			videoPlayer.pause();
		});
		
		btnStop.setOnAction( (evt)->{
			videoPlayer.stop();
		});
	}

	public Scene getScena() {
		return scena;
	}
}





