package com.nirmaan.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.ems.entities.Employee;
import com.nirmaan.ems.service.EmpService;

@RestController
@RequestMapping("section")
public class EmpController {
	
	@Autowired
	EmpService ES;
	
	@GetMapping("g")
	public String get(){
		return "helo";
	}
	
	@GetMapping("getall")
	public List<Employee> getAll(){
		return ES.getAll();
	}
	
	@GetMapping("get/{id}")
	public Employee get(@PathVariable int id) {
		return ES.get(id);
	}
	
	@PostMapping("post")
	public String post(@RequestBody Employee emp) {
		ES.post(emp);
		return "Added";
	}
	
	@PutMapping("update/{id}")
	public String update(@PathVariable int id,@RequestBody Employee emp) {
		 ES.update(id, emp);
		 return "Updated";
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		 ES.delete(id);
		 return "Deleted";
	}
	

}
