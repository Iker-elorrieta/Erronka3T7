package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Objetos.Bezeroa;

class BezeroTest {
	String DNI = "12345678P";
	String Izena = "Andoni";
	String Abizenak1 = "Fernandez";
	String Abizenak2 = "Lombera";
	String sexua = "g";
	String pasahitza = "1234";
	Bezeroa bezero = new Bezeroa();
	Bezeroa bezero2 = new Bezeroa();
	@Test
	void GetyTesttest() {
			bezero.setDNI(DNI);
			bezero.setIzena(Izena);
			bezero.setAbizena1(Abizenak1);
			bezero.setAbizena2(Abizenak2);
			bezero.setSexua(sexua);
			bezero.setPasahitza(pasahitza);
			assertEquals(bezero.getDNI(),DNI);
			assertEquals(bezero.getIzena(),Izena);
			assertEquals(bezero.getAbizena1(),Abizenak1);
			assertEquals(bezero.getAbizena2(),Abizenak2);
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
		String expected="Bezeroa [DNI=null, izena=null, Abizena1=null, Abizena2=null, sexua=null, pasahitza=null]";
		assertEquals(expected,bezero.toString());
	}
	
}
