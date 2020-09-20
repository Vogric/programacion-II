package ej3;

import java.util.ArrayList;

public class Cereal {
	private ArrayList<String> minerales;
	private String nombre;

	/**
	 * @param minerales
	 * @param nombre
	 */
	public Cereal(String nombre) {

		this.nombre = nombre;
		this.minerales = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarMinerales(String m) {
		this.minerales.add(m);
	}

	public boolean sePuedeSembrar(Lote lote) {
		for (int i = 0; i < this.minerales.size(); i++) {
			if (!lote.contieneMineral(this.minerales.get(i))) {
				return false;
			}
		}
		return true;
	}

}
