package com.example.demo.entity;

import java.time.LocalDate;

public class Student{
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }

    public LocalDate getDOB(){
        return dob;
    }
    public void setDOB(LocalDate dob){
        this.dob=dob;
    }

    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
}