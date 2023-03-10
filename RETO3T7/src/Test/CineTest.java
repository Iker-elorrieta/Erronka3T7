package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Aretoa;
import Objetos.Zinema;

class CineTest {
	String IzZinema = "Elorrieta-errekamari zinema"; 
	int Codzinema = 2;
	int ZbkAretoak = 3;
	Aretoa[] areto;
	Zinema zine = new Zinema(Codzinema, Codzinema, areto);
	Zinema zine2 = new Zinema(Codzinema, Codzinema, areto);
	@Test
	void GetySettest() {
		zine.setIzZinema(IzZinema);;
		zine.setCodzinema(Codzinema);
		zine.setZbkAretoak(ZbkAretoak);
		zine.setAreto(areto);
		assertEquals(zine.getIzZinema(),IzZinema);
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
		String expected="Zinema [IzZinema=null, Codzinema=0, ZbkAretoak=0, areto=null]";
		assertEquals(expected,zine.toString());
	}
}
