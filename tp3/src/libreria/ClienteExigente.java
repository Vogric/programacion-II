package libreria;

public class ClienteExigente extends Cliente {

	
	public boolean leGusta(Libro l) {
		
		return super.leGusta(l)   && this.leGustaGenero(l.getGeneroLiterario());
		
		
	}
	
}
