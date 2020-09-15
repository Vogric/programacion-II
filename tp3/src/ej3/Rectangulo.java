package ej3;

public class Rectangulo {

	private PuntoGeometrico verticeA;
	private PuntoGeometrico verticeB;
	private PuntoGeometrico verticeC;
	private PuntoGeometrico verticeD;

	/**
	 * @param verticeA
	 * @param verticeB
	 * @param verticeC
	 * @param verticeD
	 */
	public Rectangulo(PuntoGeometrico verticeA, PuntoGeometrico verticeB, PuntoGeometrico verticeC,
			PuntoGeometrico verticeD) {
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
		this.verticeD = verticeD;
	}

	public PuntoGeometrico getVerticeA() {
		return verticeA;
	}

	public void setVerticeA(PuntoGeometrico verticeA) {
		this.verticeA = verticeA;
	}

	public PuntoGeometrico getVerticeB() {
		return verticeB;
	}

	public void setVerticeB(PuntoGeometrico verticeB) {
		this.verticeB = verticeB;
	}

	public PuntoGeometrico getVerticeC() {
		return verticeC;
	}

	public void setVerticeC(PuntoGeometrico verticeC) {
		this.verticeC = verticeC;
	}

	public PuntoGeometrico getVerticeD() {
		return verticeD;
	}

	public void setVerticeD(PuntoGeometrico verticeD) {
		this.verticeD = verticeD;
	}

	// Methods

	// Se trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
	public boolean esRectangulo() {
		return (verticeA.getX() == verticeC.getX() && verticeB.getX() == verticeD.getX()
				&& verticeA.getY() == verticeB.getY() && verticeC.getY() == verticeD.getY());
	}

	// ● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores
	// de X e Y.

	public void trasladarRectangulo(double x, double y) {
		verticeA.desplazarPP(x, y);
		verticeB.desplazarPP(x, y);
		verticeC.desplazarPP(x, y);
		verticeD.desplazarPP(x, y);
	}

	// ● Calcular el Área del rectángulo.

	public double calcularArea() {
		double base = verticeC.calcularDistanciaEuclidea(verticeD);
		double altura = verticeC.calcularDistanciaEuclidea(verticeA);
		return base * altura;
	}

	// ● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si
	// son
	// iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el
	// área
	// del mismo es mayor que la del otro.

	public int compararRectangulos(Rectangulo rectanguloA, Rectangulo rectanguloB) {
		double areaRectanguloA = rectanguloA.calcularArea();
		double areaRectanguloB = rectanguloB.calcularArea();

		if (areaRectanguloA > areaRectanguloB)
			return 1;
		else if (areaRectanguloA == areaRectanguloB)
			return 0;
		else
			return -1;
	}

//	public boolean esCuadrado() {
//		double a1 = verticeA.calcularDistanciaEuclidea(verticeB);
//		double a2 = verticeA.calcularDistanciaEuclidea(verticeC);
//		double d1 = verticeD.calcularDistanciaEuclidea(verticeB);
//		double d2 = verticeD.calcularDistanciaEuclidea(verticeC);
//
//		double ladosA1A2 = a1 * a2;
//		double ladosD1D2 = d1 * d2;
//
//		return ladosA1A2 + ladosD1D2;
//
//	}

}
