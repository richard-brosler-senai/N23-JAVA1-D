package br.com.senaisp.bauru.richard.secao06;

public class RetanguloAscii {
	private int altura;
	private int comprimento;
	
	public RetanguloAscii(int alt, int com) {
		altura = alt;
		comprimento = com;
	}
	
	public String montagem() {
		String ret = "";
		for (int lin=1;lin<=altura;lin++) {
			for (int col=1;col<=comprimento;col++) {
				ret += ( col==1 || 
						 col==comprimento ||
				         lin==1 || 
				         lin==altura ) ? "#" : " ";
			} //termino do for da coluna
			ret += "\n";
		}//termino do for da linha
		return ret;
	}
}
