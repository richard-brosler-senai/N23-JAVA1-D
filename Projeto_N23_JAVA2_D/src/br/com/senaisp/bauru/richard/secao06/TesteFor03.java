package br.com.senaisp.bauru.richard.secao06;

import javax.swing.JOptionPane;

public class TesteFor03 {

	public static void main(String[] args) {
		String xValor = JOptionPane.
				showInputDialog("Digite um número:");
		int valor = Integer.parseInt(xValor);
		//Calcular o fatorial desse número e mostrar o resultado
		//.: fatorial(5) = 5x4x3x2x1 => 120
		//Utilizar o for para isso
		double resultado = 1;
		//desenvolver o calculo aqui
		//for(int i=valor; i>=2; resultado*=i, i-- );
		for(int i=valor; i>=2; i-- ) {
			resultado*=i;
		}
		//Mostrando a resposta
		JOptionPane.showMessageDialog(null, 
				"O resultado é " + resultado);
	}

}
