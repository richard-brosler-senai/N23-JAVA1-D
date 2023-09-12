package br.com.senaisp.bauru.richard.licaobonus;

public class TesteFolha {

	public static void main(String[] args) {
		Funcionario fun = new Funcionario();
		//fun.setChapa(1);
		fun.setNome("Roberto");
		fun.setSalario(2500.00);
		
		Funcionario fun2 = new Funcionario("José", 0, 1800.00);
		
		FolhaPagamento fol = new FolhaPagamento(2);
		
		fol.adicionarFuncionario(fun);
		fol.adicionarFuncionario(fun2);
	
		fol.reajusteSalarial(20);
		
		System.out.println("Funcionario 1: " + fun.getSalario());
		System.out.println("Funcionario 2: " + fun2.getSalario());

		System.out.println("Funcionario 1: " + fun.getChapa());
		System.out.println("Funcionario 2: " + fun2.getChapa());
		
	}

}
