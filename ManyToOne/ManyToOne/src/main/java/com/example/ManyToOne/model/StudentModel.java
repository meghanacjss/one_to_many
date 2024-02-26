package com.example.ManyToOne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

    private Long id;
    private String name;

    private CourseModel courseModel;
}
