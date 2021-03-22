
package library.management.system;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Home extends JFrame implements ActionListener{
    JPanel panel;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3,l4,l5,l6;
    
    
    
    public Home()
    {
        panel=new JPanel();
        setBounds(150,90,1100,800);
        setContentPane(panel);
        panel.setLayout(null);
        
        JMenuBar menubar=new JMenuBar();
        menubar.setBackground(Color.cyan);
        menubar.setBounds(0,10,1000,35);
        panel.add(menubar);
        
        JMenu m1=new JMenu("Record");
        m1.setFont(new Font("Arial",Font.BOLD,17));
        JMenuItem mi5=new JMenuItem("Book Details");
        mi5.addActionListener(this);
        m1.add(mi5);
        JMenuItem mi6=new JMenuItem("Student Details");
        mi6.addActionListener(this);
        m1.add(mi6);
        
        JMenu m2=new JMenu("Help");
        m1.setFont(new Font("Arial",Font.BOLD,17));
        JMenuItem mi3=new JMenuItem("Raed Me");
        mi3.addActionListener(this);
        m2.add(mi3);
        JMenuItem mi4=new JMenuItem("About Us");
        mi4.addActionListener(this);
        m2.add(mi4);

        
        JMenu m3=new JMenu("EXit");  
        m1.setFont(new Font("Arial",Font.BOLD,17));
        JMenuItem mi1=new JMenuItem("Exit");
        mi1.addActionListener(this);
        m3.add(mi1);
        JMenuItem mi2=new JMenuItem("Logout");
        mi2.addActionListener(this);
        m3.add(mi2);
        
        menubar.add(m1);
        menubar.add(m2);
        menubar.add(m3);
        
        l1=new JLabel("Library Management System");
        l1.setForeground(new Color(204 ,51,102));
        l1.setFont(new Font("Geoge UI Semilight",Font.BOLD,30));
        l1.setBounds(268,30,701,80);
        panel.add(l1);
                
        l2=new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
        Image i2=i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l2=new JLabel(i3);
        l2.setBounds(60,140,159,152);
        panel.add(l2);
        
        l3=new JLabel("");
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
        Image i5=i4.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        l3=new JLabel(i6);
        l3.setBounds(300,160,134,120);
        panel.add(l3);
        
        l4=new JLabel("");
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fourth.png"));
        Image i8=i7.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        l4=new JLabel(i9);
        l4.setBounds(530,140,225,152);
        panel.add(l4);
        
        b1=new JButton("Add Books ");
        b1.addActionListener(this);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBounds(60,320,159,44);
        panel.add(b1);
        
        b2=new JButton("Statistics ");
        b2.addActionListener(this);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setBounds(313,320,139,44);
        panel.add(b2);
        
        b3=new JButton("Add Student ");
        b3.addActionListener(this);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);  
        b3.setBounds(562,320,167,44);
        panel.add(b3);
        JPanel panel1=new JPanel();
     panel1.setBorder(new TitledBorder(new LineBorder(new Color(250,128,114 ),2),"Operations",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel1.setBounds(20,120,750,260);
     panel1.setBackground(Color.white);
     panel.add(panel1);
        
        b4=new JButton("Issue Book ");
        b4.addActionListener(this);
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.setBounds(76,620,143,41);
        panel.add(b4);
        
        b5=new JButton("Return Book ");
        b5.addActionListener(this);
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.setBounds(310,620,159,41);
        panel.add(b5);
        
        b6=new JButton("About Us ");
        b6.addActionListener(this);
        b6.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.setBounds(562,620,159,41);
        panel.add(b6);
        
        l5=new JLabel("");
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fifth.png"));
        Image i11=i10.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        l5=new JLabel(i12);
        l5.setBounds(60,440,159,163);
        panel.add(l5);
        
        l6=new JLabel("");
        l6.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sixth.png"));
        Image i14=i13.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        l6=new JLabel(i15);
        l6.setBounds(332,440,139,152);
        panel.add(l6);
        
        JLabel l7=new JLabel("");
        l7.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i16=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/seventh.png"));
        Image i17=i16.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i18=new ImageIcon(i17);
        l7=new JLabel(i18);
        l7.setBounds(565,440,157,152);
        panel.add(l7);
        
     JPanel panel2=new JPanel();
     panel2.setBorder(new TitledBorder(new LineBorder(new Color(250,128,114 ),2),"Action",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel2.setBounds(20,420,750,270);
     panel2.setBackground(Color.white);
     panel.add(panel2);
        
        
getContentPane().setBackground(Color.white);
panel.setBackground(Color.white);
        
    }
    public static void main(String args[])
    {
        new Home().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg=ae.getActionCommand();
        if(msg.equals("Logout"))
        {
            setVisible(false);
            new Login_User().setVisible(true);
        }
        else if(msg.equals("Exit")){
            System.exit(ABORT);
        }
        else if(msg.equals("Read Me")){
            new ReadMe().setVisible(true);
        }
        else if(msg.equals("About Us ")){
            new Aboutus().setVisible(true);
        }
        else if(msg.equals("Book Details"))
        {
            setVisible(false);
            new BookDetails().setVisible(true);
        }
        else if(msg.equals("Student Details"))
        {
            setVisible(false);
            new StudentDetails().setVisible(true);
        }
        
       if(ae.getSource()==b1)
        {
            this.setVisible(false);
            new AddBook().setVisible(true);
        }
       if(ae.getSource()==b2)
        {
            this.setVisible(false);
            //new Statistics().setVisible(true);
        }
       if(ae.getSource()==b3)
        {
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }
       if(ae.getSource()==b4)
        {
            this.setVisible(false);
            new IssueBook().setVisible(true);
        }
       if(ae.getSource()==b5)
        {
            this.setVisible(false);
            new ReturnBook().setVisible(true);
        }
       if(ae.getSource()==b6)
        {
            this.setVisible(false);
           // new Aboutus().setVisible(true);
        }

    }
   
}
