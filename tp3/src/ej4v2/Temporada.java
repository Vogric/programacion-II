package ej4v2;

import java.util.ArrayList;

public class Temporada {
	ArrayList<Episodio> episodios;

	/**
	 * @param episodios
	 */
	public Temporada() {
		this.episodios = new ArrayList<Episodio>();
	}

	public void agregarEpisodio(Episodio e) {
		this.episodios.add(e);
	}

	// Obtener el total episodios vistos de una temporada particular.

	public int obtTotalEpVistosTemp() {
		int visto = 0;
		for (Episodio episodio : this.episodios) {
			if (episodio.isFlag()) {
				visto++;
			}
		}
		return visto;
	}

	// Obtener el promedio de las calificaciones dadas para una temporada
	// particular.

	public int getCantCalif() {
		int calificacion = 0;
		for (Episodio episodio : this.episodios) {
			if (episodio.isFlag()) {
				calificacion += episodio.getCalificacion();
			}
		}
		return calificacion;
	}

	public int obtPromCalifTemp() {
		return getCantCalif() / obtTotalEpVistosTemp();
	}

	public int getCantEpis() {
		return episodios.size();
	}

	@Override
	public String toString() {
		return "Total episodios vistos de la temporada: " + obtTotalEpVistosTemp()
				+ "\nPromedio de las calificaciones dadas para la temporada: " + obtPromCalifTemp();
	}

}
