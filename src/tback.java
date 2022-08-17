import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class tback implements ActionListener{
     JFrame f;
    JPanel p;
    JButton b1;
    tback(){
    f=new JFrame("create table at backend");
    f.setSize(500,500);
    
    p=new JPanel();
     f.add(p);
    
    b1=new JButton("click to create table");
    p.add(b1);
    f.setVisible(true);
    b1.addActionListener(this);
    
    }
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
   try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
           String a1="Create table pro1(id char(20),proname char(20),price int)";
           Statement stat=con.createStatement();    
           stat.execute(a1);
           
           JOptionPane n1=new JOptionPane();
           n1.showMessageDialog(null,"table created successfully","msg box",1);
       }
       catch(Exception ew){
           System.out.println(ew);
       }
    }
    }
    public static void main(String p[]){
      tback t1=new tback();  
        
    }
}
