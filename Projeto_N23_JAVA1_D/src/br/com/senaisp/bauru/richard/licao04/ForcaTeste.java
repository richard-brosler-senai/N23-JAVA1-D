package br.com.senaisp.bauru.richard.licao04;

import java.util.Scanner;

public class ForcaTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Forca fo = new Forca("JAVA");
		char letra;
		do {
			fo.mostrarForca();
			System.out.println("Digite a letra:");
			letra = sc.next().charAt(0);
			fo.tentativaLetra(letra);
		}while(!fo.isTerminado());
		fo.mostrarForca();
		sc.close();
	}

}
