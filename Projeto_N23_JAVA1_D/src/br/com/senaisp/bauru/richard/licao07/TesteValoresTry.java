package br.com.senaisp.bauru.richard.licao07;

import java.util.Scanner;

public class TesteValoresTry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu de opções");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Consulta");
		System.out.println("3 - Exclusão");
		System.out.println("4 - Listagem");
		System.out.println("9 - Fim");
		
		int op=0;
		do {
			System.out.println("Digite a opção:");
			
			try {
				op = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Digite números somente!");
				op = 0;
				sc.nextLine();//necessário para capturar o dado inválido
			}
			
			if (op<1 || op>9 || op>4 && op<9) {
				System.out.println("Opção Inválida!");
				op=0;
			}
		}while(op<1 || op>9);
		System.out.println("Opção escolhida foi: " + op);
		sc.close();
	}

}
