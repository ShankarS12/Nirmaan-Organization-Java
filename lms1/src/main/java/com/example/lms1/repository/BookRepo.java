package com.example.lms1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lms1.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
	

}
