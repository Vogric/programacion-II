package sueldos;

public class ExtraHoursEmp extends Employee {
	private double workedHs;
	private double hsPay;
	
	public ExtraHoursEmp(double workedHs, double hsPay) {
		super("Rosario", "Perrotta", 10000);
		this.workedHs = workedHs;
		this.hsPay = hsPay;
	}

	public double getWorkedHs() {
		return workedHs;
	}

	public void setWorkedHs(double workedHs) {
		this.workedHs = workedHs;
	}

	public double getHsPay() {
		return hsPay;
	}

	public void setHsPay(double hsPay) {
		this.hsPay = hsPay;
	}
	
	public double getPaid() {
		double pay = super.getPaid() + workedHs*hsPay;
		return pay;
	}
	
	
}
