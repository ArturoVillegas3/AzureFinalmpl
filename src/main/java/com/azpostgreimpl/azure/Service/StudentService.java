package com.azpostgreimpl.azure.Service;

import com.azpostgreimpl.azure.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student SaveStudent(Student student);

    Student GetStudentById(Integer id);

    Student EditStudent(Student student);

    void deleteStudent(Integer id);
}
