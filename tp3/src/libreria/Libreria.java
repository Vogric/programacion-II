package libreria;

import java.util.Vector;

public class Libreria {
	
	Vector<Cliente> clientes;
	
	public double getPrecio(Producto p1, Cliente c1) {
		
		return c1.cuantoTeCobro(p1);
	}
	
	public boolean comproProducto(Producto p, Cliente c) {
		return c.comproProducto(p);
	}
	
	public boolean leGusta(Libro libro, Cliente cliente) {
		/**NUNCA
		 *   if (Tipo comun )
		 *       algo
		 *    else {
		 *        OTRA COSA
		 *     }    if 
		 * 
		 */
	    return cliente.leGusta(libro);
	}
	
	public Vector<Cliente> aQuienLeGusta(Libro libro){
		Vector<Cliente> salida = new Vector<Cliente>();
		
		for (int i = 0; i < clientes.size(); i++) {
			Cliente caux = clientes.elementAt(i);
			if (this.leGusta(libro, caux)) {
				salida.add(caux);
			}
			
		}
		
		return salida;
	}
	
	

}
