package com.nirmaan.sms.controller;

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


import com.nirmaan.sms.entities.Student;
import com.nirmaan.sms.service.StdService;

@RestController
@RequestMapping("student")
public class StdController {
	
	@Autowired
	StdService ES;
	
	@GetMapping("g")
	public String get(){
		return "helo";
	}
	
	@GetMapping("getall")
	public List<Student> getAll(){
		return ES.getAll();
	}
	
	@GetMapping("get/{id}")
	public Student get(@PathVariable int id) {
		return ES.get(id);
	}
	
	@PostMapping("post")
	public String post(@RequestBody Student emp) {
		ES.post(emp);
		return "Added";
	}
	
	@PutMapping("update/{id}")
	public String update(@PathVariable int id,@RequestBody Student emp) {
		 ES.update(id, emp);
		 return "Updated";
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		 ES.delete(id);
		 return "Deleted";
	}
	
	
	

}
