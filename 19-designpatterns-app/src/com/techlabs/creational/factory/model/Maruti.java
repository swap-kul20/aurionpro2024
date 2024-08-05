package com.techlabs.creational.factory.model;

public class Maruti implements ICar{

	@Override
	public void start() {

         System.out.println("Maruti car Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Maruti car Stopped");
		
	}

}
