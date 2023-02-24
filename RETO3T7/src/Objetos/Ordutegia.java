package Objetos;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;


public class Ordutegia {
	private int CodOrdutegiak;
	private Filma filma;
	private Date fecha;
	private Time ordua;
	
	public Ordutegia(int codOrdutegiak, Date fecha, Filma filma, Time ordua) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat Fecha = new SimpleDateFormat("yyyy-MM-dd");
		Fecha.format(cal.getTime());
		Calendar cal1 = Calendar.getInstance();
		SimpleDateFormat data1 = new SimpleDateFormat("hh:mm:ss");
		data1.format(cal1.getTime());
		java.util.Date date = cal1.getTime();
		setOrdua(new java.sql.Time(date.getTime()));
		CodOrdutegiak = codOrdutegiak;
		this.fecha = fecha;
		this.filma = filma;
		this.ordua = ordua;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date date) {
		this.fecha = date;
	}
	public Time getOrdua() {
		return ordua;
	}
	public void setOrdua(Time ordua) {
		this.ordua = ordua;
	}
	
	@Override
	public String toString() {
		return "Ordutegia [CodOrdutegiak=" + CodOrdutegiak + ", filma=" + filma + ", fecha=" + fecha + ", ordua="
				+ ordua + "]";
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

