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
	private double peso;
	private double altura;
	private static final double IMC_MIN = 18.5;
	private static final double IMC_MAX = 25;
	//Constructores
	
	public Persona(int dni){
		this.nombre = "N";
		this.apellido = "N";
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.sexo = "femenino";
		this.peso = 1;
		this.altura = 1;
		this.edad = calcularEdad();
	}
	
	public Persona(int dni, String nombre, String apellido){
		this(dni);
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento){
		this(dni, nombre, apellido);
		this.fechaNacimiento = fechaNacimiento;
	}
	//Metodos
	
	public double calcularImc() {	
		
		double imc = peso/(Math.pow(altura, 2));
		
		return imc;
	}
	
	public boolean enForma() {
		
		double imc = calcularImc();
		
		if (imc >= IMC_MIN && imc <= IMC_MAX)
			return true;			
		else
			return false;
	}
	
	public boolean esCumpleanios() {
		
		int mesNac = fechaNacimiento.getMonthValue();
		int diaNac = fechaNacimiento.getDayOfMonth();
		int mesActual = LocalDate.now().getMonthValue();
		int diaActual = LocalDate.now().getDayOfMonth();
			
		if (mesNac == mesActual && diaNac == diaActual)
			return true;
		else 
			return false;
	}
	
	public int calcularEdad() {
		int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
		return edad;
	}
	
	public boolean esMayor() {
		
		if(edad >= 18)
			return true;
		else
			
			return false;
	}
	
	public boolean esVotante() {
			
		if(edad >= 16)
			return true;
		else
			return false;
	}
	
	public boolean esCoherente() {
		int anios = calcularEdad();
		if (anios == edad) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	//Getters
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public String getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
		
}
