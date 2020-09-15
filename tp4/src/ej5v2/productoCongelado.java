package ej5p4_Avicola;

//import java.util.Date;
import java.time.LocalDate;

public class productoCongelado extends Producto {
	
	int codOrganismo;
	double temperaturaMantenimiento;
	
	public productoCongelado(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,String granjaOrigen, int codOrganismo, double temperaturaMantenimiento) {
		super(nombre,fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen);
		this.codOrganismo = codOrganismo;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	
	
	public int getCodOrganismo() {
		return codOrganismo;
	}
	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
	}
	public double getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}
	public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}
	
	@Override
	public String toString() {
		return super.toString()+"----Codigo Organismo: "+
				this.codOrganismo+"----Temperatura de Mantenimiento: "+
				this.temperaturaMantenimiento;
	}
	

	public String getEtiqueta() {
		return super.getEtiqueta()+"----Codigo Organismo: "+
				this.codOrganismo+"----Temperatura de Mantenimiento: "+
				this.temperaturaMantenimiento;
	}
	

	
	
}
