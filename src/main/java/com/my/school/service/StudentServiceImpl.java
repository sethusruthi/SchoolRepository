package com.my.school.service;

import com.my.school.entity.Student;
import com.my.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByNum(int rollNum) {
        return studentRepository.findById(rollNum).get();
    }

    @Override
    public void deleteStudentByNum(int rollNum) {
         studentRepository.deleteById(rollNum);
    }

    @Override
    public Student updateStudentByNum(Student student) {
        Student studentOld = getStudentByNum(student.getRollNum());
        studentOld.setFirstName(student.getFirstName());
        studentOld.setLastName(student.getLastName());
        return studentRepository.save(studentOld);
    }
}
