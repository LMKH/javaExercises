package com.calculatesalary.project;

public class Employee {
	//attribute to hold employees name and the employee role
	public String employeeName;
	public String employeeRole;
	
	//Constructor to initialise the Employee superclass and its attributes
	public Employee(String employeeName, String employeeRole) {
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
	}

	//getter & setter methods - return the values and set them
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	
	//method for calculating the employees salary
	public double calculateEmployeeSalary() {
		//placeholder in the method, to be overridden by the subclasses. return 0 as a placeholder value - will be overridden
		System.out.println("Employee List: ");
		return 0;
	}
}