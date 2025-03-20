package com.example.ex1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StdAddress {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String state;
	private String district;
	@OneToOne(mappedBy = "stdAddress")
	@JsonIgnore
	Student std; 
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public StdAddress(int id, String state, String district, Student std) {
		super();
		this.id = id;
		this.state = state;
		this.district = district;
		this.std = std;
	}
	public StdAddress() {
		super();
	}
	public StdAddress(int id, String state, String district) {
		super();
		this.id = id;
		this.state = state;
		this.district = district;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
}
