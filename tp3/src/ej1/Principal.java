package ej1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dni = 38917350;
		LocalDate fechaNacimiento = LocalDate.of(1995, 6, 4);

		Persona persona1 = new Persona(dni);

		persona1.setName("Juan");
		persona1.setApellido("Lennon");
		persona1.setAltura(1);
		persona1.setSexo("M");
		persona1.setFechaNacimiento(fechaNacimiento);

		System.out.println(persona1.calcularEdad());
		System.out.println(persona1.esMayor());
		System.out.println("Nombre: ");
	}

}
