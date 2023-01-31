package Objetos;

import java.sql.Date;
import java.util.Objects;

public class Aretoak {
	private String AretoIzena;
	private int CodAretoa;
	private String filmak;
	private Date fechas;
	private String ordutegiak;	
	
	public Aretoak(String aretoIzena, int codAretoa, String filmak, Date fechas, String ordutegiak) {
		AretoIzena = aretoIzena;
		CodAretoa = codAretoa;
		this.filmak = filmak;
		this.fechas = fechas;
		this.ordutegiak = ordutegiak;
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
	public String getFilmak() {
		return filmak;
	}
	public void setFilmak(String filmak) {
		this.filmak = filmak;
	}
	public Date getFechas() {
		return fechas;
	}
	public void setFechas(Date fechas) {
		this.fechas = fechas;
	}
	public String getOrdutegiak() {
		return ordutegiak;
	}
	public void setOrdutegiak(String ordutegiak) {
		this.ordutegiak = ordutegiak;
	}
	
	@Override
	public String toString() {
		return "Aretoak [AretoIzena=" + AretoIzena + ", CodAretoa=" + CodAretoa + ", filmak=" + filmak + ", fechas="
				+ fechas + ", ordutegiak=" + ordutegiak + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoak other = (Aretoak) obj;
		return Objects.equals(AretoIzena, other.AretoIzena) && CodAretoa == other.CodAretoa
				&& Objects.equals(fechas, other.fechas) && Objects.equals(filmak, other.filmak)
				&& Objects.equals(ordutegiak, other.ordutegiak);
	}
}
