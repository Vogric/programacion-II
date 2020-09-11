package Series;

import java.util.ArrayList;

public class Temporada {
	ArrayList<Episodio> episodios;
	String nombre;

	public Temporada(String nombre) {
		this.episodios = new ArrayList<Episodio>();
		this.nombre = nombre;
	}

	public void agregarEpisodio(Episodio ep) {
		this.episodios.add(ep);
	}

	// Obtener el total de episodios vistos de una temporada particular.

	public int totalEpVistosDeTemporada() {
		int cantVistos = 0;
		for (Episodio episodio : this.episodios) {
			if (episodio.isFlag()) {
				cantVistos++;
			}
		}
		return cantVistos;
	}

}