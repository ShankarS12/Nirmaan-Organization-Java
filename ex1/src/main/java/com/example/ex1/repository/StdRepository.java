package com.example.ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ex1.entities.Student;

@Repository
public interface StdRepository extends JpaRepository<Student, Integer>{

}
