package ej3;

public class Pastura extends Cereal {

	public static final int MIN_HECTAREAS = 50;

	public Pastura(String nombre) {
		super(nombre);
	}

	@Override
	public boolean sePuedeSembrar(Lote lote) {
		return lote.getHectareas() >= MIN_HECTAREAS && super.sePuedeSembrar(lote);
	}
}
