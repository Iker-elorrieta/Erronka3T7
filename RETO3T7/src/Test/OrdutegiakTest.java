package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

import Objetos.Filmak;
import Objetos.Ordutegiak;
import Objetos.Zinema;

class OrdutegiakTest {
	int CodOrdutergiak=2;
	Filmak filma=new Filmak();
	Zinema zine = new Zinema();
	Date Fecha=null;
	int horas=10;
	int minutos=20;
	Ordutegiak ordutegi = new Ordutegiak();
	Ordutegiak ordutegi2 = new Ordutegiak();
	Calendar cal = Calendar.getInstance();
	
	
	@Test
	void GetySettest() {
		cal.set(Calendar.DAY_OF_MONTH, 6);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2023);		
		/*Date Fecha = cal.getTime();*/
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
		String expected="Ordutegiak [CodOrdutegiak=0, filma=Filmak [CodFilma=0, iraupena=null, generoa=null, kostua=0, NomFilma=null], zine=InfoCine [Codzinema=0, ZbkAretoak=0], areto=Aretoak [AretoIzena=null, CodAretoa=0, fechas=null, ordutegi=Objetos.Ordutegiak, Fecha=null]";
		assertEquals(expected,ordutegi.toString());
		/* horas=0, minutos=0*/
	}
}
