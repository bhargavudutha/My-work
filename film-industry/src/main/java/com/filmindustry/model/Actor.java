package com.filmindustry.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "my_actor")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String name;
	private float Remuneration;

	@JsonManagedReference
	@OneToMany(mappedBy = "actor", cascade = { CascadeType.ALL }) // variable in address class-bidirectional
	private List<Movies> movies;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRemuneration() {
		return Remuneration;
	}

	public void setRemuneration(float remuneration) {
		Remuneration = remuneration;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	public Actor() {
		super();
	}

	public Actor(Integer id, String name, float remuneration, List<Movies> movies) {
		super();
		Id = id;
		this.name = name;
		Remuneration = remuneration;
		this.movies = movies;
	}

}
