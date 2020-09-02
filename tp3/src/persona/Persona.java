package persona;
import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private int dni;
	private String sexo;
	private int peso;
	private int altura;
	
	
	public Persona(int dni) {
		
		this.nombre = "N";
		this.apellido = "N";
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.sexo = "femenino";
		this.peso = 1;
		this.altura = 1;
	}
	
	public Persona(int dni, String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.sexo = "femenino";
		this.peso = 1;
		this.altura = 1;
	}

	public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.fechaNacimiento = fechaNacimiento;
	this.sexo = "femenino";
	this.peso = 1;
	this.altura = 1;
}

	//Methods
	public double calcularMC() {

	double MC = peso/(Math.pow(altura, 2));
	return(MC);
	
}
	public boolean conocerForma() {
		
		double mc = calcularMC();
		
		if(mc >= 18.5 && mc <= 25) {
			return true;
		}else {
			return false;
		}
	}
	public boolean esCumpleanios() {
		
		int diaNac = fechaNacimiento.getDayOfMonth();
		int mesNac = fechaNacimiento.getMonthValue();
		int diaActual = LocalDate.now().getDayOfMonth();
		int mesActual = LocalDate.now().getMonthValue();
		
		if(diaNac == diaActual && mesNac == mesActual) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}



}
