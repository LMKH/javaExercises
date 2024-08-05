package com.onlinecourse.project;

//the OnlineCourse subclass extends to the Course class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class OnlineCourse extends Course{
	
	//creating new additional attributes to store the course interface and the course duration in hours
	private String courseInterface;
	private int courseDuration;
	
	//constructor to initialise the OnlineCourse attributes and the OnlineCourse object + call the constructor of the superclass (Course)
	public OnlineCourse(String courseName, String courseInstructor, int courseCredits, String courseInterface, int courseDuration) {
		//calls the superclass's constructor
		super(courseName, courseInstructor, courseCredits);
		this.courseInterface = courseInterface;
		this.courseDuration = courseDuration;
	}
	
	//now we need to override the displayCourseInformation() method, which prints out to the console. 
	//we need to do this so that we can include the courseInterface & the courseDuration alongside the other attributes.
	
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	@Override
	public void displayCourseInformation() {
		super.displayCourseInformation();
		System.out.println("The course interface: " + courseInterface);
		System.out.println("Total course duration: " + courseDuration + " hours long");
	}
	
	//method to check if the course is eligible for a certificate. the course can only be certificate eligible if it is 15 hours or over in duration.
	//using a boolean we can see if it is true or false - is the course 15 hours and over in duration? yes - certificate eligible, no - not certificate eligible.
	public boolean isCertificateEligible() {
		//15 hours and over = certificate eligible
		return courseDuration >= 15;
	}
	
	//getter methods - to get the values from the attributes
	//get + return the course interface
	public String getCourseInterface() {
		return courseInterface;
	}
	
	//get + return the course duration
	public int getCourseDuration() {
		return courseDuration;
	}
}