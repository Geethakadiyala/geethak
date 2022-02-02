package com.spring.bookmydr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bookmydr.entity.Doctor;

public interface  DoctorRepository extends JpaRepository<Doctor,Integer> {
	
	
}


