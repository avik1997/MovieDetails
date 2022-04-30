package com.jspider.moviedetails.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="movie_details")
public class Movie implements Serializable {
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	 
	@Column(name="movie_name")
	private String moviename;
	
	@Column(name="actor_name")
	private String actorname;
	
	@Column(name="actress_name")
	private String actressname;
	
	@Column(name="date")
	private String date;
	
	@Column(name="budget")
	private String budget;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Long id, String moviename, String actorname, String actressname, String date, String budget) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.actorname = actorname;
		this.actressname = actressname;
		this.date = date;
		this.budget = budget;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getActorname() {
		return actorname;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public String getActressname() {
		return actressname;
	}

	public void setActressname(String actressname) {
		this.actressname = actressname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", moviename=" + moviename + ", actorname=" + actorname + ", actressname="
				+ actressname + ", date=" + date + ", budget=" + budget + "]";
	}

	

}
