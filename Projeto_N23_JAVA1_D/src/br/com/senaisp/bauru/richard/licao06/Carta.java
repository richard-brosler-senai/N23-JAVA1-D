package br.com.senaisp.bauru.richard.licao06;

public class Carta {
	public static final String[] NAIPES = 
		{"Espadas","Ouros","Paus","Copas"};
	public static final String[] IMAGENS = 
		{"♠","♦","♣","♥"};
	public static final String[] NOMES = 
	 {"A","2","3","4","5","6","7","8","9","10","Q","J","K"};
	
	private String naipe;
	private String valor;
	
	public Carta(String np, String vl) throws Exception {
		setNaipe(np);
		setValor(vl);
	}

	private int buscarNaipe(String value) {
		int retorno = -1;
		for(int i=0 ; i<NAIPES.length ; i++) {
			if (value.equalsIgnoreCase(NAIPES[i])) {
				retorno = i;
				break;
			}
		}
		return retorno;
	}
	
	private int buscarValor(String value) {
		int retorno = -1;
		for(int i=0 ; i<NOMES.length ; i++) {
			if (value.equalsIgnoreCase(NOMES[i])) {
				retorno = i;
				break;
			}
		}
		return retorno;
	}
	
	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		if (buscarNaipe(naipe)==-1) {
			throw new RuntimeException("Naipe Inválido!");
		}
		this.naipe = naipe;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) throws Exception {
		if (buscarValor(valor)==-1) {
			throw new Exception("Valor de carta inválido!");
		}
		this.valor = valor;
	}
	
	public String getImagemCarta() {
		                //123456789
		String texto = 	"+-------+\n"+ //1
						"|##     |\n"+ //2 
						"|   $   |\n"+ //3
						"|     ##|\n"+ //4
						"+-------+\n";//5
		String sb = IMAGENS[buscarNaipe(naipe)];
		String bb = ( valor.equals("10") ? "" : " " );
		
		texto = texto.replaceFirst("##", valor + bb);
		texto = texto.replaceAll("\\$", sb);
		texto = texto.replaceFirst("##", bb + valor);
		
		return texto;
	}
	
	public int getValorCarta() {
		return buscarValor(valor)>9 ? 10 : buscarValor(valor) + 1;
	}
}
