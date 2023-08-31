package br.com.senaisp.bauru.richard.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		Estudante est = new Estudante();
		
		est.setNome("Zé da esquina");
		est.setIdade(50);
		est.setAltura(1.75);
		est.setFumante(true);
		
		Estudante est2 = new Estudante("Joaquim", 60, 1.60, false);
		
		System.out.println("Nome: " + est.getNome());
		System.out.println(est2.toString());
	}

}
