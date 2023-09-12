package br.com.senaisp.bauru.richard.licaobonus;

public class TesteSingle {

	public static void main(String[] args) {
		ClasseSingleton sg01 = ClasseSingleton.getInstancia();
		sg01.setNome("Classe 01");

		ClasseSingleton sg02 = ClasseSingleton.getInstancia();
		sg02.setNome("Classe 02");
		
		System.out.println(sg01.getNome());
		System.out.println(sg02.getNome());
	}

}
