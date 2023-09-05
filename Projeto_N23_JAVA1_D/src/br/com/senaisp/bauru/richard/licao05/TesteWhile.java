package br.com.senaisp.bauru.richard.licao05;

public class TesteWhile {

	public static void main(String[] args) {
		int linha = 0, coluna = 0;
		while (linha < 10) {
			coluna=0;
			while(coluna<10) {
				//coluna <= linha
				//coluna+linha>=9
				//coluna == linha
				if (coluna+linha==9 || coluna == linha) {
					System.out.print(linha+"-"+coluna+" ");
				} else {
					System.out.print("    ");//4 espaços
				}
				coluna++;
			}//fim while coluna
			linha++;
			System.out.println();
		}//fim while linha
	}

}
