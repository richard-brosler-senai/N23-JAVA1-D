package br.com.senaisp.bauru.richard.secao07;

public class TesteFliperama {

	public static void main(String[] args) {
		//Criando os 2 cartões
		Cartao ct01 = new Cartao();
		Cartao ct02 = new Cartao();
		//Criar 3 categorias de Prêmios
		CategoriaPremio[] cts = new CategoriaPremio[3];
		cts[0] = new CategoriaPremio("Ouro", 30);
		cts[1] = new CategoriaPremio("Prata", 50);
		cts[2] = new CategoriaPremio("Bronze", 100);
		//Criando um terminal
		Terminal ter01 = new Terminal(cts);
		//Criando os jogos
		Jogo jg01 = new Jogo();
		jg01.setTitulo("Mortal Kombat");

		Jogo jg02 = new Jogo();
		jg02.setTitulo("Mario Cart");
		//Carregando os cartões
		ter01.carregarCartao(ct01, 50);
		ter01.carregarCartao(ct02, 5);
		//Visualizando o valor dos jogos
		System.out.println(jg01.toString());
		System.out.println(jg02.toString());
		//Gastando nos jogos
		System.out.println("----------------");
		System.out.println("Iniciando jogos");
		System.out.println("----------------");
		jg01.lerCartao(ct01);
		System.out.println("-------------");
		jg02.lerCartao(ct02);
		
		System.out.println("---------------");
		System.out.println("Segunda rodada");
		System.out.println("---------------");
		jg01.lerCartao(ct02);
		System.out.println("---------------");
		jg02.lerCartao(ct01);
		
		System.out.println("-----------------");
		System.out.println("Iniciando permuta");
		System.out.println("-----------------");
		ter01.permutarSaldo(ct01, ct02, 20);
		
		System.out.println("--------------------");
		System.out.println("Visualizando prêmios");
		System.out.println("--------------------");
		System.out.println(ter01.toString());
		
		System.out.println();
		ter01.trocarTickets(ct01, 0); //categoria ouro

		System.out.println();
		ter01.trocarTickets(ct02, 2); //categora bronze
		
		System.out.println("---------------------");
		System.out.println("Troca total creditos");
		System.out.println("---------------------");
		ter01.permutarSaldo(ct02, ct01);
		
	}

}
