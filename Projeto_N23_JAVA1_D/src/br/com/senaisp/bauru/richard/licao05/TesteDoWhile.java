package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesteDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		do {
			System.out.println("Digite sua idade:");
			idade = sc.nextInt();
		} while(idade<1 || idade > 99);

		int idade2=0;//aqui tenho que forçar a entrada
		while(idade2<1 || idade2 > 99) {
			System.out.println("Digite sua idade2:");
			idade2 = sc.nextInt();
		}
		
		sc.close();
	}

}
