package br.com.senaisp.bauru.richard.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		try {
			Carta ct = new Carta("Paus", "10");
			System.out.println(ct.getImagemCarta());
			ct = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
