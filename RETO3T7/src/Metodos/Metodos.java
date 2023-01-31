package Metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Objetos.Filmak;


public class Metodos {
	public Filmak[] Hautatu(){
		Filmak[] filmak = new Filmak[0];
		File file = new File("Filmak.txt");
		BufferedReader fitxategia;
		try {
			fitxategia = new BufferedReader(new FileReader(file));
		filmak = new Filmak[0];
		int cont = 0;
		String lerroa;
		while((lerroa = fitxategia.readLine())!=null)
		{
			Filmak filma = new Filmak();
			String[] atributuak = lerroa.split("+");
			filma.setNomFilma(atributuak[1]);
			
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return filmak;
	}
	
}
