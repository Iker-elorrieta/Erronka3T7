package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.InfoCine;

class CineTest {
	
	int Codzinema = 2;
	int ZbkAretoak = 3;
	InfoCine zine = new InfoCine(Codzinema, ZbkAretoak);
	InfoCine zine2 = new InfoCine(Codzinema, ZbkAretoak);
	@Test
	void GetySettest() {
		zine.setCodzinema(Codzinema);
		zine.setZbkAretoak(ZbkAretoak);
		assertEquals(zine.getCodzinema(),Codzinema);
		assertEquals(zine.getZbkAretoak(),ZbkAretoak);
	}
	@Test
	void Equalstest() {
		zine.equals(zine2);
		zine2 = null;
		zine.equals(zine2);
	}
	@Test
	void toStringtest() {
		String expected="InfoCine [Codzinema=2, ZbkAretoak=3]";
		assertEquals(expected,zine.toString());
	}
}
