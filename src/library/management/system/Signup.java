
package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Signup extends JFrame implements ActionListener {
    
    JPanel frame;
    JLabel label1,label2,label3,label4,label5;
    JTextField tx1,tx2,tx3,tx4;
    JButton b1,b2;
    JComboBox combobox;
    public static void main(String args[])
    {
        new Signup().setVisible(true);
    }
    
    
    public Signup()
    {
     frame=new JPanel();
     setBackground(new Color(169,169,169));
          //setBounds(600,300,600,400);
        frame=new JPanel();
        setBounds(300,250,700,500);
        setLayout(null);
        setContentPane(frame);
                setLayout(null);
     
     label1=new JLabel("Username");   
     label1.setBounds(130, 50, 90, 22);
     frame.add(label1);
     
     label2=new JLabel("Name");
     label2.setBounds(130, 90, 90, 22);    
     frame.add(label2);
     tx1=new JTextField();
     tx1.setBounds(230,50,150,22);
     tx1.setColumns(10);
     frame.add(tx1);
     
     tx2=new JTextField();   
     tx2.setBounds(230,90,150,22);
     tx2.setColumns(10);
     frame.add(tx2);

     label3=new JLabel("Password"); 
     label3.setBounds(130, 130, 90, 22);  
     frame.add(label3);

     label4=new JLabel("Security Question"); 
     label4.setBounds(130, 170, 90, 22);
     frame.add(label4);

     label5=new JLabel("Answer");  
     label5.setBounds(130, 210, 90, 22);
     frame.add(label5);
     
     

     tx3=new JTextField();    
     tx3.setBounds(230,130,150,22);
     tx3.setColumns(10);
     frame.add(tx3);

     tx4=new JTextField();     
     tx4.setBounds(230,210,150,22);
     tx4.setColumns(10);
     frame.add(tx4);

     
     b1=new JButton("Create");
     b1.addActionListener(this);  
     b1.setBackground(Color.BLACK);
     b1.setForeground(Color.WHITE);
     b1.setBounds(130,340,70,22);
     frame.add(b1);
     
     
     b2=new JButton("Back");
     b2.addActionListener(this); 
     b2.setBackground(Color.BLACK);
     b2.setForeground(Color.WHITE);
     b2.setBounds(300,340,70,22);
     frame.add(b2);
             combobox=new JComboBox();
     combobox.setModel(new DefaultComboBoxModel(new String[]{"Your Nickname?","Your Lucky Number?",
     "Your Child SuperHero?","Your Childhood School?"}));
     combobox.setBounds(230,170,150,22);
     frame.add(combobox);
     
     JPanel panel=new JPanel();
     panel.setForeground(new Color(36,139,34));
     panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Create-Account",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel.setBounds(30,30,500,380);
     panel.setBackground(Color.white);
     frame.add(panel);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            conn con=new conn();
            if(e.getSource()==b1)
            {
                String sql="insert into account(username,name,password,sec_q,sec_ans)values(?,?,?,?,?)";
                PreparedStatement st;
                st = con.c.prepareStatement(sql);
                st.setString(1,tx1.getText());
                st.setString(2,tx2.getText());     
                st.setString(3,tx3.getText());
                st.setString(4,(String)combobox.getSelectedItem());
                st.setString(5,tx4.getText());
                int i=st.executeUpdate();
                if(i>0)
                {
                 JOptionPane.showMessageDialog(null, "Successfully created");
                }
                tx1.setText("");
                tx2.setText("");
                tx3.setText("");
                tx4.setText("");
                }
            if(e.getSource()==b2)
            {
                this.setVisible(false);
                new Login_User().setVisible(true);
                
            }
        }
            
        catch(Exception e1)
        {
            
        }
    }
    
}
