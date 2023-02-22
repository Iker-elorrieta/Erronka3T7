package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Objetos.Bezeroa;
import Objetos.Eskaera;
import Objetos.Sarrera;

public class EskaeraTest {
	int CodEskaera;
	double preziototala;
	Bezeroa beze;
	Sarrera[] arraysarrera;
	Eskaera eskaera = new Eskaera(CodEskaera, preziototala, beze, arraysarrera);
	Eskaera eskaera1 = new Eskaera(CodEskaera, preziototala, beze, arraysarrera);
	Eskaera eskaera2 = new Eskaera();
@Test
void GetySettest() {
	eskaera.setCodEskaera(CodEskaera);;
	eskaera.setPreziototala(preziototala);
	eskaera.setBeze(beze);
	eskaera.setArraysarrera(arraysarrera);
	assertEquals(eskaera.getCodEskaera(),CodEskaera);
	assertEquals(eskaera.getPreziototala(),preziototala);
	assertEquals(eskaera.getBeze(),beze);
	assertEquals(eskaera.getArraysarrera(),arraysarrera);
	}
@Test
void Equalstest() {
	eskaera.equals(eskaera1);
	eskaera1 = null;
	eskaera.equals(eskaera1);
}
@Test
void toStringtest() {
	String expected="Eskaera [CodEskaera=0, preziototala=0.0, beze=null, arraysarrera=null]";
	assertEquals(expected,eskaera.toString());
}
}
