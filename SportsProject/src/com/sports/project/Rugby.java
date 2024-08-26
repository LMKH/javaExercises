package com.sports.project;

public class Rugby extends Sport{
	//overriding the method from the superclass
	@Override
	public void playSport() {
		//printing a message to the console to let the user know Rugby is being played today.
		System.out.println("Rugby is being played today.");
	}
}