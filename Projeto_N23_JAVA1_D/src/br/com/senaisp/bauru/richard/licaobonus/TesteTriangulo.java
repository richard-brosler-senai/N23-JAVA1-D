package br.com.senaisp.bauru.richard.licaobonus;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteTriangulo {

	public static void main(String[] args) {
		JOptionPane dlgMsg = new JOptionPane();
		JDialog dlg = dlgMsg.createDialog("Demonstração gráfica");
		//Criando a estrutura do triangulo
		Triangulo trg = new Triangulo();
		//Amarrando o triangulo à janela
		dlg.setContentPane(trg);
		//antes de mostrar, dimensionar
		dlg.setSize(800, 600);
		//mostrando a janela
		dlg.setVisible(true);
	}

}
