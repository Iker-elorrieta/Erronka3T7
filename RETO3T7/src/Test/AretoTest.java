package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Aretoa;
import Objetos.Ordutegia;

class AretoaTest {
	
	String Aretoizena = "areto";
	int CodAretoa = 2; 
	Ordutegia[] ordutegi;
	Aretoa areto = new Aretoa(Aretoizena, CodAretoa, ordutegi);
	Aretoa areto2 = new Aretoa(Aretoizena, CodAretoa, ordutegi);
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
		String expected="Aretoa [AretoIzena=null, CodAretoa=0, ordutegi=null]";
		assertEquals(expected,areto.toString());
	}
}
