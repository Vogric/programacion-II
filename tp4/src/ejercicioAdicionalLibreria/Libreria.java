package ejercicioAdicionalLibreria;

public class Libreria {

	public double getPrecio(Producto p1, Cliente c1) {
		return c1.precioConDescuento(p1);
	}

	public boolean comproProducto(Producto p1, Cliente c1) {
		return c1.agregarCompra(p1);
	}
}
