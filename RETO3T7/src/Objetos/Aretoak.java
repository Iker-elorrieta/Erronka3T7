package Objetos;

import java.util.Objects;


public class Aretoak {
	private String AretoIzena;
	private int CodAretoa;
	private Ordutegiak ordutegi = new Ordutegiak();	
	
	public Aretoak() {
		AretoIzena = getAretoIzena();
		CodAretoa = getCodAretoa();
		ordutegi = getOrdutegi();
	}
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
	public Ordutegiak getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Ordutegiak ordutegiak) {
		this.ordutegi = ordutegiak;
	}
	@Override
	public String toString() {
		return "Aretoak [AretoIzena=" + AretoIzena + ", CodAretoa=" + CodAretoa + ", ordutegi=" + ordutegi + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Aretoak other = (Aretoak) obj;
		return Objects.equals(CodAretoa, other.CodAretoa);
	}
}
