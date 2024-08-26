package com.sports.project;

public class Football extends Sport{
	//simply overriding the method from the superclass
	@Override
	public void playSport() {
		//simply printing a message to the console to let the user know football is being played today.
		System.out.println("Football is being played today.");
	}
}