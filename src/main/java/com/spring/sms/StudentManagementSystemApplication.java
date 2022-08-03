package com.spring.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.sms.entity.Student;
import com.spring.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Ayush","Jaiswal","ayushs.19.beis@acharya.ac.in");
		studentRepository.save(student1);
		
		Student student2 = new Student("Kingson","Rana","Kingsonr.19.beis@acharya.ac.in");
		studentRepository.save(student2);
		
		Student student3 = new Student("Yatin","Reddy","yatinr.19.beis@acharya.ac.in");
		studentRepository.save(student3);
		
		Student student4 = new Student("Manish","Verma","Manishv.19.beis@acharya.ac.in");
		studentRepository.save(student4);
		
		Student student5 = new Student("Himanshu","Malik","Himanshum.19.beis@acharya.ac.in");
		studentRepository.save(student5);
		
		Student student6 = new Student("Aayush","Dewaan","Aayushd.19.beis@acharya.ac.in");
		studentRepository.save(student6);
	*/  
	}

}
