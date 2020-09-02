package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private int peso_total;
	private String color;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String dimeDatosGenerales() { //GETTER
		return 
				"La plataforma del vehiculo tiene: " +
				ruedas + " ruedas" +
				", mide " + largo/1000 + " metros con un ancho de " + ancho +
				"cm y un peso de plataforma de " + peso_plataforma + "kg"; 
	}
	public void estableceColor(String color_coche) { //SETTER
		color = color_coche;
	}
	public String dimeColor() { //GETTER
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) { //SETTER
		if(asientosCuero == "Sí") {
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero = false;
		}
		
	}
	public String dimeAsientos() { //GETTER
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero ";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
}
