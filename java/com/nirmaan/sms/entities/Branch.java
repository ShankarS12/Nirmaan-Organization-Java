package com.nirmaan.sms.entities;

import jakarta.persistence.Entity;

@Entity
public class Branch {
	private int id;
	private String location;
	
	
	public Branch(int id, String location) {
		super();
		this.id = id;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
