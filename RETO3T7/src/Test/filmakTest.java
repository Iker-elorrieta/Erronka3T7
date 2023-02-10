package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Filma;

class filmakTest {
	int CodFilma = 4;
	String iraupena = "2h";
	String generoa = "terror";
	int kostua = 5;
	String NomFilma = "Psicosis";
	Filma filma = new Filma(CodFilma, NomFilma, NomFilma, CodFilma, NomFilma);
	Filma filma2 = new Filma(CodFilma, NomFilma, NomFilma, CodFilma, NomFilma); 
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
		String expected="Filma [CodFilma=4, iraupena=Psicosis, generoa=Psicosis, kostua=4, NomFilma=Psicosis]";
		assertEquals(expected,filma.toString());
	}
	
}
