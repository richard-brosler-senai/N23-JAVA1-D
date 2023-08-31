package br.com.senaisp.bauru.richard.licao03;

import java.util.Scanner;

public class InversaoValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program de inversão de valores");
		System.out.println("Digite o valor a ser invertido:");
		int vlr = sc.nextInt();
		// 123 => 321
		// |||----> unidade
		// ||-----> dezena
		// |------> centena
		int centena = vlr / 100;     //1
		int dezena = vlr % 100 / 10; //2
		int unidade = vlr % 10;      //3
		int vlrInv = unidade * 100 + dezena * 10 + centena;
		System.out.println("O valor invertido é " + vlrInv);
		sc.close();
	}

}
