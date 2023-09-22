package br.com.senaisp.bauru.richard.secao06;

public class TesteFor01 {

	public static void main(String[] args) {
		//Exemplo de for 0..9
		for(int i=0;i<10;i++) {
			System.out.println((i+1) + "x" + 7 + "=" + ((i+1)*7));
		}
		System.out.println();
		//Assim fica mais simples o código
		//for 1..10
		for(int i=1;i<=10;i++) {
			System.out.println( i + "x" + 8 + "=" + (i*8) );
		}
	}

}
