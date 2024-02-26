package com.example.ManyToOne.controller;
import com.example.ManyToOne.entity.Course;
import com.example.ManyToOne.entity.Student;
import com.example.ManyToOne.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/welcome")
    public String index() {
        return "welcome";
    }

    @GetMapping("/form")
    public String showCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "course-form";
    }

    @PostMapping("/save")
    public String saveCourseWithStudents(Course course, Model model) {
        List<Student> students = Arrays.asList(
                new Student(20L, "meghana", null),
                new Student(21L, "lakshmi", null),
                new Student(22L, "niha", null),
                new Student(23L, "kavya", null),
                new Student(24L, "ammu", null),
                new Student(25L, "sunny", null)
        );
        courseService.saveCourseWithStudents(course, students);
        return "course-list";
    }
    @GetMapping("/index")
    public String listCourses(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        return "course-list";
    }
    @RequestMapping("/deleteCourse")
    public String deleteCourseAndStudents(Long id, ModelMap model) {
        courseService.deleteCourseAndStudents(id);
        Optional<Course> courseModelList = courseService.getCourseById(id);
        model.addAttribute("courseModelList", courseModelList);
        return "delete";

    }
}

































//    @RequestMapping("/")
//    public String delete(@RequestParam("id") Long id, ModelMap model) {
//        try {
//            courseService.deleteCourseAndStudents(id);
//            model.addAttribute("successMessage", "Course deleted successfully");
//        } catch (Exception e) {
//            model.addAttribute("errorMessage", "Error deleting course: " + e.getMessage());
//        }
//        List<Course> courseList = courseService.getAllCourses();
//        model.addAttribute("CourseList", courseList);
//        return "course-list";
//    }
















































//    @GetMapping("/")
//    public String listCourses(Model model) {
//        List<Course> courses = courseService.getAllCourses();
//        model.addAttribute("courses", courses);
//        return "course-list";
//    }



//    @GetMapping("/form")
//    public String showCourseForm(Model model) {
//        model.addAttribute("course", new Course());
//        return "course-form";
//    }
//
//    @PostMapping("/save")
//    public String saveCourseWithStudents(@ModelAttribute Course course, Model model) {
//
//        List<Student> students = course.getStudents();
//
//        courseService.saveCourseWithStudents(course, students);
//
//        return "course-list";
//    }