package ej1;

public class Alarma {

	private boolean vidrioRoto;
	private boolean abrioPuertaOVentana;
	private boolean detectoMovimiento;
	private Timbre timbre;

	/**
	 * @param vidrioRoto
	 * @param abrioPuertaOVentana
	 * @param detectoMovimiento
	 * @param timbre
	 */
	public Alarma(boolean vidrioRoto, boolean abrioPuertaOVentana, boolean detectoMovimiento, Timbre timbre) {
		this.vidrioRoto = vidrioRoto;
		this.abrioPuertaOVentana = abrioPuertaOVentana;
		this.detectoMovimiento = detectoMovimiento;
		this.timbre = timbre;
	}

	public void comprobar() {
		if (vidrioRoto || abrioPuertaOVentana || detectoMovimiento) {
			dispararAlarma();
		}

	}

	public void dispararAlarma() {
		this.timbre.dispararAlarma();
	}
}
