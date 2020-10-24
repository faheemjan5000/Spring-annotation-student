package dao;

import java.util.Collection;

import entity.Student;

public interface StudentManager {

	void insertStudent(Student student);
	 
	Collection<Student> getAllStudents();
	
	Student getStudentById(int id);
	
	void removeStudentById(int id);
	
	void updateStudent(Student student);
	
	
}
