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
	Bezeroa bezero = new Bezeroa(Abizenak1, Abizenak1, Abizenak1, Abizenak1, Abizenak1, Abizenak1);
	Bezeroa bezero2 = new Bezeroa(Abizenak1, Abizenak1, Abizenak1, Abizenak1, Abizenak1, Abizenak1);
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
		String expected="Bezeroa [DNI=Fernandez, izena=Fernandez, Abizena1=Fernandez, Abizena2=Fernandez, sexua=Fernandez, pasahitza=Fernandez]";
		assertEquals(expected,bezero.toString());
	}
	
}
