//1 - Alarm
//Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
//la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
//sonora.
//Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
//encienda una luz cuando alguno de los indicadores está activado.
//Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
//método encender().

package ej2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alarma alarma1 = new Alarma(false, false, false, null);

		alarma1.setDetectoMovimiento(true);
		alarma1.setAbrioPuertaOVentana(true);
		alarma1.setVidrioRoto(true);

		Alarma alarma2 = new Alarma(false, false, false, null);

		alarma2.setDetectoMovimiento(false);
		alarma2.setAbrioPuertaOVentana(false);
		alarma2.setVidrioRoto(false);

		Alarma alarma3 = new Alarma(false, false, false, null);

		alarma3.setDetectoMovimiento(false);
		alarma3.setAbrioPuertaOVentana(false);
		alarma3.setVidrioRoto(true);

		Alarma alarma4 = new AlarmaLuminosa(false, false, false, null, null);

		alarma4.setDetectoMovimiento(false);
		alarma4.setAbrioPuertaOVentana(false);
		alarma4.setVidrioRoto(true);

		System.out.println("Checkear alarma 1");
		alarma1.comprobar();

		System.out.println("Checkear alarma 2");
		alarma2.comprobar();

		System.out.println("Checkear alarma 3");
		alarma4.comprobar();
	}

}
