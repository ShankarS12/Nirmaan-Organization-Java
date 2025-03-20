package com.nirmaan.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.sms.entities.Student;
import com.nirmaan.sms.repository.StdRepository;



@Service
public class StdService {
	@Autowired
	StdRepository ER;
	
	public List<Student> getAll(){
		return ER.findAll();
	}
	
	public Student get(int id) {
		return ER.findById(id).get();
	}
	
	public String update(int id,Student std) {
		std.setId(id);
		ER.save(std);
		return "Updated";
	}
	
	public String post(Student std) {
		ER.save(std);
		return "Added";
	}

	public String delete(int id) {
		ER.deleteById(id);
		return "Deleted";
	}

}
