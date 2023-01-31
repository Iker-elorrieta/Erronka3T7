package Objetos;

import java.util.Objects;

public class Bezeroa {
	private String DNI;
	private String izena;
	private String Abizenak;
	private String sexua;
	private String pasahitza;
	
	public Bezeroa(String dNI, String izena, String abizenak, String sexua, String pasahitza) {
		DNI = dNI;
		this.izena = izena;
		Abizenak = abizenak;
		this.sexua = sexua;
		this.pasahitza = pasahitza;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getAbizenak() {
		return Abizenak;
	}
	public void setAbizenak(String abizenak) {
		Abizenak = abizenak;
	}
	public String getSexua() {
		return sexua;
	}
	public void setSexua(String sexua) {
		this.sexua = sexua;
	}
	public String getPasahitza() {
		return pasahitza;
	}
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	
	@Override
	public String toString() {
		return "Bezeroa [DNI=" + DNI + ", izena=" + izena + ", Abizenak=" + Abizenak + ", sexua=" + sexua
				+ ", pasahitza=" + pasahitza + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(Abizenak, other.Abizenak) && Objects.equals(DNI, other.DNI)
				&& Objects.equals(izena, other.izena) && Objects.equals(pasahitza, other.pasahitza)
				&& Objects.equals(sexua, other.sexua);
	}
	
}
