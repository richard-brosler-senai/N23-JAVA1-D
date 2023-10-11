module Projeto_N23_Java2_D_JFX_Modulo {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.media;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru.richard.javafx to 
		javafx.graphics, javafx.controls, javafx.media,
		javafx.fxml;
	
	opens br.com.senaisp.bauru.richard.secao03 to 
		javafx.graphics, javafx.controls, javafx.media,
		javafx.fxml;
}