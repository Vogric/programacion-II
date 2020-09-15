package ej1;

public class AlarmaLuminosa extends Alarma {

	private Luz luz;

	/**
	 * @param vidrioRoto
	 * @param abrioPuertaOVentana
	 * @param detectoMovimiento
	 * @param timbre
	 * @param luz
	 */
	public AlarmaLuminosa(boolean vidrioRoto, boolean abrioPuertaOVentana, boolean detectoMovimiento, Timbre timbre,
			Luz luz) {
		super(vidrioRoto, abrioPuertaOVentana, detectoMovimiento, timbre);
		this.luz = luz;
	}

	public void dispararAlarma() {
		super.dispararAlarma();
		this.luz.encenderLuz();
	}
}
