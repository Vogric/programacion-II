package ej4;
import java.util.ArrayList;

public class Season {
	ArrayList <Episode> episodes;
	String name;
	
	
	public Season(String name) {
		this.episodes = new ArrayList<Episode>();
		this.name = name;
	}
	
	
	//agregar episodios
	public void addEpisode(Episode ep) {
		this.episodes.add(ep);
	}
	
	//FUNCIONALIDADES
	
	//cuenta los episodios vistos por temporada
	public int countSeen() {
		int seenEpisodes = 0;
		for(int i = 0; i < this.episodes.size(); i++ ) {
			if (episodes.get(i).isFlag()) {
				seenEpisodes++;
			}		
		}
		return seenEpisodes;
	}
	
	//Promedio de calificaciones de temporada
	public double rankAverage() {
		double seenEpisodes = 0;
		double rank = 0;
		for(int i = 0; i < this.episodes.size(); i++ ) {
			if (episodes.get(i).isFlag()) {
				rank += episodes.get(i).getQualification();
				seenEpisodes++;
			}		
		}
		return (rank/seenEpisodes);
	}
	
	//verifica si se vio toda la temporada
	public boolean isAllViewed() {
		for (Episode episode: this.episodes) {
			if (!episode.isFlag()) 
				return false;
		}
		return true;
	
	}

	public ArrayList<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(ArrayList<Episode> episodes) {
		this.episodes = episodes;
	}
	
	
}
