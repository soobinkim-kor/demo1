package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public List<StudentEntity> selectStudents() {
        return studentRepository.findAll();
    }

    public StudentEntity getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
