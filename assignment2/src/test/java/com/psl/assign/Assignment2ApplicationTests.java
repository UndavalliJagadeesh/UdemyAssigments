package com.psl.assign;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.psl.assign.entity.Student;
import com.psl.assign.repo.StudentRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class Assignment2ApplicationTests {
	
	@Autowired
	StudentRepository repo;

	@Test
	@Order(1)
	void testCreateStudent() {
		Student student = new Student();
		student.setId(121);
		student.setName("John");
		student.setTestScore(97.2);
		
		repo.save(student);
		
		assertNotNull(repo.findById(121));
	}
	
	@Test
	@Order(2)
	void testUpdateStudent() {
		Student student = new Student();
		student.setId(121);
		student.setName("Johnathon");
		student.setTestScore(97.2);
		
		repo.save(student);
		
		assertEquals("Johnathon", repo.findById(121).get().getName());
	}
	
	@Test
	@Order(3)
	void testDeleteStudent() {
		repo.deleteById(121);
//		assertNull(repo.findById(121).get());
		assertEquals(0,repo.findAll().size());
	}

}
