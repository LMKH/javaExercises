package com.employeeservice.project;

//first, i need to import the LocalDate class from the java.time package
//java.time is the main Application Programming Interface (API) for dates and times in Java.
//LocalDate class represents a date without time or time zone information
import java.time.LocalDate;

//then from the same java.time package, i need to import the Period class.
//Period is a date-based amount of time in the calendar system. the total amount of time between 2 specified dates
import java.time.Period;

public class EmployeeService {
	//The private keyword is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.
	
	//name variable stores the employees name
	private String employeeName;
	
	//salary variable stores the employees salary
	private double employeeSalary;
	
	//using the LocalDate class and a startDate variable we can store the date the employee first started at their place of work.
	private LocalDate startDate;
	
	//constructor to initialise the variables in the EmployeeService class
	public EmployeeService(String employeeName, double employeeSalary, LocalDate startDate) {
		//initialise the variables to their respective parameters
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.startDate = startDate;
	}
	
	//getter & setter methods - get the name of the employee and set it to the new updated variable
	//getter & setter for the employee name
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	//getter & setter for the employee salary - get the salary of the employee and set it to the new updated variable
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	//getter & setter for the employee start date - get the start date of the employee and set it to the new updated variable
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	//now a method to calculate the years of employee service. 
	public int getEmployeeYearsOfService() {
		//calculate the period of time between the employees start date at the company and the current date. Then return the value/number of years
		//between - the between() method of the Period Class in java is used to obtain a period consisting of the number of years, months and dates between 2 specified dates
		//so below we have period, between - the start date of the employee and the current date (Local
		return Period.between(startDate, LocalDate.now()).getYears();
	}
	
	//now to print out the full information of the employee with the printEmployeeInformation method.
	public void printEmployeeInformation() {
		//printing out the employees name
		System.out.println("\nEmployees Name: " + employeeName);
		//printing out the employees salary
		System.out.println("Employees Salary: " + employeeSalary);
		//printing out the employees start date
		System.out.println("Employees Start Date: " + startDate);
		//printing out the employees years of service
		System.out.println("Employees Total Years of Service: " + getEmployeeYearsOfService());
	}
}
