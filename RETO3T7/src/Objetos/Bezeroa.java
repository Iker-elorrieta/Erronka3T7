package Objetos;

import java.util.Objects;

public class Bezeroa {
	private String DNI;
	private String izena;
	private String Abizena1;
	private String Abizena2;
	private String sexua;
	private String pasahitza;
	
	
	public Bezeroa(String dNI, String izena, String abizena1, String abizena2, String sexua, String pasahitza) {
		super();
		DNI = dNI;
		this.izena = izena;
		Abizena1 = abizena1;
		Abizena2 = abizena2;
		this.sexua = sexua;
		this.pasahitza = pasahitza;
	}
	
	public String getAbizena1() {
		return Abizena1;
	}

	public void setAbizena1(String abizena1) {
		Abizena1 = abizena1;
	}

	public String getAbizena2() {
		return Abizena2;
	}

	public void setAbizena2(String abizena2) {
		Abizena2 = abizena2;
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
		return "Bezeroa [DNI=" + DNI + ", izena=" + izena + ", Abizena1=" + Abizena1 + ", Abizena2=" + Abizena2
				+ ", sexua=" + sexua + ", pasahitza=" + pasahitza + "]";
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(DNI, other.DNI);
	}
	
}