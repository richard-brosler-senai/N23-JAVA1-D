package br.com.senaisp.bauru.richard.secao05;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String xValor = JOptionPane.
		 showInputDialog("Digite o espectro de cor (número):");
		//Convertendo o texto para double
		double valor = Double.parseDouble(xValor);
		//realizando o teste para mostrar a mensagem
		String msg = "Nenhuma cor está nesse espectro";
		    //Violeta	380-450
		if (valor >= 380.00 && valor <= 450.00) {
			msg = "A cor é violeta";
		           //Azul	450.000001-495
		} else if (valor > 450.00 && valor <= 495.00 ) {
			msg = "A cor é Azul";
			      //Verde	495-570
		} else if (valor > 495.00 && valor <= 570.00 ) {
			msg = "A cor é Verde";
			       //Amarelo	570-590
		} else if (valor > 570.00 && valor <= 590.00 ) {
			msg = "A cor é Amarelo";
			       //Laranja	590-620
		} else if (valor > 590.00 && valor <= 620.00 ) {
			msg = "A cor é Laranja";
				   //Vermelho	620-750
		} else if (valor > 620.00 && valor <= 750.00 ) {
			msg = "A cor é Vermelho";
		}
		//Mostrando a mensagem
		JOptionPane.showMessageDialog(null, msg);
		
	}
}
