package br.com.senaisp.bauru.richard.licao03;

import java.time.Year;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		boolean comeco = JOptionPane.
				showConfirmDialog(null, 
				"Você quer participar do Jogo do Milhão?",
				"Jogo do Milhão",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE) 
				== JOptionPane.OK_OPTION;
		if (comeco) {
			String nome = (String)JOptionPane.showInputDialog(
									null,
									"Digite seu nome:",
									"Jogo do Milhão",
									JOptionPane.WARNING_MESSAGE,
									null,
									null,
									"String");
			String xIdade = (String)JOptionPane
					.showInputDialog(
					null,
					nome + ", digite sua Idade:",
					"Jogo do Milhão",
					JOptionPane.WARNING_MESSAGE,
					null,
					null,
					"Int");
			int idade = Integer.parseInt(xIdade);
			                  //Ano atual
			int anoNascimento = Year.now().getValue() - idade;
			//ConfirmDialog podemos escolher os botões de resposta
			boolean confAno = JOptionPane.
					showConfirmDialog(null, 
							nome + ", Você nasceu em " + 
						    anoNascimento + " ?",
							"Jogo do Milhão",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.INFORMATION_MESSAGE) 
							== JOptionPane.OK_OPTION;
			
		} else {
			JOptionPane.showMessageDialog(null, "Que Pena!");
		}
	}
}
