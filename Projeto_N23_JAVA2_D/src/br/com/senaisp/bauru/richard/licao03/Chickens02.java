package br.com.senaisp.bauru.richard.licao03;

public class Chickens02 {

	public static void main(String[] args) {
		double dailyAverage = 0;
		double monthlyAverage = 0;
		double monthlyProfit = 0;
		
		//Segunda-feira - 100 ovos
		dailyAverage += 100;
	
		//Terça-feira - 121 ovos
		dailyAverage += 121;

		//Quarta-feira - 117
		dailyAverage += 117;
		
		//Calculando a média
		dailyAverage /= 3;
		
		//Calculando a média mensal
		monthlyAverage = dailyAverage * 30;
		
		//Calculando o lucro médio mensal
		monthlyProfit = monthlyAverage * 0.18;
		
		System.out.println("Média Diária:   " + dailyAverage);
        System.out.println("Média Mensal: " + monthlyAverage);
        System.out.println("Lucro Médio Mensal:  $" + 
        									   monthlyProfit);
	}

}
