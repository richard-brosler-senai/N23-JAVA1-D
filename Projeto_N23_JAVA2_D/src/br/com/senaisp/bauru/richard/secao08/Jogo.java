package br.com.senaisp.bauru.richard.secao08;

import java.util.Random;

public class Jogo {
	private static int contador = 0;
	private static final int FATORCALOR = 25; 
	//Fields (Campos)
	private int id;
	private double temperatura;
	private Time casa;
	private Time visitante;
	private int golsCasa;
	private int golsVisitante;
	//Constructor
	public Jogo(Time cas, Time vis, double temp) {
		id = ++contador;
		casa = cas;
		visitante = vis;
		temperatura = temp;
		//Criando valores aleatórios
		Random rnd = new Random();
		int max = Math.round(
					(float)(temp * FATORCALOR / 100)
					);
		
		golsCasa = rnd.nextInt(max);
		golsVisitante = rnd.nextInt(max);
		//Calculando resultado
		calcularResultado();
	}
	//Getters e Setters
	public int getId() {
		return id;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public Time getCasa() {
		return casa;
	}

	public Time getVisitante() {
		return visitante;
	}

	public int getGolsCasa() {
		return golsCasa;
	}

	public int getGolsVisitante() {
		return golsVisitante;
	}

	private void calcularResultado() {
		//Atualizando a casa
		casa.addGolsFeitos(golsCasa);
		casa.addGolsSofridos(golsVisitante);
		if (golsCasa > golsVisitante) {
			casa.addVitorias(1);
		} else if (golsCasa < golsVisitante) {
			casa.addDerrotas(1);
		} else {
			casa.addEmpates(1);
		}
		//Atualizando visitantes
		visitante.addGolsFeitos(golsVisitante);
		visitante.addGolsSofridos(golsCasa);
		if (golsVisitante > golsCasa) {
			visitante.addVitorias(1);
		} else if (golsVisitante < golsCasa) {
			visitante.addDerrotas(1);
		} else {
			visitante.addEmpates(1);
		}
	}//fim do método
}//fim da classe
