package com.example.ex1.controller;

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

import com.example.ex1.entities.Student;
import com.example.ex1.service.StdService;

@RestController
@RequestMapping("section")
public class StdController {
	
	@Autowired
	StdService SS;
	
	@PostMapping("post")
	public String post(@RequestBody Student std) {
		return SS.post(std);
	}
	
	@GetMapping("getall")
	public List<Student> getall(){
		return SS.getall();		
	}
	
	@GetMapping("get/{id}")
	public Student get(@PathVariable int id) {
		return SS.get(id);
	}
	
	@PutMapping("put/{id}")
	public String put(@PathVariable int id, @RequestBody Student std) {
		return SS.update(id, std);
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return SS.delete(id);
	}

}
