package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
	
		String s = "�";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252 , ");
		
		String novaS = new String(bytes);
		System.out.println(novaS);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		
		String novaS2 = new String(bytes, "UTF-16");
		System.out.println(novaS2);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", ASCII, ");
		
		String novaS3 = new String(bytes, "US-ASCII");
		System.out.println(novaS3);
		
	}

}
