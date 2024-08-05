package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	
	AreaCalculator calculator;
	
	@BeforeEach
	void init()
	{
		calculator=new AreaCalculator();
	}
	
	@Test
	void testCalculateAreaOfCircle()
	{
		assertEquals(78.5,calculator.calculateAreaOfCircle(5));
		
	
	}
	
	@Test
	void testCalculateAreaOfRectangle()
	{
		assertEquals(25, calculator.calculateAreaOfRectangle(5, 5));
	}
	
	@Test
	void testCalculateAreaOfTriangle()
	{
		fail("unimplemented");
	}

}
