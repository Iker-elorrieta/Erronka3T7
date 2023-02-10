package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Objetos.Filma;
import Objetos.Ordutegia;
import Objetos.Sarrera;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Date Fecha = null;
	Filma filma;
	Sarrera []sarrera;
	Calendar cal = Calendar.getInstance();
	Ordutegia ordutegi = new Ordutegia(CodOrdutergiak, Fecha, filma);
	Ordutegia ordutegi2 = new Ordutegia(CodOrdutergiak, Fecha, filma);

	@Test
	void GetySettest() {
		cal.set(Calendar.DAY_OF_MONTH, 20);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.YEAR, 2023);
		Fecha = cal.getTime();
		ordutegi.setCodOrdutegiak(CodOrdutergiak);
		ordutegi.setFilma(filma);
		ordutegi.setFecha(Fecha);
		assertEquals(ordutegi.getCodOrdutegiak(),CodOrdutergiak);
		assertEquals(ordutegi.getFilma(),filma);
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
		String expected="Ordutegia [CodOrdutegiak=2, Fecha=null, filma=null]";
		assertEquals(expected,ordutegi.toString());
	}
}
