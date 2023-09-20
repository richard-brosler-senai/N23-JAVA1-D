package br.com.senaisp.bauru.richard.secao04.exercicio01;

import java.util.Random;
import java.util.Scanner;

public class ComputeMethods {
	//Fields - Campos
	private Random rnd;
	//Constructor
	/**
	 * Constructor da classe
	 */
	public ComputeMethods() {
		rnd = new Random();
	}
	//Metodos
	
	/**
	 * Método de conversão de Fahrenheit para Celsius
	 * @param degreesF Deverá informar a temperatura em Fahrenheit
	 * @return Retorna a temperatura e Celsius
	 */
	public double fToC(double degreesF) {
		double retorno=0;
		//Desenvolver a lógica aqui
		retorno = 5.0 / 9 * (degreesF - 32);
		//Fim da lógica
		return retorno;
	}
	
	/**
	 * Função que calcula a Hipotenusa com base nos catetos informados
	 * @param a Informar o Cateto Oposto
	 * @param b Informar o Cateto Adjacente
	 * @return Calcula a hipotenusa e retorna seu valor
	 */
	public double hypotenuse(int a, int b) {
		double retorno = 0;
		//Desenvolver a lógica aqui
		retorno = Math.sqrt( a * a + Math.pow(b, 2));
		//Fim da lógica
		return retorno;
	}
	
	/**
	 * Função que irá rolar 2 dados e somar suas faces
	 * @return Retorna um inteiro contendo o valor da soma de 2 faces e dados
	 */
	public int roll() {
		int retorno = 0;
		//Desenvolver a lógica aqui
		//Lembrando que rnd.nextInt(6) é de 0 até 5
		retorno = rnd.nextInt(6)+1+rnd.nextInt(6)+1;
		//Fim da lógica
		return retorno;
	}
	
	/**
	 * Função pega o nome com sobrenome e devolve Sobrenome, J. Onde J será
	 * a letra inicial do nome.
	 * 
	 * @param value Informar o nome completo para ser separado
	 * @return Retorna o sobrenome, Letra inicial do nome.
	 */
	public String processaNome(String value) {
		String retorno="";
		//Desenvolver a lógica aqui
		//0123456789012 
		//Joaquim Silva
		//
		retorno = value.substring(value.indexOf(" ") + 1);
		retorno += ", " + value.substring(0,1) + ".";
		//Fim da lógica
		return retorno;
	}
	
	public String processaNome2(String value) {
		String retorno = "";
		Scanner ap = new Scanner(value);
		String nome = "";
		if (ap.hasNext()) nome = ap.next();

		String sobrenome = "";
		while(ap.hasNext()) {
			sobrenome = ap.next();
		}
		ap.close();
		retorno = sobrenome + ", " + nome.charAt(0) + ".";
		return retorno;
	}
}
