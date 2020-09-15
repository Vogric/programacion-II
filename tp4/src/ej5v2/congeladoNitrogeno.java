package ej5p4_Avicola;
import java.time.LocalDate;
//import java.util.Date;
public class congeladoNitrogeno extends productoCongelado{
	
	String metodoCongelacion;
	int tiempoExposicion;
	
	
	public congeladoNitrogeno(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo,double temperaturaMantenimiento, String metodoCongelacion,int tiempoExposicion) {
		super(nombre,fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen,codOrganismo,temperaturaMantenimiento);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}

	
	
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ "----Metodo Congelacion: "+
				this.metodoCongelacion+"----Tiempo Exposicion: "+
				this.tiempoExposicion;
	};
	
	public String getEtiqueta() {
		return super.getEtiqueta()+ "----Metodo Congelacion: "+
				this.metodoCongelacion+"----Tiempo Exposicion: "+
				this.tiempoExposicion;
	}
	

}
