package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(sc.hasNextLine()){
			
			String linha = sc.nextLine();
			
			System.out.println(linha);
		}			
		sc.close();		
	}

}
