package com.my.school.service;

import com.my.school.entity.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher createTeacher (Teacher teacher);
    List<Teacher> getAllTeachers();
    Teacher getTeacherByEmpId(int empId);
    void deleteTeacherByEmpId(int empId);
    Teacher updateTeacherById(Teacher teacher);
}
