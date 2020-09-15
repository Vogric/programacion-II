package ej5;

public class Cliente {
	private String nombre;
	private int telefono;
	private String mail;

	public Cliente(int telefono, String mail) {

		this.telefono = telefono;
		this.mail = mail;

	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getMail() {
		return mail;
	}

	public void elegirPeluquero() {

	}

//	Los clientes al solicitar un turno indican con cuál peluquero se desean cortar. 

//	A los clientes frecuentes se les descuenta un 10%. 
//	Se considera cliente frecuente al que saca turno al menos una vez por mes.
}
