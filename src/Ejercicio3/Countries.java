package Ejercicio3;

import java.util.Objects;

public class Countries {
    private int indece;
	private String ciudad;
	private String capital;
	
	
	
	public Countries(int indece, String ciudad, String capital) {
		this.indece = indece;
		this.ciudad = ciudad;
		this.capital = capital;
	}

	public int getIndece() {
		return indece;
	}

	public void setIndece(int indece) {
		this.indece = indece;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Countries(String ciudad, String capital) {
		this.ciudad = ciudad;
		this.capital = capital;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public String getCapital() {
		return capital;
	}

	@Override
	public String toString() {
		return "Countries [ciudad=" + ciudad + ", capital=" + capital + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, ciudad, indece);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Countries other = (Countries) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(ciudad, other.ciudad) && indece == other.indece;
	}
	
	
	
	

}
