package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class StudentDetails extends JFrame implements ActionListener{
    private JPanel contentpanel;
    private JTable table;
    private JTextArea search;
    private JButton b1,b2,b3;
    public static void main(String args[])
    {
       new StudentDetails().setVisible(true);
       
    }
    public void student()
    {
        try{
            conn con=new conn();
            String sql="select * from student";
            PreparedStatement st=con.c.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            
            rs.close();
            st.close();
            con.c.close();
            
            
        }
        catch(Exception e){
            
        }
    }
    
    public StudentDetails()
    {
        setBounds(200,200,850,475);
       contentpanel=new JPanel();
       contentpanel.setBackground(Color.white);
       setLayout(null);
       setContentPane(contentpanel);
       
       JScrollPane scrollpane=new JScrollPane();
       scrollpane.setBounds(79,133,771,282);
       contentpanel.add(scrollpane);
       table=new JTable();
       table.addMouseListener(new MouseAdapter() {
       public void mouseClicked(){
           int row=table.getSelectedRow();
           search.setText(table.getModel().getValueAt(row, 1).toString());
       }
       });
       
       table.setBackground(new Color(240,248,255));
       table.setForeground(Color.GRAY);
       scrollpane.setViewportView(table);
       
       b1=new JButton("Search");
       b1.addActionListener(this);
       b1.setBorder(new LineBorder(new Color(255,20,147),2,true));
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("library/management/system/ICONS/eight.png"));
       Image i2=i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       b1.setIcon(i3);
       b1.setForeground(new Color(199,21,133));
       b1.setBounds(564,89,138,33);
       contentpanel.add(b1);
       
       b2=new JButton("Delete");
       b2.addActionListener(this);
       b2.setBorder(new LineBorder(new Color(255,20,147),2,true));
       ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("library/management/system/ICONS/nineth.png"));
       Image i5=i4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
       ImageIcon i6=new ImageIcon(i5);
       b2.setIcon(i6);
       b2.setForeground(new Color(199,21,133));
       b2.setBounds(712,89,138,33);
       contentpanel.add(b2);
       
       JLabel l1=new JLabel("Student Details");
       l1.setBounds(300,15,400,47);
       contentpanel.add(l1);
       l1.setForeground(new Color(107,142,35));
       
       search=new JTextArea();
       search.setColumns(10);
       search.setForeground(new Color(47,79,79));
       search.setBackground(new Color(255,240,245));
       search.setBounds(189,89,357,33);
       contentpanel.add(search);
       
       JLabel l3=new JLabel("Back");
       l3.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent me)
           {
               setVisible(false);
               Home home=new Home();
               home.setVisible(true);
           }
       });
       l3.setForeground(Color.gray);
       ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("library/management/system/ICONS/tenth.png"));
       Image i8=i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
       ImageIcon i9=new ImageIcon(i8);
       l3.setIcon(i9);
       l3.setForeground(new Color(199,21,133));
       l3.setBounds(97,89,72,33);
       contentpanel.add(l3);
       student();

    }
    
         public void actionPerformed(ActionEvent e) {
             try
             {
                 conn con=new conn();
                 if(e.getSource()==b2)
                 {
                     String sql="delete from student where name= '"+search.getText()+"'";
                     PreparedStatement st=con.c.prepareStatement(sql);
                     
                     JDialog.setDefaultLookAndFeelDecorated(true);
                     int response=JOptionPane.showConfirmDialog(null,"Do you want to Continue?","confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                     if(response==JOptionPane.NO_OPTION){
                         
                     }
                     else if(response==JOptionPane.YES_OPTION)
                     {
                         int rs=st.executeUpdate();
                         JOptionPane.showMessageDialog(null, "Delete");
                     }
                     st.close();
                 }
                 
                 con.c.close();
             }
             catch(Exception e1)
             {
                 
             }
      }
   }
