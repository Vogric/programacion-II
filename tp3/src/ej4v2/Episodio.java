package ej4v2;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;

	/**
	 * @param titulo
	 * @param descripcion
	 * @param flag
	 * @param calificacion
	 */
	public Episodio(String titulo, String descripcion, boolean flag) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = flag;
		this.calificacion = -1;
	}

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

	// Metodos:
	// Ingresar la calificación de un episodio.
	// Si el valor ingresado como calificación no es correcto, imprimir un mensaje
	// por pantalla y no cambiar el valor anterior.

	public boolean calificar(int calificacion) {
		if (calificacion < 1 || calificacion > 5) {
			return false;
		} else {
			this.calificacion = calificacion;
			this.flag = true;
			return true;
		}
	}

}
