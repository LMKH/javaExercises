package com.schoolMGMT.project;

public class Main {

	public static void main(String[] args) {
		//creating a new instance of the School class
		School school = new School();
		
		//creating new student objects - this is where the students names and ages are
		Student student1 = new Student("Kim Shaw", 22);
		Student student2 = new Student("Beth Grant", 22);
		Student student3 = new Student("Ewan Wilson", 22);
		Student student4 = new Student("Mikey Howard", 21);
		Student student5 = new Student("Grace Hunter-Jones", 21);
		Student student6 = new Student("Jake Walker", 21);
		
		//now to add the students to the school
		school.addSchoolStudent(student1);
		school.addSchoolStudent(student2);
		school.addSchoolStudent(student3);
		school.addSchoolStudent(student4);
		school.addSchoolStudent(student5);
		school.addSchoolStudent(student6);
		
		//crating new teacher objects - this is where the teachers names and subjects are
		Teacher teacher1 = new Teacher("Michelle Thomson", "English");
		Teacher teacher2 = new Teacher("Kimberley Ross", "Maths");
		Teacher teacher3 = new Teacher("Greg Hughes", "Science");
		Teacher teacher4 = new Teacher("Robin French", "Art");
		
		//now to add the teachers to the school
		school.addSchoolTeacher(teacher1);
		school.addSchoolTeacher(teacher2);
		school.addSchoolTeacher(teacher3);
		school.addSchoolTeacher(teacher4);
		
		//creating new SchoolClass objects - this is where the class name and teacher of the class are
		SchoolClass englishClass = new SchoolClass("English", teacher1);
		//now to add the selected students to the English class
		englishClass.addStudent(student1);
		englishClass.addStudent(student3);
		englishClass.addStudent(student5);
		englishClass.addStudent(student6);
		
		SchoolClass mathsClass = new SchoolClass("Maths", teacher2);
		//now to add the selected students to the math class
		mathsClass.addStudent(student2);
		mathsClass.addStudent(student3);
		mathsClass.addStudent(student4);
		mathsClass.addStudent(student6);
		
		SchoolClass scienceClass = new SchoolClass("Science", teacher3);
		//now to add the selected students to the science class
		scienceClass.addStudent(student1);
		scienceClass.addStudent(student4);
		scienceClass.addStudent(student5);
		
		SchoolClass artClass = new SchoolClass("Art", teacher4);
		//now to add the selected students to the art class
		artClass.addStudent(student2);
		artClass.addStudent(student3);
		artClass.addStudent(student6);
		
		//now to add the classes to the school
		school.addSchoolClass(englishClass);
		school.addSchoolClass(mathsClass);
		school.addSchoolClass(scienceClass);
		school.addSchoolClass(artClass);
		
		//printing out the school information before removing any students, teachers or classes
		//size - prints out in an integer the total value
		System.out.println("Welcome to our school! Here's our information: ");
		System.out.println("The number of students in our school: " + school.getSchoolStudents().size());
		System.out.println("The number of teachers in our school: " + school.getSchoolTeachers().size());
		System.out.println("The number of classes in our school: " + school.getSchoolClasses().size());
		System.out.println("");
		
		//to remove a student, a teacher and/or a class from the school
		//removing student3
		school.removeSchoolStudent(student3);
		//removing teacher4
		school.removeSchoolTeacher(teacher4);
		//removing art class
		school.removeSchoolClass(artClass);
		
		//printing out the school information after removing some students, teachers and classes
		System.out.println("Welcome to our school! Here's our information: ");
		System.out.println("The number of students in our school: " + school.getSchoolStudents().size());
		System.out.println("The number of teachers in our school: " + school.getSchoolTeachers().size());
		System.out.println("The number of classes in our school: " + school.getSchoolClasses().size());
		System.out.println("");
	}
}