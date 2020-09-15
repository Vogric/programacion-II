package ej5p4_Avicola;
//import java.util.Date;
import java.time.LocalDate;
public class congeladoAgua extends productoCongelado{
	
	int salinidad;
	

	public congeladoAgua(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo,double temperaturaMantenimiento, int salinidad) {
		super(nombre,fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen,codOrganismo,temperaturaMantenimiento);
		this.salinidad = salinidad;
	}
	


	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"----Salinidad: "+this.salinidad;
	}
	

	public String getEtiqueta() {
		return super.getEtiqueta()+"----Salinidad: "+this.salinidad;
	}
	
	
	

}
