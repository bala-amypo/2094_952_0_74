package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exapmle.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;

@Service
public interface StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
        return 
    }
    
}