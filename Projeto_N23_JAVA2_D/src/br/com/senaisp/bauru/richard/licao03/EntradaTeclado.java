package br.com.senaisp.bauru.richard.licao03;

import javax.swing.JOptionPane;

public class EntradaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String nome = (String) JOptionPane.
				showInputDialog(null,
								"Digite seu nome:",
								"Bem vindo ao sistema",
								JOptionPane.INFORMATION_MESSAGE,
								null,
								null,
								"Digite seu nome");
		System.out.println(nome);
		//Mostrando a mensagem
		JOptionPane.showMessageDialog(null, nome);
		//double[] z;
		double z[] = new double[7];
	}

}
