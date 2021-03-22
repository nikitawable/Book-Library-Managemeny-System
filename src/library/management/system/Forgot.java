
package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class Forgot extends JFrame implements ActionListener{
    private JPanel panel;
    private JTextField tx1,tx2,tx3,tx4,tx5;
    private JButton b1,b2,b3;
    
    public static void main(String args[])
    {
        new Forgot().setVisible(true);
    }
    
        public Forgot()
    {
     setBounds(500,200,650,500);
     panel=new JPanel();
     setContentPane(panel);
     panel.setBackground(Color.WHITE);
     panel.setLayout(null);
     JLabel l1,l2,l3,l4,l5;
     
     l1=new JLabel("Username");
     l1.setFont(new Font("Arial",Font.BOLD,13));
     l1.setBounds(109, 83, 87, 29);
     panel.add(l1);
     l2=new JLabel("Name");
     l2.setFont(new Font("Arial",Font.BOLD,13));
     l2.setBounds(109, 122, 75, 21);
     panel.add(l2);
     l3=new JLabel("Your Security Question?");
     l3.setFont(new Font("Arial",Font.BOLD,13));
     l3.setBounds(109, 154, 156, 27);
     panel.add(l3);
     l4=new JLabel("Answer");
     l4.setFont(new Font("Arial",Font.BOLD,13));
     l4.setBounds(109, 192, 104, 21);
     panel.add(l4);
     l5=new JLabel("Password");
     l5.setFont(new Font("Arial",Font.BOLD,13));
     l5.setBounds(109, 224, 104, 21);
     panel.add(l5);
     
     tx1=new JTextField();
     tx1.setEditable(true);
     tx1.setColumns(10);
     tx1.setFont(new Font("Arial",Font.BOLD,12));
     tx1.setForeground(Color.black);
     tx1.setBounds(277,88,139,20);
     panel.add(tx1);
     tx2=new JTextField();
     tx2.setEditable(true);
     tx2.setColumns(10);
     tx2.setFont(new Font("Arial",Font.BOLD,12));
     tx2.setForeground(Color.black);
     tx2.setBounds(277,123,139,20);
     panel.add(tx2);
     tx3=new JTextField();
     tx3.setEditable(true);
     tx3.setColumns(10);
     tx3.setFont(new Font("Arial",Font.BOLD,12));
     tx3.setForeground(Color.black);
     tx3.setBounds(277,161,221,20);
     panel.add(tx3);
     tx4=new JTextField();
     tx4.setEditable(true);
     tx4.setColumns(10);
     tx4.setFont(new Font("Arial",Font.BOLD,12));
     tx4.setForeground(Color.black);
     tx4.setBounds(277,193,139,20);
     panel.add(tx4);
     tx5=new JTextField();
     tx5.setEditable(true);
     tx5.setColumns(10);
     tx5.setFont(new Font("Arial",Font.BOLD,12));
     tx5.setForeground(Color.black);
     tx5.setBounds(277,225,139,20);
     panel.add(tx5);
     
     b1=new JButton("Search");
     b1.addActionListener(this); 
     b1.setFont(new Font("Arial",Font.BOLD,12));
     b1.setBackground(Color.BLACK);
     b1.setForeground(Color.WHITE);
     b1.setBounds(428, 83, 80, 29);
     panel.add(b1);
     
     b2=new JButton("Retrive");
     b2.addActionListener(this); 
     b2.setFont(new Font("Arial",Font.BOLD,12));
     b2.setBackground(Color.BLACK);
     b2.setForeground(Color.WHITE);
     b2.setBounds(426, 193, 85, 29);
     panel.add(b2);
     
     b3=new JButton("Back");
     b3.addActionListener(this); 
     b3.setFont(new Font("Arial",Font.BOLD,12));
     b3.setBackground(Color.BLACK);
     b3.setForeground(Color.WHITE);
     b3.setBounds(233, 270, 101, 29);
     panel.add(b3);
     
     JPanel panel1=new JPanel();
     panel1.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Forgot-Account",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel1.setBounds(47,45,500,281);
     panel1.setBackground(Color.white);
     panel.add(panel1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
try
{
    conn con=new conn();
    if(e.getSource()==b1){
    String sql="select * from account where username=?";
    PreparedStatement st=con.c.prepareStatement(sql);
    
    st.setString(1, tx1.getText());
    ResultSet rs=st.executeQuery();
    while(rs.next())
    {
        tx2.setText(rs.getString("name"));
        tx3.setText(rs.getString("sec_q"));
           }
    
    }
            if(e.getSource()==b2){
        String sql="select * from account where sec_ans=?";
        PreparedStatement st=con.c.prepareStatement(sql);

        st.setString(1, tx4.getText());
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
            tx5.setText(rs.getString("password"));
               }

        }
        if(e.getSource()==b3){
            this.setVisible(false);
                new Login_User().setVisible(true);
            
        }
        }

    
catch(Exception e1)
{
    
}

    }
    
}
