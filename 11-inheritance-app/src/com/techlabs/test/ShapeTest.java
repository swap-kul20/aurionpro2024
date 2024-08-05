package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		
		       Shape shape;

               shape=new Circle(25);
               shape.area();
               
               shape=new Rectangle(15,25);
               shape.area();
               
               final int array[]= {10,20,30};
                array[1]=50;

	}

}
