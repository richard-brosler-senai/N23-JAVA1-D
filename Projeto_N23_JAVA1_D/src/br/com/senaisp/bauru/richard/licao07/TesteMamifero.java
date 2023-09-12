package br.com.senaisp.bauru.richard.licao07;

public class TesteMamifero {

	public static void main(String[] args) {
		Mamifero[] ma = new Mamifero[3];
		//Criando os mamíferos
		ma[0] = new Humano();
		ma[1] = new Felino();
		ma[2] = new Humano(); //Mamifero(); Não é possível
		
		ma[0].setNome("José");
		ma[1].setNome("Jorge");
		ma[2].setNome("Marta");
		
		//Todo mundo falando!!!
		for (Mamifero it: ma) {
			it.falar();
		}
		ma[0].alimentar();
		//comparando o humano com o felino
		System.out.println(ma[0].compareTo(ma[1]));
		
		//DONE Metodos com objetos como parametro
		//DONE Variaveis estaticas
		//DONE Classe Final
		//TODO Applet
	}

}
