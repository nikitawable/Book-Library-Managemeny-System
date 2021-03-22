
package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class IssueBook extends JFrame implements ActionListener {
    
    JPanel ppanel,ppanel2;
    JPanel contentpanel;
    JDateChooser datechooser;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JTextField t11,t21,t31,t41,t51,t61,t71;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JLabel l11,l22,l33,l44,l55,l66,l77;
    JButton b1,b2,b3,b4;
    
    
    public static void main(String args[])
    {
        new IssueBook().setVisible(true);
        
    }
     public IssueBook()
     {
        setBackground(new Color(169,169,169));
        contentpanel=new JPanel();
        setBounds(100,150,1100,500);
        setLayout(null);
        setContentPane(contentpanel);
        setLayout(null);
        l1=new JLabel("Book_id");
        l1.setBounds(130, 50, 90, 22);
        contentpanel.add(l1);
        
        l2=new JLabel("Name");
        l2.setBounds(130, 90, 90, 22);
        contentpanel.add(l2);
        
        l3=new JLabel("ISBN");
        l3.setBounds(130, 130, 90, 22);
        contentpanel.add(l3);
        
        l4=new JLabel("Publisher");
        l4.setBounds(130, 170, 90, 22);
        contentpanel.add(l4);
        
        l5=new JLabel("Edition");
        l5.setBounds(130, 210, 90, 22);
        contentpanel.add(l5);
        
        l6=new JLabel("Price");
        l6.setBounds(130, 250, 90, 22);
        contentpanel.add(l6);
        
        l7=new JLabel("Pages");
        l7.setBounds(130, 290, 90, 22);
        contentpanel.add(l7);
        
        t1=new JTextField();
        t1.setBounds(230,50,100,22);
        contentpanel.add(t1);
        
         b1=new JButton("Search");
        b1.setBounds(340,50,100,22);
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        contentpanel.add(b1);
               
        t2=new JTextField();
        t2.setBounds(230, 90, 200, 22);    
        contentpanel.add(t2);
        
        t3=new JTextField();
        t3.setBounds(230, 130, 200, 22);    
        contentpanel.add(t3);
        
        t4=new JTextField();
        t4.setBounds(230, 170, 200, 22);    
        contentpanel.add(t4);
        
        t5=new JTextField();
        t5.setBounds(230, 250, 200, 22);    
        contentpanel.add(t5);
        
        t6=new JTextField();
        t6.setBounds(230, 290, 200, 22);    
        contentpanel.add(t6);

        t7=new JTextField(); 
        t7.setBounds(230, 210, 200, 22);    
        contentpanel.add(t7);
        
        JPanel panel=new JPanel();
     panel.setForeground(new Color(36,139,34));
     panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Add-Book",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel.setBounds(30,30,500,300);
     panel.setBackground(Color.white);
     contentpanel.add(panel);
     
     
     
     l11=new JLabel("Student_id");
        l11.setBounds(560, 50, 90, 22);
        contentpanel.add(l11);
        
        l22=new JLabel("Name");
        l22.setBounds(560, 100, 90, 22);
        contentpanel.add(l22);
        
        l33=new JLabel("Fathers Name");
        l33.setBounds(560, 140, 90, 22);
        contentpanel.add(l33);
        
        l44=new JLabel("Course");
        l44.setBounds(560, 180, 90, 22);
        contentpanel.add(l44);
        
        l55=new JLabel("Branch");
        l55.setBounds(560, 220, 90, 22);
        contentpanel.add(l55);
        
        l66=new JLabel("Year");
        l66.setBounds(560, 270, 90, 22);
        contentpanel.add(l66);
        
        l77=new JLabel("Semester");
        l77.setBounds(560, 320, 90, 22);
        contentpanel.add(l77);
        
        t11=new JTextField();
        t11.setBounds(660,50,100,22);
        contentpanel.add(t11);
        
        b2=new JButton("Search");
        b2.setBounds(780,50,90,22);
        b2.addActionListener(this);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        contentpanel.add(b2);
               
        t21=new JTextField();
        t21.setBounds(660, 100, 200, 22);    
        contentpanel.add(t21);
        
        t31=new JTextField();
        t31.setBounds(660, 140, 200, 22);    
        contentpanel.add(t31);
        
        t41=new JTextField();
        t41.setBounds(660, 180, 200, 22);    
        contentpanel.add(t41);
        
        t51=new JTextField();
        t51.setBounds(660, 220, 200, 22);    
        contentpanel.add(t51);
        
        t61=new JTextField();
        t61.setBounds(660, 270, 200, 22);    
        contentpanel.add(t61);
        
        t71=new JTextField();
        t71.setBounds(660, 320, 200, 22);    
        contentpanel.add(t71);
        
     JPanel ppanel2=new JPanel();
     ppanel2.setForeground(new Color(36,139,34));
     ppanel2.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Add-Student",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     ppanel2.setBounds(550,30,480,380);
     ppanel2.setBackground(Color.white);
     contentpanel.add(ppanel2);
     
     JLabel l15=new JLabel("Date of Issue");
     l15.setForeground(new Color(105,105,105));
     l15.setFont(new Font("Trebuchet MS",Font.BOLD,15));
     l15.setBounds(100,337,150,26);
     contentpanel.add(l15);
     
     datechooser=new JDateChooser();
     datechooser.setBorder(new LineBorder(new Color(0,0,0),1,true));
     datechooser.setBackground(new Color(105,105,105));
     datechooser.setBounds(250,337,200,29);
     contentpanel.add(datechooser);
     
        b3=new JButton("Issue");
        b3.setBounds(130,380,70,22);
        b3.addActionListener(this);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        contentpanel.add(b3);
        
        b4=new JButton("Back");  
        b4.addActionListener(this);
        b4.setBounds(300,380,70,22);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        contentpanel.add(b4);
        
     

        
       
         
     }

    @Override
    public void actionPerformed(ActionEvent e) {
try
{
    conn con=new conn();
    if(e.getSource()==b1)
    {
        String sql="select * from book where book_id=?";
        PreparedStatement st=con.c.prepareStatement(sql);
        st.setString(1,t1.getText());
        ResultSet rs=st.executeQuery();
                while(rs.next())
                {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
                }
                st.close();
                rs.close();
    }
    if(e.getSource()==b2)
    {
        String sql="select * from student where student_id=?";
        PreparedStatement st=con.c.prepareStatement(sql);
        st.setString(1,t11.getText());
        ResultSet rs=st.executeQuery();
                while(rs.next())
                {
                    t21.setText(rs.getString("name"));
                    t31.setText(rs.getString("father"));
                    t41.setText(rs.getString("course"));
                    t51.setText(rs.getString("branch"));
                    t61.setText(rs.getString("year"));
                    t71.setText(rs.getString("semester"));
                }
                st.close();
                rs.close();
    }
    /*if(e.getSource()==b3)
            {
                String sql="insert into issueBook(book_id,student_id,bname,sname,course,branch,dateOfIssue)values(?,?,?,?,?,?,?)";
                PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                st.setString(2, t11.getText());
                st.setString(3, t2.getText());
                st.setString(4,t21.getText()); 
                st.setString(5,t41.getText()); 
                st.setString(6,t51.getText()); 
                st.setString(7,((JTextField) datechooser.getDateEditor().getUiComponent()).getText()); 
                
                int i=st.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null, "Book Issued Successfully.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error ");
                }
                
                st.close();
                
            }*/
    if(e.getSource()==b3)
            {
                String sql="insert into issueBook(book_id,student_id,bname,sname,course,branch,dateOfIssue ) values (?,?,?,?,?,?,?)";
        try (PreparedStatement st = con.c.prepareStatement(sql)) {
            st.setString(1, t1.getText());
            st.setString(2, t11.getText());
            st.setString(3, t2.getText());
            st.setString(4, t21.getText());
            st.setString(5, t41.getText());
            st.setString(6, t51.getText());
            st.setString(7,((JTextField) datechooser.getDateEditor().getUiComponent()).getText());
            
            int i=st.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(null, "Successfully Added");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Try Again");
            }
            st.close();
        }
                
            }
    if(e.getSource()==b4)
    {
        this.setVisible(false);
        new Home().setVisible(true);
    }
}
    catch(Exception ae)
            {
            
            }
        }
}
