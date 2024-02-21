package com.saew.dto;

import java.util.List;

public class Student {
    public static List<Student> getAllStudents(){
    // return null;

     }

     public static Student getStudentById(String id){
     return null;

     }

     public static List<Student> getStudentsByName(String name){
     return null;

     }

     public static Student createStudent(Student students){
     return students;

     }

     public static Student updateStudent(Student students){
     return students;}

     public static void deleteStudent(String id){

    }

        private int id; // Id (entero, clave primaria)
        private String nombre; // Nombre (cadena)
        private String correoElectronico; // Correo electrónico (cadena)
        private float gpa; // GPA (flotante)
    
        // Constructor
        public Student(int id, String nombre, String correoElectronico, float gpa) {
            this.id = id;
            this.nombre = nombre;
            this.correoElectronico = correoElectronico;
            this.gpa = gpa;
        }
    
        // Getters y Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getCorreoElectronico() {
            return correoElectronico;
        }
    
        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }
    
        public float getGpa() {
            return gpa;
        }
    
        public void setGpa(float gpa) {
            this.gpa = gpa;
        }
    }
    

