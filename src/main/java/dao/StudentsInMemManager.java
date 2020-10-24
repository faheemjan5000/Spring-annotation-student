package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import entity.Student;

@Repository
@Qualifier("memory")
public class StudentsInMemManager implements StudentManager {

	private static Map<Integer, Student> students;
	static
	{
		students = new HashMap<Integer,Student>(){
			{
				put(1,new Student(1,"faheem","informatica"));
				put(2,new Student(2,"waqas","econimics"));
				put(3, new Student(3,"sergio","thales"));
			}
		};
	}
	 
	  
	

	public void insertStudent(Student student) {
		students.put(student.getId(), student);

	}

	@Override
	public Collection<Student> getAllStudents() {
		
		return students.values();
	}

	@Override
	public Student getStudentById(int id) {
		return students.get(id);
		
	}

	@Override
	public void removeStudentById(int id) {
	 students.remove(id);
	}

	@Override
	public void updateStudent(Student student) {
		Student tmp = students.get(student.getId());
		tmp.setName(student.getName());
		tmp.setCourse(student.getCourse());
		students.put(tmp.getId(), tmp);
		

	}

}
