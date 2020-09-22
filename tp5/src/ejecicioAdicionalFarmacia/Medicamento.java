package ejecicioAdicionalFarmacia;

import java.util.ArrayList;

public class Medicamento {
	private String nombre;
	private String laboratorio;
	private double precio;
	private ArrayList<String> sintomas;

	/**
	 * @param nombre
	 * @param laboratorio
	 * @param precio
	 * @param sintomas
	 */
	public Medicamento(String nombre, String laboratorio, double precio) {
		super();
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
		this.sintomas = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean trataSintoma(String sintoma) {
		if (sintoma != null && this.sintomas.contains(sintoma)) {
			this.sintomas.add(sintoma);
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Medicamento m = (Medicamento) obj;
			return this.getNombre().equals(m.getNombre()) && this.getLaboratorio().equals(m.getLaboratorio());

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
