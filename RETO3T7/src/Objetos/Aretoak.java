package Objetos;

import java.sql.Date;

public class Aretoak {
	private String AretoIzena;
	private int CodAretoa;
	private String filmak;
	private Date fechas;
	private String ordutegiak;
	
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
	
	
}
