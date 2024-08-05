package com.techlabs.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

          Consumer<Integer> consumer=(Integer number)-> System.out.println("Square of number: "+number*number);
          
          
          consumer.accept(5);
          
          BiConsumer<Integer,Integer> adder=(Integer number1,Integer number2)->
                                     System.out.println(number1+number2);
                                     
           adder.accept(10, 20);

	}

}
