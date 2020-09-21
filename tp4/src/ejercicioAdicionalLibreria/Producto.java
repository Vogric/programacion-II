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

	@Override
	public boolean equals(Object obj) {
		try {
			Producto produc = (Producto) obj;
			return produc.getNombre().equals(this.nombre) && produc.getPrecio() == this.precio;
		} catch (Exception e) {
			return false;
		}
	}

}
