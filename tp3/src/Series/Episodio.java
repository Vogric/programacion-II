package Series;

import java.util.ArrayList;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;

	ArrayList<Episodio> episodios = new ArrayList<Episodio>();

	public Episodio(String titulo, String descripcion, boolean flag, ArrayList<Episodio> episodios) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = flag;
		this.calificacion = -1;
		this.episodios = episodios;
	}

	// G y S

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isFlag() {
		return flag;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	// Metodos

	public boolean calificarEpisodio() {
		if (this.calificacion >= 1 && this.calificacion <= 5) {
			this.flag = true;
			return true;
		} else {
			System.out.println("Calificacion incorrecta");
			return false;
		}
	}

}
