package Objetos;

import java.util.Arrays;
import java.util.Objects;


public class Aretoa {
	private String AretoIzena;
	private int CodAretoa;
	private Ordutegia[] ordutegi;
	
	public Aretoa(String aretoIzena, int codAretoa, Ordutegia[] ordutegi) {
		AretoIzena = getAretoIzena();
		CodAretoa = getCodAretoa();
		ordutegi=getOrdutegi();
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
	public Ordutegia[] getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Ordutegia[] ordutegi) {
		this.ordutegi = ordutegi;
	}
	@Override
	public String toString() {
		return "Aretoa [AretoIzena=" + AretoIzena + ", CodAretoa=" + CodAretoa + ", ordutegi="
				+ Arrays.toString(ordutegi) + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Aretoa other = (Aretoa) obj;
		return Objects.equals(CodAretoa, other.CodAretoa);
	}
}

