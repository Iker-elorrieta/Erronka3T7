package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Zinema;

class CineTest {
	
	int Codzinema = 2;
	int ZbkAretoak = 3;
	Aretoak[] areto;
	Zinema zine = new Zinema();
	Zinema zine2 = new Zinema();
	@Test
	void GetySettest() {
		zine.setCodzinema(Codzinema);
		zine.setZbkAretoak(ZbkAretoak);
		zine.setAreto(areto);
		assertEquals(zine.getCodzinema(),Codzinema);
		assertEquals(zine.getZbkAretoak(),ZbkAretoak);
		assertEquals(zine.getAreto(),areto);
	}
	@Test
	void Equalstest() {
		zine.equals(zine2);
		zine2 = null;
		zine.equals(zine2);
	}
	@Test
	void toStringtest() {
		String expected="Zinema [Codzinema=0, ZbkAretoak=0, areto=null]";
		assertEquals(expected,zine.toString());
	}
}
