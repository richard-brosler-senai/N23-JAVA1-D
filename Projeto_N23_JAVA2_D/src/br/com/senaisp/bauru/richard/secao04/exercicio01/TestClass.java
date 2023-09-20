package br.com.senaisp.bauru.richard.secao04.exercicio01;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ComputeMethods cp = new ComputeMethods();

		int opc; 
		do {
			System.out.println("MENU");
			System.out.println("");
			System.out.println("1 - Calcular Fahrenheit para Celsius");
			System.out.println("2 - Calcular Hipotenusa");
			System.out.println("3 - Jogar Dados");
			System.out.println("4 - Obter sobrenome, inicial nome");
			System.out.println("5 - Obter sobrenome, inicial nome (versão 2)");
			System.out.println("9 - Fim");
			System.out.println("");
			System.out.println("Escolha a opção:");

			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Digite a temperatura Fahrenheit:");
				double tmpF = sc.nextDouble();
				double tmpC = cp.fToC(tmpF);
				System.out.println("Temperatura C: " + tmpC);
				System.out.println("Tecle Enter para Voltar ao menu.");
				sc.nextLine();
				sc.nextLine();
				break;
			case 2:
				System.out.println("Digite o Cateto Oposto:");
				int catA = sc.nextInt();
				System.out.println("Digite o Cateto Adjacente:");
				int catB = sc.nextInt();
				double hip = cp.hypotenuse(catA, catB);
				System.out.println("Hipotenusa: " + hip);
				System.out.println("Tecle Enter para Voltar ao menu.");
				sc.nextLine();
				sc.nextLine();
				break;
			case 3:
				System.out.println("Rolando os dados....");
				int soma = cp.roll();
				System.out.println("Soma dos 2 dados foi : " + soma);
				System.out.println("Tecle Enter para Voltar ao menu.");
				sc.nextLine();
				sc.nextLine();
				break;
			case 4:
			case 5:
				sc.nextLine();
				System.out.println("Digite seu nome completo:");
				String nomeCp = sc.nextLine();
				String sobreNome = opc == 4 ? //usando operador ternário
						cp.processaNome(nomeCp) : //se opc = 4
						cp.processaNome2(nomeCp); //se opc = 5
				System.out.println("Resultado: " + sobreNome);
				System.out.println("Tecle Enter para Voltar ao menu.");
				sc.nextLine();
				break;
			case 9:
				System.out.println("Adeus!");
				break;
			default: System.out.println("Opção incorreta!");
			}
		} while(opc!=9);
		sc.close();
	}
}
