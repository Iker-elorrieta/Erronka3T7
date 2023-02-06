package Objetos;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Ordutegiak {
	private int CodOrdutegiak;
	private Filmak filma= new Filmak();
	private Zinema zine = new Zinema();
	private Aretoak areto = new Aretoak();
	private Date Fecha;
	/*private int horas;
	private int minutos;
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}*/
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
	public Aretoak getAreto() {
		return areto;
	}
	public void setAreto(Aretoak areto) {
		this.areto = areto;
	}
	@Override
	public String toString() {
		return "Ordutegiak [CodOrdutegiak=" + CodOrdutegiak + ", filma=" + filma + ", zine=" + zine + ", areto=" + areto
				+ ", Fecha=" + Fecha +/* ", horas=" + horas + ", minutos=" + minutos +*/ "]";
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
