package com.calculatesalary.project;

public class Main {

	public static void main(String[] args) {
		//manager and programmer object instances
		//employee name + base salary + increased the salary by
		Manager manager = new Manager("Janice Stevenson", 48000, 4200);
		Programmer programmer = new Programmer("Tyler Burnham", 42000, 3600);
		
		//finally to print out the manager and programmer info to the console.
		//it will show the employees name, their original salary, how much the salary has been increased 
		//for manager
		System.out.println(manager.getEmployeeName() + " is the " + manager.getEmployeeRole() + ". Their original salary was £" + manager.managerBaseSalary 
				+ ". Their salary has increased by £" + manager.managerIncreasedSalary + ". Their new total salary is £" + manager.calculateEmployeeSalary());
		//for spacing
		System.out.println();
		//for programmer
		System.out.println(programmer.getEmployeeName() + " is the " + programmer.getEmployeeRole() + ". Their original salary was £" + programmer.programmerBaseSalary 
				+ ". Their salary has increased by £" + programmer.programmerIncreasedSalary + ". Their new total salary is £" + programmer.calculateEmployeeSalary());
	}
}