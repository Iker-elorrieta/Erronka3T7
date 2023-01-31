package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Bezeroa;
import Objetos.Filmak;
import Objetos.InfoCine;

class ObjectuakTest {
	String Aretoizena = "areto";
	int CodAretoa = 1;
	Date Fecha = null;
	String Filmak = "Hulk";
	String Ordutegiak = "a";
	
	String DNI = "12345678P";
	String Izena = "Andoni";
	String Abizenak = "Fernandez";
	String sexua = "g";
	String pasahitza = "1234";
	
	int CodFilma = 4;
	String iraupena = "2h";
	String generoa = "terror";
	int kostua = 5;
	String NomFilma = "Psicosis";
	
	int Codzinema = 2;
	int ZbkAretoak = 3;
	@Test
	void Aretoatest() {
		Aretoak areto = new Aretoak(Aretoizena, CodAretoa, Aretoizena, Fecha, Aretoizena);
		areto.setAretoIzena(Aretoizena);
		areto.setCodAretoa(CodAretoa);
		areto.setFechas(Fecha);
		areto.setFilmak(Filmak);
		areto.setOrdutegiak(Ordutegiak);
		assertEquals(areto.getAretoIzena(),Aretoizena);
		assertEquals(areto.getCodAretoa(),CodAretoa);
		assertEquals(areto.getFechas(),Fecha);
		assertEquals(areto.getFilmak(),Filmak);
		assertEquals(areto.getOrdutegiak(),Ordutegiak);
	}
	
	@Test
	void Bezeroatest() {
		Bezeroa bezero = new Bezeroa(DNI, Izena, Abizenak, sexua, pasahitza);
		bezero.setDNI(DNI);
		bezero.setIzena(Izena);
		bezero.setAbizenak(Abizenak);
		bezero.setSexua(sexua);
		bezero.setPasahitza(pasahitza);
		assertEquals(bezero.getDNI(),DNI);
		assertEquals(bezero.getIzena(),Izena);
		assertEquals(bezero.getAbizenak(),Abizenak);
		assertEquals(bezero.getSexua(),sexua);
		assertEquals(bezero.getPasahitza(),pasahitza);
	}
	
	@Test
	void Filmaktest() {
		Filmak filma = new Filmak();
		filma.setCodFilma(CodFilma);
		filma.setIraupena(iraupena);
		filma.setGeneroa(generoa);
		filma.setKostua(kostua);
		filma.setNomFilma(NomFilma);
		assertEquals(filma.getCodFilma(),CodFilma);
		assertEquals(filma.getIraupena(),iraupena);
		assertEquals(filma.getGeneroa(),generoa);
		assertEquals(filma.getKostua(),kostua);
		assertEquals(filma.getNomFilma(),NomFilma);
	}
	
	@Test
	void InfoCinetest() {
		InfoCine zine = new InfoCine(CodAretoa, ZbkAretoak);
		zine.setCodzinema(Codzinema);
		zine.setZbkAretoak(ZbkAretoak);
		assertEquals(zine.getCodzinema(),Codzinema);
		assertEquals(zine.getZbkAretoak(),ZbkAretoak);
	}
	
	@Test
	void Sarreratest() {
		
	}

}
