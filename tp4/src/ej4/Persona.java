package ej4;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private int nPasaporte;
	private LocalDate fechaNac;
	private boolean viajando;
	private boolean enConcentracion;

	/**
	 * @param nombre
	 * @param apellido
	 * @param nPasaporte
	 * @param fechaNac
	 * @param estado
	 */
	public Persona(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nPasaporte = nPasaporte;
		this.fechaNac = fechaNac;
		this.viajando = viajando;
		this.enConcentracion = enConcentracion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getnPasaporte() {
		return nPasaporte;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public boolean isViajando() {
		return viajando;
	}

	public boolean isEnConcentracion() {
		return enConcentracion;
	}

}
