package sueldos;

public class Employee {
	private String name;
	private String lastName;
	private double fixedSalary;
	

	public Employee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		fixedSalary = 10000;
	}
	
	public Employee(String name, String lastName, double fixedSalary) {
		this.name = name;
		this.lastName = lastName;
		this.fixedSalary = fixedSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
	//metodo a implementar en los hijos
	public double getPaid() {
		
		return fixedSalary;
	}
	
	
}
