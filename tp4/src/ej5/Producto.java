package ej5;

import java.time.LocalDate;

public class Producto {

	private LocalDate fechaVencimiento;
	private int numeroLote;
	private LocalDate fechaEnvasado;
	private String granjaOrigen;

	/**
	 * @param fechaVencimiento
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param granjaOrigen
	 */
	public Producto(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen) {
		this.fechaVencimiento = fechaVencimiento;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	@Override
	public String toString() {
		return "Fecha de vencimiento: " + fechaVencimiento + "\nNro lote: " + numeroLote + "\nFecha envasado: "
				+ fechaEnvasado + "\nGranja de origen: " + granjaOrigen;
	}

}
