package br.com.senaisp.bauru.richard.licaobonus;

public class ClasseSingleton {
	private static ClasseSingleton instancia=null;
	//campos
	private String nome;
	//Constructor privado
	private ClasseSingleton() {
		nome = "Sem nome";
	}
	//Usaremos um método statico para criar a classe
	public static ClasseSingleton getInstancia() {
		
		if (instancia == null) {
			instancia = new ClasseSingleton();
		}
		
		return instancia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
