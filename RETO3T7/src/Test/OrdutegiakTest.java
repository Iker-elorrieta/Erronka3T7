package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Filmak;
import Objetos.Ordutegiak;
import Objetos.Zinema;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Filmak filma=new Filmak();
	Zinema zine = new Zinema();
	Ordutegiak ordutegi = new Ordutegiak();
	Ordutegiak ordutegi2 = new Ordutegiak();
	@Test
	void GetySettest() {
		ordutegi.setCodOrdutegi(CodOrdutergiak);
		ordutegi.setFilma(filma);
		ordutegi.setZine(zine);
		assertEquals(ordutegi.getCodOrdutegi(),CodOrdutergiak);
		assertEquals(ordutegi.getFilma(),filma);
		assertEquals(ordutegi.getZine(),zine);
	}
	@Test
	void Equalstest() {
		ordutegi.equals(ordutegi2);
		ordutegi2 = null;
		ordutegi.equals(ordutegi2);
	}
	@Test
	void toStringtest() {
		String expected="Ordutegiak [CodOrdutegi=0, filma=Filmak [CodFilma=0, iraupena=null, generoa=null, kostua=0, NomFilma=null], zine=InfoCine [Codzinema=0, ZbkAretoak=0]]";
		assertEquals(expected,ordutegi.toString());
	}
}
