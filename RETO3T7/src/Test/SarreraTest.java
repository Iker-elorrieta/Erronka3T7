package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Bezeroa;
import Objetos.Filmak;
import Objetos.Sarrera;


class SarreraTest {
	int CodSarrera=123;
	int prezioa=4;
	Filmak filma = new Filmak();
	Aretoak areto = new Aretoak();
	Bezeroa beze = new Bezeroa();
	Sarrera sarrera = new Sarrera();
	Sarrera sarrera2 = new Sarrera();
	@Test
	void GetySettest() {
		sarrera.setCodSarrera(CodSarrera);
		sarrera.setFilma(filma);
		sarrera.setAreto(areto);
		sarrera.setPrezioa(prezioa);
		sarrera.setBeze(beze);
		assertEquals(sarrera.getCodSarrera(),CodSarrera);
		assertEquals(sarrera.getFilma(),filma);
		assertEquals(sarrera.getAreto(),areto);
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
			String expected="Sarrera [CodSarrera=0, filma=Filmak [CodFilma=0, iraupena=null, generoa=null, kostua=0, NomFilma=null], Aretoa=Aretoak [AretoIzena=null, CodAretoa=0, ordutegi=Ordutegiak [CodOrdutegiak=0, Fecha=null, filma=Filmak [CodFilma=0, iraupena=null, generoa=null, kostua=0, NomFilma=null], zine=InfoCine [Codzinema=0, ZbkAretoak=0]]], prezioa=0]";
			assertEquals(expected,sarrera.toString());
		}
	

	
	
	
	

}
