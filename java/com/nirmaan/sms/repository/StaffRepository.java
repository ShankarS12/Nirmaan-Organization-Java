package com.nirmaan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.sms.entities.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
