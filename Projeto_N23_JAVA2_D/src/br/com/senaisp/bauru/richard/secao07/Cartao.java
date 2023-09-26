package br.com.senaisp.bauru.richard.secao07;

public class Cartao {
	//campos necessários
	// Número do cartão
	// Saldo de créditos
	// Saldo de tickets
	// Campos todos privados
	// Usaremos getters e setters necessários
	private static int sequenciaCartao = 0;
	//campos
	private int numeroCartao;
	private int creditos;
	private int tickets;
	//Constructor
	public Cartao() {
		numeroCartao = ++sequenciaCartao;
		creditos = 0;
		tickets = 0;
	}
	//Getters e setters
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public int getCreditos() {
		return creditos;
	}
	public int getTickets() {
		return tickets;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	
	@Override
	public String toString() {
		return "Cartão nr: " + numeroCartao + "\n" +
			   "Saldo créditos: " + creditos + "\n" +
			   "Saldo tickets: " + tickets;
	}
}
