package Objetos;

import java.util.Calendar;
import java.util.Objects;


public class Ordutegia {
	private int CodOrdutegiak;
	private Filma filma;
	private Calendar fecha;
	
	public Ordutegia(int codOrdutegiak, Calendar fecha, Filma filma) {
		CodOrdutegiak = codOrdutegiak;
		this.fecha = fecha;
		this.filma = filma;
	}
	public Ordutegia() {
	}
	public Filma getFilma() {
		return filma;
	}
	public void setFilma(Filma filma) {
		this.filma = filma;
	}
	public int getCodOrdutegiak() {
		return CodOrdutegiak;
	}
	public void setCodOrdutegiak(int codOrdutegiak) {
		CodOrdutegiak = codOrdutegiak;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "Ordutegia [CodOrdutegiak=" + CodOrdutegiak + ", filma=" + filma + ", fecha=" + fecha + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Ordutegia other = (Ordutegia) obj;
		return Objects.equals(CodOrdutegiak , other.CodOrdutegiak) ;
	}

	
	
	
}

