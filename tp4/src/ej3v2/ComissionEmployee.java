package sueldos;

public class ComissionEmployee extends Employee {
	private double percentage;
	private double saled;

	public ComissionEmployee(double saled) {
		super("Ezequiel", "Leanes", 10000);
		percentage = 0.10;
		this.saled = saled;
	}
	
	public ComissionEmployee(String name, String lastName, double pay, double percentage, double saled) {
		super(name, lastName, pay);
		this.percentage = percentage;
		this.saled = saled;
	}
	
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public double getPaid() {
		double pay = super.getPaid() + saled*percentage;
		return pay;
	}
	
}
