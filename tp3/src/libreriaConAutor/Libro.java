package libreria;

public class Libro {
	
	private String nombre;
	private Autor autorDelLibro;
	private double precio;
	private int cantidadDePaginas;
	private String resumen;
	private String generoLiterario;
	
	
	public Autor getAutor() {
		return autorDelLibro;
	}
	
	public boolean equals(Object o1) {
		try {
			Libro lnuevo = (Libro) o1;
			return nombre.equals(lnuevo.getNombre());
		} catch (Exception e) {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getAutorDelLibro() {
		return autorDelLibro;
	}

	public void setAutorDelLibro(Autor autorDelLibro) {
		this.autorDelLibro = autorDelLibro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}

	public void setCantidadDePaginas(int cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	
	
	
}
