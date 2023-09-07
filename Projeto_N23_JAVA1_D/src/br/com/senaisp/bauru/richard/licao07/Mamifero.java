package br.com.senaisp.bauru.richard.licao07;

public abstract class Mamifero {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void falar();
	
	protected void alimentar() {
		System.out.println("Alimentando-se");
	}
}