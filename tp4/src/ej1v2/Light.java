package alarm;

public class Light {
	private boolean inLight;
	
	
	public Light() {
		inLight = false;
	}
	
	//enciende la luz
	public void turnOnLight() {
		inLight = true;
	}

	public boolean isInLight() {
		return inLight;
	}
	
}
