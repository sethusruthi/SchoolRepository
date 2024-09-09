package com.my.school.service;

import com.my.school.entity.Student;
import com.my.school.entity.Teacher;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentByNum(int rollNum);
    void deleteStudentByNum(int rollNum);
    Student updateStudentByNum(Student student);
}
