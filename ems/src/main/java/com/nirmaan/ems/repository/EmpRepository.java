package com.nirmaan.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.ems.entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
