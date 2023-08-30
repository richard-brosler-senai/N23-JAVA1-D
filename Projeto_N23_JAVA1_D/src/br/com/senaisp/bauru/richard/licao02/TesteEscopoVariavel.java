package br.com.senaisp.bauru.richard.licao02;

public class TesteEscopoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 10;
		
		if (idade<=10) {
			String nome = "Roberto";
			System.out.println(nome);
		}
		System.out.println(idade);
		//Nessa linha abaixo há um erro por conta de escopo
		//Se retirar o comentário irá acusar erro.
		//System.out.println(nome);
	}

}
