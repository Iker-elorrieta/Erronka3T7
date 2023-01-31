package Objetos;

import java.util.Date;
import java.util.Objects;

public class InfoCine {
	private int Codzinema;
	private int ZbkAretoak;
	
	
	
	public InfoCine(int codzinema, int zbkAretoak) {
		Codzinema = codzinema;
		ZbkAretoak = zbkAretoak;
	}
	public int getCodzinema() {
		return Codzinema;
	}
	public void setCodzinema(int codzinema) {
		Codzinema = codzinema;
	}
	public int getZbkAretoak() {
		return ZbkAretoak;
	}
	public void setZbkAretoak(int zbkAretoak) {
		ZbkAretoak = zbkAretoak;
	}
	
	@Override
	public String toString() {
		return "InfoCine [Codzinema=" + Codzinema + ", ZbkAretoak=" + ZbkAretoak + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoCine other = (InfoCine) obj;
		return Codzinema == other.Codzinema && ZbkAretoak == other.ZbkAretoak;
	}
	
	
}
