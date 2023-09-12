package br.com.senaisp.bauru.richard.licao07;
//final indicará que não será possível gerar uma
//classe filha
public final class Humano extends Mamifero {
	
	private boolean bipede;
	
	@Override
	public void falar() {
		System.out.println("Olá");
	}
	
	public void falar(String valor) {
		System.out.println("Olá + " + valor);
	}

	public boolean isBipede() {
		return bipede;
	}

	public void setBipede(boolean bipede) {
		this.bipede = bipede;
	}

}
