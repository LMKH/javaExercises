package com.employeeservice.project;

//first, i need to import the LocalDate class from the java.time package
//java.time is the main Application Programming Interface (API) for dates and times in Java.
//LocalDate class represents a date without time or time zone information
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//creating new Employee objects for employee 1, 2 & 3. in them they include the employees name, salary and start date in a descending order -> YYYY-MM-DD
		EmployeeService employee1 = new EmployeeService("Anne-Marie Richardson", 38500, LocalDate.parse("2014-08-19"));
		EmployeeService employee2 = new EmployeeService("Janet McDonald", 45600, LocalDate.parse("2007-06-05"));
		EmployeeService employee3 = new EmployeeService("Kevin Simpson", 52400, LocalDate.parse("2002-11-23"));
		
		//now to print out each employees information one by one
		//employee1
		employee1.printEmployeeInformation();
		
		//employee2
		employee2.printEmployeeInformation();
		
		//employee3
		employee3.printEmployeeInformation();
	}
}