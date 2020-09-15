package ej4v2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie serie1 = new Serie("TituloSerie1", "Descripcion Serie1", "Creador Serie1", "Genero Serie1");
		Temporada temp1 = new Temporada();
		// Temporada temp2 = new Temporada();
		Episodio ep1 = new Episodio("TituloEp1", "Descripcion Ep1", false);
		Episodio ep2 = new Episodio("TituloEp2", "Descripcion Ep2", false);
		Episodio ep3 = new Episodio("TituloEp3", "Descripcion Ep3", false);

		serie1.agregarTemporada(temp1);
		// serie1.agregarTemporada(temp2);
		temp1.agregarEpisodio(ep1);
		temp1.agregarEpisodio(ep2);
		temp1.agregarEpisodio(ep3);

		// Calificacion
		enviarCalificacion(ep1, 5);
		enviarCalificacion(ep2, 3);
		enviarCalificacion(ep3, 1);

		// Obtener el total episodios vistos de una temporada particular.
		System.out.println(temp1.toString());

		// Obtener el total de episodios vistos de una serie.
		System.out.println(serie1.toString());

	}

	public static void enviarCalificacion(Episodio e, int calif) {
		if (e.calificar(calif) == false) {
			System.out.println("La calificacion no es correcta");
		}
	}
}
