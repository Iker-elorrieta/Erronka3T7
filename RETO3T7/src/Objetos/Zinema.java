package Objetos;

import java.util.Objects;

public class Zinema {
	private int Codzinema;
	private int ZbkAretoak;
	private Aretoak areto = new Aretoak();
	
	
	public Zinema() {
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
	public Aretoak getAreto() {
		return areto;
	}
	public void setAreto(Aretoak areto) {
		this.areto = areto;
	}	
	@Override
	public String toString() {
		return "Zinema [Codzinema=" + Codzinema + ", ZbkAretoak=" + ZbkAretoak + ", areto=" + areto + "]";
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
