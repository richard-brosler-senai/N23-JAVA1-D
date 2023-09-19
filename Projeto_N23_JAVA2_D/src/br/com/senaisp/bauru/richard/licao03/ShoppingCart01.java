package br.com.senaisp.bauru.richard.licao03;

public class ShoppingCart01 {

	public static void main(String[] args) {
		String custName = "Richard";
		String itemDesc = "Camisa";
		
		int qtdeItem = 2;
		double preco = 25.50;
		double taxa = 1.07; //7% acima do valor
		
		String mensagem = custName + " Comprou " + qtdeItem + 
								" " + itemDesc;
		
		double total = qtdeItem * preco * taxa;
		
		System.out.println(mensagem);
		
		mensagem = "O custo \"total\" com o imposto é de $ " + total;
		System.out.println(mensagem);
	}

}
