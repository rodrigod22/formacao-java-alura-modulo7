package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteFormataValores {

	public static void main(String[] args) throws FileNotFoundException {

	Scanner sc = new Scanner(new File("contas.csv"));
		
		while(sc.hasNextLine()){
			
			String linha = sc.nextLine();
			
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();			
			int conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
//			String saidaFormatada = String.format(new Locale("pt", "BR"), "%s - %04d - %05d - %s - %.2f", 
//					tipoConta, agencia, conta, titular, saldo);
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d - %05d - %s - %.2f %n", 
					tipoConta, agencia, conta, titular, saldo);
			
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores));			
			
			linhaScanner.close();
		}	
		
		sc.close();

	}

}
