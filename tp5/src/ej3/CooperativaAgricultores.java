package ej3;

import java.util.ArrayList;

public class CooperativaAgricultores {
	private ArrayList<String> mineralesEspeciales;

	/**
	 * @param mineralesEspeciales
	 */
	public CooperativaAgricultores() {
		this.mineralesEspeciales = new ArrayList<String>();
	}

	public void agregarMineralesEsp(String me) {
		this.mineralesEspeciales.add(me);
	}

	public boolean aptoSiembra(Lote lote, Cereal cereal) {
		return cereal.sePuedeSembrar(lote);
	}

	public boolean esEspecial(Lote lote) {
		for (int i = 0; i < this.mineralesEspeciales.size(); i++) {
			if (!lote.contieneMineral(mineralesEspeciales.get(i))) {
				return false;
			}
		}
		return true;
	}

}
