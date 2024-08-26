package com.sports.project;

public class Sport {
	//no need for attributes in this programme, as the expected behaviour for each sport is being handled through the method overriding process in the subclasses.
	//to reduce redundancy and keep simplicity in the programme, all that is necessary right now is the method and overriding it each time with the subclasses
	 
	//play sports method 
	public void playSport() {
		//message appears in the console
		System.out.println("The following sports are playing today: ");
		System.out.println(); //for spacing
	}
}