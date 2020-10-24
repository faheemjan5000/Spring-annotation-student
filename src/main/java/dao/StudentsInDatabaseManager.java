package dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import entity.Student;
@Repository
@Qualifier("database")
public class StudentsInDatabaseManager implements StudentManager {

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudentById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

}
