package br.com.senaisp.bauru.richard.secao06;

import javax.swing.JOptionPane;

public class TesteFor04 {

	public static void main(String[] args) {
		String xValor = JOptionPane
				.showInputDialog("Digite um valor:");
		int valor = Integer.parseInt(xValor);
		int res = valor;
		//Calcular o número mais próximo da raiz quadrada
		//do número digitado sem utilizar Math.sqrt
		//use somente o for e o break se necessário
		for(int i=1;  i*i <= valor ;i++) {
			res = i;
		}
		
		JOptionPane.showMessageDialog(null, 
				"O resultado é " + res );
	}

}
