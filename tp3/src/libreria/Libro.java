package libreria;

public class Libro extends Producto{
	
	private int cantidadDePaginas;
	private String resumen;
	private String generoLiterario;
	
	


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

	
	public boolean equals(Object o1) {
		try {
			Libro libro = (Libro)o1;
			if (super.equals(libro) && 
					cantidadDePaginas == libro.getCantidadDePaginas()) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
