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
			//Convertendo texto para inteiro
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
			String xValor = (String)JOptionPane
					.showInputDialog(
					null,
					nome + ", digite quanto você ganha por hora:",
					"Jogo do Milhão",
					JOptionPane.INFORMATION_MESSAGE,
					null,
					null,
					"Double");
			//Convertendo texto para double
			double valor = Double.parseDouble(xValor);
			//Calculando o salário de 1 ano
			double salAno = valor * 8 * 30 * 365.25;
			//Mostrando o valor
			JOptionPane.showMessageDialog(null, nome + 
					", você recebe R$ "+ salAno + " !\n"
							+ "É muita grana!!!");
			
			String[] op01 = {"D.Pedro I", "Tiradentes", 
					         "Joaquim Chavier", 
					         "Pedro Alvares Cabral"};
			
			String pergunta01 = (String)JOptionPane
					.showInputDialog(
					null,
					nome + ", Quem descobriu o Brasil:",
					"Jogo do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					op01,
					op01[0]);
			boolean conf01 = JOptionPane.
					showConfirmDialog(null, 
							nome + ", Tem certeza disso? ?",
							"Jogo do Milhão",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE) 
							== JOptionPane.OK_OPTION;
			
			if (conf01 && pergunta01.equals("Pedro Alvares Cabral")) 
			{
				JOptionPane.showMessageDialog(null, 
						"Parabéns, vc ganhou R$ 100,00");
			} else {
				JOptionPane.showMessageDialog(null, "Que Pena!");				
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Que Pena!");
		}
	}
}
