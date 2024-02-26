package com.example.ManyToOne;

import com.example.ManyToOne.entity.Course;
import com.example.ManyToOne.entity.Student;
import com.example.ManyToOne.repository.CourseRepository;
import com.example.ManyToOne.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication

public class ManyToOneApplication {
	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}
}



























//@SpringBootApplication
//public class ManyToOneApplication implements CommandLineRunner {
//	@Autowired
//
//	private CourseRepository courseRepository;
//	@Autowired
//	private StudentRepository studentRepository;
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(ManyToOneApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//
//		Course course = new Course();
//		course.setId(1L);
//		course.setName("java");
//
//		Course savedCourse = courseRepository.save(course);
//
//		Student student1 = new Student();
//		student1.setId(20L);
//		student1.setName("meghana");
//		student1.setCourse(savedCourse);
//
//		Student student2 = new Student();
//		student2.setId(21L);
//		student2.setName("lakshmi");
//		student2.setCourse(savedCourse);
//
//		Student student3 = new Student();
//		student3.setId(22L);
//		student3.setName("niha");
//		student3.setCourse(savedCourse);
//
//		studentRepository.saveAll(Arrays.asList(student1, student2 ,student3));
//
//	}
//}
//




























//		Course course = new Course();
//		course.setId(1L);
//		course.setName("java");
//
//        Student student1 = new Student();
//		student1.setId(20L);
//		student1.setName("meghana");
//
//		Student student2 = new Student();
//		student2.setId(21L);
//		student2.setName("lakshmi");
//
//		List<Student> studentList = new ArrayList<>();
//
//		studentList.add(student1);
//		studentList.add(student2);
//
//		course.setStudents(studentList);
//
//		courseRepository.save(course);
//	}
//}
