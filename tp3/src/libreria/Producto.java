package libreria;

public class Producto {
	private String nombre;
	private String autor;
	private double precio;
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autorDelLibro) {
		this.autor = autorDelLibro;
	}

	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public boolean equals(Object o1) {
		try {
		
	
			Producto pp = (Producto)o1;
			if ( pp.getNombre().equals(nombre) && precio == pp.getPrecio())
					return true;
			else {
				return false;
			}
		} catch(Exception e) {
			return false;
		}
	}
}
