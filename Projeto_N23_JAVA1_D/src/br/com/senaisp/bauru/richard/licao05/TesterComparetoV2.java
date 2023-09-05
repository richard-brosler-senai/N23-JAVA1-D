package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesterComparetoV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//nextLine faz com que o separador seja o final de linha
		System.out.println("Digite um nome:");
		String nome1 = sc.nextLine();

		System.out.println("Digite um outro nome:");
		String nome2 = sc.nextLine();

		if (nome1.compareTo(nome2) > 0) {
			System.out.println("Nome1 é maior que nome2");
		} else if (nome1.compareTo(nome2) < 0) {
			System.out.println("Nome1 é menor que nome2");
		} else {
			System.out.println("São iguais!");
		}
		sc.close();
	}

}
