package ej5p4_Avicola;

//import java.util.Date;
import java.time.LocalDate;

public class Producto {
	
	String nombre;
	LocalDate fechaVencimiento;
	int nroLote;
	LocalDate fechaEnvasado;
	String granjaOrigen;
	
	public Producto(String nombre,LocalDate fechaVencimiento,int nroLote, LocalDate fechaEnvasado,String granjaOrigen){
		this.nombre = nombre;
		this.fechaVencimiento = fechaVencimiento;
		this.nroLote = nroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}
	

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getNroLote() {
		return nroLote;
	}
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	@Override
	public String toString() {
		return 	"----Nombre: "+this.nombre+
				"----Fecha de Vencimiento: "+this.fechaVencimiento+
				"----Nro. Lote: "+this.nroLote+
				"----Fecha Envasado: "+this.fechaEnvasado+
				"----Granja de Origen: "+this.granjaOrigen;
	}

	public String getEtiqueta() {
		return "----Nombre: "+this.nombre+
				"----Fecha de Vencimiento: "+this.fechaVencimiento+
				"----Nro. Lote: "+this.nroLote+
				"----Fecha Envasado: "+this.fechaEnvasado+
				"----Granja de Origen: "+this.granjaOrigen;
	}
	

	
	

}
