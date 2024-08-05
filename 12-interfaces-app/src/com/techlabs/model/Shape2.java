package com.techlabs.model;

public interface Shape2 {
	
	default void volume()
	{
		System.out.println("Inside Shape Volume");
	}

}
