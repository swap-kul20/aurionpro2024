package com.techlabs.test;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

          Supplier<Integer> randomNumberSupplier=()->(int) (Math.random() *1000);
          
          
          System.out.println("Number Generated: "+randomNumberSupplier.get());

	}

}
