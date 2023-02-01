package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import Objetos.Aretoak;
import Objetos.Bezeroa;
import Objetos.Filmak;
import Objetos.InfoCine;
import Objetos.Sarrera;
import junit.framework.Assert;

class SarreraTest {
	
	int CodSarrera=123;
	Date Fecha = null;
	String Filmak="Hulk";
	String ordutegiak="a";
	int Aretoa=3;
	int prezioa=4;
	Sarrera sarrera = new Sarrera(CodSarrera,Fecha,Filmak,ordutegiak,Aretoa,prezioa);
	Sarrera sarrera2 = new Sarrera(CodSarrera,Fecha,Filmak,ordutegiak,Aretoa,prezioa);
	@Test
	void GetySettest() {
		sarrera.setCodSarrera(CodSarrera);
		sarrera.setFilmak(Filmak);
		sarrera.setFecha(Fecha);
		sarrera.setOrdutegiak(ordutegiak);
		sarrera.setAretoa(Aretoa);
		sarrera.setPrezioa(prezioa);
		assertEquals(sarrera.getCodSarrera(),CodSarrera);
		assertEquals(sarrera.getFecha(),Fecha);
		assertEquals(sarrera.getFilmak(),Filmak);
		assertEquals(sarrera.getOrdutegiak(),ordutegiak);
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
