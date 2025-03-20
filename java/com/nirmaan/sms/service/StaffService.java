package com.nirmaan.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nirmaan.sms.entities.Staff;
import com.nirmaan.sms.entities.Student;
import com.nirmaan.sms.repository.StaffRepository;
import com.nirmaan.sms.repository.StdRepository;

public class StaffService {
	@Autowired
	StaffRepository SR;
	
	public List<Staff> getAll(){
		return SR.findAll();
	}
	
	public Staff get(int id) {
		return SR.findById(id).get();
	}
	
	public String update(int id,Staff std) {
		std.setId(id);
		SR.save(std);
		return "Updated";
	}
	
	public String post(Staff std) {
		SR.save(std);
		return "Added";
	}

	public String delete(int id) {
		SR.deleteById(id);
		return "Deleted";
	}

}
