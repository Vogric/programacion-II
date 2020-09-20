package ej4;

import java.time.LocalDate;

public class Futbolista extends Persona {

	private String posicion;
	private String piernaHabil;
	private int cantGolConvert;

	/**
	 * @param nombre
	 * @param apellido
	 * @param nPasaporte
	 * @param fechaNac
	 * @param viajando
	 * @param enConcentracion
	 * @param posicion
	 * @param piernaHabil
	 * @param cantGolConvert
	 */
	public Futbolista(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, String posicion, String piernaHabil, int cantGolConvert) {
		super(nombre, apellido, nPasaporte, fechaNac, viajando, enConcentracion);
		this.posicion = posicion;
		this.piernaHabil = piernaHabil;
		this.cantGolConvert = cantGolConvert;
	}

	public String getPosicion() {
		return posicion;
	}

	public String getPiernaHabil() {
		return piernaHabil;
	}

	public int getCantGolConvert() {
		return cantGolConvert;
	}

}
