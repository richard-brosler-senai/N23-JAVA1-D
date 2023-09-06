package br.com.senaisp.bauru.richard.licao06;

public class TesteBaralho {

	public static void main(String[] args) {
		try {
			Baralho ba = new Baralho();
			Carta ct = ba.sortearCarta();
			System.out.println(ct.getImagemCarta());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
