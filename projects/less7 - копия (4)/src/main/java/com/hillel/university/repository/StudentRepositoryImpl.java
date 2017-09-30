package com.hillel.university.repository;

import com.hillel.university.model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Primary
@Repository("student-repository")
public class StudentRepositoryImpl implements StudentRepository {
    public List<Student> findStudents() {

        List<Student> students = new ArrayList<Student>();

        Student student = new Student(11,"John","Doe", 31);
        Student student2 = new Student(21,"Kate","White", 29);
        Student student3 = new Student(31,"Leo","Black", 26);
        students.add(student);
        students.add(student2);
        students.add(student3);
        return students;
    }
}
