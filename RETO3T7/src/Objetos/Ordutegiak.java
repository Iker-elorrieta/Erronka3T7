package Objetos;

import java.util.Date;
import java.util.Objects;


public class Ordutegiak {
	private int CodOrdutegiak;
	Date Fecha=null;
	private String orduak;
	private String minutuak;
	private Filmak filma;
	
	public Ordutegiak(int codOrdutegiak, Date fecha, String orduak, String minutuak, Filmak filma) {
		CodOrdutegiak = codOrdutegiak;
		Fecha = fecha;
		this.orduak = orduak;
		this.minutuak = minutuak;
		this.filma = filma;
	}
	public Filmak getFilma() {
		return filma;
	}
	public void setFilma(Filmak filma) {
		this.filma = filma;
	}
	public String getOrduak() {
		return orduak;
	}
	public void setOrduak(String orduak) {
		this.orduak = orduak;
	}
	public String getMinutuak() {
		return minutuak;
	}
	public void setMinutuak(String minutuak) {
		this.minutuak = minutuak;
	}
	public int getCodOrdutegiak() {
		return CodOrdutegiak;
	}
	public void setCodOrdutegiak(int codOrdutegiak) {
		CodOrdutegiak = codOrdutegiak;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "Ordutegiak [CodOrdutegiak=" + CodOrdutegiak + ", Fecha=" + Fecha + ", orduak=" + orduak + ", minutuak="
				+ minutuak + ", filma=" + filma + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Ordutegiak other = (Ordutegiak) obj;
		return Objects.equals(CodOrdutegiak , other.CodOrdutegiak) ;
	}

	
	
	
}
