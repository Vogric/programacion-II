package persona;

import java.time.LocalDate;
import java.time.Period;

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

	// Methods
	public double calcularMC() {

		double MC = peso / (Math.pow(altura, 2));
		return (MC);

	}

	public boolean calcularForma() {

		double imc = calcularMC();

		if (imc >= 18.5 && imc <= 25) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esCumpleanios() {

		int diaNac = fechaNacimiento.getDayOfMonth();
		int mesNac = fechaNacimiento.getMonthValue();
		int diaActual = LocalDate.now().getDayOfMonth();
		int mesActual = LocalDate.now().getMonthValue();

		if (diaNac == diaActual && mesNac == mesActual) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esMayor() {

		LocalDate now = LocalDate.now();
		int anios = Period.between(fechaNacimiento, now).getYears();
		;

		if (anios >= 16) {
			return true;

		} else {
			return false;
		}

	}

	public boolean calcularEdad() {

		if (anios >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
