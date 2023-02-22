package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Metodoak.Metodoak;
import Objetos.Zinema;

class MetodoakTest {

	@Test
	void Metodoaktest() {
		Metodoak Metodoak = new Metodoak();
		Zinema[] arrayzinema = Metodoak.ZinemaHasieratu();
		assertEquals(1, arrayzinema[0].getCodzinema());
		assertEquals("Elorrieta-errekamari",arrayzinema[0].getIzZinema());
		assertEquals(3, arrayzinema[0].getZbkAretoak());
		assertEquals(1, arrayzinema[0].getAreto()[0].getCodAretoa());
		assertEquals(2, arrayzinema[0].getAreto()[1].getCodAretoa());
		assertEquals(3, arrayzinema[0].getAreto()[2].getCodAretoa());
	}

	@Test
	void FilmakErakutsitest() {
		Metodoak Metodoak = new Metodoak();
		Zinema[] arrayzinema = Metodoak.ZinemaHasieratu();
		String[][] arrayfilma = new String[0][0];
		arrayfilma= Metodoak.FilmakErakutsi(arrayzinema, 1);
		assertEquals("Handia", arrayfilma[0][0]);
		assertEquals("Drama", arrayfilma[0][1]);
		assertEquals("112", arrayfilma[0][2]);
		assertEquals("8", arrayfilma[0][3]);
		}
	}
