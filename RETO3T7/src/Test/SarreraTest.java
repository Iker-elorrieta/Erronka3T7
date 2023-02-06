package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Bezeroa;
import Objetos.Ordutegiak;
import Objetos.Sarrera;


class SarreraTest {
	int CodSarrera=123;
	int prezioa=4;
	Aretoak areto = new Aretoak();
	Ordutegiak ordutegiak = new Ordutegiak();
	Bezeroa beze =new Bezeroa();
	Sarrera sarrera = new Sarrera();
	Sarrera sarrera2 = new Sarrera();

	@Test
	void GetySettest() {
		sarrera.setCodSarrera(CodSarrera);
		sarrera.setOrdutegi(null);
		sarrera.setAreto(null);
		sarrera.setPrezioa(prezioa);
		assertEquals(sarrera.getPrezioa(),prezioa);
		assertEquals(sarrera.getCodSarrera(),CodSarrera);
		assertEquals(sarrera.getAreto(),areto);
		assertEquals(sarrera.getOrdutegi(),ordutegiak);
		}
	@Test
	void Equalstest() {
		sarrera.equals(sarrera2);
		sarrera2 = null;
		sarrera.equals(sarrera2);
		}
		@Test
		void toStringtest() {
			String expected="Sarrera [CodSarrera=123, Fecha=null, filmak=Hulk, prezioa=4]";
			assertEquals(expected,sarrera.toString());
		}
}
