
//Ej5

//Una empresa encargada de la comercialización de productos avícolas trabaja con tres tipos de productos: 

//productos frescos (huevos de gallina blancos y de color, huevos de codorniz, etc),
//productos refrigerados (pollos frescos, milanesas de pollo, de cerdo y de ternera, pollo arrollado, chorizos de cerdo, etc) 
//y productos congelados (hamburguesas, papas fritas, arvejas, granos de maíz, formas de pollo rebozadas, etc.)

//Todos los productos llevan esta información común: fecha de vencimiento y número de lote.

//A su vez, cada tipo de producto lleva alguna información específica.

//Los productos frescos deben llevar la fecha de envasado y la granja de origen. 
//Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento recomendada y la granja de origen.
//Los productos congelados deben llevar la fecha de envasado, el código del organismo de supervisión alimentaria, la granja de origen y la temperatura de mantenimiento recomendada.

//Hay tres tipos de productos congelados: congelados por aire, congelados por agua y congelados por nitrógeno.

// Los productos congelados por aire deben llevar la información de la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido de carbono y % de vapor de agua).
// Los productos congelados por agua deben llevar la información de la salinidad del agua con que se realizó la congelación en gramos de sal por litro de agua.
// Los productos congelados por nitrógeno deben llevar la información del método de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.

//Implementar los métodos necesarios para obtener cada uno de los atributos de un producto.
//Implementar un método que permita obtener la etiqueta de un producto (un String con la combinación de los atributos).

package ej5;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto produc1 = new Producto(LocalDate.of(2020, 06, 04), 9, LocalDate.of(2019, 04, 10), "ElLoiza");
		ProductoFrio producFrio1 = new ProductoFrio(LocalDate.of(2010, 03, 03), 2, LocalDate.of(2019, 05, 3),
				"TandilSA", 2342, 4.0);
		ProductoFrio cpAire1 = new CongeladoPorAire(LocalDate.of(2010, 03, 03), 2, LocalDate.of(2019, 05, 3),
				"TandilSA", 2342, 4.0, 60, 30, 70, 3);
		ProductoFrio cpAgua1 = new CongeladoPorAgua(LocalDate.of(2010, 03, 03), 2, LocalDate.of(2019, 05, 3),
				"TandilSA", 2342, 10, "Buena", "Frizado");
		ProductoFrio cpNitrogeno1 = new CongeladoPorNitrogeno(LocalDate.of(2010, 03, 03), 2, LocalDate.of(2019, 05, 3),
				"TandilSA", 2342, 4.0, "Frizado Rapido", 1.0);

		System.out.println(produc1.toString());
		System.out.println("\n");
		System.out.println(producFrio1.toString());
		System.out.println("\n");
		System.out.println(cpAire1.toString());
		System.out.println("\n");
		System.out.println(cpAgua1.toString());
		System.out.println("\n");
		System.out.println(cpNitrogeno1.toString());

	}

}
