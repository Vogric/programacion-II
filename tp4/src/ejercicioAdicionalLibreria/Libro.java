package ejercicioAdicionalLibreria;

public class Libro extends Producto {

	private int cantidadPaginas;
	private String resumen;
	private String genero;

	/**
	 * @param nombre
	 * @param autor
	 * @param precio
	 * @param cantidadPaginas
	 * @param resumen
	 * @param genero
	 */
	public Libro(String nombre, String autor, double precio, int cantidadPaginas, String resumen, String genero) {
		super(nombre, autor, precio);
		this.cantidadPaginas = cantidadPaginas;
		this.resumen = resumen;
		this.genero = genero;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public String getResumen() {
		return resumen;
	}

	public String getGenero() {
		return genero;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Libro l = (Libro) obj;
			return super.equals(l) && l.getCantidadPaginas() == this.getCantidadPaginas();
		} catch (Exception e) {
			return false;
		}
	}

}
