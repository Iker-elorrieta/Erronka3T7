package Objetos;

import java.util.Objects;

public class Filmak {
	private int CodFilma;
	private String iraupena;
	private String generoa;
	private int kostua;
	private String NomFilma;
	
	public int getCodFilma() {
		return CodFilma;
	}
	public void setCodFilma(int codFilma) {
		CodFilma = codFilma;
	}
	public String getIraupena() {
		return iraupena;
	}
	public void setIraupena(String iraupena) {
		this.iraupena = iraupena;
	}
	public String getGeneroa() {
		return generoa;
	}
	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}
	public int getKostua() {
		return kostua;
	}
	public void setKostua(int kostua) {
		this.kostua = kostua;
	}
	
	public String getNomFilma() {
		return NomFilma;
	}
	public void setNomFilma(String nomFilma) {
		NomFilma = nomFilma;
	}
	
	@Override
	public String toString() {
		return "Filmak [CodFilma=" + CodFilma + ", iraupena=" + iraupena + ", generoa=" + generoa + ", kostua=" + kostua
				+ ", NomFilma=" + NomFilma + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filmak other = (Filmak) obj;
		return CodFilma == other.CodFilma && Objects.equals(NomFilma, other.NomFilma)
				&& Objects.equals(generoa, other.generoa) && Objects.equals(iraupena, other.iraupena)
				&& kostua == other.kostua;
	}
	
	
}
