
package library.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class AddStudent extends JFrame implements ActionListener {
    
    JPanel contentpanel;

    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton b1,b2;
    JComboBox combobox1,combobox2,combobox3,combobox4;
    public void random()
    {
        Random rd=new Random();
        t1.setText(""+rd.nextInt(1000+1));
    }
    
    public AddStudent()
    {
        setLayout(null);
        setBackground(new Color(169,169,169));
        contentpanel=new JPanel();
        setBounds(300,250,700,500);
        setLayout(null);
        setContentPane(contentpanel);
        setLayout(null);

        
        l1=new JLabel("Student_id");
        l1.setBounds(130, 50, 90, 22);
        contentpanel.add(l1);
        
        l2=new JLabel("Name");
        l2.setBounds(130, 90, 90, 22);
        contentpanel.add(l2);
        
        l3=new JLabel("Fathers Name");
        l3.setBounds(130, 130, 90, 22);
        contentpanel.add(l3);
        
        l4=new JLabel("Course");
        l4.setBounds(130, 170, 90, 22);
        contentpanel.add(l4);
        
        l5=new JLabel("Branch");
        l5.setBounds(130, 210, 90, 22);
        contentpanel.add(l5);
        
        l6=new JLabel("Year");
        l6.setBounds(130, 250, 90, 22);
        contentpanel.add(l6);
        
        l7=new JLabel("Semester");
        l7.setBounds(130, 290, 90, 22);
        contentpanel.add(l7);
        
        t1=new JTextField();
        t1.setBounds(230,50,150,22);
        contentpanel.add(t1);
               
        t2=new JTextField();
        t2.setBounds(230, 90, 150, 22);    
        contentpanel.add(t2);
        
        t3=new JTextField();
        t3.setBounds(230, 130, 150, 22);    
        contentpanel.add(t3);
        
        combobox1=new JComboBox();
        combobox1.setModel(new DefaultComboBoxModel (new String[]{"B.E","B.TECH","MCA","BCA","MBA"}));
        combobox1.setBounds(230, 170, 150, 22);    
        contentpanel.add(combobox1);
        
        combobox2=new JComboBox();
        combobox2.setModel(new DefaultComboBoxModel (new String[]{"Mechanical","Computer","IT","Design","Civil"}));
        combobox2.setBounds(230, 210, 150, 22);    
        contentpanel.add(combobox2);
        
        combobox3=new JComboBox();
        combobox3.setModel(new DefaultComboBoxModel (new String[]{"First","Second","Third","Fourth"}));
        combobox3.setBounds(230, 250, 150, 22);    
        contentpanel.add(combobox3);
        
        combobox4=new JComboBox();
        combobox4.setModel(new DefaultComboBoxModel (new String[]{"1St","2nd","3rd","4th","5th","6th"}));
        combobox4.setBounds(230, 290, 150, 22);    
        contentpanel.add(combobox4);
                
        b1=new JButton("Add");
        b1.setBounds(130,340,70,22);
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        contentpanel.add(b1);
        
        b2=new JButton("Back");  
        b2.addActionListener(this);
        b2.setBounds(300,340,70,22);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        contentpanel.add(b2);
        JPanel panel=new JPanel();
     panel.setForeground(new Color(36,139,34));
     panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Add-Student",
     TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
     panel.setBounds(30,30,500,380);
     panel.setBackground(Color.white);
     contentpanel.add(panel);
     
     random();
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         conn con=new conn();

        try
        {
            if(e.getSource()==b1)
            {
                String sql="insert into student(student_id,name,father,course,branch,year,semester )values(?,?,?,?,?,?,?)";
                PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                st.setString(2, t2.getText());
                st.setString(3, t3.getText());
                st.setString(4, (String)combobox1.getSelectedItem());
                st.setString(5, (String)combobox2.getSelectedItem());
                st.setString(6, (String)combobox3.getSelectedItem());
                st.setString(7, (String)combobox4.getSelectedItem());
                int i=st.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Try Again");
                }
                t1.setText("");
                t2.setText("");
                t3.setText("");
                st.close();
                
            }
            else if(e.getSource()==b2)
            {
                this.setVisible(false);
                new Home().setVisible(true);
            }
            
        }
        catch(Exception ae){
            
        }

    
    }

    public static void main(String args[])
    {
        new AddStudent().setVisible(true);
        
    }

    
    
}
