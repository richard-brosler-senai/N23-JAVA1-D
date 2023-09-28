package br.com.senaisp.bauru.richard.secao08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static ConexaoBD instancia;
	
	private String strConn; //minha string de conexao
	private Connection conector;
	//constructor
	private ConexaoBD() {
		strConn = "jdbc:sqlite:C:\\Javalibs\\"
				+ "dados\\N23_Java2_D.db";
		
		try {
			conector = DriverManager.getConnection(strConn);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um problema ao "
								+ "conectar");
		}
	}
	
	public Connection getConector() {
		return conector;
	}
	
	public static ConexaoBD getInstancia() {
		if (instancia==null) {
			instancia = new ConexaoBD();
		}
		return instancia;
	}
	
}
