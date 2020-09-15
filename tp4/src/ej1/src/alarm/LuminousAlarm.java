package alarm;

public class LuminousAlarm extends Alarm {
	private Light light1;
	
	public LuminousAlarm(Light light1, Bell bell1) {
		super(bell1);
		this.light1 = light1;
	}
	
	//checkea si el sonido esta activado, si es cierto prende la luz
	public void checkAlarm() {
		super.checkAlarm();
		if (super.bell1.isSounds()) {
			light1.turnOnLight();
			System.out.println("La luz esta encendida");
		}else {
			System.out.println("La luz esta apagada");
		}
	}
}
