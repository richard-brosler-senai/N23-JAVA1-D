package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		sc.nextLine(); //retirar o enter do nextInt
		
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Seu nome é " + nome + 
				" e você tem " + idade + " anos.");
		
		sc.close();
	}

}
