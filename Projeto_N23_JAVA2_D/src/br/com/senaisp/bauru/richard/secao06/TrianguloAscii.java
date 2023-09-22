package br.com.senaisp.bauru.richard.secao06;

public class TrianguloAscii {
	private int altura;

	public TrianguloAscii(int alt) {
		altura = alt;
	}
	
	public String montagem() {
		String ret="#\n";
		//Inicio do for de linha
		for(int lin=2;lin<=altura;lin++) {
			ret += "#"; //primeiro caracter da coluna
			//Inicio do for de coluna
			for(int col=2;col<lin;col++) {
				ret += lin==altura ? "#" : " ";
			}
			ret+="#\n";//último caracter da linha
		}
		return ret;
	}
}
