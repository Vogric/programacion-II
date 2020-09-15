package ej4;
public class Main {

	public static void main(String[] args) {
		Serie TheOutlander = new Serie("The Outlander", "Una persona extranjera", "RP", "drama");
		Season season1 = new Season("The Beggining");

		TheOutlander.addSeasons(season1);

		Episode episode1 = new Episode("The man", "About him");
		Episode episode2 = new Episode("The land", "Where was him");
		Episode episode3 = new Episode("The world", "His context");

		episode1.qualifyEpisode(4);
		episode1.setFlag(true);
		episode2.qualifyEpisode(5);
		episode2.setFlag(true);
		episode3.qualifyEpisode(3);
		episode3.setFlag(true);

		season1.addEpisode(episode1);
		season1.addEpisode(episode2);
		season1.addEpisode(episode3);

		System.out.println("La temporada uno tiene " + season1.countSeen() + " episodios vistos");
		System.out.println("Una calificacion de " + season1.rankAverage());

		if (season1.isAllViewed()) {
			System.out.println("La temporada ha sido visto completa");
		} else {
			System.out.println("La temporada aun no se ha vista completa");
		}

		Season season2 = new Season("The end");

		TheOutlander.addSeasons(season2);

		Episode episode1_s2 = new Episode("His life", "AAAAAA");
		Episode episode2_s2 = new Episode("His family", "AAAAA");
		Episode episode3_s2 = new Episode("His love", "AAAA");

		season2.addEpisode(episode1_s2);
		season2.addEpisode(episode2_s2);
		season2.addEpisode(episode3_s2);

		Serie GOT = new Serie("Game of Thrones", " Juego de tronos ", "George RR Martin", "Ficcion");
		GOT.addSeasons(season1);
		GOT.addSeasons(season2);

		System.out.println("La serie " + GOT.getTitle() + " tiene " + GOT.countEpisodesSeason() + " episodios vistos");
		System.out.println("La serie " + GOT.getTitle() + " tiene una calificacion promedio de: " + GOT.rankSeason());
		System.out.println("La serie " + GOT.getTitle() + " se vio entera? " + GOT.isAllViewed());

	}

}
