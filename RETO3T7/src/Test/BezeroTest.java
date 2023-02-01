package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Bezeroa;

class BezeroTest {
	String DNI = "12345678P";
	String Izena = "Andoni";
	String Abizenak = "Fernandez";
	String sexua = "g";
	String pasahitza = "1234";
	Bezeroa bezero = new Bezeroa(DNI, Izena, Abizenak, sexua, pasahitza);
	Bezeroa bezero2 = new Bezeroa(DNI, Izena, Abizenak, sexua, pasahitza);
	@Test
	void GetyTesttest() {
			bezero.setDNI(DNI);
			bezero.setIzena(Izena);
			bezero.setAbizenak(Abizenak);
			bezero.setSexua(sexua);
			bezero.setPasahitza(pasahitza);
			assertEquals(bezero.getDNI(),DNI);
			assertEquals(bezero.getIzena(),Izena);
			assertEquals(bezero.getAbizenak(),Abizenak);
			assertEquals(bezero.getSexua(),sexua);
			assertEquals(bezero.getPasahitza(),pasahitza);
	}
	@Test
	void Equalstest() {
		bezero.equals(bezero2);
		bezero2=null;
		bezero.equals(bezero2);
	}
	@Test
	void toStringtest() {
		String expected="Bezeroa [DNI=12345678P, izena=Andoni, Abizenak=Fernandez, sexua=g, pasahitza=1234]";
		assertEquals(expected,bezero.toString());
	}
	
}
