package br.com.senaisp.bauru.richard.secao08;

public class Time {
	//Fields (Campos)
	private String nome;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int golsSofridos;
	private int golsFeitos;
	//Constructor
	public Time(String nom) {
		nome = nom;
		vitorias = 0;
		derrotas = 0;
		empates = 0;
		golsSofridos = 0;
		golsFeitos = 0;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public int getGolsSofridos() {
		return golsSofridos;
	}
	public int getGolsFeitos() {
		return golsFeitos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = golsSofridos;
	}
	public void setGolsFeitos(int golsFeitos) {
		this.golsFeitos = golsFeitos;
	}
	//Metodos
	public void addGolsFeitos(int value) {
		golsFeitos += value;
	}
	
	public void addGolsSofridos(int value) {
		golsSofridos += value;
	}
	
	public void addVitorias(int value) {
		vitorias += value;
	}
	
	public void addDerrotas(int value) {
		derrotas += value;
	}
	
	public void addEmpates(int value) {
		empates += value;
	}
}//Final da classe
