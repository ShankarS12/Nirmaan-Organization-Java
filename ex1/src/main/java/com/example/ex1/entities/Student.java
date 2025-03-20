package com.example.ex1.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id")
	StdAddress stdAddress;
	
	public Student() {
		super();
	}

	public StdAddress getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(StdAddress stdAddress) {
		this.stdAddress = stdAddress;
	}

	public Student(int id, String name, StdAddress stdAddress) {
		super();
		this.id = id;
		this.name = name;
		this.stdAddress = stdAddress;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
