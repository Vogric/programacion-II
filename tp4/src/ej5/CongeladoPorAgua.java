package ej5;

import java.time.LocalDate;

public class CongeladoPorAgua extends ProductoFrio {
	private String sanidadDelAgua;
	private String procesoDeCongelado;

	/**
	 * @param fechaVencimiento
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param granjaOrigen
	 * @param codigoOrganismo
	 * @param tempRecomendada
	 * @param sanidadDelAgua
	 * @param procesoDeCongelado
	 */
	public CongeladoPorAgua(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen,
			int codigoOrganismo, double tempRecomendada, String sanidadDelAgua, String procesoDeCongelado) {
		super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempRecomendada);
		this.sanidadDelAgua = sanidadDelAgua;
		this.procesoDeCongelado = procesoDeCongelado;
	}

	public String getSanidadDelAgua() {
		return sanidadDelAgua;
	}

	public String getProcesoDeCongelado() {
		return procesoDeCongelado;
	}

	@Override
	public String toString() {
		return super.toString() + "Sanidad del agua: " + sanidadDelAgua + "\nProceso de congelado: "
				+ procesoDeCongelado;
	}

}
