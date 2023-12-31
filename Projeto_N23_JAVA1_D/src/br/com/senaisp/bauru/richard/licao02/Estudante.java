package br.com.senaisp.bauru.richard.licao02;

public class Estudante {
	private String nome;
	private int idade;
	private double altura;
	private boolean fumante;
	public static final int BIMESTRES = 4; // constante
	// constructor

	public Estudante() // padrão
	{
		nome = "Sem nome";
		idade = 100_000;
		altura = 1.80;
		fumante = false;
	}

	// constructor específico com passagem de parâmetros
	public Estudante(String nom, int ida, double alt, boolean fum) {
		setNome(nom);
		setIdade(ida);
		setAltura(alt);
		setFumante(fum);
	}

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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	@Override
	public String toString() {
		return "Nome : " + getNome() + 
			   "\nIdade: " + getIdade() +
			   "\nAltura : " + getAltura() +
			   "\nFumante: " + isFumante();
	}
}
