package br.com.senaisp.bauru.richard.secao08;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
	// Campos
	private int id;
	private String nome;
	private int    idade;
	private String cpf;
	private String rg;
	private String data_nasc;
	private String sexo;
	private String signo;
	private String mae;
	private String pai;
	private String email;
	private String senha;
	private String cep;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone_fixo;
	private String celular;
	private double altura;
	private double peso;
	private String tipo_sanguineo;
	private String cor;

	private ConexaoBD conn;

	// constructor
	public Cliente() {
		id = 0;
		nome = null;
		idade = 0;
		cpf = null;
		rg = null;
		data_nasc = null;
		sexo = null;
		signo = null;
		mae = null;
		pai = null;
		email = null;
		senha = null;
		cep = null;
		endereco = null;
		numero = null;
		bairro = null;
		cidade = null;
		estado = null;
		telefone_fixo = null;
		celular = null;
		altura = 0;
		peso = 0;
		tipo_sanguineo = null;
		cor = null;

		conn = ConexaoBD.getInstancia();
	}// fim do constructor

	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public String getSexo() {
		return sexo;
	}

	public String getSigno() {
		return signo;
	}

	public String getMae() {
		return mae;
	}

	public String getPai() {
		return pai;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getCep() {
		return cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getTelefone_fixo() {
		return telefone_fixo;
	}

	public String getCelular() {
		return celular;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public String getCor() {
		return cor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setTelefone_fixo(String telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public static Cliente criar(String nome, int idade, String cpf, String rg, String data_nasc, String sexo,
			String signo, String mae, String pai, String email, String senha, String cep, String endereco,
			String numero, String bairro, String cidade, String estado, String telefone_fixo, String celular,
			double altura, double peso, String tipo_sanguineo, String cor) {
		Cliente ret = new Cliente();
		
		ret.nome = nome;
		ret.idade = idade;
		ret.cpf = cpf;
		ret.rg = rg;
		ret.data_nasc = data_nasc;
		ret.sexo = sexo;
		ret.signo = signo;
		ret.mae = mae;
		ret.pai = pai;
		ret.email = email;
		ret.senha = senha;
		ret.cep = cep;
		ret.endereco = endereco;
		ret.numero = numero;
		ret.bairro = bairro;
		ret.cidade = cidade;
		ret.estado = estado;
		ret.telefone_fixo = telefone_fixo;
		ret.celular = celular;
		ret.altura = altura;
		ret.peso = peso;
		ret.tipo_sanguineo = tipo_sanguineo;
		ret.cor = cor;
		
		ret.inserir();
		
		return ret;
	}

	private void inserir() {
		try {
			PreparedStatement stmt = conn.getConector()
					  .prepareStatement("insert into clientes("
					  		+ "nome,idade,cpf,rg,data_nasc,sexo,"
					  		+ "signo,mae,pai,email,senha,cep,endereco,"
					  		+ "numero,bairro,cidade,estado,telefone_fixo,"
					  		+ "celular,altura,peso,tipo_sanguineo,cor)"
					  		+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					  		+ "         ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					  		+ "         ?, ?, ? )",
					  		Statement.RETURN_GENERATED_KEYS);
			int id = 0;
			stmt.setString(++id, nome);          
			stmt.setInt(++id, idade);         
			stmt.setString(++id, cpf);           
			stmt.setString(++id, rg);            
			stmt.setString(++id, data_nasc);     
			stmt.setString(++id, sexo);          
			stmt.setString(++id, signo);       
			stmt.setString(++id, mae);           
			stmt.setString(++id, pai);           
			stmt.setString(++id, email);         
			stmt.setString(++id, senha);         
			stmt.setString(++id, cep);           
			stmt.setString(++id, endereco);      
			stmt.setString(++id, numero);        
			stmt.setString(++id, bairro);        
			stmt.setString(++id, cidade);        
			stmt.setString(++id, estado);        
			stmt.setString(++id, telefone_fixo); 
			stmt.setString(++id, celular);       
			stmt.setDouble(++id, altura);        
			stmt.setDouble(++id, peso);          
			stmt.setString(++id, tipo_sanguineo);
			stmt.setString(++id, cor);           
			
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
			
			if (rs.next()) {
				setId(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void gravar() {
		String sql = "update clientes set "
				+ "nome=?,idade=?,cpf=?,rg=?,data_nasc=?,sexo=?,"
		  		+ "signo=?,mae=?,pai=?,email=?,senha=?,cep=?,endereco=?,"
		  		+ "numero=?,bairro=?,cidade=?,estado=?,telefone_fixo=?,"
		  		+ "celular=?,altura=?,peso=?,tipo_sanguineo=?,cor=?"
		  		+ " where id=?";
		try {
			PreparedStatement stmt = conn.getConector()
					.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}// fim da classe
