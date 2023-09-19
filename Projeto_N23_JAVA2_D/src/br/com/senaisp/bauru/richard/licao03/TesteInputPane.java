package br.com.senaisp.bauru.richard.licao03;

import javax.swing.JOptionPane;

public class TesteInputPane {

	public static void main(String[] args) {
		//Nesse exemplo só temos a mensagem de input de dados
		String msg01 = JOptionPane.showInputDialog("Digite seu nome");
		
		JOptionPane.showMessageDialog(null, msg01);
		//Nesse exemplo colocamos um valor inicial
		String msg02 = JOptionPane.
				showInputDialog("Digite seu endereço",
							"Seu endereço");
		JOptionPane.showMessageDialog(null, msg02);
		//Nesse exemplo temos o título, a mensagem, título,
		//tipo de mensagem
		String msg03 = JOptionPane
				.showInputDialog(null, 
						"Digite seu telefone", 
						"Sistema de cadastro", 
						JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, msg03);
		
		String msg04 = (String) JOptionPane.
						showInputDialog(
						null,     //Parent
						"Digite sua cidade",    //Mensagem
						"Sistema de cadastro",    //título
						JOptionPane.ERROR_MESSAGE, //tipo mensagem
						null,     //ícone da janela
						null,     //vetor de opções
						"Sua cidade");   //valor inicial
		JOptionPane.showMessageDialog(null, msg04);
		
		String[] opc = {"Corinthians", "São Paulo", 
						"Palmeiras", "Santos" };
		String msg05 = (String) JOptionPane.
				showInputDialog(
				null,     //Parent
				"Escolha seu time",    //Mensagem
				"Sistema de cadastro",    //título
				JOptionPane.ERROR_MESSAGE, //tipo mensagem
				null,     //ícone da janela
				opc,     //vetor de opções
				opc[0]);   //valor inicial
		JOptionPane.showMessageDialog(null, msg05);
		
	}

}
