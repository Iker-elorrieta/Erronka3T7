package Objetos;

import java.sql.Date;

public class Sarrera {
	private int CodSarrera;
	private Date Fecha;
	private String filmak;
	private String ordutegiak;
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
	public String getFilmak() {
		return filmak;
	}
	public void setFilmak(String filmak) {
		this.filmak = filmak;
	}
	public String getOrdutegiak() {
		return ordutegiak;
	}
	public void setOrdutegiak(String ordutegiak) {
		this.ordutegiak = ordutegiak;
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
	
	
}
