package ej3;

public class EmpleadoHoraExtra extends Empleado {

	private double montoExtraXH;
	private int horasExtrasTrabajadas;

	/**
	 * @param salarioSemanal
	 * @param montoExtraXH
	 */
	public EmpleadoHoraExtra(double salarioSemanal, double montoExtraXH, int horasExtrasTrabajadas) {
		super(salarioSemanal);
		this.montoExtraXH = montoExtraXH;
		this.horasExtrasTrabajadas = horasExtrasTrabajadas;
	}

	public double getMontoExtraXH() {
		return this.montoExtraXH * this.horasExtrasTrabajadas;
	}

	@Override
	public double getSalarioSemanal() {
		// TODO Auto-generated method stub
		return super.getSalarioSemanal() + this.getMontoExtraXH();
	}

}
