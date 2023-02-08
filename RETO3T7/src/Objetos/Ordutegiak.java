package Objetos;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;


public class Ordutegiak {
	private int CodOrdutegiak;
	Date Fecha=null;
	private String orduak;
	private String minutuak;
	private Sarrera[] sarrera;//no sabemos si ponerle un valor
	private Filmak filma;
	
	public Ordutegiak() {
		CodOrdutegiak = getCodOrdutegiak();
		Fecha = getFecha();
		orduak = getOrduak();
		minutuak = getMinutuak();
		setSarrera(getSarrera());
		filma = getFilma();
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
	public Sarrera[] getSarrera() {
		return sarrera;
	}
	public void setSarrera(Sarrera[] sarrera) {
		this.sarrera = sarrera;
	}
	
	
	@Override
	public String toString() {
		return "Ordutegiak [CodOrdutegiak=" + CodOrdutegiak + ", Fecha=" + Fecha + ", orduak=" + orduak + ", minutuak="
				+ minutuak + ", sarrera=" + Arrays.toString(sarrera) + ", filma=" + filma + "]";
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
