package com.my.school.service;

import com.my.school.entity.Course;
import com.my.school.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceimpl implements CourseService{
    @Autowired
    CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(String courseId) {

        return courseRepository.findById(courseId).get();
    }

    @Override
    public void deleteCourseById(String courseId) {
        courseRepository.deleteById(courseId);

    }

    @Override
    public Course updateCourseById(Course course) {
        Course oldCourse = getCourseById(course.getCourseId());
        oldCourse.setCourseName(course.getCourseName());

        return courseRepository.save(oldCourse);
    }
}
