package com.nirmaan.sms.service;

import java.util.List;

import com.nirmaan.sms.entities.Branch;
import com.nirmaan.sms.entities.Student;
import com.nirmaan.sms.repository.BranchRepository;
import com.nirmaan.sms.repository.StdRepository;

public class BranchService {
	BranchRepository BR;
	
	public List<Branch> getAll(){
		return BR.findAll();
	}
	
	public Branch get(int id) {
		return BR.findById(id).get();
	}
	
	public String update(int id,Branch std) {
		std.setId(id);
		BR.save(std);
		return "Updated";
	}
	
	public String post(Branch std) {
		BR.save(std);
		return "Added";
	}

	public String delete(int id) {
		BR.deleteById(id);
		return "Deleted";
	}

}
