package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Objetos.Filmak;
import Objetos.Ordutegiak;
import Objetos.Sarrera;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Date Fecha = null;
	String orduak="10";
	String minutuak="21";
	Filmak filma;
	Sarrera []sarrera;
	Calendar cal = Calendar.getInstance();
	Ordutegiak ordutegi = new Ordutegiak();
	Ordutegiak ordutegi2 = new Ordutegiak();

	@Test
	void GetySettest() {
		cal.set(Calendar.DAY_OF_MONTH, 20);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.YEAR, 2023);
		Fecha = cal.getTime();
		ordutegi.setCodOrdutegiak(CodOrdutergiak);
		ordutegi.setFilma(filma);
		ordutegi.setSarrera(sarrera);
		ordutegi.setOrduak(orduak);
		ordutegi.setMinutuak(minutuak);
		ordutegi.setFecha(Fecha);
		assertEquals(ordutegi.getCodOrdutegiak(),CodOrdutergiak);
		assertEquals(ordutegi.getFilma(),filma);
		assertEquals(ordutegi.getSarrera(),sarrera);
		assertEquals(ordutegi.getFecha(),Fecha);
		assertEquals(ordutegi.getFilma(),filma);
		assertEquals(ordutegi.getOrduak(),orduak);
		assertEquals(ordutegi.getMinutuak(),minutuak);
		
	}
	@Test
	void Equalstest() {
		ordutegi.equals(ordutegi2);
		ordutegi2 = null;
		ordutegi.equals(ordutegi2);
	}
	@Test
	void toStringtest() {
		String expected="Ordutegiak [CodOrdutegiak=0, Fecha=null, orduak=null, minutuak=null, sarrera=null, filma=null]";
		assertEquals(expected,ordutegi.toString());
	}
}
