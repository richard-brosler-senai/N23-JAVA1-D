package br.com.senaisp.bauru.richard.licao03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TesteLeituraArquivo {

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("C:\\Users\\sn1069942\\Downloads\\Input04\\Level05.txt");
			Scanner sc = new Scanner(in);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
