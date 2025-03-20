package com.nirmaan.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Book")
public class Controller {
	
	@GetMapping("Bookdisp")
	public String[] display() {
		String[] name = {"Shankar","Surya"};
		return name;
	}
	
	@GetMapping("Bookdisp1")
	public int num() {
		int num = 1;
		return num;
	}
	
	@PutMapping("Bookput")
	public void disp() {
		System.out.println("Ranjith");
	}
	

}
