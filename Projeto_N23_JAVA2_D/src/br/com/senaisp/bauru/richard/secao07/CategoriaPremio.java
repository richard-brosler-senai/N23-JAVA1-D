package br.com.senaisp.bauru.richard.secao07;

import java.util.Random;

public class CategoriaPremio {
	//Campos
	private Random rnd;
	private String nomeCategoria;
	private int custoTickets;
	private int saldo;
	//Constructor
	public CategoriaPremio(String nome, int qtde) {
		rnd = new Random();
		custoTickets = rnd.nextInt(20)+1;
		nomeCategoria = nome;
		saldo = qtde;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public int getCustoTickets() {
		return custoTickets;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Nome: " + nomeCategoria + "\n" +
	           "Custo: " + custoTickets + "\n" + 
			   "Saldo: " + saldo;
	}
}
