
package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class AddBook extends JFrame implements ActionListener {
    JPanel ppanel;
        JPanel contentpanel;

    JTextField t1,t2,t3,t4,t5,t6,t7;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton b1,b2;
    JComboBox combobox;
    
    public void random()
    {
        Random rd=new Random();
        t1.setText(""+rd.nextInt(1000+1));
        
    }
    
    
    public AddBook(){
            setLayout(null);
          setBackground(new Color(169,169,169));
          //setBounds(600,300,600,400);
        contentpanel=new JPanel();
        setBounds(300,250,700,500);
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
        t1.setBounds(230,50,150,22);
        contentpanel.add(t1);
               
        t2=new JTextField();
        t2.setBounds(230, 90, 150, 22);    
        contentpanel.add(t2);
        
        t3=new JTextField();
        t3.setBounds(230, 130, 150, 22);    
        contentpanel.add(t3);
        
        t4=new JTextField();
        t4.setBounds(230, 170, 150, 22);    
        contentpanel.add(t4);
        
        t5=new JTextField();
        t5.setBounds(230, 250, 150, 22);    
        contentpanel.add(t5);
        
        t6=new JTextField();
        t6.setBounds(230, 290, 150, 22);    
        contentpanel.add(t6);

        combobox=new JComboBox();
        combobox.setModel(new DefaultComboBoxModel (new String[]{"1","2","3","4","5","6"}));
        combobox.setBounds(230, 210, 150, 22);    
        contentpanel.add(combobox);
        
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
     panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Add-Book",
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
                String sql="insert into book(book_id,name,isbn,publisher,edition,price,pages )values(?,?,?,?,?,?,?)";
                PreparedStatement st=con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                st.setString(2, t2.getText());
                st.setString(3, t3.getText());
                st.setString(4, t4.getText());
                st.setString(5, (String)combobox.getSelectedItem());
                st.setString(6, t5.getText());
                st.setString(7, t6.getText());
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
        new AddBook().setVisible(true);
    }
    
}
