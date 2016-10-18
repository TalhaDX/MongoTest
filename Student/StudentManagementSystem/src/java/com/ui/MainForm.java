package com.ui;

import com.events.MainButtonListeners;

import javax.swing.*;

/**
 * Created by Talha on 5/20/2016.
 */
public class MainForm {
    private JButton insertBtn;
    private JButton viewBtn;
    public JPanel panelView;

    public MainForm(){
        insertBtn.addActionListener(new MainButtonListeners());
        viewBtn.addActionListener(new MainButtonListeners());
    }
}
