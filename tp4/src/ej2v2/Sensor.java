package sensorialAlarm;

public class Sensor {
	private String name;
	private boolean isActivated;
	
	
	public Sensor(String name) {
		this.name = name;
		isActivated = false;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//Verifica el movimiento en la zona que sondea
	public boolean isActivated() {
		return isActivated;
	}


	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	
}
