package com.spring.sms.service;

import java.util.List;

import com.spring.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentbyId(Long id);
	Student updatestudent(Student student);
	
	void deleteStudentById(Long id);
}
