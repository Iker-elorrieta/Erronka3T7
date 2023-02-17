package Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Metodoak.Metodoak;
import Objetos.Bezeroa;
import Objetos.Filma;
import Objetos.Ordutegia;
import Objetos.Zinema;


class MetodoakTest {
	
	@Test
	void testZinemaArray() {//
		Metodoak Metodoak = new Metodoak();
		Zinema[] ArrayaTestZ = Metodoak.arrayZinema();
		assertEquals("Elorrieta-errekamari",ArrayaTestZ[0].getIzZinema());
		assertEquals(1,ArrayaTestZ[0].getCodzinema());
		//assertEquals("Andoni",ArrayaTestZ[0].getAreto()[0].getAretoIzena());
	}
	@Test
	void testFilmakArray() {
		Metodoak Metodoak = new Metodoak();
		Filma[] ArrayaTestF = Metodoak.ArrayFilmak();
		assertEquals(1,ArrayaTestF[0].getCodFilma());
		assertEquals("drama",ArrayaTestF[0].getGeneroa());
		assertEquals("112",ArrayaTestF[0].getIraupena());
		//assertEquals(8,ArrayaTestF[0].getSarrera()[0].getPrezioa());
		assertEquals("Handia",ArrayaTestF[0].getNomFilma());
	}
	@Test
	void testBezeroaArray() {
		Metodoak Metodoak = new Metodoak();
		Bezeroa[] ArrayaTestB = Metodoak.arrayBezeroa();
		assertEquals("12345678L",ArrayaTestB[0].getDNI());
		assertEquals("Juan",ArrayaTestB[0].getIzena());
		assertEquals("mezcorta",ArrayaTestB[0].getAbizena1());
		assertEquals("zurrutia",ArrayaTestB[0].getAbizena2());
		assertEquals("Masculino",ArrayaTestB[0].getSexua());
		assertEquals("123macarron",ArrayaTestB[0].getPasahitza());
	}
	
	@Test
	void testFilmakErakutsi() {
		//Metodoak Metodoak = new Metodoak();
		//Filma[] ArrayaTestFE = Metodoak.FilmakErakutsi(null, null, null, null, null);
		//assertEquals();
		
	}
	
	@Test
	void testOrdutegia() {
		Metodoak Metodoak = new Metodoak();
		Ordutegia[] ArrayaTestO = Metodoak.arrayOrdutegia();
		assertEquals(1,ArrayaTestO[0].getCodOrdutegiak());
		assertEquals(2023-01-05,ArrayaTestO[0].getFecha());
		assertEquals("Scary Movie",ArrayaTestO[0].getFilma());
		
	}
	
	
	
	

	
}
