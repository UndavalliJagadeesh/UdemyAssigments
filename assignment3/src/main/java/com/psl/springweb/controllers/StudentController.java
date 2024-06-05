package com.psl.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.psl.springweb.entities.Student;
import com.psl.springweb.repos.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return repo.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@RequestParam("id") int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping("/students")
	public int createStudent(@RequestBody Student student) {
		return repo.save(student).getId();
	}
	
	@PostMapping("/students")
	public int updateStudent(@RequestBody Student student) {
		return repo.save(student).getId();
	}
	
	@GetMapping("/students/{id}")
	public void deleteStudent(@RequestParam("id") int id) {
		repo.deleteById(id);
	}

}
