package com.calculatesalary.project;

public class Programmer extends Employee{
	//same principals as used in manager subclass. An attribute each for both programmer base salary and increased salary
	double programmerBaseSalary;
	double programmerIncreasedSalary;
	
	//constructor to initialise the programmer subclass w/ its attributes and call the superclass constructor
	public Programmer(String employeeName, double programmerBaseSalary, double programmerIncreasedSalary) {
		//calling the superclass constructor and placing "Programmer" within the employee role
		super(employeeName, "Programmer");
		this.programmerBaseSalary = programmerBaseSalary;
		this.programmerIncreasedSalary = programmerIncreasedSalary;
	}

	//overriding the calculateEmployeeSalary() method
	@Override
	public double calculateEmployeeSalary() {
		//calculate and returning the programmers salary. taking the base salary and adding the increased salary on to it
		return programmerBaseSalary + programmerIncreasedSalary;
	}
}