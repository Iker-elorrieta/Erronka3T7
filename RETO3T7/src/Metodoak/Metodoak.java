package Metodoak;

import java.sql.*;
import Objetos.Zinema;
import Objetos.Ordutegia;
import Objetos.Aretoa;
import Objetos.Bezeroa;
import Objetos.Filma;
import Objetos.Sarrera;

public class Metodoak {
	int CodFilma;
	String NomFilma;
	int kostua;
	String iraupena;
	String genero;

	Filma filma = new Filma(CodFilma, NomFilma, iraupena, kostua, genero);

	String DNI;
	String izena;
	String Abizena1;
	String Abizena2;
	String sexua;
	String pasahitza;
	Bezeroa beze = new Bezeroa(DNI, izena, Abizena1, Abizena2, sexua, pasahitza);

	int CodOrdutegiak;
	Date fecha;
	Ordutegia ordutegi = new Ordutegia(CodOrdutegiak, fecha, filma);
	Ordutegia[] arrayOrdutegia = { ordutegi };

	int CodSarrera;
	double prezioa;
	Sarrera sarrera = new Sarrera(CodSarrera, beze, prezioa, arrayOrdutegia);

	String HautatutakoZinema;
	String AretoIzena;
	int CodAretoa;
	Aretoa areto = new Aretoa(AretoIzena, CodAretoa, arrayOrdutegia);
	Aretoa[] arrayAretoa = { areto };

	int Codzinema;
	String IzZinema;
	int ZbkAretoak;
	Zinema zine = new Zinema(IzZinema, Codzinema, arrayAretoa);
	Zinema[] arrayZinema = { zine };

	String ZinemaGorde = "";
	int ZinemaGordeID = 0;

	public Zinema[] arrayZinema() {

		Zinema[] HasieratuZ = new Zinema[0];
		Connection conexionZ;
		try {
			conexionZ = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema", "root", "");
			Statement comandoZ = conexionZ.createStatement();
			String sqlZ = "SELECT * FROM cine";
			ResultSet registroZ = comandoZ.executeQuery(sqlZ);
			while (registroZ.next()) {
				zine = new Zinema(IzZinema, Codzinema, arrayAretoa);
				zine.setCodzinema(registroZ.getInt("CodCine"));
				zine.setIzZinema(registroZ.getString("nombcine"));

				Zinema[] zine1 = new Zinema[HasieratuZ.length + 1];
				for (int i = 0; i < HasieratuZ.length; i++) {
					zine1[i] = HasieratuZ[i];
				}
				zine1[HasieratuZ.length] = zine;
				HasieratuZ = zine1;

			}

		} catch (Exception e) {
			System.out.println("error");
		}
		return HasieratuZ;
	}

