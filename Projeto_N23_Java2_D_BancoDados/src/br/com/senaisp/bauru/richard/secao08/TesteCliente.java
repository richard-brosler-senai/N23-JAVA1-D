package br.com.senaisp.bauru.richard.secao08;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cli = Cliente.criar("Richard", 46, 
				"123456789", "12345", "18/01/1977", 
				"Masculino", "Capricornio",
				"Nome da mãe", "Nome do pai", "a@b.c.d",
				"123456", "12345", "Rua das ruas", "Numero",
				"Bairro",
				"Cidade", "SP", "12123123", "123321", 
				1.89, 110, "O+", "Azul");
		
		System.out.println("Cliente inserido no id " + 
									cli.getId());
	}

}
