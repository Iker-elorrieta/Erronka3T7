
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Metodoak.Metodoak;
import Objetos.Zinema;

class MetodosTest {
	Metodoak Metodoak = new Metodoak();

	@Test
	void ZinemaHasieratutest() {
		
		Zinema[] arrayzinema = Metodoak.ZinemaHasieratu();
		assertEquals(1, arrayzinema[0].getCodzinema());
		assertEquals("Elorrieta-Errekamari",arrayzinema[0].getIzZinema());
		assertEquals(3, arrayzinema[0].getZbkAretoak());
		assertEquals(1, arrayzinema[0].getAreto()[0].getCodAretoa());
	}
	
	@Test
	public void testFilmakErakutsi() {
		String zinema = "Elorrieta-Errekamari";
		Zinema[] zine = Metodoak.ZinemaHasieratu();
		Metodoak.FilmakErakutsi(zinema, zine);
		Metodoak.ZinemaHasieratu();
		assertEquals(zine[0].getIzZinema(), zinema);

	}
}

