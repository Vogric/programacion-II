package ej5;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoFrio {

	private double porcentNitrogeno;
	private double porcentOxigeno;
	private double porcentDioxCarb;
	private double porcentVaporAgua;

	/**
	 * @param fechaVencimiento
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param granjaOrigen
	 * @param codigoOrganismo
	 * @param tempRecomendada
	 * @param porcentNitrogeno
	 * @param porcentOxigeno
	 * @param porcentDioxCarb
	 * @param porcentVaporAgua
	 */
	public CongeladoPorAire(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen,
			int codigoOrganismo, double tempRecomendada, double porcentNitrogeno, double porcentOxigeno,
			double porcentDioxCarb, double porcentVaporAgua) {
		super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempRecomendada);
		this.porcentNitrogeno = porcentNitrogeno;
		this.porcentOxigeno = porcentOxigeno;
		this.porcentDioxCarb = porcentDioxCarb;
		this.porcentVaporAgua = porcentVaporAgua;
	}

	public double getPorcentNitrogeno() {
		return porcentNitrogeno;
	}

	public double getPorcentOxigeno() {
		return porcentOxigeno;
	}

	public double getPorcentDioxCarb() {
		return porcentDioxCarb;
	}

	public double getPorcentVaporAgua() {
		return porcentVaporAgua;
	}

	@Override
	public String toString() {
		return super.toString() + "Porcentaje de Nitrogeno: " + porcentNitrogeno + "\nPorcentaje de oxigeno: "
				+ porcentOxigeno + "\nPorcentaje de dioxido de carbono: " + porcentDioxCarb
				+ "\nPorcentaje de vapor de agua: " + porcentVaporAgua;
	}

}
