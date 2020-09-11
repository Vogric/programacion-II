package Electrodomesticos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico electro = new Electrodomestico();

		System.out.println(electro.getNombre());
		System.out.println(electro.getColor());
		System.out.println(electro.getConsumEnerg());
		System.out.println(electro.getPrecioBase());
		System.out.println(electro.getPeso());
		System.out.print("\n");

		Electrodomestico electro1 = new Electrodomestico("Electro1", "Rojo", 30, 5, 10);

		System.out.println(electro1.getNombre());
		System.out.println(electro1.getColor());
		System.out.println(electro1.getConsumEnerg());
		System.out.println(electro1.getPrecioBase());
		System.out.println(electro1.getPeso());
		System.out.println(electro1.comprobarConsumo());
		System.out.println(electro1.calcularBalance());
		System.out.println(electro1.calcularGama());
		System.out.print("\n");

		Electrodomestico electro2 = new Electrodomestico("Electro2", "Azul", 6000, 234234, 234234);

		electro2.setConsumEnerg(45);

		System.out.println(electro2.getNombre());
		System.out.println(electro2.getColor());
		System.out.println(electro2.comprobarConsumo());
		System.out.println(electro2.calcularBalance());
		System.out.println(electro2.calcularGama());

	}

}
