package com.naveen.student_management.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseId;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String level; // Example: Undergraduate, Graduate
    private int maxStudents;

    @ManyToMany
    private List<Subject> subjects;

    @ManyToMany
    private List<Course> prerequisites;

    @ManyToOne
    private Department department;

    @ManyToMany
    private List<Instructor> instructors;

}
