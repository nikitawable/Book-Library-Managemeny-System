
package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LibraryManagementSystem extends JFrame  implements ActionListener{
    JLabel l1;
    JButton b1;
    
    public LibraryManagementSystem()
    {
        setSize(1200,400);
        setLayout(null);
        setLocation(150,150);
        
        l1=new JLabel("");
        b1=new JButton("Next");
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1=new JLabel(i3);
        
        l1.setBounds(0,0,1300,500);
        b1.setBounds(1050,250,200,40);
        l1.add(b1);
        add(l1);
        b1.addActionListener(this);
            }
        
    public static void main(String[] args) {
        
                new LibraryManagementSystem().setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
    new Login_User().setVisible(true);
    this.setVisible(false);
    }
  }
