package Objetos;

import java.sql.Date;
import java.util.Objects;

import Vista.Saioak;

public class Sarrera {
	private int CodSarrera;
	private Saioak ordutegi = new Saioak();
	Aretoak areto =new Aretoak();
	private int prezioa;
	private Bezeroa beze = new Bezeroa();
	
	
	public Sarrera() {
		CodSarrera = getCodSarrera();
		ordutegi = getOrdutegi();
		areto = getAreto();
		prezioa = getPrezioa();
		beze = getBeze();
	}
	public Aretoak getAreto() {
		return areto;
	}

	public void setAreto(Aretoak areto) {
		this.areto = areto;
	}

	public Bezeroa getBeze() {
		return beze;
	}
	public void setBeze(Bezeroa beze) {
		this.beze = beze;
	}
	public int getCodSarrera() {
		return CodSarrera;
	}
	public void setCodSarrera(int codSarrera) {
		CodSarrera = codSarrera;
	}
	public Saioak getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Saioak ordutegi) {
		this.ordutegi = ordutegi;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}	
	
	@Override
	public String toString() {
		return "Sarrera [CodSarrera=" + CodSarrera + ", ordutegi=" + ordutegi
				+ ", Aretoa=" + ", prezioa=" + prezioa + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;*/
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Sarrera other = (Sarrera) obj;
		return  Objects.equals(CodSarrera, other.CodSarrera);
				
	}
	
	
}
