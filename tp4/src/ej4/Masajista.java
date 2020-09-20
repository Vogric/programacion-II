package ej4;

import java.time.LocalDate;

public class Masajista extends Persona {

	private String titulo;
	private int cantAniosExp;

	/**
	 * @param nombre
	 * @param apellido
	 * @param nPasaporte
	 * @param fechaNac
	 * @param viajando
	 * @param enConcentracion
	 * @param titulo
	 * @param cantAniosExp
	 */
	public Masajista(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, String titulo, int cantAniosExp) {
		super(nombre, apellido, nPasaporte, fechaNac, viajando, enConcentracion);
		this.titulo = titulo;
		this.cantAniosExp = cantAniosExp;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCantAniosExp() {
		return cantAniosExp;
	}

}
