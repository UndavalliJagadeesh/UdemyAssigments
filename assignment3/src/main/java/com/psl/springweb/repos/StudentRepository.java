package com.psl.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.springweb.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
