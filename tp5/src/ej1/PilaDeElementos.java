package ej1;

import java.util.ArrayList;

public class PilaDeElementos {

	ArrayList<Elemento> elementos;

	/**
	 * @param elementos
	 */
	public PilaDeElementos() {
		this.elementos = new ArrayList<Elemento>();
	}

	public void push(Elemento e) {
		this.elementos.add(e);
	}

	// Probar
	public void pop(Elemento e) {
		int i = this.elementos.size() - 1;
		this.elementos.remove(i);
	}

	public void top(Elemento e) {
		this.elementos.size();
	}
}
