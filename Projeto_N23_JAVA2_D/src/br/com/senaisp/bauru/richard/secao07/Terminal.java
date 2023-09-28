package br.com.senaisp.bauru.richard.secao07;

public class Terminal {
	//campos
	private CategoriaPremio[] categoria;
	//Constructor
	public Terminal(CategoriaPremio[] cat) {
		categoria = cat;
	}
	//Getters e setters
	public CategoriaPremio[] getCategoria() {
		return categoria;
	}
	//Métodos
	public void consultarSaldo(Cartao ct) {
		System.out.println("-----------------");
		System.out.println("Consulta de Saldo");
		System.out.println("-----------------");
		System.out.println(ct.toString());
	}
	
	public void carregarCartao(Cartao ct, int valor) {
		int saldo = ct.getCreditos() + valor * 2;
		ct.setCreditos(saldo);
		System.out.println("----------------");
		System.out.println("Crédito de saldo");
		System.out.println("----------------");
		System.out.println(ct.toString());
	}
	
	public void permutarSaldo(Cartao ctOri, 
							  Cartao ctDes, int valor) {
		if (ctOri.getCreditos()<valor) {
			System.out.println("Não é possível efetuar"
					+ " a permuta de créditos! Saldo"
					+ " insuficiente!");
		} else {
			int saldo = ctOri.getCreditos() - valor;
			ctOri.setCreditos(saldo);
			
			saldo = ctDes.getCreditos() + valor;
			ctDes.setCreditos(saldo);
			
			//Mostrando os saldos
			System.out.println("----------------");
			System.out.println("Permuta Creditos");
			System.out.println("----------------");
			System.out.println("Origem:");
			System.out.println(ctOri.toString());
			System.out.println();
			System.out.println("Destino:");
			System.out.println(ctDes.toString());
		}
	}
	
	public void permutarSaldo(Cartao ctOri, Cartao ctDes){
		if (ctOri.getCreditos()>0) {
			permutarSaldo(ctOri, ctDes, ctOri.getCreditos());
		} else {
			System.out.println("Você não possui saldo para"
					+ " permutar com outro cartão!");
			System.out.println(ctOri.toString());
		}
	}
	
	public void trocarTickets(Cartao ct, int idPremio) {
		if (idPremio>categoria.length-1) {
			System.out.println("Id Premio inválido!");
			return;
		}
		
		if (categoria[idPremio].getSaldo()<=0) {
			System.out.println("Sem saldo do prêmio "
					+ "escolhido!");
			return; //saida forçada do método
		}
		
		if (ct.getTickets()<
				categoria[idPremio].getCustoTickets()) {
			System.out.println("Sem saldo de tickets"
					+ " para efetuar a troca!");
			return;
		}
		//Obtendo o saldo de tickets, subtraindo o custo
		int saldo = ct.getTickets() - 
				     categoria[idPremio].getCustoTickets();
		//regravando o saldo de tickets no cartão
		ct.setTickets(saldo);
		
		//Deduzindo o prêmio da categoria
		saldo = categoria[idPremio].getSaldo() - 1;
		//Regravando o saldo de prêmios na categoria
		categoria[idPremio].setSaldo(saldo);
		
		//mostrando a mensagem
		System.out.println("----------------");
		System.out.println("Troca de prêmios");
		System.out.println("----------------");
		System.out.println("Troca efetuada com sucesso!");
		System.out.println();
		System.out.println(categoria[idPremio].toString());
		System.out.println();
		System.out.println(ct.toString());
		
	} //fim do método de troca
	@Override
	public String toString() {
		return "Prêmio 01: " + categoria[0].toString() + "\n"+
			   "Prêmio 02: " + categoria[1].toString() + "\n"+
			   "Prêmio 03: " + categoria[2].toString();
	}
	
} //fim da classe





