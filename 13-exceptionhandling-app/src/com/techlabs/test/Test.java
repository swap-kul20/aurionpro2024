package com.techlabs.test;

import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) {

		 try
         {
          int number1=Integer.parseInt(args[0]);
          int number2=Integer.parseInt(args[1]);
         
          double result=number1/number2;
          
          System.out.println("Division is: "+result);
          }   
	
          catch(ArithmeticException exception)
          {
        	  System.out.println("Invalid input for number2. Number 2 can not be zero");
        	  
          }
		 catch(ArrayIndexOutOfBoundsException exception)
		 {
			 System.out.println("Division requires two arguments. Please enter two values. ");
		 }
		 catch(NumberFormatException exception)
		 {
			 System.out.println("Division can not be performed other than numbers. Please enter number values.");
		 }
		 catch(Exception exception)
		 {
			 System.out.println("Exception occured");
		 }
		
		 finally
		 {
			 System.out.println("Inside finally");
		 }
		 
		 
	
          System.out.println("Exiting");

	}

}
