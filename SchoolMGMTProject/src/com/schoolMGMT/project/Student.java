package com.schoolMGMT.project;

public class Student {
	//private fields to store the school students names & ages respectively
	private String studentName;
	private int studentAge;
	
	//constructor to initialise the students names & ages 
	public Student(String studentName, int studentAge) {
		//assigning the student name parameter to the student name field - same for the age
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	//getter & setter methods
	//get the name and return the value of the name field
	public String getStudentName() {
		return studentName;
	}
	//set the name and assign the parameter to the field
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//get the age and return the value of the age field
	public int getStudentAge() {
		return studentAge;
	}
	//set the age and assign the parameter to the field
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
}