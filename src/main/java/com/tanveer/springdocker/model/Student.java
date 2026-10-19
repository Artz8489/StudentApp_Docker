package com.tanveer.springdocker.model;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String student_name;
    private int age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student(Long id, String student_name, int age) {
        this.id = id;
        this.student_name = student_name;
        this.age = age;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student_name='" + student_name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
