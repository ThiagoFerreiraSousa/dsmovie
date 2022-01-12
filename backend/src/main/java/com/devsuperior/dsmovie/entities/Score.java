package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public void setMovie(Movie movie) {
		this.setMovie(movie);
	}
	
	public void setUser(User user) {
		this.setUser(user);
	}

}
