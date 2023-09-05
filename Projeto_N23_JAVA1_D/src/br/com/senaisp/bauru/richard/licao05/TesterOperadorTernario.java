package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesterOperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		String texto = "Você " + 
		     // teste lógico    se verdade  se falso
				( idade >= 18 ? "é maior" : "é menor" ) + 
				" de idade";
		
		System.out.println(texto);
		
		sc.close();
	}

}
