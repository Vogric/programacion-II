package ej4;

public class Episode {
	String title;
	String description;
	boolean flag;
	int qualification;

	public Episode(String title, String description) {
		this.title = title;
		this.description = description;
		flag = false;
		qualification = -1;
	}

	public Episode(String title, String description, boolean flag, int qualification) {
		this.title = title;
		this.description = description;
		this.flag = flag;
		this.qualification = qualification;
	}

	// FUNCIONALIDADES

	public void qualifyEpisode(int qualification) {
		if ((this.qualification >= 1) && (this.qualification <= 5)) {
			this.flag = true;
		} else {
			System.out.println("La puntuacion esta fuera del rango de 1 a 5");
		}
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

	// verifica si esta visto o no el episodio
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getQualification() {
		return qualification;
	}

}
