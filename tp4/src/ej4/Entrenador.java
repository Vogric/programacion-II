package ej4;

import java.time.LocalDate;

public class Entrenador extends Persona {

	private int id;

	/**
	 * @param nombre
	 * @param apellido
	 * @param nPasaporte
	 * @param fechaNac
	 * @param viajando
	 * @param enConcentracion
	 * @param id
	 */
	public Entrenador(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, int id) {
		super(nombre, apellido, nPasaporte, fechaNac, viajando, enConcentracion);
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
