package com.ui;

import javax.swing.*;

/**
 * Created by Talha on 5/20/2016.
 */
public class Main {

    public static void main(String arg[]){

        JFrame frame = new JFrame("Fuck m bitch");
//        frame.setContentPane(new StudentEntryForm().panelView);
        frame.setContentPane(new MainForm().panelView);
        frame.pack();

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
