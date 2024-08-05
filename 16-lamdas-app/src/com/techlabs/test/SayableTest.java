package com.techlabs.test;

import com.techlabs.model.ISayable;


public class SayableTest {

	public static void main(String[] args) {

		ISayable sayable=() -> 

                     System.out.println("Annonymous class");
			
		sayable.say();
     

}
	
	private static void sayHello(ISayable sayable)
	{
		sayable.say();
	}
}
