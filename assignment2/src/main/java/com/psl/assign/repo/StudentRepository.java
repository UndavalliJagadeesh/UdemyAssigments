package com.psl.assign.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.assign.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
