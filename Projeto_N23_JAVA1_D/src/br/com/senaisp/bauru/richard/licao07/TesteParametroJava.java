package br.com.senaisp.bauru.richard.licao07;

public class TesteParametroJava {

	public static void main(String[] args) {
		//listando os argumentos passados pela
		//linha de comando do java
		for(String item : args) {
			System.out.println(item);
		}
		System.out.println("--------------------");
		System.out.println("Fim do programa");
	}

}
