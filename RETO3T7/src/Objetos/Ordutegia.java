package Objetos;

import java.util.Date;
import java.util.Objects;


public class Ordutegia {
	private int CodOrdutegiak;
	Date Fecha=null;
	private Filma filma;
	
	public Ordutegia(int codOrdutegiak, Date fecha, Filma filma) {
		CodOrdutegiak = codOrdutegiak;
		Fecha = fecha;
		this.filma = filma;
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
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "Ordutegia [CodOrdutegiak=" + CodOrdutegiak + ", Fecha=" + Fecha + ", filma=" + filma + "]";
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
