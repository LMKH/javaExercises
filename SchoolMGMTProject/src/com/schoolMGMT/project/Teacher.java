package com.schoolMGMT.project;

public class Teacher {
		//almost exactly the same as what I did in the student class, just this time in place of "student" its "teacher" and instead of "age" its "subject"
		//private fields to store the school teachers names & subject respectively
		private String teacherName;
		private String teacherSubject;
		
		//constructor to initialise the teachers names & subjects 
		public Teacher(String teacherName, String teacherSubject) {
			//assigning the teachers name parameter to the teacher name field
			//then also the same for the teachers subject
			this.teacherName = teacherName;
			this.teacherSubject = teacherSubject;
		}
		
		//getter & setter methods
		//get the name and return the value of the name field
		public String getTeacherName() {
			return teacherName;
		}
		//set the name and assign the parameter to the field
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
		
		//get the subject and return the value of the subject field
		public String getTeacherSubject() {
			return teacherSubject;
		}
		//set the subject and assign the parameter to the field
		public void setTeacherSubject(String teacherSubject) {
			this.teacherSubject = teacherSubject;
	}
}