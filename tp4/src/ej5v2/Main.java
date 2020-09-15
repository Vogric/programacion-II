package ej5p4_Avicola;
//import java.util.Date;
import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		LocalDate fechaV = LocalDate.of(2021,5,2);
		LocalDate fechaE = LocalDate.of(2020,2,12);
		
		Producto p1 = new congeladoAgua("Productardo",fechaV,1,fechaE,"Granja fresca",1,2.3,10);
		
		String etiqueta = p1.getEtiqueta();
		System.out.println(etiqueta);
		
		String toString = p1.toString();
		System.out.println(toString);
		
	}

}
