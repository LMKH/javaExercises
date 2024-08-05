package com.onlinecourse.project;

public class Course {
	//storing in the private attributes the course's name, instructor and its credits
	private String courseName;
	private String courseInstructor;
	private int courseCredits;
	
	//constructor to initialise the Course objects + the above attributes to their respective parameters
	public Course(String courseName, String courseInstructor, int courseCredits) {
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.courseCredits = courseCredits;
	}
	
	//method to display to the console the courses information
	public void displayCourseInformation() {
		System.out.println("The course name: " + courseName);
		System.out.println("The course instructor: " + courseInstructor);
		System.out.println("The course total credits: " + courseCredits);
	}
	
	//getter methods - to get the values from the attributes
	//get + return the course name
	public String getCourseName() {
		return courseName;
	}
	
	//get + return the course instructor
	public String getCourseInstructor() {
		return courseInstructor;
	}
	
	//get + return the course credits
	public int getCourseCredits() {
		return courseCredits;
	}
}