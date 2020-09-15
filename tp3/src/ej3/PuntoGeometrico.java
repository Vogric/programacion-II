package ej3;

public class PuntoGeometrico {
	private double x;
	private double y;

	/**
	 * @param x
	 * @param y
	 */
	public PuntoGeometrico() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// ● Desplazar el punto en el plano.
	// Se encarga de trasladar el punto a otra posición
	// del plano. Para esto se incrementan los valores de X e Y en una cierta
	// cantidad
	// (cierto desplazamiento en X y cierto desplazamiento en Y).

	public void desplazarPP(double x, double y) {
		this.x += x;
		this.y += y;
	}

	// ● Calcular la distancia euclídea.
	// Dado un punto es posible establecer la distancia euclídea con otro punto
	// acorde a la siguiente formula:
	// Distancia2
	// = ( X1 – X2 )
	// 2
	// + (Y1 – Y2)
	// 2

	public double calcularDistanciaEuclidea(PuntoGeometrico p2) {
		double punto1 = this.getX() - p2.getX();
		double punto2 = this.getY() - p2.getY();
		double distanciaAlCuadrado = Math.pow(punto1, 2) + Math.pow(punto2, 2);
		return Math.sqrt(distanciaAlCuadrado);
	}

}
