package libreria;

import java.util.ArrayList;

public class Autor {
	
	private String nombre;
	
	private ArrayList<Libro> libros ;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor(String nombre) {
		this.nombre = nombre;
		libros = new ArrayList<Libro>();
	}
	
	public int cantidadLibrosEscritos() {
		return libros.size();
	}
	
	public void addLibro(Libro l) {
		if (l.getAutor().equals(this)) { //EN OBJECT ES ==
			libros.add(l);
		}
	}
	
	
	public boolean escribioLibro(Libro l1) {
		
	   //return libros.contains(l1);
		
		for(int i=0; i < libros.size();i++) {
			
			if (libros.get(i).equals(l1) )
				return true;
		}
		return false;
	}
	
	
	public boolean equals(Object onuevo) {
		try {
			Autor lnuevo = (Autor) onuevo;
			return nombre.equals(lnuevo.getNombre());
		} catch (Exception e) {
			return false;
		}
	}
	
}
