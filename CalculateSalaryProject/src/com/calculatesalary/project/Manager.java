package com.calculatesalary.project;

public class Manager extends Employee{
	//attributes for the managers base salary and increased salary
	double managerBaseSalary;
	double managerIncreasedSalary;
	
	//constructor to initialise the manager subclass w/ its attributes and call the superclass constructor
	public Manager(String employeeName, double managerBaseSalary, double managerIncreasedSalary) {
		//calling the superclass constructor and placing "Manager" within the employee role
		super(employeeName, "Manager");
		this.managerBaseSalary = managerBaseSalary;
		this.managerIncreasedSalary = managerIncreasedSalary;
	}
	
	//overriding the calculateEmployeeSalary() method
	@Override
	public double calculateEmployeeSalary() {
		//calculate and returning the Managers salary
		//simply taking the base salary and adding on to it the increased salary
		return managerBaseSalary + managerIncreasedSalary;
	}
}