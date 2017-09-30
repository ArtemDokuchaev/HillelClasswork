package com.hillel.university.service;

import com.hillel.university.model.Student;
import com.hillel.university.repository.StudentRepository;
import com.hillel.university.repository.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("student-repository")
public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository;

    @Autowired
    //@Qualifier("student-repository")
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findStudents();
    }
}
