package com.schoolMGMT.project;
import java.util.ArrayList;

public class SchoolClass {
	//private fields to store the classes name - e.g. biology, the teacher of the class, and an array list to store the list of student objects
	private String className;
	private Teacher teacher;
	private ArrayList<Student> students;
	
	//constructor to initialise the className, teacher of the class and student fields
	public SchoolClass(String className, Teacher teacher) {
		//assigning the ClassName parameter to the className field
		this.className = className;
		//assigning the Teacher parameter to the teacher field
		this.teacher = teacher;
		//then, creating a new ArrayList to hold all the student objects
		this.students = new ArrayList<Student>();
	}
	
	//getter & setter methods
	//get class name and return the value
	public String getClassName() {
		return className;
	}
	//set class name and assign the parameter to the field
	public void setClassName(String className) {
		this.className = className;
	}
	
	//get the teachers field and return the value
	public Teacher getTeacher() {
		return teacher;
	}
	//set the teacher field and assign the parameter to the field
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	//get method for the students field
	public ArrayList<Student> getStudents() {
		//return the full list of students
		return students;
	}
	
	//now for the methods to both add and remove a student to & from a class
	//firstly to add
	public void addStudent(Student student) {
		students.add(student);
	}

	//secondly to remove
	public void removeStudent(Student student) {
		students.remove(student);
	}
}