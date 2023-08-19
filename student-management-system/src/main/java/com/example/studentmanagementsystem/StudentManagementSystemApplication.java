package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		//Burada studentRepository manuel olarak doldurduk. Ve ekranda gösterdik.
		/*
		Student student1=new Student("Isil","Subasi","isil@gmail.com");
		studentRepository.save(student1);

		Student student2=new Student("Sevgi","Subaşi","sevgi@gmail.com");
		studentRepository.save(student2);

		Student student3=new Student("Hikmet","Subaşi","hikmet@gmail.com");
		studentRepository.save(student3);
		 */



	}
}
