package com.example.formregis;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan")
public class Viewloan {
    @Id
    private Long id;
    private String username;
    // other fields and getters/setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Viewloan(Long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public Viewloan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

