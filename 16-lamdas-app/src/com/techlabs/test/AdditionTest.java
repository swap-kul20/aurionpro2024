package com.techlabs.test;

import com.techlabs.model.IAddition;

public class AdditionTest {

	public static void main(String[] args) {

           IAddition adder=(int number1,int number2)-> number1+number2;
           
           
           System.out.println(adder.addition(10, 20));

	}

}
