package ejercicioAdicionalLibreria;

public class Revista extends Producto {

	private int numero;
	private int anio;

	/**
	 * @param nombre
	 * @param autor
	 * @param precio
	 * @param numero
	 * @param anio
	 */
	public Revista(String nombre, String autor, double precio, int numero, int anio) {
		super(nombre, autor, precio);
		this.numero = numero;
		this.anio = anio;
	}

	public int getNumero() {
		return numero;
	}

	public int getAnio() {
		return anio;
	}

}
