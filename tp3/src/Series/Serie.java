package Series;

import java.util.ArrayList;

public class Serie {
	ArrayList<Temporada> temporadas;
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;

	public Serie(ArrayList<Temporada> temporadas, String titulo, String descripcion, String creador, String genero) {
		this.temporadas = temporadas;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList<Temporada>();
	}

	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public String getGenero() {
		return genero;
	}

	// Obtener el total de episodios vistos de una serie.

	public int totalEpVistosDeSerie() {
		int cantVistos = 0;
		for (Episodio episodio : this.temporadas) {
			if (episodio.isFlag()) {
				cantVistos++;
			}
		}
		return cantVistos;
	}

}
