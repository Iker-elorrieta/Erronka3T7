package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Objetos.Bezeroa;
import Objetos.Sarrera;


class SarreraTest {
	int CodSarrera=123;
	int prezioa=4;
	Bezeroa beze;
	Sarrera sarrera = new Sarrera();
	Sarrera sarrera2 = new Sarrera();
	@Test
	void GetySettest() {
		sarrera.setCodSarrera(CodSarrera);
		sarrera.setPrezioa(prezioa);
		sarrera.setBeze(beze);
		assertEquals(sarrera.getCodSarrera(),CodSarrera);
		assertEquals(sarrera.getPrezioa(),prezioa);
		assertEquals(sarrera.getBeze(),beze);
		}
	@Test
	void Equalstest() {
		sarrera.equals(sarrera2);
		sarrera2 = null;
		sarrera.equals(sarrera2);
		}
		@Test
		void toStringtest() {
			String expected="Sarrera [CodSarrera=0, prezioa=0]";
			assertEquals(expected,sarrera.toString());
		}
	

	
	
	
	

}
