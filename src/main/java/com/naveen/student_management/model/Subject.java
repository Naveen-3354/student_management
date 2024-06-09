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
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private int credits;
    private String syllabus;
    private String semester;
    private String type; // Example: Core, Elective

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "subject_prerequisite",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "prerequisite_id"))
    private List<Subject> prerequisites;
    public Subject(String code) {
        this.code = code;
    }
}
