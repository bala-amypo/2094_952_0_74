package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/getall")
    public List<Student>get(){
        return stdser.getAllStudents();
    }
    @GetMapping("/getbyId/{id}")
    public Optional<Student>getById(@PathVariable Long id){
        return stdser.getById(Id);
    }
}