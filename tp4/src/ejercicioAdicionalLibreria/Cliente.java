package ejercicioAdicionalLibreria;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private int dni;
	private char direccion;
	private double descuento;
	ArrayList<String> autoresFav;
	ArrayList<String> generosFav;
	ArrayList<Producto> compras;

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param descuento
	 * @param autoresFav
	 * @param generosFav
	 * @param compras
	 */
	public Cliente(String nombre, String apellido, int dni, char direccion, double descuento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento = descuento;
		this.autoresFav = new ArrayList<String>();
		this.generosFav = new ArrayList<String>();
		this.compras = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public char getDireccion() {
		return direccion;
	}

	public double getDescuento() {
		return descuento;
	}

	public void agregarAutorFav(String autor) {
		if (!this.autoresFav.contains(autor)) {
			this.autoresFav.add(autor);
		}
	}

	public void agregarGeneroFav(String genero) {
		if (!this.generosFav.contains(genero)) {
			this.generosFav.add(genero);
		}
	}

	public void agregarCompra(Producto producto) {
		this.compras.add(producto);
	}

	public boolean estaEnFavoritos(Libro l) {
		return this.autoresFav.contains(l.getAutor());
	}

	public double precioConDescuento(Producto p1) {
		double precio = p1.getPrecio();
		double precioFinal = precio - precio * this.descuento;
		return precioFinal;
	}

}
