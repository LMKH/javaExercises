package com.employee.project;

public class Employee {
	//private variables to store the employees name, job Role and salary attributes
	//string variable types for the name and job role, a double for the salary
	private String name;
	private String jobRole;
	private double salary;
	
	//Constructor for the employee class, here it initialises the name, job Role and salary variables
	public Employee(String name, String jobRole, double salary) {
		//setting the variables to their respective parameters.
		this.name = name;
		this.jobRole = jobRole;
		this.salary = salary;
	}
	
	//getter & setter methods - retrieving the values and then setting them.
	//access and modify the attributes
	//get the name - return the value
	public String getName() {
		return name;
	}
	//set the name - setting the value to the parameter
	public void setName(String name) {
		this.name = name;
	}
	
	//get the jobRole
	public String getJobRole() {
		return jobRole;
	}
	//set the jobRole to the parameter
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	
	//get the salary
	public double getSalary(){
		return salary;
	}
	//set the salary to the parameter 
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//to increase the salary of an employee by a certain percentage - method
	public void increaseSalary(double percentage) {
		//now to calculate the new salary by increasing it by a certain percentage
		/* here I explain how the following piece of code works:
		 * salary = salary - this updates the new salary by adding the calculated increase 
		 * salary * percentage / 100 - this part calculates the the amount of increase
		 * salary * percentage - multiplies the current salary by the percentage to determine how much salary should be increased
		 * dividing by 100 converts the percentage into a decimal*/
		salary = salary + salary * percentage / 100;
	}

	//now to print out the employees information. included is the of the employee, their job role and their salary current salary - these will all be printed out to the console
	public void printEmployeeInformation() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Job Role: " + jobRole);
		System.out.println("Employee Salary: " + salary);
	}
}