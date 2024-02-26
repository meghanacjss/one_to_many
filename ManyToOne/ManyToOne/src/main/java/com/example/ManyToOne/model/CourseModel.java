package com.example.ManyToOne.model;

import com.example.ManyToOne.entity.Student;
import lombok.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CourseModel {

    private Long id;
    private String name;

    private List<Student> students;

}
