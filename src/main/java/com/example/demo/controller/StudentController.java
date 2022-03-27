package com.example.demo.controller;
import java.util.List;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public List<StudentEntity> selectStudents() {
        return studentService.selectStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
