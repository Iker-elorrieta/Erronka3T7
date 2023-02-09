package Objetos;

import java.util.Objects;

public class Sarrera {
	private int CodSarrera;
	private Bezeroa beze;
	private int prezioa;
	private Ordutegiak[] ordutegi;
	
	
	public Sarrera(int codSarrera, Bezeroa beze, int prezioa, Ordutegiak[] ordutegi) {
		CodSarrera = codSarrera;
		this.beze = beze;
		this.prezioa = prezioa;
		this.setOrdutegi(ordutegi);
	}
	public int getCodSarrera() {
		return CodSarrera;
	}
	public void setCodSarrera(int codSarrera) {
		CodSarrera = codSarrera;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}	
	public Bezeroa getBeze() {
		return beze;
	}
	public void setBeze(Bezeroa beze) {
		this.beze = beze;
	}
	public Ordutegiak[] getOrdutegi() {
		return ordutegi;
	}
	public void setOrdutegi(Ordutegiak[] ordutegi) {
		this.ordutegi = ordutegi;
	}
	
	@Override
	public String toString() {
		return "Sarrera [CodSarrera=" + CodSarrera +/* ", filma=" + filma + ", Aretoa=" + areto +*/ ", prezioa=" + prezioa + "]";
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
