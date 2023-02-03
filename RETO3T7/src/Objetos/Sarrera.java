package Objetos;

import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

import Vista.Ordutegiak;

public class Sarrera {
	private int CodSarrera;
	private Date Fecha;
	private Filmak filma = new Filmak();
	private Ordutegiak ordutegi = new Ordutegiak();
	private int Aretoa;
	private int prezioa;
	
	public int getCodSarrera() {
		return CodSarrera;
	}
	public void setCodSarrera(int codSarrera) {
		CodSarrera = codSarrera;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Filmak getFilma() {
		return filma;
	}
	public void setFilma(Filmak filma) {
		this.filma = filma;
	}
	public Ordutegiak getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Ordutegiak ordutegi) {
		this.ordutegi = ordutegi;
	}
	public int getAretoa() {
		return Aretoa;
	}
	public void setAretoa(int aretoa) {
		Aretoa = aretoa;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}	
	
	@Override
	public String toString() {
		return "Sarrera [CodSarrera=" + CodSarrera + ", Fecha=" + Fecha + ", filma=" + filma + ", ordutegi=" + ordutegi
				+ ", Aretoa=" + Aretoa + ", prezioa=" + prezioa + "]";
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
