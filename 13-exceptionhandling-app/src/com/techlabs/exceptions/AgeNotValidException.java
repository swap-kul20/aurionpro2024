package com.techlabs.exceptions;

public class AgeNotValidException extends RuntimeException {
	
	private int age;
	
	
	public AgeNotValidException(int age) {
		
		this.age = age;
	}


	public String getMessage()
	{
		return "Age can not be less than 18. Yo have entered : "+age;
	}

}
