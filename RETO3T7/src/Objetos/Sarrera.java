package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Sarrera {
	private int CodSarrera;
	private Bezeroa beze;
	private double prezioa;
	private Ordutegia[] ordutegi;
	
	
	public Sarrera(int codSarrera, Bezeroa beze, double prezioa, Ordutegia[] ordutegi) {
		CodSarrera = codSarrera;
		this.beze = beze;
		this.prezioa = prezioa;
		this.setOrdutegi(ordutegi);
	}
	public int getCodSarrera() {
		return CodSarrera;
	}
	public void setCodSarrera(int codSarrera) {
		CodSarrera = codSarrera;
	}
	public double getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(double d) {
		this.prezioa = d;
	}	
	public Bezeroa getBeze() {
		return beze;
	}
	public void setBeze(Bezeroa beze) {
		this.beze = beze;
	}
	public Ordutegia[] getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Ordutegia[] ordutegi) {
		this.ordutegi = ordutegi;
	}
	
	@Override
	public String toString() {
		return "Sarrera [CodSarrera=" + CodSarrera + ", beze=" + beze + ", prezioa=" + prezioa + ", ordutegi="
				+ Arrays.toString(ordutegi) + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Sarrera other = (Sarrera) obj;
		return  Objects.equals(CodSarrera, other.CodSarrera);
				
	}
	
	
	
	
}
