package com.student.project;

public class Main {

	public static void main(String[] args) {
		//firstly, I need to create new Student objects with the names student1, 2, 3, 4, 5 respectively
		//I need to include both the students name in a string and an integer representing their grade score out of 100
		Student student1 = new Student("Luca Ricci", 99);
		Student student2 = new Student("Ciaran Smith", 97);
		Student student3 = new Student("Izzy Martin", 98);
		Student student4 = new Student("Ava Scott", 96);
		Student student5 = new Student("James King", 95);
		
		//now to print out the Students information to the console
		System.out.println("Students Information: " + "\n");
		//printing out each students information one by one
		student1.printStudentInformation();
		student2.printStudentInformation();
		student3.printStudentInformation();
		student4.printStudentInformation();
		student5.printStudentInformation();
		
		//now for messages to be printed verifying that a specific student has added courses to their courses list
		System.out.println("\n" + student1.getStudentName() + " has added the following course/s to their courses list: ");
		
		//adding "Science", "Geography" and "Physical Education" to student1's courses list
		student1.addStudentCourses("Science");
		student1.addStudentCourses("Geography");
		student1.addStudentCourses("Physical Education");
		
		//printing out the students name and their courses list
		System.out.println(student1.getStudentName() + "'s courses list: " + student1.getStudentCourses());
		
		//now student1's courses are complete, we can now move on to adding courses to student2's course list
		//again for messages to be printed verifying that a specific student has added courses to their courses list
		System.out.println("\n" + student2.getStudentName() + " has added the following course/s to their courses list: ");
		
		//adding "German", "Spanish", "Biology" and "Catering" to student2's courses list
		student2.addStudentCourses("German");
		student2.addStudentCourses("Spanish");
		student2.addStudentCourses("Biology");
		student2.addStudentCourses("Catering");
		
		//printing out the students name and their courses list
		System.out.println(student2.getStudentName() + "'s courses list: " + student2.getStudentCourses());
		
		//however, if student2 for instance added biology by mistake we can easily rectify this by utilising the removeStudentCourses method
		//printing out a message verifying that a specific student has removed a course/s from their courses list
		System.out.println("\n" + student2.getStudentName() + " has removed the following course/s from their courses list: ");
		System.out.println("Removing 'Biology' course from " + student2.getStudentName() + " courses list");
		//removing "Biology" from student2's courses list
		student2.removeStudentCourses("Biology");
		//now an updated list of student2's courses list
		System.out.println(student2.getStudentName() + "'s courses list: " + student2.getStudentCourses());
	}
}