package ej4;
import java.util.ArrayList;

public class Serie {
	private ArrayList<Season> seasons;
	private String title;
	private String description;
	private String creator;
	private String gender;
	
	
	public Serie (String title, String description, 
			String creator, String gender) {
		this.seasons = new ArrayList<Season>();
		this.title = title;
		this.description = description;
		this.creator = creator;
		this.gender = gender;
	}
	
	
	//agrega temporadas a la serie
	public void addSeasons(Season sea1) {
		this.seasons.add(sea1);
	}
	
	public Serie (ArrayList<Season> seasons, String title, String description, 
			String creator, String gender) {
		this.seasons = seasons;
		this.title = title;
		this.description = description;
		this.creator = creator;
		this.gender = gender;
	}
	
	//cuenta los episodios vistos por serie
	public int countEpisodesSeason() {
		int seenEpSeason=0;
		for (Season season: this.seasons) {
			seenEpSeason += season.countSeen();
		}
		return seenEpSeason;
	}
	
	//promedio de calificaciones de la serie
	public double rankSeason() {
		double rankSeason = 0;
		for (Season season: this.seasons) {
			rankSeason += season.rankAverage();
		}
		return rankSeason/(this.seasons.size());
	}
	
	
	//verificar si se vio toda la serie
	public boolean isAllViewed() {
		for (Season season: this.seasons) {
			if (!season.isAllViewed()) 
				return false;
		}
		return true;
	}


	public ArrayList<Season> getSeasons() {
		return seasons;
	}


	public void setSeasons(ArrayList<Season> seasons) {
		this.seasons = seasons;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCreator() {
		return creator;
	}


	public void setCreator(String creator) {
		this.creator = creator;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
