package com.example.demo.student;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public  StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student> get(){
      return studentRepository.findAll();
    }


    public  Student store(){

//        Student student=new Student(
//                "Maria Antonia",
//                "maria@gmail.com",
////                LocalDate.of(2004,12,12),
//
//
//        );

        return studentRepository.save(new Student());
    }

}
