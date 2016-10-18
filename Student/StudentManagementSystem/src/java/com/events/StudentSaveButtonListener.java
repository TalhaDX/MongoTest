package com.events;

import com.domain.Student;
import com.repositiry.StudentRepositoryImpl;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.ui.StudentEntryForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Talha on 5/15/2016.
 */
public class StudentSaveButtonListener implements ActionListener {

    private JTextField txtName;
    private JTextField txtAge;
    private JTextField txtGender;
    private JTextField txtAddress;
    private StudentService studentService;


    public StudentSaveButtonListener(StudentEntryForm studentEntryForm) {
        this.txtName = studentEntryForm.getTxtName();
        this.txtAge = studentEntryForm.getTxtAge();
        this.txtGender = studentEntryForm.getTxtGender();
        this.txtAddress = studentEntryForm.getTxtAddress();
        studentService = new StudentServiceImpl(new StudentRepositoryImpl());
    }

    private Student createStudent() {
        return new Student.StudentBuilder().withName(txtName.getText())
                .withAge(Integer.valueOf(txtAge.getText()))
                .withGender(txtGender.getText())
                .withAddress(txtAddress.getText()).toStudent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        studentService.saveStudent(createStudent());
    }
}
