package com.java.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Talha on 5/14/2016.
 */
public class Calculator {
    private JTextField resultsTxt;
    private JButton clearBtn;
    private JButton signBtn;
    private JButton percentBtn;
    private JButton divideBtn;
    private JButton sevenBtn;
    private JButton eightBtn;
    private JButton nineBtn;
    private JButton multiplyBtn;
    private JButton fourBtn;
    private JButton fiveBtn;
    private JButton sixBtn;
    private JButton minusBtn;
    private JButton oneBtn;
    private JButton twoBtn;
    private JButton threeBtn;
    private JButton addBtn;
    private JButton zeroBtn;
    private JButton digitBtn;
    private JButton equalBtn;
    private JPanel calculatorView;
    private Double valueOne = 0.0;
    private Double valueTwo = 0.0;
    private String operator;
    private boolean canPerform = false;


    public Calculator() {
        zeroBtn.addActionListener(new NumberBtnClicked(zeroBtn.getText()));
        oneBtn.addActionListener(new NumberBtnClicked(oneBtn.getText()));
        twoBtn.addActionListener(new NumberBtnClicked(twoBtn.getText()));
        threeBtn.addActionListener(new NumberBtnClicked(threeBtn.getText()));
        fourBtn.addActionListener(new NumberBtnClicked(fourBtn.getText()));
        fiveBtn.addActionListener(new NumberBtnClicked(fiveBtn.getText()));
        sixBtn.addActionListener(new NumberBtnClicked(sixBtn.getText()));
        sevenBtn.addActionListener(new NumberBtnClicked(sevenBtn.getText()));
        eightBtn.addActionListener(new NumberBtnClicked(eightBtn.getText()));
        nineBtn.addActionListener(new NumberBtnClicked(nineBtn.getText()));

        addBtn.addActionListener(new OperatorBtnClicked(addBtn.getText()));
        minusBtn.addActionListener(new OperatorBtnClicked(minusBtn.getText()));
        multiplyBtn.addActionListener(new OperatorBtnClicked(multiplyBtn.getText()));
        divideBtn.addActionListener(new OperatorBtnClicked(divideBtn.getText()));

        equalBtn.addActionListener(new OtherBtnClicked(equalBtn.getText()));
        clearBtn.addActionListener(new OtherBtnClicked(clearBtn.getText()));

    }

    private class NumberBtnClicked implements ActionListener {

        private String value = "";

        public NumberBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText(resultsTxt.getText() + value);
        }
    }

    private class OperatorBtnClicked implements ActionListener {

        private String value = "";

        public OperatorBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(resultsTxt.getText() != null || !resultsTxt.getText().equals(0)) {

                valueOne = Double.valueOf(resultsTxt.getText());
                operator = value;
                canPerform = true;
                resultsTxt.setText("");
            }
        }
    }

    private class OtherBtnClicked implements ActionListener {

        private String value = "";

        public OtherBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if(value.equals("=")) {
                if ((resultsTxt.getText() != null || !resultsTxt.getText().equals(0)) && canPerform ) {
                    valueTwo = Double.valueOf(resultsTxt.getText());
                    Operations();
                    canPerform = false;
                }
            } else if(value.equals("AC")){
                valueOne = 0.0;
                valueTwo = 0.0;
                canPerform = false;
                resultsTxt.setText("");
            }
        }
    }

    public void Operations(){
        System.out.println("v1: " + valueOne +  " op: " + operator +  " v2: " +valueTwo);
        if (operator.equals("+")){
            resultsTxt.setText(String.valueOf((valueOne + valueTwo)));
        }
        else if (operator.equals("-")){
            resultsTxt.setText(String.valueOf((valueOne - valueTwo)));
        }
        else if (operator.equals("x")){
            resultsTxt.setText(String.valueOf((valueOne * valueTwo)));
        }
        else if (operator.equals("/")){
            resultsTxt.setText(String.valueOf((valueOne / valueTwo)));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculatorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

