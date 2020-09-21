package ejercicioAdicionalLibreria;

public class ClienteExigente extends Cliente {

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param descuento
	 * @param estaEnFav
	 */
	public ClienteExigente(String nombre, String apellido, int dni, char direccion, double descuento) {
		super(nombre, apellido, dni, direccion, descuento);
	}

	public boolean estaEnFav(Libro libro) {
		if (super.autoresFav.contains(libro.getAutor()) && super.generosFav.contains(libro.getGenero())) {
			return true;
		} else {
			return false;
		}
	}
}
