package com.example.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex1.entities.Student;
import com.example.ex1.repository.StdRepository;

@Service
public class StdService {
	
	@Autowired
	StdRepository SR;
	
	public String post(Student std) {
		SR.save(std);
		return "Added";
	}
	
	public List<Student> getall(){
		return SR.findAll();
	}
	
	public Student get(int id) {
		return SR.findById(id).get();
	}
	
	public String update(int id,Student std) {
		std.setId(id);
		SR.save(std);
		return "updated";
	}
	
	public String delete(int id) {
		SR.deleteById(id);
		return "Deleted";
	}

}
