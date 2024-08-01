package com.schoolMGMT.project;
import java.util.ArrayList;

public class School {
	//private field to store the list of student objects
	private ArrayList<Student> students;
	//private field to store the list of teacher objects
	private ArrayList<Teacher> teachers;
	//private field to store the list of classes objects
	private ArrayList<SchoolClass> classes;
	
	//constructor to initialise the above student, teachers and classes fields
	public School() {
		//creating a new ArrayList to hold the student objects
		this.students = new ArrayList<Student>();
		//creating a new ArrayList to hold the teacher objects
		this.teachers = new ArrayList<Teacher>();
		//creating a new ArrayList to hold the class objects
		this.classes = new ArrayList<SchoolClass>();
	}
	
	//the following methods are the methods to add & remove students, teachers & classes from their respective array lists
	//method to add a student to the student array list
	public void addSchoolStudent(Student student) {
		//adds the student to the student array list
		students.add(student);
	}
	
	//method to remove a student from the student array list
	public void removeSchoolStudent(Student student) {
		//removes the student from the student array list
		students.remove(student);
	}
	
	//now for the teachers. the method to add a teacher to the teacher array list
	public void addSchoolTeacher(Teacher teacher) {
		//adds the teacher to the teacher array list
		teachers.add(teacher);
	}
	
	//method to remove a teacher from the teacher array list
	public void removeSchoolTeacher(Teacher teacher) {
		//removes the teacher from the teacher array list
		teachers.remove(teacher);
	}
	
	//now for the school classes. the method to add a class to the school class array list
	public void addSchoolClass(SchoolClass schoolClass) {
		//adds the class to the school classes array list
		classes.add(schoolClass);
	}
	
	//method to remove a class from the school class array list
	public void removeSchoolClass(SchoolClass schoolClass) {
		//removes the class from the school classes array list
		classes.remove(schoolClass);
	}
	
	//method to get a list of all the students
	public ArrayList<Student> getSchoolStudents(){
		//returns a list of the students
		return students;
	}
	
	//method to get a list of all the teachers
	public ArrayList<Teacher> getSchoolTeachers(){
		//returns a list of the teachers
		return teachers;
	}
	
	//method to get a list of all the school classes
	public ArrayList<SchoolClass> getSchoolClasses(){
		//returns a a list of the classes
		return classes;
	}
}