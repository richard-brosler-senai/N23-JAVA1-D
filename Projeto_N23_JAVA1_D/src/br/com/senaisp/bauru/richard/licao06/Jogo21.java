package br.com.senaisp.bauru.richard.licao06;

import java.util.Scanner;

public class Jogo21 {

	public static void main(String[] args) {
		try {
			Baralho ba = new Baralho();
			Scanner sc = new Scanner(System.in);
			int totalCartas = 0;
			Carta ct;
			char resp;
			do {
				
				ct = ba.sortearCarta();
				
				totalCartas += ct.getValorCarta();
				System.out.println(ct.getImagemCarta());
				System.out.println("Você já tem " + totalCartas);
				System.out.println("Quer mais uma carta?");
				resp = sc.nextLine().charAt(0);
				
			}while(totalCartas<=21 && resp != 'N');
			sc.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
