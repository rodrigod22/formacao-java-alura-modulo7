package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteParseArquivo {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("contas.csv"));
		
		while(sc.hasNextLine()){
			
			String linha = sc.nextLine();
			
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();			
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			
			
			System.out.println(valor1 + valor2 + valor3 + valor4);
			
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores));			
			
			linhaScanner.close();
		}	
		
		sc.close();
		
	}

}
