package ej3;

public class EmpleadoComision extends Empleado {

	private double montoXVent;
	private int ventasRealizadas;

	/**
	 * @param salarioSemanal
	 * @param porcentajeCantVent
	 */
	public EmpleadoComision(double salarioSemanal, double montoXVent, int ventasRealizadas) {
		super(salarioSemanal);
		this.montoXVent = montoXVent;
		this.ventasRealizadas = ventasRealizadas;
	}

	public double getPorcentajeComision() {
		return this.montoXVent * this.ventasRealizadas;
	}

	@Override
	public double getSalarioSemanal() {
		// TODO Auto-generated method stub
		return super.getSalarioSemanal() + this.getPorcentajeComision();
	}

}
