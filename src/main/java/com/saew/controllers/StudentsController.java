package com.saew.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saew.dto.Student;

@RestController
@RequestMapping("/students")
public class StudentsController {
    
    
    public List<Student> getAllStudents() {
        //TODO: Implement the method
        throw new UnsupportedOperationException();
    }
    

    
    public List<Student> getStudentByName(String name) {    
        //TODO: Implement the method
        throw new UnsupportedOperationException();
    }
       
    public ResponseEntity<Student> getStudentById(String id) {
        //TODO: Implement the method
        throw new UnsupportedOperationException();
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(Student student) {
        //TODO: Implement the method
        throw new UnsupportedOperationException();
    }

    @PatchMapping
    public ResponseEntity<Student> updateProduct(Student product) {
        //TODO: Implement the method
        throw new UnsupportedOperationException();   
    }
    
    public ResponseEntity<Student> deleteStudent(String id) {
        //TODO: Implement the method
        throw new UnsupportedOperationException();   
    }

    

    
}
