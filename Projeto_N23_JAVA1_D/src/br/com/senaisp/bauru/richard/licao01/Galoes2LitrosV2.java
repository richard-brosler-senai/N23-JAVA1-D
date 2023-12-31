package br.com.senaisp.bauru.richard.licao01;

import java.util.Locale;
import java.util.Scanner;

public class Galoes2LitrosV2 {

	public static void main(String[] args) {
		//Criação de captura de teclado com o Scanner
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		//use locale fará com que use os padrões de números do USA. Ponto decimal
		double GALOES2LITROS = 3.785;
		System.out.println("Program de conversão de Galões para Litros");
		System.out.println("Digite a quantidade de galões a ser convertida:");
		//Capturando o valor pela entrada do usuário
		double galoes = sc.nextDouble();
		//Realizando a conta de conversão
		double litros = galoes * GALOES2LITROS;
		//Mostrando o resultado
		System.out.println("Quantidade de litros é " + litros);
		//Fechando o Scanner
		sc.close();
	}

}