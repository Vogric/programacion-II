package ej5;

import java.time.LocalDate;

public class ProductoFrio extends Producto {

	private int codigoOrganismo;
	private double tempRecomendada;

	/**
	 * @param fechaVencimiento
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param granjaOrigen
	 * @param codigoOrganismo
	 * @param tempRecomendada
	 */
	public ProductoFrio(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen,
			int codigoOrganismo, double tempRecomendada) {
		super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen);
		this.codigoOrganismo = codigoOrganismo;
		this.tempRecomendada = tempRecomendada;
	}

	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public double getTempRecomendada() {
		return tempRecomendada;
	}

	@Override
	public String toString() {
		return super.toString() + "Codigo de Organismo: " + codigoOrganismo
				+ "\nTemperatura de mantenimiento recomendada: " + tempRecomendada;

	}

}
