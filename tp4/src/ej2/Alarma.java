package ej2;

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
		this.timbre = new Timbre();
	}

	public void comprobar() {
		if (vidrioRoto || abrioPuertaOVentana || detectoMovimiento) {
			this.dispararAlarma();
		}

	}

	public void dispararAlarma() {
		this.timbre.hacerSonar();
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isAbrioPuertaOVentana() {
		return abrioPuertaOVentana;
	}

	public void setAbrioPuertaOVentana(boolean abrioPuertaOVentana) {
		this.abrioPuertaOVentana = abrioPuertaOVentana;
	}

	public boolean isDetectoMovimiento() {
		return detectoMovimiento;
	}

	public void setDetectoMovimiento(boolean detectoMovimiento) {
		this.detectoMovimiento = detectoMovimiento;
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

}
