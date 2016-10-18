package com.repositiry;

import com.domain.Student;

import java.util.List;


public interface StudentRepository {

    public void saveStudent(Student student);

    public List<Student> getAll();
}
