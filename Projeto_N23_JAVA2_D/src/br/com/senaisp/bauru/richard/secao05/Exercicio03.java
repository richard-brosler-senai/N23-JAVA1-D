package br.com.senaisp.bauru.richard.secao05;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String corAtual = 
		  JOptionPane.showInputDialog("Digite a cor: (1 a 3)");
		String msg = "Cor inválida!";
		if (corAtual.equals("1")) {
			msg = "A próxima cor é Verde!";
		} else if (corAtual.equals("2")) {
			msg = "A próxima cor é Amarelo!";
		} else if (corAtual.equals("3")) {
			msg = "A próxima cor é Vermelho!";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
