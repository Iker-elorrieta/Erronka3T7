package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Objetos.Filmak;
import Objetos.Ordutegiak;
import Objetos.Zinema;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Date Fecha = null;
	int orduak=10;
	int minutuak=21;
	Filmak filma[]=new Filmak[3];
	Zinema zine[] = new Zinema[3];
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
		ordutegi.setZine(zine);
		ordutegi.setOrduak(orduak);
		ordutegi.setMinutuak(minutuak);
		ordutegi.setFecha(Fecha);
		assertEquals(ordutegi.getCodOrdutegiak(),CodOrdutergiak);
		assertEquals(ordutegi.getFilma(),filma);
		assertEquals(ordutegi.getZine(),zine);
		assertEquals(ordutegi.getOrduak(),orduak);
		assertEquals(ordutegi.getMinutuak(),minutuak);
		assertEquals(ordutegi.getFecha(),Fecha);
		assertEquals(ordutegi.getFilma(),filma);
	}
	@Test
	void Equalstest() {
		ordutegi.equals(ordutegi2);
		ordutegi2 = null;
		ordutegi.equals(ordutegi2);
	}
	@Test
	void toStringtest() {
		String expected="Ordutegiak [CodOrdutegiak=0, Fecha=null, filma=[LObjetos.Filmak;@26a4842b, zine=[LObjetos.Zinema;@7e38a7fe, orduak=0, minutuak=0]";
		assertEquals(expected,ordutegi.toString());
	}
}
