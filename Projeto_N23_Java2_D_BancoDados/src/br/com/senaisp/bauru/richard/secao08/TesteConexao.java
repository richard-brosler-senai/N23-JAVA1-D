package br.com.senaisp.bauru.richard.secao08;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteConexao {

	public static void main(String[] args) {
		ConexaoBD conn = ConexaoBD.getInstancia();
		try {
			PreparedStatement stmt = conn.getConector()
			  .prepareStatement("select * from clientes");
			
			stmt.executeQuery();
			System.out.println("Tudo certo até aqui!");
			
			Scanner sc = new Scanner(new 
					FileInputStream("c:\\javalibs\\"
							+ "arquivo_carregar.csv"));
			
			String linha = sc.nextLine();
			System.out.println(linha);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
