package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Eskaera {
	private int CodEskaera;
	private double preziototala;
	private Bezeroa beze;
	private Sarrera[] arraysarrera;
		
	public Eskaera(int codEskaera, double preziototala, Bezeroa beze, Sarrera[] arraysarrera) {
		CodEskaera = codEskaera;
		this.preziototala = preziototala;
		this.beze = beze;
		this.arraysarrera = arraysarrera;
	}
	public Eskaera() {
		
	}
	public int getCodEskaera() {
		return CodEskaera;
	}
	public void setCodEskaera(int codEskaera) {
		CodEskaera = codEskaera;
	}
	public double getPreziototala() {
		return preziototala;
	}
	public void setPreziototala(double preziototala) {
		this.preziototala = preziototala;
	}
	public Bezeroa getBeze() {
		return beze;
	}
	public void setBeze(Bezeroa beze) {
		this.beze = beze;
	}
	public Sarrera[] getArraysarrera() {
		return arraysarrera;
	}
	public void setArraysarrera(Sarrera[] arraysarrera) {
		this.arraysarrera = arraysarrera;
	}
	@Override
	public String toString() {
		return "Eskaera [CodEskaera=" + CodEskaera + ", preziototala=" + preziototala + ", beze=" + beze
				+ ", arraysarrera=" + Arrays.toString(arraysarrera) + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Eskaera other = (Eskaera) obj;
		return Objects.equals(CodEskaera, other.CodEskaera);
	}
	
}
