package com.onlinecourse.project;

public class Main {

	public static void main(String[] args) {
		//creating a brand new course object
		//with course name, instructor and total credits
		Course course = new Course("HTML & CSS Masterclass", "Phil Donaldson", 12);
		//print out the info to the console
		course.displayCourseInformation();
		System.out.println("");
		
		//creating a brand new online course object
		//with course name, instructor, total credits, interface & duration
		OnlineCourse onlineCourse = new OnlineCourse("German for Beginners", "Christoph Kruger", 10, "Google", 20);
		//print out the info to the console
		onlineCourse.displayCourseInformation();
		//message printed if the course is eligible for a certificate
		System.out.println("Certificate eligible? " + onlineCourse.isCertificateEligible());
	}
}