package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Objetos.Bezeroa;
import Objetos.Ordutegia;
import Objetos.Sarrera;


class SarreraTest {
	int CodSarrera=123;
	int prezioa=4;
	Bezeroa beze;
	Ordutegia[] ordutegi;
	Sarrera sarrera = new Sarrera(CodSarrera, beze, prezioa, ordutegi);
	Sarrera sarrera2 = new Sarrera(CodSarrera, beze, prezioa, ordutegi);
	Sarrera sarrera3 = new Sarrera();
	@Test
	void GetySettest() {
		sarrera.setCodSarrera(CodSarrera);
		sarrera.setPrezioa(prezioa);
		sarrera.setBeze(beze);
		sarrera.setOrdutegi(null);
		assertEquals(sarrera.getCodSarrera(),CodSarrera);
		assertEquals(sarrera.getPrezioa(),prezioa);
		assertEquals(sarrera.getBeze(),beze);
		assertEquals(sarrera.getOrdutegi(),ordutegi);
		}
	@Test
	void Equalstest() {
		sarrera.equals(sarrera2);
		sarrera2 = null;
		sarrera.equals(sarrera2);
		}
		@Test
		void toStringtest() {
			String expected="Sarrera [CodSarrera=123, beze=null, prezioa=4.0, ordutegi=null]";
			assertEquals(expected,sarrera.toString());
		}
	

	
	
	
	

}
