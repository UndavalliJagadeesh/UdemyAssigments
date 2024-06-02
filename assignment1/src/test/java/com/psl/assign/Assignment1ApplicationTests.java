package com.psl.assign;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Assignment1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	SumOfTwo adder;
	
	@Test
	void testSumOfTwo() {
		int a = 7;
		int b = 9;
		
		assertEquals(16, adder.sumOfTwo(a, b));
	}

}
