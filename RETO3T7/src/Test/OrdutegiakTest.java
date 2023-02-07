package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Filmak;
import Objetos.Ordutegiak;
import Objetos.Zinema;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Date Fecha = null;
	Filmak filma=new Filmak();
	Zinema zine = new Zinema();
	Aretoak areto = new Aretoak();
	Calendar cal = Calendar.getInstance();
	Ordutegiak ordutegi = new Ordutegiak();
	Ordutegiak ordutegi2 = new Ordutegiak();
	@Test
	void GetySettest() {
		cal.set(Calendar.DAY_OF_MONTH, 20);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.YEAR, 2023);
		Fecha = cal.getTime();
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
		String expected="Ordutegiak [CodOrdutegiak=0, Fecha=null, filma=Filmak [CodFilma=0, iraupena=null, generoa=null, kostua=0, NomFilma=null], zine=InfoCine [Codzinema=0, ZbkAretoak=0]]";
		assertEquals(expected,ordutegi.toString());
	}
}
