package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesterCompareto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		String nome1 = sc.next();
		//Se tiver um espaço no nome1, o scanner vai jogar
		//esse conteúdo após o espaço para o segundo campo
		System.out.println("Digite um outro nome:");
		String nome2 = sc.next();
		
		if (nome1.compareTo(nome2)>0) {
			System.out.println("Nome1 é maior que nome2");
		} else if (nome1.compareTo(nome2)<0) {
			System.out.println("Nome1 é menor que nome2");
		} else {
			System.out.println("São iguais!");
		}
		sc.close();
	}

}
