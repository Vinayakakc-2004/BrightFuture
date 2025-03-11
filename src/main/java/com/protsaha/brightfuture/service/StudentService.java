package com.protsaha.brightfuture.service;

import com.protsaha.brightfuture.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(String id);
    Student addStudent(Student student);
    void deleteStudent(String id);
}