package com.saew.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saew.SAEWApplication;
import com.saew.dto.Student;

@RestController
@RequestMapping("/students")
public class StudentsController {
    
    
    public List<Student> getAllStudents() {
        List<Student> students = Student.getAllStudents(); 
        return students;
    }
    

    
    public List<Student> getStudentByName(String name) {    
        List<Student> students = Student.getStudentsByName(name); 
        return students;
    }
       
    public ResponseEntity<Student> getStudentById(String id) {
        Student student = Student.getStudentById(id); 
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(Student students) {
        Student createdStudent = Student.createStudent(students); 
        return ResponseEntity.ok(createdStudent);
    }

    @PatchMapping
    public ResponseEntity<Student> updateProduct(Student product) {
        Student updatedStudent = Student.updateStudent(product); 
        return ResponseEntity.ok(updatedStudent); 
    }
    
    public ResponseEntity<Student> deleteStudent(String ds) {
        Student.deleteStudent(ds); 
        return ResponseEntity.noContent().build();   
    }

    

    
}
