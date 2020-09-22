package ej2;

import java.util.ArrayList;

public class Casa {

	public final static int cantMaxAlumnos = 50;
	private ArrayList<String> cualidadesQueDebenTener;
	private ArrayList<Alumno> alumnos;

	/**
	 * @param cualidadesQueDebenTener
	 * @param alumnos
	 */
	public Casa() {
		this.cualidadesQueDebenTener = new ArrayList<String>();
		this.alumnos = new ArrayList<Alumno>();
	}

	// metodo si la casa se encuentra llena, no puede recibir nuevos alumnos

	public void agregarAlumno(Alumno a) {
		if (this.alumnos.size() < cantMaxAlumnos) {
			this.alumnos.add(a);
		}
	}

}
