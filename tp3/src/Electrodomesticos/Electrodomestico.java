package Electrodomesticos;

public class Electrodomestico {
	private String nombre;
	private double precioBase;
	private String color;
	private double consumEnerg;
	private double peso;
	private final static int BAJO_CONSUMO = 45;
	private final static int MIN_ALTA_GAMA = 3;

	// Contructores

	public Electrodomestico() {
		this.nombre = "Electro";
		this.color = "Gris plata";
		this.consumEnerg = 10;
		this.precioBase = 100;
		this.peso = 2;

	}

	public Electrodomestico(String nombre) {
		this.nombre = nombre;

	}

	public Electrodomestico(String nombre, String color) {
		this(nombre);
		this.color = color;

	}

	public Electrodomestico(String nombre, String color, double consumEnerg) {
		this(nombre, color);
		this.consumEnerg = consumEnerg;
	}

	public Electrodomestico(String nombre, String color, double consumEnerg, double precioBase) {
		this(nombre, color, consumEnerg);
		this.precioBase = precioBase;
	}

	public Electrodomestico(String nombre, String color, double consumEnerg, double precioBase, double peso) {
		this(nombre, color, consumEnerg, precioBase);
		this.peso = peso;
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumEnerg() {
		return consumEnerg;
	}

	public void setConsumEnerg(double consumEnerg) {
		this.consumEnerg = consumEnerg;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)

	public boolean comprobarConsumo() {
		if (this.consumEnerg < BAJO_CONSUMO) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularBalance() {
		return this.precioBase / this.peso;
	}

	public boolean calcularGama() {
		return this.calcularBalance() > MIN_ALTA_GAMA;
	}

}
