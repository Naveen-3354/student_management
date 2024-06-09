package com.naveen.student_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String instructorId;
    private String name;
    private String email;
    private String phone;
    private String specialization;
    private String officeLocation;

    @ManyToOne
    private Department department;

    @ManyToMany
    private List<Subject> subjects;
}