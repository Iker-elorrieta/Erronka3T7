package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Filmak;

class filmakTest {
	int CodFilma = 4;
	String iraupena = "2h";
	String generoa = "terror";
	int kostua = 5;
	String NomFilma = "Psicosis";
	Filmak filma = new Filmak();
	Filmak filma2 = new Filmak(); 
	@Test
	void GetySettest() {
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
	void Equalstest() {
		filma.equals(filma2);
		filma2 = null;
		filma.equals(filma2);
	}
	@Test
	void toStringtest() {
		String expected="Filmak [CodFilma=0, iraupena=null, generoa=null, kostua=0, NomFilma=null]";
		assertEquals(expected,filma.toString());
	}
	
}
