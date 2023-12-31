package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesterSwitchV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu de opções");
		System.out.println("A - Adição");
		System.out.println("B - Subtração");
		System.out.println("C - Multiplicação");
		System.out.println("D - Divisão");
		System.out.println("E - Resto");
		System.out.println("F - Fim");
		System.out.println("Digite sua opção:");
		
		char opc = sc.nextLine().charAt(0);
		
		System.out.println("Digite o valor 1:");
		int vlr1 = sc.nextInt();
		
		System.out.println("Digite o valor 2:");
		int vlr2 = sc.nextInt();
		
		int resultado = 0;
		
		//aqui estou usando char, mas pode ser outros tipos
		switch(opc) { 
		case 'A' -> resultado = vlr1 + vlr2; //adição
		case 'B' -> resultado = vlr1 - vlr2;  //subtração
		case 'C' -> resultado = vlr1 * vlr2;  //multiplicação
		case 'D' -> resultado = vlr1 / vlr2; //divisão
		case 'E' -> resultado = vlr1 % vlr2; //resto
		case 'F' -> resultado = 0;  //fim
		default -> {
			System.out.println("Opção Inválida!");
			resultado = 0;
			//se não for nenhum dos outros
			}
		}
		System.out.println("Resultado é " + resultado);
		
		sc.close();
	}

}
