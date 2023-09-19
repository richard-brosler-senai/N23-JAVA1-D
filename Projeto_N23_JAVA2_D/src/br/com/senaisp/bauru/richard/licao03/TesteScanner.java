package br.com.senaisp.bauru.richard.licao03;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(
				TesteScanner.class.
				getResourceAsStream("input04text.txt"));
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
