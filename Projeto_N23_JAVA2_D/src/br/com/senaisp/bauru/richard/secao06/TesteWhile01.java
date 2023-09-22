package br.com.senaisp.bauru.richard.secao06;

import javax.swing.JOptionPane;

public class TesteWhile01 {

	public static void main(String[] args) {
		int tentativa = 0;
		String senha = "SEMSENHA";
		String entrada;
		do {
			entrada = JOptionPane.
				showInputDialog("Digite a senha:");
			//Testando a senha digitada
			if(!senha.equalsIgnoreCase(entrada)) {
				tentativa++;
				JOptionPane.showMessageDialog(null, 
						"Senha incorreta!");
			}
			///
		}while(!senha.equalsIgnoreCase(entrada) && 
				tentativa < 3);
		
		if (tentativa<3)
			JOptionPane.
			  showMessageDialog(null, "Acesso permitido");
		else
			JOptionPane.
			  showMessageDialog(null, "Senha bloqueada");
	}

}
