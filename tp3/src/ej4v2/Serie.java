package ej4v2;

import java.util.ArrayList;

public class Serie {
	ArrayList<Temporada> temporadas;
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;

	/**
	 * @param temporadas
	 * @param titulo
	 * @param descripcion
	 * @param creador
	 * @param genero
	 */
	public Serie(String titulo, String descripcion, String creador, String genero) {
		this.temporadas = new ArrayList<Temporada>();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
	}

	public void agregarTemporada(Temporada t) {
		this.temporadas.add(t);
	}

	// Obtener el total de episodios vistos de una serie.

	public int obtTotalEpVistosSerie() {
		int visto = 0;
		for (Temporada temporada : this.temporadas) {
			visto += temporada.obtTotalEpVistosTemp();
		}
		return visto;
	}

	// Obtener el promedio de las calificaciones dadas para una serie.

	public int obtPromCalifSerie() {
		int calificacion = 0;
		for (Temporada temporada : this.temporadas) {
			calificacion += temporada.getCantCalif();
		}
		return calificacion / obtTotalEpVistosSerie();
	}

	// Determinar si se vio todos los episodios de la serie.

	public boolean seViotodosLosEpSerie() {
		int cantEps = 0;
		for (Temporada temporada : this.temporadas) {
			cantEps += temporada.getCantEpis();
		}
		if (obtTotalEpVistosSerie() == cantEps) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Total de episodios vistos de la serie: " + obtTotalEpVistosSerie()
				+ "\nPromedio de las calificaciones de la serie: " + obtPromCalifSerie()
				+ "\nSe vio todos los episodios de la serie: " + seViotodosLosEpSerie();
	}

}
