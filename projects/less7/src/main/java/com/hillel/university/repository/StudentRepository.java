package com.hillel.university.repository;

import com.hillel.university.model.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findStudents();

}
