package com.hillel.university.service;

import com.hillel.university.model.Student;
import com.hillel.university.repository.StudentRepository;
import com.hillel.university.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository;

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findStudents();
    }
}
