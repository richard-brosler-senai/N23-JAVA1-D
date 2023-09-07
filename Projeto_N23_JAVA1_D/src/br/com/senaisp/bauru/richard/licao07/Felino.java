package br.com.senaisp.bauru.richard.licao07;

public class Felino extends Mamifero {
	private boolean quadrupede;
	
	@Override
	public void falar() {
		System.out.println("Miau");
	}

	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}

}
