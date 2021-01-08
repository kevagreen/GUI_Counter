package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    //declared variables' scope is the whole class
    //private so hidden from user
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    //constructor
    public GUI() {


            frame = new JFrame();
            panel = new JPanel();
            JButton button = new JButton("Click Me");
            label = new JLabel("Number of Clicks");
            button.addActionListener(this);
            //panel is the actual window
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            panel.setLayout(new GridLayout(0, 1));
            panel.add(button);
            panel.add(label);
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("My First GUI");
            frame.pack();
            frame.setVisible(true);


        }
    public static void main(String[] args) {
        new GUI();
    }
    //event or action listener method that is tied to button
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks " + count);

    }
}





