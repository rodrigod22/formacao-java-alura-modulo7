package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoHeranca {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Rodrigo");
//		cliente.setCpf("23565656566");
//		cliente.setProfissao("DEV");
//		
//		ContaCorrente cc = new ContaCorrente(1111, 111111);
//		cc.setTitular(cliente);
//		cc.deposita(100.0);
		
	    //String nome = "Rodrigo";		
		//escrita
	
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
//		oos.writeObject(cc);		
//		oos.close();
		
//		
//		//leitura
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc= (ContaCorrente) ois.readObject();		
		
		ois.close();		
		System.out.println(cc.getTitular().getNome());
		System.out.println(cc.getSaldo());
	}

}


