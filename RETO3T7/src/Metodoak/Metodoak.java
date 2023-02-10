package Metodoak;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Objetos.Aretoa;
import Objetos.Bezeroa;
import Objetos.Filma;
import Objetos.Ordutegia;
import Objetos.Sarrera;
import Objetos.Zinema;

public class Metodoak {
	private int Codzinema;
	private int ZbkAretoak;
	private Aretoa[] areto;
	
	private String AretoIzena;
	private int CodAretoa;
	private Ordutegia[] ordutegi;
	
	private int CodFilma;
	private String iraupena;
	private String generoa;
	private int kostua;
	private String NomFilma;
	
	private int CodOrdutegiak;
	Date Fecha=null;
	private Filma filma;
	
	private String DNI;
	private String izena;
	private String Abizena1;
	private String Abizena2;
	private String sexua;
	private String pasahitza;
	
	private int CodSarrera;
	private Bezeroa beze;
	private int prezioa;
	
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
	public Aretoa[] ArrayAretoak(Aretoa areto) {
		Aretoa [] HasieratuA = new Aretoa[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM salas";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				areto = new Aretoa(AretoIzena,CodAretoa,ordutegi);
				areto.setCodAretoa(registro.getInt("CodSala"));
				areto.setAretoIzena(registro.getString("nomsala"));
				Aretoa [] areto1 =new Aretoa[HasieratuA.length + 1];
				for (int i = 0;i<HasieratuA.length;i++) {
					areto1[i]=HasieratuA[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		return HasieratuA;
	}
	public Filma[] ArrayFilmak(Filma filma) {
		Filma [] HasieratuF = new Filma[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM peliculas";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				filma = new Filma(CodFilma,iraupena,generoa,kostua,NomFilma);
				filma.setCodFilma(registro.getInt("CodPeli"));
				filma.setIraupena(registro.getString("duracion"));
				filma.setGeneroa(registro.getString("genero"));
				filma.setKostua(registro.getInt(""));
				filma.setNomFilma(registro.getString("titulo"));
				Filma [] filma1 =new Filma[HasieratuF.length + 1];
				for (int i = 0;i<HasieratuF.length;i++) {
					filma1[i]=HasieratuF[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		return HasieratuF;
	}
	public Ordutegia[] ArrayOrdutegiak(Ordutegia ordutegi) {
		Ordutegia[] HasieratuO = new Ordutegia[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM sesiones";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				ordutegi = new Ordutegia(CodOrdutegiak,Fecha,filma);
				ordutegi.setCodOrdutegiak(registro.getInt("CodSesion"));
				ordutegi.setFecha(registro.getDate("fecha"));
				Ordutegia [] areto1 =new Ordutegia[HasieratuO.length + 1];
				for (int i = 0;i<HasieratuO.length;i++) {
					areto1[i]=HasieratuO[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		return HasieratuO;
	}
	public Bezeroa[] ArrayBezeroa(Bezeroa beze) {
		Bezeroa [] HasieratuB = new Bezeroa[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM clientes";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				beze = new Bezeroa(DNI, izena, Abizena1, Abizena2, sexua, pasahitza);
				beze.setDNI(registro.getString("DNI"));
				beze.setIzena(registro.getString("nombre"));
				beze.setAbizena1(registro.getString("apellido1"));
				beze.setAbizena2(registro.getString("apellido2"));
				beze.setSexua(registro.getString("sexo"));
				beze.setPasahitza(registro.getString("contraseña"));
				Bezeroa [] beze1 =new Bezeroa[HasieratuB.length + 1];
				for (int i = 0;i<HasieratuB.length;i++) {
					beze1[i]=HasieratuB[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
	return HasieratuB;	
	}
	public Sarrera[] ArraySarrera(Sarrera sarrera) {
		Sarrera [] HasieratuS = new Sarrera[0];
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT * FROM entrada";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				sarrera = new Sarrera(CodSarrera, beze, prezioa, ordutegi);
				sarrera.setCodSarrera(registro.getInt("CodEntrada"));
				sarrera.setPrezioa(registro.getInt("precio"));
				Sarrera [] sarrera1 =new Sarrera[HasieratuS.length + 1];
				for (int i = 0;i<HasieratuS.length;i++) {
					sarrera1[i]=HasieratuS[i];
				}
			}
		}catch(Exception e){
			System.out.println("okerra");
		}
		
		return HasieratuS;
		
	}
	public Filma[] ZinemakErakutsi(Filma[] filmaZE) {
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT nombcine FROM cine";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				System.out.println(registro.getString("nombcine"));
				
			}
			}catch(Exception e){
				System.out.println("okerra");
			}
		return filmaZE;
		
	}
	public Filma[] FilmakErakutsi(Filma[] filmaFE) {
		try {
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema","root","");
			Statement comando=(Statement) conexion.createStatement();
			
			String sql = "SELECT titulo FROM peliculas order by fecha desc";
			ResultSet registro = comando.executeQuery(sql);
			
			while (registro.next()) {
				System.out.println(registro.getString("titulo"));
				
			}
			}catch(Exception e){
				System.out.println("okerra");
			}
	
		return filmaFE;
	}
	//public Filma[] DatarenArabera(Filma[] filmaDA){
	//}
}