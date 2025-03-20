package com.nirmaan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.sms.entities.Student;

public interface StdRepository extends JpaRepository<Student, Integer>{

}
