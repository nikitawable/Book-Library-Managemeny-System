
package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ReturnBook extends JFrame implements ActionListener {
    
    JPanel panel;
     JDateChooser datechooser;

    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2,b3;
    public void delete()
    {
        try
        {
            conn con=new conn();
            String sql="delete from issueBook where book_id=?";        
            PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                         
                int i=st.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null,"Book Returned.");
                    delete();
                    
                }
                 else
                {
                    JOptionPane.showMessageDialog(null, "Error...");
                }
        }
        catch(Exception oe){
            oe.printStackTrace();
            
        }
    }
    
    public ReturnBook()
    {
        panel=new JPanel();
        panel.setBounds(100,100,900,500);
        panel.setLayout(null);
        setContentPane(panel);
        
        l1=new JLabel("Book_id");
        l1.setBounds(40,60,70,30);
        panel.add(l1);
        
        l2=new JLabel("Student_id");
        l2.setBounds(230,60,70,30);
        panel.add(l2);
        t1=new JTextField();
        t1.setBounds(120, 60, 100, 30);    
        panel.add(t1);
        t2=new JTextField();
        t2.setBounds(310, 60, 100, 30);    
        panel.add(t2);
        
        b1=new JButton("Search");
        b1.setBounds(420,60,80,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);
        
        
        l3=new JLabel("Book");
        l3.setBounds(40,110,60,30);
        panel.add(l3);
        
        l4=new JLabel("Name");
        l4.setBounds(230,110,60,30);
        panel.add(l4);
        
        t3=new JTextField();
        t3.setBounds(110, 110, 120, 30);    
        panel.add(t3);
        t4=new JTextField();
        t4.setBounds(280, 110, 120, 30);    
        panel.add(t4);
        
        l5=new JLabel("Course");
        l5.setBounds(40,160,70,30);
        panel.add(l5);
        
        l6=new JLabel("Branch");
        l6.setBounds(260,160,70,30);
        panel.add(l6);
        t5=new JTextField();
        t5.setBounds(130, 160, 120, 30);    
        panel.add(t5);
        t6=new JTextField();
        t6.setBounds(340, 160, 120, 30);    
        panel.add(t6);
        
        l7=new JLabel("Date of Issue");
        l7.setBounds(40,210,90,30);
        panel.add(l7);
        t7=new JTextField();
        t7.setBounds(150, 210, 200, 30);    
        panel.add(t7);
        
        l8=new JLabel("Date of Return");
        l8.setBounds(40,260,90,30);
        panel.add(l8);
        datechooser=new JDateChooser();
     datechooser.setBorder(new LineBorder(new Color(0,0,0),1,true));
     datechooser.setBackground(new Color(105,105,105));
     datechooser.setBounds(150,260,200,29);
     panel.add(datechooser);
        
        b2=new JButton("Return");
        b2.setBounds(360,210,80,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        panel.add(b2);
        b3=new JButton("Back");
        b3.setBounds(360,260,80,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        panel.add(b3);
        
        JPanel panel1=new JPanel();
        panel1.setForeground(new Color(36,139,34));
     panel1.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Return-Book",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel1.setBounds(30,30,500,350);
     panel1.setBackground(Color.white);
     panel.add(panel1);
        
    }
    public static void main(String args[])
    {
        new ReturnBook().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try
        {
            conn con=new conn();
            if(ae.getSource()==b1)
            {
                String sql="select * from issueBook where book_id=? and student_id=?";
                PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                st.setString(2, t2.getText());
                ResultSet rs=st.executeQuery();
                while(rs.next()){
                    t3.setText(rs.getString("bname"));
                    t4.setText(rs.getString("sname"));
                    t5.setText(rs.getString("course"));     
                    t6.setText(rs.getString("branch"));      
                    t7.setText(rs.getString("dateOfIssue"));
                }
                st.close();
                rs.close();
            }
            if(ae.getSource()==b2)
             {
                 String sql="insert into returnBook(book_id,student_id,bname,sname,course,branch,dateOfIssue,dateOfReturn) values(?,?,?,?,?,?,?)";
                PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                st.setString(2, t2.getText());
                st.setString(3, t3.getText());    
                st.setString(4, t4.getText());   
                st.setString(5, t5.getText());   
                st.setString(6, t6.getText());     
                st.setString(7, t7.getText());        
                st.setString(8, ((JTextField) datechooser.getDateEditor().getUiComponent()).getText());
                
                int i=st.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null,"Processing.....");
                    delete();
                    
                }
                 else
                {
                    JOptionPane.showMessageDialog(null, "Error...");
                }
             }
            if(ae.getSource()==b3)
            {
                this.setVisible(false);
                new Home().setVisible(true);
                           }
            
        }
        catch(Exception e)
        {
            
        }

    
    }
    
}
