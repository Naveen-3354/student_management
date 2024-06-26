package com.naveen.student_management.service;

import com.naveen.student_management.model.Subject;
import com.naveen.student_management.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
    public List<Subject> saveAllSubject(List<Subject> subject) {
        for(Subject x : subject){
            subjectRepository.save(x);
        }
        return subjectRepository.findAll();
    }

    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }
}