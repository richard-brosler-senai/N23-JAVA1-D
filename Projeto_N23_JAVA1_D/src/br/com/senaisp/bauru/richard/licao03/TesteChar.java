package br.com.senaisp.bauru.richard.licao03;

public class TesteChar {

	public static void main(String[] args) {
		char letra = 'A'; //65
		//char letra1 = "B"; <== erro
		letra++;
		System.out.println(letra);
		letra = 67;
		System.out.println(letra);
		char letra2 = 'D';
		System.out.println("" + letra + letra2);
		String nome = "Richard";
		String nome1 = new String("Roberval");
		System.out.println("Richard".length());
	}

}
