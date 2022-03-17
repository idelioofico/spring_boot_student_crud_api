package com.example.demo.student;

import org.springframework.util.RouteMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController  {

    @GetMapping
    public List<Student> get(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "miriam@gmail.com",
                        LocalDate.of(1999, Month.MARCH,22),
                        23
                ),
                new Student(
                        1L,
                        "Idelio Ofico",
                        "oficoidelio@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,12),
                        22
                )
        );
    }
}
