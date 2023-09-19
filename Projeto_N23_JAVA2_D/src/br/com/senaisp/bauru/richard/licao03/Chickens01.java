package br.com.senaisp.bauru.richard.licao03;
public class Chickens01 {
	public static void main(String[] args) {
		int totalEggs = 0;
		//int eggsPerChicken = 5, chickenCount = 3;
		int eggsPerChicken = 4, chickenCount = 8;
		//Segunda-feira - O fazendeiro coleta os ovos
		totalEggs = eggsPerChicken * chickenCount;
		//Terça-feira - Ganha uma galinha logo pela manhã
		chickenCount++;
		totalEggs += eggsPerChicken * chickenCount;
		//Quarta-feira - Animal come metade das galinhas pela manhã
		chickenCount /= 2; // chickenCount = chickenCount / 2;
		totalEggs += eggsPerChicken * chickenCount;
		System.out.println(totalEggs);
		
	}
}
