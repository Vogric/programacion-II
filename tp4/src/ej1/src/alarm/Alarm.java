package alarm;

public class Alarm {

	private boolean brokenGlass;
	private boolean openedWindow;
	private boolean openedDoor;
	private boolean movement;
	protected Bell bell1;
	
	
	public Alarm (Bell bell1) {
		brokenGlass = false;
		openedWindow = false;
		openedDoor = false;
		movement = false;
		this.bell1 = bell1;
	}
	
	//GETTER Y SETTER
	public boolean isBrokenGlass() {
		return brokenGlass;
	}

	public void setBrokenGlass(boolean brokenGlass) {
		this.brokenGlass = brokenGlass;
	}

	public boolean isOpenedWindow() {
		return openedWindow;
	}

	public void setOpenedWindow(boolean openedWindow) {
		this.openedWindow = openedWindow;
	}

	public boolean isOpenedDoor() {
		return openedDoor;
	}

	public void setOpenedDoor(boolean openedDoor) {
		this.openedDoor = openedDoor;
	}

	public boolean isMovement() {
		return movement;
	}

	public void setMovement(boolean movement) {
		this.movement = movement;
	}

	//checkea las variables de la alarme si alguna esta en true, dispara la alarma
	public void checkAlarm() {
		if (brokenGlass || openedWindow || openedDoor || movement ) {
			System.out.println("La alarma se disparo");
			bell1.turnOnBell();
		}else {
			System.out.println("No se han detectado movimientos en la casa");
		}
	}
}
