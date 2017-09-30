package com.hillel.university.config;

import com.hillel.university.repository.StudentRepository;
import com.hillel.university.repository.StudentRepositoryImpl;
import com.hillel.university.service.StudentService;
import com.hillel.university.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public StudentRepository getStudentREpository(){
        return new StudentRepositoryImpl();
    }
    @Bean
    public StudentService getStudentService(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentRepository((getStudentREpository()));
        return studentService;
        }
    }
}
