package com.employee.project;

public class Main {

	public static void main(String[] args) {
		//creating instances of employee classes - here is where I fill in the employees names, job roles and salaries.
		//									String			String		double
		Employee employee1 = new Employee("Katy Sivan", "Supervisor", 30000);
		Employee employee2 = new Employee("Shawn Swift", "Shift Manager", 28000);
		
		//printing out a heading/title for the console to display
		System.out.println("Employee Information: \n");
		//printing out to the console employee information
		employee1.printEmployeeInformation();
		System.out.println(""); //empty line - for better readability 
		employee2.printEmployeeInformation();
		
		//now to raise the salaries of the employees
		//with increaseSalary method and with an amount in the parameter, we can increase the employees salary
		//here i increase employee1 (Katy) salary by 10% (10)
		employee1.increaseSalary(10);
		//and i increase employee2 (Shawn) salary by 7% (7)
		employee2.increaseSalary(7);
		
		//now for a new printed out title to confirm the updates
		//\n new line to space out the output info better
		System.out.println("\nYou just increased the following employees salaries. Their new salaries are: ");
		
		//here we print out the updated info messages + new salaries
		//employee 1
		System.out.println("\nSalary increase for " + employee1.getName() + ". Their salary has increased by 10%");
		employee1.printEmployeeInformation();
		
		//employee 2
		System.out.println("\nSalary increase for " + employee2.getName() + ". Their salary has increased by 7%");
		employee2.printEmployeeInformation();
	}
}