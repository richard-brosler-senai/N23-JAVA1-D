package br.com.senaisp.bauru.richard.secao08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TesteJogos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		ArrayList<Jogo> jogos = new ArrayList<Jogo>();
		ArrayList<Integer> numSorteados = new ArrayList<Integer>();
		
		double tempAlta = 0;
		double tempMedia = 0;
		int qtdeConsFrio = 0;
		//Times
		Time[] time = new Time[4];
		
		time[0] = new Time("Time 01");
		time[1] = new Time("Time 02");
		time[2] = new Time("Time 03");
		time[3] = new Time("Time 04");
		
		//
		do {
			double temp;
			do {
				System.out.println("Digite a temperatura:");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Digite somente números!");
					temp = -50.00;
					sc.nextLine(); //captura o enter
				}
			} while(temp < -30.00);
			tempMedia += temp;
			//Verificando a temperatura mais alta
			if (tempAlta<temp) {
				tempAlta = temp;
			}
			//Tratar o jogo
			if (temp <= Jogo.TEMP_MIN) {
				System.out.println("Muito frio para o jogo!");
				qtdeConsFrio++;
			} else {
				//tivemos temperatura,zeramos o contador
				qtdeConsFrio=0; 
				//
				Time casa, visitante;
				//sorteando os times da casa e visitantes
				//para jogar
				int seq; 
				numSorteados.clear(); //limpando antes 
				for (int i = 0; i < time.length / 2; i++) {
					seq = rnd.nextInt(time.length);
					casa = time[seq];
					numSorteados.add(seq);
					do {
						seq = rnd.nextInt(time.length);
					} while (numSorteados.indexOf(seq) > -1);
					visitante = time[seq];
					Jogo jg = new Jogo(casa, visitante, temp);
					jogos.add(jg);
				} //fim do for
				
			}//fim do if
		} while(qtdeConsFrio<3);
		System.out.println("Fim de temporada!");
		System.out.println("Resultados");
		//mostrando os resultados de cada time
		for(int i=0; i<time.length;i++) {
			System.out.println(time[i].toString());
			System.out.println();
		}
		//mostrando os jogos
		System.out.println("Jogos");
		System.out.println();
		//For each no conjunto
		for(Jogo jg : jogos) {
			System.out.println(jg.toString());
			System.out.println();
		}
		//mostrando a temperatura média e máxima
		System.out.println("Temperatura máxima: " + tempAlta);
		System.out.println("Temperatura Média: " + 
					(tempMedia / ( jogos.size() + 3)) );
		//fechando o scanner
		sc.close();
	} //fim do main
}//fim da classe
