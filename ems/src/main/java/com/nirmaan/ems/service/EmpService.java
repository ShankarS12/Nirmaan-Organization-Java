package com.nirmaan.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.ems.entities.Employee;
import com.nirmaan.ems.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository ER;
	
	public List<Employee> getAll(){
		return ER.findAll();
	}
	
	public Employee get(int id) {
		return ER.findById(id).get();
	}
	
	public String update(int id, Employee emp) {
		emp.setId(id);
		ER.save(emp);
		return "Updated";
	}
	
	public String post(Employee emp) {
		ER.save(emp);
		return "Added";
	}

	public String delete(int id) {
		ER.deleteById(id);
		return "Deleted";
	}
}
