package ej4;

import java.util.ArrayList;

public class SeleccionDeFutbol {

	ArrayList<Futbolista> futbolistas;
	ArrayList<Entrenador> entrenadores;
	ArrayList<Masajista> masajistas;

	/**
	 * @param futbolistas
	 * @param entrenadores
	 * @param masajistas
	 */
	public SeleccionDeFutbol() {
		this.futbolistas = new ArrayList<Futbolista>();
		this.entrenadores = new ArrayList<Entrenador>();
		this.masajistas = new ArrayList<Masajista>();
	}

	public void agregarFutbolista(Futbolista f) {
		this.futbolistas.add(f);
	}

	public void agregarEntrenador(Entrenador e) {
		this.entrenadores.add(e);
	}

	public void agregarMasajista(Masajista m) {
		this.masajistas.add(m);
	}

}
