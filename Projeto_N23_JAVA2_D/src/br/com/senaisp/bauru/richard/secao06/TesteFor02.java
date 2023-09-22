package br.com.senaisp.bauru.richard.secao06;

public class TesteFor02 {

	public static void main(String[] args) {
		//Imprimir todos os pares de 0 a 100
		for(int i=0;i<101; i+=2  ) {
			System.out.println(i);
		}
		//outra forma de mostrar os pares
		System.out.println("----------------------");
		for(int i=0;i<101; i++ ) {
			if ( i % 2 == 0 )
			  System.out.println(i);
		}
		
	}

}
