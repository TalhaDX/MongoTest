package com.service;

import com.domain.Student;

import java.util.List;

/**
 * Created by Talha on 5/16/2016.
 */
public interface StudentService {

    public void saveStudent(Student student);

    public List<Student> getAll();
}
