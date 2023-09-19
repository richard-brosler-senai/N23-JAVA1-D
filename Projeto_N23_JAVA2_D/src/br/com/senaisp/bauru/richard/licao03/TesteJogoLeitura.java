package br.com.senaisp.bauru.richard.licao03;

import java.util.Scanner;

public class TesteJogoLeitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(TesteJogoLeitura.
				class.
				getResourceAsStream("Level05.txt"));
		
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			Scanner ap = new Scanner(linha);
			if (ap.hasNext()) {
				String nomeComponente = ap.next();
				if (!nomeComponente.equals("No")) {
					int posX = ap.nextInt();
					int posY = ap.nextInt();
					System.out.println("Componente: " +
					   nomeComponente + 
					   " Pos X: " + posX +
					   " Pos Y: " + posY);
				} //if equals
			} //if hasNext
			ap.close();
		}
		
	}

}
