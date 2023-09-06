package br.com.senaisp.bauru.richard.licao06;

import java.util.Random;

public class Baralho {
	private Carta[] cartas;
	private boolean[] cartaSaiu;
	private Random rnd;
	
	public Baralho() throws Exception {
		cartas = new Carta[Carta.NAIPES.length * 
		                   Carta.NOMES.length];
		cartaSaiu = new boolean[cartas.length];
		rnd = new Random();
		int id = 0;
		//criando as cartas
		for(String np : Carta.NAIPES) {
			for(String vl: Carta.NOMES) {
				cartas[id] = new Carta(np,vl);
				cartaSaiu[id] = false;
				id++;
			}
		}
	}
	
	public Carta sortearCarta() {
		int id;
		do {
			id = rnd.nextInt(cartas.length);
		}while(cartaSaiu[id]);
		//Aqui estou marcando a carta como saiu
		cartaSaiu[id] = true;
		//Devolvendo a carta 
		return cartas[id];
	}
}
