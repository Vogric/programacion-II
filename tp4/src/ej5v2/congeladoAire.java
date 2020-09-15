package ej5p4_Avicola;
import java.time.LocalDate;
//import java.util.Date;
public class congeladoAire extends productoCongelado {
	
	String infoComposicionAire;
	
	public congeladoAire(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo,double temperaturaMantenimiento, String infoComposicionAire) {
		super(nombre,fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen,codOrganismo,temperaturaMantenimiento);
		this.infoComposicionAire = infoComposicionAire;
	}
	
	

	public String getInfoComposicionAire() {
		return infoComposicionAire;
	}

	public void setInfoComposicionAire(String infoComposicionAire) {
		this.infoComposicionAire = infoComposicionAire;
	}
	
	@Override
	public String toString() {
		return super.toString()+"----Info de composicion de aire: "+this.infoComposicionAire;
	}
	
	public String getEtiqueta() {
		return super.getEtiqueta()+"----Info de composicion de aire: "+this.infoComposicionAire;
	}
	

	
		
	
	
}
