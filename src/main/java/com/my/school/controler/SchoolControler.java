package com.my.school.controler;

import com.my.school.entity.Course;
import com.my.school.entity.Student;
import com.my.school.entity.Teacher;
import com.my.school.service.CourseService;
import com.my.school.service.StudentService;
import com.my.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SchoolControler {
   @Autowired
    StudentService studentService;
   @Autowired
   TeacherService teacherService;
   @Autowired
    CourseService courseService;


  @PostMapping("/createStudent") //API entry point
   public Student createStudent(@RequestBody Student student){
       return studentService.createStudent(student);
   }
   @GetMapping("/getAllStudents")
   public List<Student> getAllStudents(){
      return studentService.getAllStudents();
   }
   @GetMapping("/getStudentByRollNum/{rollNum}")
   public Student getStudentByNum(@PathVariable int rollNum){
      return studentService.getStudentByNum(rollNum);
   }
   @DeleteMapping("/deleteStudentByNum/{rollNum}")
   public void deleteStudentByNum(@PathVariable int rollNum){
      studentService.deleteStudentByNum(rollNum);
   }
   @PutMapping("/updateStudentByNum")
   public Student updateStudentByNum(@RequestBody Student student){
      return studentService.updateStudentByNum(student);

   }
   @PostMapping("/createTeacher")
   public Teacher createTeacher(@RequestBody Teacher teacher){
      return teacherService.createTeacher(teacher);
   }
   @GetMapping("/getAllTeachers")
   public List<Teacher> getAllTeachers(){
      return teacherService.getAllTeachers();
   }
   @GetMapping("/getTeacherByEmpId/{empId}")
   public Teacher getTeacherByEmpId(@PathVariable int empId ){
      return teacherService.getTeacherByEmpId(empId);
   }
   @DeleteMapping("/deleteTeacherByEmpId/{empId}")
   public void deleteTeacherByEmpid(@PathVariable int empId){
      teacherService.deleteTeacherByEmpId(empId);
   }
   @PutMapping("/updateTeacherById")
   public Teacher updateTeacherByEmpId(@RequestBody Teacher teacher){
      return teacherService.updateTeacherById(teacher);
   }
   @PostMapping("/createCourse")
   public Course createCourse(@RequestBody Course course){
      return courseService.createCourse(course);

   }
   @GetMapping("/getAllCourses")
   public List<Course> getAllCourses(){
      return courseService.getAllCourses();
   }
   @GetMapping("/getCourseById/{courseId}")
   public Course getCourseById(@PathVariable String courseId){
      return courseService.getCourseById(courseId);
   }
   @DeleteMapping("/deleteCourseById/{courseId}")
   public void deleteCourseById(@PathVariable String courseId){
      courseService.deleteCourseById(courseId);
   }
   @PutMapping("/updateCoursebyId")
   public Course updateCourseById(@RequestBody Course course){
      return courseService.updateCourseById(course);
   }


}
