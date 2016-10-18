package com.events;

import com.repositiry.StudentRepositoryImpl;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import com.ui.StudentEntryForm;
import com.ui.ViewForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainButtonListeners implements ActionListener {

    private StudentService studentService;

    public MainButtonListeners() {
        studentService = new StudentServiceImpl(new StudentRepositoryImpl());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Insert")) {

            JFrame frame = new JFrame("Student Entry Form");
            frame.setContentPane(new StudentEntryForm().panelView);
            frame.pack();
            frame.setSize(500, 500);
            frame.setVisible(true);

        } else if (e.getActionCommand().equals("View")) {

                 studentService.getAll();
//            JFrame frame = new JFrame("JTable Test");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            JTable table = createTable();
//            JScrollPane scrollPane = new JScrollPane(table);
//            frame.getContentPane().add(scrollPane);
//            frame.pack();
//            frame.setSize(500, 500);
//            frame.setVisible(true);
        }
    }

    public static JTable createTable()
    {
        String[] columnNames = {"First Name", "Last Name"};
        Object[][] data = {{"Kathy", "Smith"},{"John", "Doe"}};
        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        return table;
    }
}
