package com.techlabs.creational.factory.model;

public class CarFactory {
	
	public static ICar makeCar(String carName)
	{
		
		ICar car=null;
		
		if(carName=="Maruti")
			car=new Maruti();
		if(carName=="Tata")
			car=new Tata();
		if(carName=="Mahindra")
			car=new Mahindra();
		
		return car;
	}

}
