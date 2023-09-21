package br.com.senaisp.bauru.richard.secao05;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteSemaforo {

	public static void main(String[] args) {
		JOptionPane dlgMsg = new JOptionPane();
		JDialog dlg = dlgMsg.createDialog("Demonstração gráfica");
		//Criando a estrutura do triangulo
		Semaforo trg = new Semaforo(3);
		//Amarrando o triangulo à janela
		dlg.setContentPane(trg);
		//antes de mostrar, dimensionar
		dlg.setSize(800, 600);
		//mostrando a janela
		dlg.setVisible(true);

	}

}
