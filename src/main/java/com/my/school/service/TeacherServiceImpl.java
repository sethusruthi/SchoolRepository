package com.my.school.service;

import com.my.school.entity.Teacher;
import com.my.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherByEmpId(int EmpId) {
        return teacherRepository.findById(EmpId).get();
    }

    @Override
    public void deleteTeacherByEmpId(int empId) {
        teacherRepository.deleteById(empId);

    }

    @Override
    public Teacher updateTeacherById(Teacher teacher) {
        Teacher oldTeacherDetails = getTeacherByEmpId(teacher.getEmpId());
        oldTeacherDetails.setName(teacher.getName());
        return teacherRepository.save(oldTeacherDetails) ;
    }
}
