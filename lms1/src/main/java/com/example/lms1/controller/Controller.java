package com.example.lms1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lms1.entity.Book;
import com.example.lms1.repository.BookRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("section")
public class Controller {
	
	@Autowired
	BookRepo BR;
	
	@GetMapping("sec1")
	public String getMethodName() {
		return "shankar";
	}
	
	@GetMapping("sec2")
	public List<Book> getAll() {
		return BR.findAll();	
	}
	@GetMapping("sec3/{id}")
	public Book get(@PathVariable int id) {
		return BR.findById(id).get();	
	}
	
	@PostMapping
	public String addBook(@RequestBody Book book) {
		BR.save(book);
		return "Success";
	}
	@PutMapping("/sec4/{id}")
	public String updateBook(@PathVariable int id,@RequestBody Book book) {
		book.setId(id);
		BR.save(book);
		return "Success";
		
	}
	@DeleteMapping("/sec5/{id}")
	public String deleteBook(@PathVariable int id) {
		BR.deleteById(id);
		return "Deleted";
	}
	
	

}
