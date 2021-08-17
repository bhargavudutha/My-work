package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_jpa")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id",length=5)
	private Integer id;
	@Column(name="user_name",length=20)
	private String name;
	public Integer getId() {
		return id;
	}
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
