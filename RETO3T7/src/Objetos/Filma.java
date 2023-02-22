package Objetos;

import java.util.Objects;

public class Filma {
	private int CodFilma;
	private String iraupena;
	private String generoa;
	private int prezioa;
	private String NomFilma;
	
	
	public Filma(int codFilma, String nomFilma, String iraupena, int prezioa, String generoa) {
		CodFilma = codFilma;
		this.iraupena = iraupena;
		this.generoa = generoa;
		this.prezioa = prezioa;
		NomFilma = nomFilma;
	}
	public Filma() {
	}
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
		return prezioa;
	}
	public void setKostua(int kostua) {
		this.prezioa = kostua;
	}
	
	public String getNomFilma() {
		return NomFilma;
	}
	public void setNomFilma(String nomFilma) {
		NomFilma = nomFilma;
	}	
	
	@Override
	public String toString() {
		return "Filma [CodFilma=" + CodFilma + ", NomFilma=" + NomFilma + ", iraupena=" + iraupena +
				", prezioa=" + prezioa + ", generoa=" + generoa + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Filma other = (Filma) obj;
		return Objects.equals(CodFilma, other.CodFilma);
	}
	
	
}
