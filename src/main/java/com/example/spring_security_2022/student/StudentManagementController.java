package com.example.spring_security_2022.student;

import org.apache.catalina.util.ToStringUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Arif Java"),
            new Student(2, "Jacob Html"),
            new Student(3, "Robin Css")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    @PostMapping
    public void createNewStudents(@RequestBody Student student) {
//        STUDENTS.add(student);
        System.out.println("createNewStudents");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        System.out.println("deleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student) {
        System.out.println("updateStudent");
        System.out.println(String.format("%s %s", studentId, student));
    }
}
