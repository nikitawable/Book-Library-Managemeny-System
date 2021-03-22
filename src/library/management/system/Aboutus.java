
package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aboutus  extends JFrame implements ActionListener{
    JPanel panel=new JPanel();
    
    public Aboutus(){
        setLayout(null);
        setBounds(200,200,400,300);
        setContentPane(panel);
         
        JLabel l1=new JLabel("About Us:");
        l1.setBounds(150,60,100,60);
        l1.setForeground(new Color(0,255,64));
        panel.add(l1);
        JLabel area=new JLabel("Developed By:Nikita Wable. ");
        area.setForeground(new Color(0,0,255));
                area.setBounds(110,300,200,60);

        panel.add(area);
        
    }
    public static void main(String args[])
    {
        new Aboutus().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
