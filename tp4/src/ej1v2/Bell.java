package alarm;

public class Bell {
	private boolean sounds;
	
	public Bell() {
		sounds = false;
	}
		
	//enciende el sonido
	public void turnOnBell() {
		this.sounds = true;
	}

	public boolean isSounds() {
		return sounds;
	}
}
