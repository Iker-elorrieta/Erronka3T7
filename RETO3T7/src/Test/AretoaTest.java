package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Sarrera;

class AretoaTest {
	
	String Aretoizena = "areto";
	int CodAretoa = 1;
	Date Fecha = null;
	String Filmak = "Hulk";
	String Ordutegiak = "a";
	Aretoak areto = new Aretoak(Aretoizena, CodAretoa, Fecha, Filmak, Ordutegiak);
	Aretoak areto2 = new Aretoak(Aretoizena, CodAretoa, Fecha, Filmak, Ordutegiak);
	@Test
	void GetySettest() {
		
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
	void Equalstest() {
		boolean resul = areto.equals(areto2);
		assertTrue(resul);
		areto2=null;
		areto.equals(areto2);
	}
	@Test
	void toStringtest() {
		String expected="Aretoak [AretoIzena=areto, CodAretoa=1, filmak=Hulk, fechas=null, ordutegiak=a]";
		assertEquals(expected,areto.toString());
	}
}
