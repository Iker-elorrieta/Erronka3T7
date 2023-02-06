package Objetos;

import java.sql.Date;
import java.util.Objects;

import Vista.Saioak;


public class Aretoak {
	private String AretoIzena;
	private int CodAretoa;
	private Date fechas;
	private Saioak ordutegi = new Saioak();	

	
	public Aretoak() {
		AretoIzena = getAretoIzena();
		CodAretoa = getCodAretoa();
		fechas = getFechas();
		ordutegi = getOrdutegi();
	}
	public String getAretoIzena() {
		return AretoIzena;
	}
	public void setAretoIzena(String aretoIzena) {
		AretoIzena = aretoIzena;
	}
	public int getCodAretoa() {
		return CodAretoa;
	}
	public void setCodAretoa(int codAretoa) {
		CodAretoa = codAretoa;
	}
	public Date getFechas() {
		return fechas;
	}
	public void setFechas(Date fechas) {
		this.fechas = fechas;
	}
	public Saioak getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Saioak ordutegiak) {
		this.ordutegi = ordutegiak;
	}
	@Override
	public String toString() {
		return "Aretoak [AretoIzena=" + AretoIzena + ", CodAretoa=" + CodAretoa + ", fechas=" + fechas + ", ordutegi=" + ordutegi + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Aretoak other = (Aretoak) obj;
		return Objects.equals(CodAretoa, other.CodAretoa);
	}
}
