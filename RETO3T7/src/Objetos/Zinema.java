package Objetos;

import java.util.Date;
import java.util.Objects;

public class Zinema {
	private int Codzinema;
	private int ZbkAretoak;
	
	public int getCodzinema() {
		return Codzinema;
	}
	public void setCodzinema(int codzinema) {
		Codzinema = codzinema;
	}
	public int getZbkAretoak() {
		return ZbkAretoak;
	}
	public void setZbkAretoak(int zbkAretoak) {
		ZbkAretoak = zbkAretoak;
	}
	
	@Override
	public String toString() {
		return "InfoCine [Codzinema=" + Codzinema + ", ZbkAretoak=" + ZbkAretoak + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Zinema other = (Zinema) obj;
		return Objects.equals(Codzinema, other.Codzinema);
	}
	
	
}
