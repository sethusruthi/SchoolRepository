package com.my.school.service;

import com.my.school.entity.Course;

import java.util.List;

public interface CourseService {
     Course createCourse(Course course);
     List<Course> getAllCourses();
     Course getCourseById(String courseId);
     void deleteCourseById(String courseId);
     Course updateCourseById(Course course);
}
