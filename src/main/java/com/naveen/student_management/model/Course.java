package com.naveen.student_management.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String courseDescription;
    private int credits;

    @OneToMany(mappedBy = "course")
    private Set<ClassSchedule> classSchedules;

    // Getters and Setters
}

