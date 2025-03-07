package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {

	Operations operations;
	
	@BeforeEach
	void init()
	{
	     operations=new Operations();
	}
	
	@AfterEach
	void status()
	{
		System.out.println("Test executed");
	}
	
	@Test
	void testAddition() {
	
		assertEquals(10, operations.addition(7, 5),"This function must do addition");
		
	}
	@Test
	void testSubstraction() {
		
		
		assertEquals(0, operations.substraction(2, 2),"This function must do substraction");
		
	}
	@Test
	void testMultiplication() {
		
		
		
		assertEquals(4, operations.multiplication(2, 2),"This function must do multiplication");
		assertEquals(6, operations.multiplication(3, 2),"This function must do multiplication");
		assertEquals(6, operations.multiplication(2, 3),"This function must do multiplication");
		
	}
	
	@Test
	void testDivision() {	
		
		
		assertEquals(2, operations.division(6, 3),"This function must do division");
		
		assertThrows(ArithmeticException.class, ()->operations.division(6, 0));
		
	}
	
	
	@Test
	void testIsEven() {	
		
		assertTrue(operations.isEven(6));
		
	}

}
