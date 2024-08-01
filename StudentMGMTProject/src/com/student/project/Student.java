package com.student.project;

//first, import java.util.ArrayList
import java.util.ArrayList;

public class Student {
	//variables to store the names and the grades of the students
	private String studentName;
	private int studentGrades;
	//ArrayList to store the students courses
	private ArrayList<String> studentCourses;
	
	//constructor - to initialise the above variables to their respective parameters
	//name and grades values are passed as arguments. the studentCourses are initialised to an empty ArrayList
	public Student(String studentName, int studentGrades) {
		this.studentName = studentName;
		this.studentGrades = studentGrades;
		this.studentCourses = new ArrayList<String>();
	}
	
	//getter methods - methods used to get the name, grades and students courses and to return them all
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentGrades() {
		return studentGrades;
	}
	
	public ArrayList<String> getStudentCourses() {
		return studentCourses;
	}
	
	//method to add a course to the studentCourses list - using the add method()
	public void addStudentCourses(String studentCourses) {
		this.studentCourses.add(studentCourses);
	}
	
	//method to do the reverse of the above by removing a course from the studentCourses list - using the remove method()
	public void removeStudentCourses(String studentCourses) {
		this.studentCourses.remove(studentCourses);
	}
	
	//method for printing out the students information - their name + their grades
	//Utilising + "\n" for better spaced output in the console
	public void printStudentInformation() {
		System.out.println("Students Name: " + studentName);
		System.out.println("Students Grades: " + studentGrades + "\n");
	}
}