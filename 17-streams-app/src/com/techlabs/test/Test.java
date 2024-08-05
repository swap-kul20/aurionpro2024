package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

      List<Integer> numbers=Arrays.asList(20,15,25,45,35);
      
      Stream<Integer> numberStream=numbers.stream();
      
      numberStream.forEach((number)->System.out.println(number));

      System.out.println("All numbers");
      numbers.stream()
             .forEach((number)->System.out.println(number));
      

      System.out.println("All Odd numbers");
      
      List<Integer> filteredNumbers=numbers.stream()
             .filter((number)->(number%2)!=0)
             .filter((number)->(number>25))
             .collect(Collectors.toList());
      
      filteredNumbers.stream()
                     .forEach((number)->System.out.println(number));
      
      List<Integer> squareNumbers=numbers.stream()
             .map((number)->number*number)
             .collect(Collectors.toList());
      
      
     int sum=numbers.stream()
    		        .reduce(0, (number1,number2)->number1+number2);
     
     System.out.println("Sum: "+sum);
     
     
     List<Integer> sortedNumbers=numbers.stream()
    		                            .sorted(Comparator.reverseOrder())
    		                            .limit(3)
    		                            .collect(Collectors.toList());
     
     
     
     sortedNumbers.stream()
                  .forEach((number)->System.out.println(number));
     
     
     Optional<Integer> max=numbers.stream().max((number1,number2)->number1-number2);
     if(max.isPresent())
    	 System.out.println("Max is: "+max.get());
     
     
    
      
      

	}

}
