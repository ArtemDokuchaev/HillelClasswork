package com.hillel.university;

import com.hillel.university.model.Student;
import com.hillel.university.service.StudentService;
import com.hillel.university.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring-config.xml");
        

        StudentService studentService =
                new StudentServiceImpl();



        List<Student> students =
                studentService.getAllStudents();

        for (Student student : students){
            System.out.println(student);
        }

        /*
        students.forEach(System.out::println);
         */
    }
}
