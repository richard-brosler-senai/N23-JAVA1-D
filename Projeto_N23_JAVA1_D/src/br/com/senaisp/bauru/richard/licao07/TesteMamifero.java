package br.com.senaisp.bauru.richard.licao07;

public class TesteMamifero {

	public static void main(String[] args) {
		Mamifero[] ma = new Mamifero[3];
		//Criando os mamíferos
		ma[0] = new Humano();
		ma[1] = new Felino();
		ma[2] = new Humano(); //Mamifero(); Não é possível
		//Todo mundo falando!!!
		for (Mamifero it: ma) {
			it.falar();
		}
		ma[0].alimentar();
		
		//TODO Metodos com objetos como parametro
		//TODO Variaveis estaticas
		//TODO Classe Final
		//TODO Applet
	}

}