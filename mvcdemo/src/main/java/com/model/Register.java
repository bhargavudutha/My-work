package com.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RegisterDetails")
public class Register {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
    
	@NotEmpty(message="Username should not be empty")
	private String username;

	@NotEmpty(message="Password should not be empty")
	private String password;
	
	@NotEmpty(message="Please select language")
	/*@Column(name="Column_name" , nullable=false)          it means it don't take null value */   
	private String languages;
	
	@NotEmpty(message="Please select gender")
	private String gender;
	
	
	@NotNull(message="Please select Date of Birth")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	/*@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)*/
	/*@Temporal(TemporalType.DATE)*/
	/*private Date dob;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}*/
	
	private Date dob;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@NotEmpty(message="Please select country")
	private String country;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
