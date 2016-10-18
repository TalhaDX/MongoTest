package com.service;

import com.domain.Student;
import com.repositiry.StudentRepository;

import java.util.List;

/**
 * Created by Talha on 5/16/2016.
 */
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);

    }

    @Override
    public List<Student> getAll() {
       return studentRepository.getAll();
    }
}
