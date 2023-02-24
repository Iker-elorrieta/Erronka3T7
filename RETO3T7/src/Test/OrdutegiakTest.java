package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.Time;

import org.junit.jupiter.api.Test;

import Objetos.Filma;
import Objetos.Ordutegia;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Date Fecha = null;
	Filma filma;
	Time ordua;
	Ordutegia ordutegi = new Ordutegia(CodOrdutergiak, Fecha, filma, ordua);
	Ordutegia ordutegi2 = new Ordutegia(CodOrdutergiak, Fecha, filma, ordua);
	Ordutegia ordutegi3 =new Ordutegia();
	@Test
	void GetySettest() {
		ordutegi.setCodOrdutegiak(CodOrdutergiak);
		ordutegi.setFilma(filma);
		ordutegi.setFecha(Fecha);
		ordutegi.setOrdua(ordua);
		assertEquals(ordutegi.getCodOrdutegiak(),CodOrdutergiak);
		assertEquals(ordutegi.getFilma(),filma);
		assertEquals(ordutegi.getFecha(),Fecha);
		assertEquals(ordutegi.getOrdua(),ordua);
		
	}
	@Test
	void Equalstest() {
		ordutegi.equals(ordutegi2);
		ordutegi2 = null;
		ordutegi.equals(ordutegi2);
	}
	@Test
	void toStringtest() {
		String expected="Ordutegia [CodOrdutegiak=2, filma=null, fecha=null, ordua=null]";
		assertEquals(expected,ordutegi.toString());
	}
}