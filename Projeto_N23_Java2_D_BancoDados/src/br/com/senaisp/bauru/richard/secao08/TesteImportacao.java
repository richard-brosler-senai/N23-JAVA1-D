package br.com.senaisp.bauru.richard.secao08;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteImportacao {

	public static void main(String[] args) {
		ConexaoBD conn = ConexaoBD.getInstancia();
		try {
			PreparedStatement stmt = conn.getConector()
			  .prepareStatement("insert into clientes("
			  		+ "nome,idade,cpf,rg,data_nasc,sexo,"
			  		+ "signo,mae,pai,email,senha,cep,endereco,"
			  		+ "numero,bairro,cidade,estado,telefone_fixo,"
			  		+ "celular,altura,peso,tipo_sanguineo,cor)"
			  		+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			  		+ "         ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			  		+ "         ?, ?, ? )"); //24 ?
			
			Scanner sc = new Scanner(new 
					FileInputStream("c:\\javalibs\\"
							+ "arquivo_carregar.csv"));
			//Desprezando a linha de cabeçalho
			sc.nextLine();
			while(sc.hasNextLine()) {
				//Pegando a próxima linha
				String linha = sc.nextLine().
						replaceAll("\"", "");
				//usando a linha para pegar as colunas
				System.out.println(linha);
				Scanner ap = new Scanner(linha);
				//indicando o delimitador para ;
				ap.useDelimiter(";");
				int idx = 1;
				stmt.setString(idx++, ap.next()); //nome
				stmt.setInt(idx++, ap.nextInt()); //idade
				//economizando 17 linhas iguais
				for (int i=0;i<17;i++) {
					stmt.setString(idx++, ap.next());
				}
				stmt.setDouble(idx++, ap.nextDouble()); //altura
				stmt.setDouble(idx++, ap.nextDouble()); //altura
				stmt.setString(idx++, ap.next());
				stmt.setString(idx++, ap.next());
				
				stmt.executeUpdate(); //executa o comando
				ap.close(); //fechando o leitor de colunas
			} //fim do while
			sc.close(); //fechando o arquivo texto
			System.out.println("Fim do processamento! \\o/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
