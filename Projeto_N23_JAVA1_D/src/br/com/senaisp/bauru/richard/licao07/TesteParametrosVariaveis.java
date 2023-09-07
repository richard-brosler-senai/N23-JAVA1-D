package br.com.senaisp.bauru.richard.licao07;

public class TesteParametrosVariaveis {

	public static void main(String[] args) {
		String[] frutas = {"Pera","Uva","Laranja","Banana"};
		listarValoresV1(frutas);
		System.out.println("-----");
		listarValoresV2("Pera");
	}
	
	public static void listarValoresV1(String[] par) {
		for (String it : par) {
			System.out.println(it);
		}
	}

	public static void listarValoresV2(String ... par) {
		for (String it : par) {
			System.out.println(it);
		}
	}

}
