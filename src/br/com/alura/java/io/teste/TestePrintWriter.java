package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		// FileWriter fw = new FileWriter("lorem2.txt");
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
//	
//		fw.close();
		
		//PrintStream ps = new PrintStream("lorem2.txt");		
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		
		ps.println();
		
		ps.println("labore et dolore magna aliqua. Ut enim ad minim veniam,");
		

		
		ps.close();

	}

}
