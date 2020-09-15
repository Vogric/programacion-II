package ej5;

import java.util.ArrayList;

public class Peluqueria {
	ArrayList<Peluquero> peluqueros;
	ArrayList<Cliente> clientes;
	ArrayList<Cita> citas;
	String lugarReunion;
	String corte;
	double duracion;

	/**
	 * @param lugarReunion
	 * @param corte
	 * @param duracion
	 */
	public Peluqueria(String corte, double duracion) {
		this.peluqueros = new ArrayList<Peluquero>();
		this.clientes = new ArrayList<Cliente>();
		this.citas = new ArrayList<Cita>();
		this.lugarReunion = "Peluqueria";
		this.corte = corte;
		this.duracion = duracion;
	}

	public void agregarPeluquero(Peluquero p) {
		peluqueros.add(p);
	}

	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}

	public void agregarCita(Cita c) {
		citas.add(c);
	}

	// El sistema además de registrar los turnos, debe poder buscar
//	el primer turno disponible, 
//	también el primero disponible con un determinado peluquero. 
}
