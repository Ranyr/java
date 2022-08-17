import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class insertion implements ActionListener {
    JFrame f;
    JPanel p1;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
 JButton b1;
    
    insertion(){
    f=new JFrame("insert enetries here");
    f.setSize(700,700);
    
    p1=new JPanel();
    p1.setLayout(null);////////////////////////////////////////////
    f.add(p1);
    
    l1=new JLabel("id");
     l2=new JLabel("name");
      l3=new JLabel("class");
       l4=new JLabel("address");
        l5=new JLabel("city");
        
    t1=new JTextField(20);
    t2=new JTextField(20);
    t3=new JTextField(20);
    t4=new JTextField(20);
  t5=new JTextField(20);
  
  b1=new JButton("click to enter data in table");    
    
    
    l1.setBounds(50,50,50,30);
    l2.setBounds(50,100,50,30);
   l3.setBounds(50,150,50,30);
   l4.setBounds(50,200,50,30);
   l5.setBounds(50,250,50,30);
   
   t1.setBounds(150,50,380,30);
  t2.setBounds (150,100,380,30);
  t3.setBounds(150,150,380,30);
  t4.setBounds(150,200,380,30);
  t5.setBounds(150,250,380,30);
  
 b1.setBounds(150,300,200,30);
  
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(l3);
    p1.add(t3);
    p1.add(l4);
    p1.add(t4);
    p1.add(l5);
    p1.add(t5);
     p1.add(b1);
   
    f.setVisible(true);
   
    


    }
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==b1){
      String a1,a2,a3,a4,a5;
      a1=t1.getText();
      a2=t2.getText();
      a3=t3.getText();
      a4=t4.getText();
      a5=t5.getText();
       try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
           PreparedStatement stat=con.prepareStatement("Insert into values student1(?,?,?,?,?)");
           stat.setString(1,a1);
           stat.setString(2,a2);
           stat.setString(3,a3);
           stat.setString(4,a4);
           stat.setString(5,a5);
            stat.executeUpdate();
           JOptionPane h=new JOptionPane();
           h.showMessageDialog(null,"data inserted successfull","msg box",3);
       }
       catch(Exception ew){
           System.out.println(ew);
       }

      }
   } 
   public static void main(String p[]){
       insertion i=new insertion();
   }
    
}
