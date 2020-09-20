package sensorialAlarm;

public class Main {
	public static void main (String []args) {
		
		//ALARMA COMUN
		Bell bell2 = new Bell();
		Alarm alarm2 = new Alarm(bell2);
		
		Sensor sensorOne = new Sensor("patio");
		Sensor sensorTwo = new Sensor("antesala");
		Sensor sensorThree = new Sensor ("quincho");
		
		alarm2.addSensor(sensorOne);
		alarm2.addSensor(sensorTwo);
		alarm2.addSensor(sensorThree);
		
		sensorOne.setActivated(true);
		sensorTwo.setActivated(true);
		sensorThree.setActivated(true);
		
		alarm2.checkAlarm();
		
		//ALARMA LUMINOSA
//		
//		Bell bell1 = new Bell();
//		Light light1 = new Light();
//		LuminousAlarm alarm1 = new LuminousAlarm(light1, bell1);
//		
//		Sensor sensor1 = new Sensor("living");
//		Sensor sensor2 = new Sensor ("cocina");
//		Sensor sensor3 = new Sensor ("dormitorio");
//		Sensor sensor4 = new Sensor ("garage");
//		
//		alarm1.addSensor(sensor1);
//		alarm1.addSensor(sensor2);
//		alarm1.addSensor(sensor3);
//		alarm1.addSensor(sensor4);
//		
//		sensor1.setActivated(false);
//		sensor2.setActivated(true);
//		sensor3.setActivated(false);
//		sensor4.setActivated(true);
//		
//		alarm1.checkAlarm();
//		
	}

}
