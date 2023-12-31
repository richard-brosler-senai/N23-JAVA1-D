package br.com.senaisp.bauru.richard.licao03;

import java.util.Scanner;

public class FormulaBhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa de calculo trigonométrico");
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		//calculando delta
		double delta = Math.pow(b,2) - 4 * a * c;
		System.out.println("Delta = " + delta);
		//calculando x1 e x2
		double x1 = ( -b + Math.sqrt(delta) ) / ( 2 * a );
		double x2 = ( -b - Math.sqrt(delta) ) / ( 2 * a );
		//Mostrando o resultado
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
		//Fechar scanner
		sc.close();
	}

}
