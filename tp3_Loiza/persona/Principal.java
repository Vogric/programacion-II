package persona;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		int dni = 34961384;
		LocalDate fechaNacimiento = LocalDate.of(1990, 6, 2);
		
		Persona persona1 = new Persona(dni);
		
		
		persona1.setFechaNacimiento(fechaNacimiento);
		persona1.setAltura(1.73);
		persona1.setPeso(59);
		persona1.setEdad(30);
		persona1.setSexo("Masculino");
		persona1.setNombre("Joaquin");
		persona1.setApellido("Loiza");
		
		System.out.println("Nombre: "+persona1.getNombre()+" "+persona1.getApellido());
		System.out.println("Edad: "+persona1.getEdad());
		System.out.println("Dni: "+persona1.getDni());
		System.out.println("Fecha de nacimiento: "+persona1.getFechaNacimiento());
		System.out.println("Sexo: "+persona1.getSexo());
		System.out.println("Peso: "+persona1.getPeso());
		System.out.println("Altura: "+persona1.getAltura());
		
		System.out.println("\n"+"IMC: "+persona1.calcularImc());
		System.out.println("En forma: "+persona1.enForma());
		System.out.println("Es coherente la edad: "+persona1.esCoherente());
		System.out.println("Es cumpleaños hoy: "+persona1.esCumpleanios());
		System.out.println("Es mayor de edad: "+persona1.esMayor());
		System.out.println("Puede votar: "+persona1.esVotante());
		
	}
}
