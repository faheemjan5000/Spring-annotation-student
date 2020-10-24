package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.StudentManager;

import entity.Student;

@Service
public class StudentService {

	@Autowired
	@Qualifier("memory")
	StudentManager studentManager;
	
	
	public void insertStudent(Student student) {
		studentManager.insertStudent(student);
	}
	 
	public Collection<Student> getAllStudents(){
		return studentManager.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return studentManager.getStudentById(id);
	}
	
	public void removeStudentById(int id) {
		studentManager.removeStudentById(id);
	}
	
	public void updateStudent(Student student) {
		studentManager.updateStudent(student);
	}
}
