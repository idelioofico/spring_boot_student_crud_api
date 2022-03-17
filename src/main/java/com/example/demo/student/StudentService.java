package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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

    @PostMapping(path = "/store")
    public  Student store(){
        return studentRepository.save();
    }

}
