/*package Metodos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Objetos.Aretoa;
import Objetos.Filma;
import Objetos.Ordutegia;
import Objetos.Zinema;

public class Metodos {
	private int Codzinema;
	private int ZbkAretoak;
	private Aretoak[] areto;
	
	private String AretoIzena;
	private int CodAretoa;
	private Ordutegiak[] ordutegi;
	
	private int CodFilma;
	private String iraupena;
	private String generoa;
	private int kostua;
	private String NomFilma;
	
	private int CodOrdutegiak;
	Date Fecha=null;
	private String orduak;
	private String minutuak;
	private Filmak filma;
	
	public Zinema[] ArrayZinema(Zinema zine) {
		Zinema[] HasieratuZ = new Zinema[0];
	try {
		Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
		Statement comando=(Statement) conexion.createStatement();
		
		String sql = "SELECT * FROM cine";
		ResultSet registro = comando.executeQuery(sql);
		
		while (registro.next()) {
			zine = new Zinema(Codzinema,ZbkAretoak,areto);
			zine.setCodzinema(registro.getInt("CodCine"));
			zine.setIzZinema(registro.getString("nombcine"));
			Zinema [] zine1 = new Zinema[HasieratuZ.length + 1];
			for (int i =0;i<HasieratuZ.length;i++) {
				zine1[i] = HasieratuZ[i];
			}
		}
		}catch(Exception e){
			System.out.println("okerra");
		}
	return HasieratuZ;
	}
	public Aretoak[] ArrayAretoak(Aretoak areto) {
		Aretoak [] HasieratuA = new Aretoak[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM salas";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				areto = new Aretoak(AretoIzena,CodAretoa,ordutegi);
				areto.setCodAretoa(registro.getInt("CodSala"));
				areto.setAretoIzena(registro.getString("nomsala"));
				Aretoak [] areto1 =new Aretoak[HasieratuA.length + 1];
				for (int i = 0;i<HasieratuA.length;i++) {
					areto1[i]=HasieratuA[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		return HasieratuA;
	}
	
	public Filmak[] ArrayFilmak(Filmak filma) {
		Filmak [] HasieratuF = new Filmak[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM peliculas";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				filma = new Filmak(CodFilma,iraupena,generoa,kostua,NomFilma);
				filma.setCodFilma(registro.getInt("CodPeli"));
				filma.setNomFilma(registro.getString("titulo"));
				Filmak [] filma1 =new Filmak[HasieratuF.length + 1];
				for (int i = 0;i<HasieratuF.length;i++) {
					filma1[i]=HasieratuF[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		return HasieratuF;
	}
	
	public Ordutegiak[] ArrayOrdutegiak(Ordutegiak ordutegi) {
		Ordutegiak [] HasieratuO = new Ordutegiak[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM salas";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				ordutegi = new Ordutegiak(CodOrdutegiak,Fecha,orduak,minutuak,filma);
				ordutegi.setCodOrdutegiak(registro.getInt("CodSesion"));
				ordutegi.setAretoIzena(registro.getString("AretoIzena"));
				Aretoak [] areto1 =new Aretoak[HasieratuA.length + 1];
				for (int i = 0;i<HasieratuA.length;i++) {
					areto1[i]=HasieratuA[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		return HasieratuO;
	}
}
*/