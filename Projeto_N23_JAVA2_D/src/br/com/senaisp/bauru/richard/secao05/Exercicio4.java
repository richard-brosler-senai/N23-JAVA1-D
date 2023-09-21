package br.com.senaisp.bauru.richard.secao05;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String corAtual = 
		  JOptionPane.showInputDialog("Digite a cor: (1 a 3)");
		String msg = "Cor inválida!";
		switch(corAtual) {
		case "1" -> msg = "A próxima cor é Verde!";
		case "2" -> msg = "A próxima cor é Amarelo!";
		case "3" -> msg = "A próxima cor é Vermelho!";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		int nOpc = Integer.parseInt(corAtual);
		
		JOptionPane pnl = new JOptionPane();
		JDialog dlg = pnl.createDialog("Semáforo");
		dlg.setSize(60, 200);
		Semaforos sm = new Semaforos(nOpc);
		dlg.setContentPane(sm);
		dlg.setVisible(true);
	}

}
