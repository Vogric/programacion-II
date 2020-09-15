package alarm;

public class Main {
	public static void main (String[]args) {
		//creo el timbre que le paso como parametro a la alarma
		
		Bell bell1 = new Bell();
		Alarm alarm1 = new Alarm(bell1);
		
		alarm1.setBrokenGlass(true);
		alarm1.setMovement(true);
		
		alarm1.checkAlarm();
		
		alarm1.setBrokenGlass(false);
		alarm1.setMovement(false);
		
		alarm1.checkAlarm();
		
	}
	
	

	
	 
}
