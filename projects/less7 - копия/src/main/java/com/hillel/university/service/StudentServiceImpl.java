package com.hillel.university.service;

import com.hillel.university.model.Student;
import com.hillel.university.repository.StudentRepository;
import com.hillel.university.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository =
            new StudentRepositoryImpl();

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findStudents();
    }
}
