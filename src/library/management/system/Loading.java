

package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Loading extends JFrame implements Runnable {
    private JPanel contentPane;
    private JProgressBar progressbar;
    int i;
    Thread th;
    public static void main(String args[])
    {
        new Loading().setVisible(true);
    }
    
    public void setUploading(){
        th.start();
    }
    
    public void run() {
        try{
            for(int i=0;i<200;i++)
            {
                i=i+1;
                int m= progressbar.getMaximum();
                int v=progressbar.getValue();
                if(v<m){
                    progressbar.setValue(progressbar.getValue()+1);
                }
                else
                {
                    i=201;
                    setVisible(false);
                    new Home().setVisible(true);
                }
                Thread.sleep(50); 
            }
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }
    public Loading()
    {
        super("Loading");
        th=new Thread((Runnable)this);
        setBounds(400,300,800,400);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel heading=new JLabel("Smart Library V5.1");
        heading.setForeground(Color.blue);
        heading.setFont(new Font("Imprint MT Shadow",Font.BOLD,30));
        heading.setBounds(130,46,500,35);
        contentPane.add(heading);
        
        progressbar=new JProgressBar();
        progressbar.setFont(new Font("Imprint MT Shadow",Font.BOLD,30));
        progressbar.setStringPainted(true);
        progressbar.setBounds(130,135,300,25);
        contentPane.add(progressbar);

        JLabel l1=new JLabel("PleaseWait.......");
        l1.setForeground(Color.gray);
        l1.setFont(new Font("Imprint MT Shadow",Font.BOLD,30));
        l1.setBounds(200,170,150,100);
        contentPane.add(l1);
        
        JPanel panel=new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(0,0,600,500);
        contentPane.add(panel);
        
        setUploading();
        
          
    }
    
    
    

    
    
}
