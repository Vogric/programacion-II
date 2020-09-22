package ej2;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familQAsistenALaEsc;

	/**
	 * @param nombre
	 * @param cualidades
	 * @param familQAsistenALaEsc
	 */
	public Alumno(String nombre) {
		this.nombre = nombre;
		this.cualidades = new ArrayList<String>();
		this.familQAsistenALaEsc = new ArrayList<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getCualidades() {
		return cualidades;
	}

	public ArrayList<Alumno> getFamilQAsistenALaEsc() {
		return familQAsistenALaEsc;
	}

}
