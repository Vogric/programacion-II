package ej5;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoFrio {

	private String metodoCongelacion;
	private double tiempoExpAlNitrogeno;

	/**
	 * @param fechaVencimiento
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param granjaOrigen
	 * @param codigoOrganismo
	 * @param tempRecomendada
	 * @param metodoCongelacion
	 * @param tiempoExpAlNitrogeno
	 */
	public CongeladoPorNitrogeno(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOrganismo, double tempRecomendada, String metodoCongelacion,
			double tiempoExpAlNitrogeno) {
		super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempRecomendada);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExpAlNitrogeno = tiempoExpAlNitrogeno;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public double getTiempoExpAlNitrogeno() {
		return tiempoExpAlNitrogeno;
	}

	@Override
	public String toString() {
		return super.toString() + "Metodo de congelacion: " + metodoCongelacion
				+ "\nTiempo de exposicion al Nitrogeno: " + tiempoExpAlNitrogeno;
	}

}
