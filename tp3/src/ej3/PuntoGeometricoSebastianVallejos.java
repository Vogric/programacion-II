//Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.

public class puntoGeometrico {
	private int x;
	private int y;
	
//CONSTRUCTOR por defecto de los mismos es (0,0)
public puntoGeometrico(){
	this.x=0;
	this.y=0;
}
//CONSTRUCTOR para cualquier x o y
public puntoGeometrico(int x, int y) {
	this.x = x;
	this.y = y;
}

//FUNCIONALIDAD
//1-Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
//del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
//(cierto desplazamiento en X y cierto desplazamiento en Y).
public void desplazar(int deltaX,int deltaY){
	this.x+=deltaX;
	this.y+=deltaY;
	}

//Calcular la distancia euclídea. Dado un punto es posible establecer la distanciaeuclídea 
//con otro punto acorde a la siguiente formula:
//Distancia2= ( X 1 –X 2 )2+ (Y 1 –Y 2 )2
public double distancia(puntoGeometrico otroPuntoGeometrico){
	int difX= (this.getX()-otroPuntoGeometrico.getX())*(this.getX()-otroPuntoGeometrico.getX());
	int difY = (this.getY()-otroPuntoGeometrico.getY())*(this.getY()-otroPuntoGeometrico.getY());
	double distancia = Math.sqrt(difX+difY);
	return distancia;
	
	}

//IMPRIMIR EN FORMA DE PUNTO
public String toString(){
	return "("+this.x + "," + this.y+")";
	}

public int getX(){
	return this.x;
	}

public void setX(int x) {
	this.x = x;
	}
public int getY() {
	return y;
	}
public void setY(int y) {
	this.y = y;
 	}

}
