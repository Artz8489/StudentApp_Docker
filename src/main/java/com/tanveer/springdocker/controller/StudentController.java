package com.tanveer.springdocker.controller;

import com.tanveer.springdocker.model.Student;
import com.tanveer.springdocker.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping()
    public List<Student> getStudent(){
   return service.getStudents();
}

@PostMapping("/createStudent")
    public void createStudent(@RequestBody Student st){
    System.out.println("@ posttttttttttttttttttttttttt"+st);
        service.createStudent(st);
    }
}
