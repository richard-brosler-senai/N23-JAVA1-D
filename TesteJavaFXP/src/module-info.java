module TesteJavaFXP {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru.richard.testejavafx to javafx.graphics, javafx.fxml;
}
