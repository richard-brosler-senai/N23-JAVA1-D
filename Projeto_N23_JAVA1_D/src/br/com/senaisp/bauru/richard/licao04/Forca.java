package br.com.senaisp.bauru.richard.licao04;

public class Forca {
	//Campos
	private static final int LIMITE_ERROS = 6;
	private String palavraOculta;
	private String palavraVista;
	private int tentativas;
	private int erros;
	//Constructor
	public Forca(String palaOcu){
		palavraOculta = palaOcu;
		palavraVista = "_".repeat(palaOcu.length());
		tentativas = 0;
		erros = 0;
	}
	public String getPalavraOculta() {
		return palavraOculta;
	}
	public String getPalavraVista() {
		return palavraVista;
	}
	public int getTentativas() {
		return tentativas;
	}
	public int getErros() {
		return erros;
	}
	public boolean tentativaLetra(char letra) {
		boolean ret = false;
		//Desenvolvimento da lógica
		if (erros>=LIMITE_ERROS) {
			return ret;
		}
		tentativas++;
		if (palavraOculta.indexOf(letra)>-1) {
			ret = true;
			if (palavraVista.indexOf(letra)==-1) {
				//percorrendo cada letra da palavra para comparar
				String apoio = "";
				for (int i=0;i<palavraOculta.length();i++) {
					if (palavraOculta.charAt(i)==letra) {
						apoio += letra;
					} else {
						apoio += palavraVista.charAt(i);
					} //fim do if
				}//fim do for
				palavraVista = apoio;
			}//fim do if 
		} else {
			erros++;
			System.out.println("A letra informada "
					+ "não consta na palavra!");
		}
		return ret;
	}
	public boolean isTerminado()
	{
		return erros>= LIMITE_ERROS || 
			   palavraVista.indexOf('_') == -1;
	}
	public void mostrarForca() {
		String linha1 = "";
		if (erros>=3) {
			linha1 += "\\";
		} else {
			linha1 += " ";
		}
		if (erros>=1) {
			linha1 += "O";
		}
		if (erros>=2) {
			linha1 += "/";
		}
		String linha2 = " ";//<-- Aqui tem 1 espaço
		if (erros>=4) {
			linha2 += "|";
		}
		String linha3 = "";
		if (erros>=5) {
			linha3 += "/";
		}
		linha3 += " ";
		if (erros>=6) {
			linha3 += "\\";
		}
		//Vamos ver como está nosso boneco
		System.out.println(" +----+");
		System.out.println(" |   " + linha1);
		System.out.println(" |   " + linha2);
		System.out.println(" |   " + linha3);
		System.out.println(" |   " );
		System.out.println("-+-------------");
		System.out.println(palavraVista);
	}
}
