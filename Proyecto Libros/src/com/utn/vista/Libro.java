package com.utn.vista;

public class Libro {
	private String nombreLibro;
	private String nombreAutor;
	private String genero;
	private int cantPag;
	public Libro(String nombre, String nombreAutor2, String genero2, int cantPag2) {
		// TODO Auto-generated constructor stub
	}
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getCantPag() {
		return cantPag;
	}
	public void setCantPag(int cantPag) {
		this.cantPag = cantPag;
	}
	@Override
	public String toString() {
		return "Libro [nombreLibro=" + nombreLibro + ", nombreAutor=" + nombreAutor + ", genero=" + genero
				+ ", cantPag=" + cantPag + "]";
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantPag;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nombreAutor == null) ? 0 : nombreAutor.hashCode());
		result = prime * result + ((nombreLibro == null) ? 0 : nombreLibro.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (cantPag != other.cantPag)
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nombreAutor == null) {
			if (other.nombreAutor != null)
				return false;
		} else if (!nombreAutor.equals(other.nombreAutor))
			return false;
		if (nombreLibro == null) {
			if (other.nombreLibro != null)
				return false;
		} else if (!nombreLibro.equals(other.nombreLibro))
			return false;
		return true;
	}
	
	
}
