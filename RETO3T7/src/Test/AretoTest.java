package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Ordutegiak;

class AretoaTest {
	
	String Aretoizena = "areto";
	int CodAretoa = 2; 
	Ordutegiak[] ordutegi;
	Aretoak areto = new Aretoak();
	Aretoak areto2 = new Aretoak();
	@Test
	void GetySettest() {
		areto.setAretoIzena(Aretoizena);
		areto.setCodAretoa(CodAretoa);
		areto.setOrdutegi(ordutegi);
		assertEquals(areto.getAretoIzena(),Aretoizena);
		assertEquals(areto.getCodAretoa(),CodAretoa);
		assertEquals(areto.getOrdutegi(),ordutegi);
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
		String expected="Aretoak [AretoIzena=null, CodAretoa=0]";
		assertEquals(expected,areto.toString());
	}
}
