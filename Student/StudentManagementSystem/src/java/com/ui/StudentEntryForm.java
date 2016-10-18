package com.ui;

import com.events.StudentSaveButtonListener;

import javax.swing.*;

/**
 * Created by Talha on 5/15/2016.
 */
public class StudentEntryForm {
    public JPanel panelView;
    private JTextField txtName;
    private JTextField txtAge;
    private JTextField txtGender;
    private JTextField txtAddress;
    private JButton btnCancel;
    private JButton btnSave;


    public StudentEntryForm() {
        btnSave.addActionListener(new StudentSaveButtonListener(this));
    }

    public JTextField getTxtAddress() {
        return txtAddress;
    }

    public JTextField getTxtGender() {
        return txtGender;
    }

    public JTextField getTxtAge() {
        return txtAge;
    }

    public JTextField getTxtName() {
        return txtName;
    }

//    public static void main(String[] args) {
//
//        JFrame frame = new JFrame("Student Entry Form");
////        frame.setContentPane(new StudentEntryForm().panelView);
//        frame.setContentPane(new MainForm().panelView);
//        frame.pack();
//
//        frame.setSize(500, 500);
//        frame.setVisible(true);
//
//    }



}
