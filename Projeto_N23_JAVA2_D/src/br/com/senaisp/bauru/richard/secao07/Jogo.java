package br.com.senaisp.bauru.richard.secao07;

import java.util.Random;

public class Jogo {
	//Campos
	private Random rnd;
	private int custoCredito;
	private int tickets;
	private String titulo;
	//Constructor
	public Jogo() {
		//se quiser sempre a mesma sequencia, fixar a semente
		//por exemplo 123456
		//rnd = new Random(123456); 
		rnd = new Random(); 
		custoCredito = rnd.nextInt(10)+1;
		tickets = rnd.nextInt(15)+1;
		titulo = "Sem titulo";
	}
	//Getters e setters
	public int getCustoCredito() {
		return custoCredito;
	}
	public int getTickets() {
		return tickets;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	//Métodos
	public void lerCartao(Cartao ct) {
		if (ct.getCreditos()<getCustoCredito()) {
			System.out.println("Infelizmente você "
					+ "não possui saldo suficiente "
					+ "para o jogo!");
		} else {
			int saldo = ct.getCreditos() - getCustoCredito();
			ct.setCreditos(saldo);
			
			saldo = ct.getTickets() + getTickets();
			ct.setTickets(saldo);
			
			System.out.println("----------------------");
			System.out.println("Saldo remanescente:");
			System.out.println(ct.toString());
		}
	}
	@Override
	public String toString() {
		return "Nome jogo: " + titulo + "\n" +
			   "Preço: " + custoCredito + "\n" + 
			   "Ticket cedidos: " + tickets;
	}
}
