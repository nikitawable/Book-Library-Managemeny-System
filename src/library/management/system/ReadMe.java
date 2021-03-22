/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class ReadMe extends JFrame {
    JPanel panel;
    
    public ReadMe()
    {
        super("Read Me");
        panel=new JPanel();
        setContentPane(panel);
        setLayout(null);
        setBounds(150,150,700,700);
        panel.setBackground(Color.WHITE);
        
        JLabel l1=new JLabel("Library");
        l1.setBounds(250,40,150,35);
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setForeground(new Color(128,255,0));
        panel.add(l1);
       
        JLabel l2=new JLabel("Management System");
        l2.setBounds(200,90,300,35);
        l2.setFont(new Font("Times New Roman",Font.BOLD,30));
        l2.setForeground(new Color(128,0,255));
        panel.add(l2);
        
        JLabel l3=new JLabel("V5.1");
        l3.setBounds(250,140,150,35);
        l3.setFont(new Font("Times New Roman",Font.BOLD,30));
        l3.setForeground(new Color(255,128,128));
        panel.add(l3);
        
        TextArea t1=new TextArea("Library Management System is a project which \n aims in developing a computerized \n system to maintain all the daily work \n of library.The System helps both student\n and library manager to\n keep a constant track of all \n the books available in the library.");
        t1.setBounds(120,180,500,200);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        t1.setForeground(Color.black);
        panel.add(t1);
        
    }
    public static void main(String args[])
    {
        new ReadMe().setVisible(true);
    }
    
}
