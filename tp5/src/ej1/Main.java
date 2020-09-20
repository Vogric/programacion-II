//1 - Pila de elementos

//Implementar en Java una colección para almacenar una pila de elementos. 

//A esta colección se le pueden agregar elementos utilizando el método push(Object o). 
//Para retirar elementos de la colección se utiliza el método pop(), que retorna el último elemento agregado a la colección y lo elimina de la misma.
//Es posible consultar el tope de la pila sin eliminarlo utilizando el método top().
//La mencionada anteriormente es la única forma de consultar y retirar elementos de la colección, es decir, no se pueden obtener ni consultar
//elementos de otra posición que no sea el tope de la pila. 

//Definir también los siguientes métodos:
//● size(): retorna la cantidad de elementos almacenados
//● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en el mismo orden. 
//La pila original debe mantener el orden de los elementos.
//● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso.

package ej1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		System.out.println(stack.pop());
		System.out.println(stack.);

	}

}
