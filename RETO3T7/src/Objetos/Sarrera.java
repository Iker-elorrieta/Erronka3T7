package Objetos;

import java.sql.Date;
import java.util.Objects;

public class Sarrera {
	private int CodSarrera;
	private Date Fecha;
	private String filmak;
	private String Ordutegiak;
	private int Aretoa;
	private int prezioa;
	
	public Sarrera(int codSarrera, Date fecha, String filmak, String ordutegiak, int aretoa, int prezioa) {
		CodSarrera = codSarrera;
		Fecha = fecha;
		this.filmak = filmak;
		this.Ordutegiak = ordutegiak;
		Aretoa = aretoa;
		this.prezioa = prezioa;
	}
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
	public String getFilmak() {
		return filmak;
	}
	public void setFilmak(String filmak) {
		this.filmak = filmak;
	}
	public String getOrdutegiak() {
		return Ordutegiak;
	}
	public void setOrdutegiak(String ordutegiak) {
		this.Ordutegiak = ordutegiak;
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
		return "Sarrera [CodSarrera=" + CodSarrera + ", Fecha=" + Fecha + ", filmak=" + filmak + ", ordutegiak="
				+ Ordutegiak + ", Aretoa=" + Aretoa + ", prezioa=" + prezioa + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sarrera other = (Sarrera) obj;
		return  Objects.equals(CodSarrera, other.CodSarrera);
	}
	
	
}
