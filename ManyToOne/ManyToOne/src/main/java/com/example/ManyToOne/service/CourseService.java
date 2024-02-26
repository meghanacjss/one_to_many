package com.example.ManyToOne.service;

import com.example.ManyToOne.entity.Course;
import com.example.ManyToOne.entity.Student;
import com.example.ManyToOne.repository.CourseRepository;
import com.example.ManyToOne.repository.StudentRepository;
import com.example.ManyToOne.model.CourseModel;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    public List<Course> getCourseById;
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    public Course saveCourseWithStudents(Course course, List<Student> students) {
        Course savedCourse = courseRepository.save(course);

        for (Student student : students) {
            student.setCourse(savedCourse);

            CourseModel courseModel = new CourseModel();
            BeanUtils.copyProperties(course,courseModel);

            studentRepository.save(student);
        }

        return savedCourse;
    }


    public void deleteCourseAndStudents(Long courseId) {

        Course courseToDelete = courseRepository.findById(courseId)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with ID: " + courseId));

        List<Student> studentsToDelete = courseToDelete.getStudents();
        studentRepository.deleteAll(studentsToDelete);

        courseRepository.delete(courseToDelete);
    }
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }
}
