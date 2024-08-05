package com.techlabs.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		
		int result=addition(number1,number2);
		
		System.out.println("Adiition= "+result);
		
		
		
		
		

	}
	
	private static int addition(int number1,int number2)
	{
		System.out.println("Addition function is called");
		return number1+number2;
	}

}
