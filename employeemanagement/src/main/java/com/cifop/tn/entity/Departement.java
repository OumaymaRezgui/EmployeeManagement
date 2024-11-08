package com.cifop.tn.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Departement {
    @Id
    @GeneratedValue
    private long id;
    private String name;
	public Departement(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Departement() {
		super();
	}  

	
}