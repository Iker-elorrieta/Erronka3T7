package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Filma;

class filmakTest {
	int CodFilma = 4;
	String iraupena = "2h";
	String generoa = "terror";
	int prezioa = 5;
	String NomFilma = "Psicosis";
	Filma filma = new Filma(CodFilma, NomFilma, iraupena, prezioa, generoa);
	Filma filma2 = new Filma(CodFilma, NomFilma, iraupena, prezioa, generoa); 
	Filma filma3 = new Filma();
	@Test
	void GetySettest() {
		filma.setCodFilma(CodFilma);
		filma.setIraupena(iraupena);
		filma.setGeneroa(generoa);
		filma.setKostua(prezioa);
		filma.setNomFilma(NomFilma);
		assertEquals(filma.getCodFilma(),CodFilma);
		assertEquals(filma.getIraupena(),iraupena);
		assertEquals(filma.getGeneroa(),generoa);
		assertEquals(filma.getKostua(),prezioa);
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
		String expected="Filma [CodFilma=4, NomFilma=Psicosis, iraupena=2h, prezioa=5, generoa=terror]";
		assertEquals(expected,filma.toString());
	}
	
}
