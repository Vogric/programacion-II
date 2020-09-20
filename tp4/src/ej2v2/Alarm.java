package sensorialAlarm;
import java.util.ArrayList;


public class Alarm {
	private ArrayList <Sensor> sensores;
	protected Bell bell1;
	
	
	public Alarm (Bell bell1) {
		sensores = new ArrayList <Sensor>();
		this.bell1 = bell1;
	}
	
	public void addSensor(Sensor s1) {
		sensores.add(s1);
	}
	
	//checkea los sensores de la alarme si alguna esta en true, dispara la alarma
	public void checkAlarm() {
		ArrayList <Sensor> activated = new ArrayList<Sensor>();
		
		for (int i= 0; i <sensores.size(); i++) {
			Sensor sensor1 = this.sensores.get(i); //agarro el sensor sub i
			if (sensor1.isActivated()) {
				bell1.turnOnBell();
				activated.add(sensor1);
			}
		}
		if (!bell1.isSounds()) { //si el timbre no suena
			System.out.println("La alarma no ha sonado");
			
		}else { // si el timbre suena
			for (int i2=0 ; i2< activated.size(); i2++) {
				Sensor active = activated.get(i2);
				
				System.out.println("La alarma se disparo por movimientos en la zona del " +
				active.getName() + " de la casa");
			}
			
		}
	}

}
