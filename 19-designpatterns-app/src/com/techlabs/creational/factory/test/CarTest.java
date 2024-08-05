package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.ICar;


public class CarTest {

	public static void main(String[] args) {

    ICar car;
    
    car=CarFactory.makeCar("Maruti");
    car.start();
    car.stop();
    
    car=CarFactory.makeCar("Tata");
    car.start();
    car.stop();
    
    car=CarFactory.makeCar("Mahindra");
    car.start();
    car.stop();

	}

}
