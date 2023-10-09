package br.com.senaisp.bauru.richard.secao08;

import java.util.ArrayList;

public class TesteListaCliente {

	public static void main(String[] args) {
		ArrayList<Cliente> lst = Cliente.listarClientes();
		for(Cliente cl : lst) {
			System.out.println("Nome: " + cl.getNome());
		}
	}

}
