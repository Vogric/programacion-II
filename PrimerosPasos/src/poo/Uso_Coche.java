package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche renault = new Coche();
		
		renault.estableceColor("Azul");
		
		System.out.println(renault.dimeColor());
		
		Coche ford = new Coche();
		
		ford.estableceColor("Rojo");
		System.out.println(ford.dimeColor());
		
		
		Coche micoche = new Coche();
		micoche.estableceColor("marron");
		System.out.println(micoche.dimeColor());
		System.out.println(micoche.dimeDatosGenerales());
		
		micoche.configuraAsientos("Sí");
		System.out.println(micoche.dimeAsientos());
		

	}
	

}
