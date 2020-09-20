package ejercicioAdicionalLibreria;

public class Producto {

	private String nombre;
	private String autor;
	private double precio;

	/**
	 * @param nombre
	 * @param autor
	 * @param precio
	 */
	public Producto(String nombre, String autor, double precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public double getPrecio() {
		return precio;
	}

}
