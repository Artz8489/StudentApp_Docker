package com.tanveer.springdocker.service;

import com.tanveer.springdocker.model.Student;
import com.tanveer.springdocker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
 @Autowired
 private StudentRepository repository;

 public List<Student> getStudents() {

 return repository.findAll();
 }

 public void createStudent(Student st) {
  System.out.println("========================================================"+st);
  repository.save(st);
 }
}
