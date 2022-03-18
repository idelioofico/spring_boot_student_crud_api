package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.RouteMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController  {

    private  final StudentService studentService;

    @Autowired
    public  StudentController(StudentService studentService){

        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> get(){
        return  this.studentService.get();
    }

    @PostMapping("/store")
    public Student store(){
        return  this.studentService.store();
    }
}
