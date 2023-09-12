package br.com.senaisp.bauru.richard.licaobonus;

public class FolhaPagamento {
	private int numeroFuncionarios;
	private Funcionario[] funcionarios;
	private int indiceDisponivel;
	
	public FolhaPagamento(int nrFun) {
		numeroFuncionarios = nrFun;
		funcionarios = new Funcionario[numeroFuncionarios];
		indiceDisponivel = 0;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void adicionarFuncionario(Funcionario fun) {
		if (indiceDisponivel<numeroFuncionarios) {
			funcionarios[indiceDisponivel] = fun;
			indiceDisponivel++; 
		} else {
			throw new RuntimeException("Não é possível "
					+ "adicionar o funcionário!");
		}
	}
	
	public void reajusteSalarial(double percentual) {
		double fator = 1 + percentual / 100;
		for (Funcionario fun : funcionarios) {
			//fazendo a conta
			double conta = fun.getSalario() * fator;
			//guardando o valor reajustado no funcionário
			fun.setSalario(conta);
		}
	}
}
