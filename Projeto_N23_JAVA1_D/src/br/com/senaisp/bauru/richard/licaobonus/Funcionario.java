package br.com.senaisp.bauru.richard.licaobonus;

public class Funcionario {
	private static int contador=0;
	
	private int chapa;
	private String nome;
	private double salario;
	
	public Funcionario() {
		contador++;
		chapa = contador;
		nome = "Sem nome";
		salario = 0;
	}
	
	public Funcionario(String nm, int ch, double sal) {
		chapa = ch==0 ? ++contador : ch;
		nome = nm;
		salario = sal;
	}

	public int getChapa() {
		return chapa;
	}

	public void setChapa(int chapa) {
		this.chapa = chapa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
