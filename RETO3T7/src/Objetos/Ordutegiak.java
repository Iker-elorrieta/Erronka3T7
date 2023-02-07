package Objetos;

import java.util.Date;
import java.util.Objects;

public class Ordutegiak {
	private int CodOrdutegiak;
	Date Fecha=null;
	private Filmak filma= new Filmak();
	private Zinema zine = new Zinema();
	
	
	public int getCodOrdutegi() {
		return CodOrdutegiak;
	}
	public void setCodOrdutegi(int codOrdutegi) {
		CodOrdutegiak = codOrdutegi;
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
	
	@Override
	public String toString() {
		return "Ordutegiak [CodOrdutegiak=" + CodOrdutegiak + ", Fecha=" + Fecha + ", filma="
				+ filma + ", zine=" + zine + "]";
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
