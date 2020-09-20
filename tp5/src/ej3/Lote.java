package ej3;

import java.util.ArrayList;

public class Lote {
	private ArrayList<String> minerales;
	private String nombre;
	private int hectareas;

	/**
	 * @param minerales
	 * @param nombre
	 * @param hectareas
	 */
	public Lote(String nombre, int hectareas) {

		this.nombre = nombre;
		this.hectareas = hectareas;
		this.minerales = new ArrayList<String>();

	}

	public String getNombre() {
		return nombre;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void agregarMinerales(String m) {
		this.minerales.add(m);
	}

	public boolean contieneMineral(String m) {
		return this.minerales.contains(m);
	}

	public boolean sePuedeSembrar(Cereal cereal) {
		return cereal.sePuedeSembrar(this);
	}

	public boolean esEspecial(ArrayList<String> mineralesEspeciales) {
		for (int i = 0; i < mineralesEspeciales.size(); i++) {
			if (!this.minerales.contains(mineralesEspeciales.get(i))) {
				return false;
			}
		}
		return true;
	}
}
