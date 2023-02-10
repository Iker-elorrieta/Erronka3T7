package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	private String IzZinema;
	private int Codzinema;
	private int ZbkAretoak;
	private Aretoa[] areto;
	
	
	public Zinema(int codzinema, int zbkAretoak, Aretoa[] areto) {
		IzZinema = getIzZinema();
		Codzinema = getCodzinema();
		ZbkAretoak = getZbkAretoak();
		areto = getAreto();
	}
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
	public Aretoa[] getAreto() {
		return areto;
	}
	public void setAreto(Aretoa[] areto) {
		this.areto = areto;
	}	
	public String getIzZinema() {
		return IzZinema;
	}
	public void setIzZinema(String izZinema) {
		IzZinema = izZinema;
	}
	@Override
	public String toString() {
		return "Zinema [IzZinema=" + IzZinema + ", Codzinema=" + Codzinema + ", ZbkAretoak=" + ZbkAretoak + ", areto="
				+ Arrays.toString(areto) + "]";
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
