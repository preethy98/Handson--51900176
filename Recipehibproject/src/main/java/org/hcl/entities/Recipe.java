package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name,description,cookingnotes;
	public Recipe() {
		// TODO Auto-generated constructor stub
	}
	public Recipe(Integer id, String name, String description, String cookingnotes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cookingnotes = cookingnotes;
	}
	public Integer getId() {
		return id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCookingnotes() {
		return cookingnotes;
	}
	public void setCookingnotes(String cookingnotes) {
		this.cookingnotes = cookingnotes;
	}
	

}
