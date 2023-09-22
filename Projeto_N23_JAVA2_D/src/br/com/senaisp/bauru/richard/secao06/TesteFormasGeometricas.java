package br.com.senaisp.bauru.richard.secao06;

public class TesteFormasGeometricas {

	public static void main(String[] args) {
		TrianguloAscii trg = new TrianguloAscii(5);
		System.out.println(trg.montagem());
		
		RetanguloAscii ret = 
				new RetanguloAscii(5, 5);
		System.out.println(ret.montagem());
	}

}
