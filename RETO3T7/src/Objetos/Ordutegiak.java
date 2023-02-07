package Objetos;

import java.util.Date;
import java.util.Objects;


public class Ordutegiak {
	private int CodOrdutegiak;
	Date Fecha=null;
	private int orduak;
	private int minutuak;
	private Zinema zine = new Zinema();
	private Filmak filma= new Filmak();
	
	public Ordutegiak() {
		CodOrdutegiak = getCodOrdutegiak();
		Fecha = getFecha();
		orduak = getOrduak();
		minutuak = getMinutuak();
		zine = getZine();
		filma = getFilma();
	}
	public Filmak getFilma() {
		return filma;
	}
	public void setFilma(Filmak filma) {
		this.filma = filma;
	}
	public Zinema getZine() {
		return zine;
	}
	public void setZine(Zinema zine) {
		this.zine = zine;
	}
	public int getOrduak() {
		return orduak;
	}
	public void setOrduak(int orduak) {
		this.orduak = orduak;
	}
	public int getMinutuak() {
		return minutuak;
	}
	public void setMinutuak(int minutuak) {
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
		return "Ordutegiak [CodOrdutegiak=" + CodOrdutegiak + ", Fecha=" + Fecha + ", filma=" + filma + ", zine=" + zine +
				", orduak=" + orduak + ", minutuak=" + minutuak + "]";
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
