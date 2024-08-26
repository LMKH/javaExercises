package com.sports.project;

public class Basketball extends Sport{
	//overriding the method from the superclass
	@Override
	public void playSport() {
		//printing a message to the console to let the user know Basketball is being played today.
		System.out.println("Basketball is being played today.");
	}
}