	public Filma[] ArrayFilmak() {

		Filma[] HasieratuF = new Filma[0];
		Connection conexion;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema", "root", "");
			Statement comando = conexion.createStatement();
			String sql = "SELECT * FROM peliculas";
			ResultSet registro = comando.executeQuery(sql);
			while (registro.next()) {
				filma = new Filma(CodFilma, iraupena, genero, kostua, NomFilma);
				filma.setNomFilma(registro.getString("titulo"));
				filma.setIraupena(registro.getString("duracion"));
				filma.setGeneroa(registro.getString("genero"));
				filma.setCodFilma(registro.getInt("CodPeli"));

				Filma[] film1 = new Filma[HasieratuF.length + 1];
				for (int i = 0; i < HasieratuF.length; i++) {
					film1[i] = HasieratuF[i];
				}
				film1[HasieratuF.length] = filma;
				HasieratuF = film1;
			}

		} catch (Exception e) {
			System.out.println("error");
		}
		return HasieratuF;
	}

	public Ordutegia[] arrayOrdutegia() {

		Ordutegia[] HasieratuO = new Ordutegia[0];
		Connection conexion;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema", "root", "");
			Statement comando = conexion.createStatement();
			String sql = "SELECT * FROM sesiones";

			ResultSet registro = comando.executeQuery(sql);
			while (registro.next()) {
				ordutegi = new Ordutegia(CodOrdutegiak, fecha, filma);
				ordutegi.setCodOrdutegiak(registro.getInt("CodSesion"));
				ordutegi.setFecha(registro.getDate("fecha"));
				Ordutegia[] ordutegi1 = new Ordutegia[HasieratuO.length + 1];
				for (int i = 0; i < HasieratuO.length; i++) {
					ordutegi1[i] = HasieratuO[i];
				}
				ordutegi1[HasieratuO.length] = ordutegi;
				HasieratuO = ordutegi1;
			}
		} catch (Exception e) {
			System.out.println("error");
		}

		return HasieratuO;

	}

	public Bezeroa[] arrayBezeroa() {

		Bezeroa[] HasieratuB = new Bezeroa[0];
		Connection conexion;

		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema", "root", "");
			Statement comando = conexion.createStatement();
			String sql = "select * from clientes";
			ResultSet registro = comando.executeQuery(sql);
			while (registro.next()) {
				beze = new Bezeroa(DNI, izena, Abizena1, Abizena2, sexua, pasahitza);
				beze.setAbizena1(registro.getString("apellido1"));
				beze.setAbizena2(registro.getString("apellido2"));
				beze.setPasahitza(registro.getString("contraseña"));
				beze.setDNI(registro.getString("DNI"));
				beze.setIzena(registro.getString("nombre"));
				beze.setSexua(registro.getString("sexo"));
				Bezeroa[] beze1 = new Bezeroa[HasieratuB.length + 1];
				for (int i = 0; i < HasieratuB.length; i++) {
					beze1[i] = HasieratuB[i];
				}
				beze1[HasieratuB.length] = beze;
				HasieratuB = beze1;
			}

		} catch (Exception e) {
			System.out.println("error");
		}
		return HasieratuB;
	}

	public Filma[] FilmakErakutsi(String nombreCineSel, Zinema[] zinema, Aretoa aretoa, Ordutegia ordutegi,

			Filma filma) {
		zinema = arrayZinema();
		Aretoa[] HasieratuA = new Aretoa[0];
		Ordutegia[] HasieratuO = new Ordutegia[0];
		Filma[] HasieratuF = new Filma[0];
		Connection conexion;
		if (nombreCineSel != null) {
			for (int i = 0; i < zinema.length; i++) {
				if (zinema[i].getIzZinema().equals(nombreCineSel)) {
					ZinemaGorde = nombreCineSel;
					try {
						conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_zinema", "root", "");
						Statement comando = conexion.createStatement();
						ZinemaGordeID = zinema[i].getCodzinema();
						String sql = "SELECT * FROM salas where salas.CodCine = " + "'" + zinema[i].getCodzinema()
								+ "'";
						ResultSet registro = comando.executeQuery(sql);
						while (registro.next()) {
							aretoa = new Aretoa();
							aretoa.setCodAretoa(registro.getInt("CodSala"));
							aretoa.setAretoIzena(registro.getString("nomSalas"));
							Aretoa[] aretoa1 = new Aretoa[HasieratuA.length + 1];
							for (int j = 0; j < HasieratuA.length; j++) {
								aretoa1[j] = HasieratuA[j];
							}
							aretoa1[HasieratuA.length] = aretoa;
							HasieratuA = aretoa1;
						}
						for (int k = 0; k < HasieratuA.length; k++) {
							Statement comando1 = conexion.createStatement();
							String sql1 = "SELECT * FROM sesiones where sesiones.CodSala = " + "'"
									+ HasieratuA[k].getCodAretoa() + "'";
							ResultSet registro1 = comando1.executeQuery(sql1);
							while (registro1.next()) {
								ordutegi = new Ordutegia(CodOrdutegiak, fecha, filma);
								ordutegi.setFecha(registro1.getDate("fecha"));
								ordutegi.setCodOrdutegiak(registro1.getInt("CodSesion"));
								Ordutegia[] ordutegi1 = new Ordutegia[HasieratuO.length + 1];
								for (int l = 0; l < HasieratuO.length; l++) {
									ordutegi1[l] = HasieratuO[l];
								}
								ordutegi1[HasieratuO.length] = ordutegi;
								HasieratuO = ordutegi1;
							}

						}
						for (int j = 0; j < HasieratuO.length; j++) {
							Statement comando2 = conexion.createStatement();
							String sql2 = "SELECT * FROM sesiones,peliculas where sesiones.CodFilma=peliculas.CodFilma and sesiones.CodSesion = "
									+ "'" + HasieratuO[j].getCodOrdutegiak() + "'";
							ResultSet registro2 = comando2.executeQuery(sql2);
							while (registro2.next()) {
								filma = new Filma(CodFilma, NomFilma, iraupena, kostua, genero);
								filma.setIraupena(registro.getString("duracion"));
								filma.setGeneroa(registro.getString("genero"));
								filma.setCodFilma(registro.getInt("CodPeli"));
								filma.setNomFilma(registro.getString("titulo"));
								filma.setKostua(registro.getInt("coste"));
								Filma[] filma1 = new Filma[HasieratuF.length + 1];
								for (int m = 0; m < HasieratuF.length; m++) {
									filma1[m] = HasieratuF[m];
									System.out.println(filma1[m].getNomFilma());
								}
								filma1[HasieratuF.length] = filma;
								HasieratuF = filma1;
							}
						}
					} catch (Exception ex) {
						System.out.println("sacarPeliculaDelCine");
					}
				}
			}
		}
		return HasieratuF;

	}

}