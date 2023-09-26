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
			int saldo = ctOri.getTickets() - valor;
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
}



