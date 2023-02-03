package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Bezeroa;
import Objetos.Filmak;
import Objetos.Ordutegiak;
import Objetos.Zinema;
import Objetos.Sarrera;


class SarreraTest {
	int CodSarrera=123;
	Date Fecha = null;
	int Aretoa=3;
	int prezioa=4;
	Filmak filma = new Filmak();
	Ordutegiak ordutegiak = new Ordutegiak();
	Sarrera sarrera = new Sarrera();
	Sarrera sarrera2 = new Sarrera();
	@Test
	void GetySettest() {
		sarrera.setCodSarrera(CodSarrera);
		sarrera.setFecha(Fecha);
		sarrera.setFilma(filma);
		sarrera.getOrdutegi(ordutegiak);
		sarrera.setAretoa(Aretoa);
		sarrera.setPrezioa(prezioa);
		assertEquals(sarrera.getCodSarrera(),CodSarrera);
		assertEquals(sarrera.getFecha(),Fecha);
		assertEquals(sarrera.getFilma(),filma);
		assertEquals(sarrera.getOrdutegi(),ordutegiak);
		assertEquals(sarrera.getAretoa(),Aretoa);
		assertEquals(sarrera.getPrezioa(),prezioa);
	
	}
	@Test
	void Equalstest() {
		sarrera.equals(sarrera2);
		sarrera2 = null;
		sarrera.equals(sarrera2);
		}
		@Test
		void toStringtest() {
			String expected="Sarrera [CodSarrera=123, Fecha=null, filmak=Hulk, ordutegiak=a, Aretoa=3, prezioa=4]";
			assertEquals(expected,sarrera.toString());
		}
	

	
	
	
	

}
