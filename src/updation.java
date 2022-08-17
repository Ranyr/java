
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class updation implements ActionListener{
     JFrame f;
    JPanel p1;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1;
    
    updation(){
    f=new JFrame("update enetries here");
    f.setSize(700,700);
    
    p1=new JPanel();
    p1.setLayout(null);////////////////////////////////////////////
    f.add(p1);
    
    l1=new JLabel("id");
    l3=new JLabel("class");
    l4= new JLabel("address");
    l5=new JLabel("city");
        
    t1=new JTextField(20);
    t2=new JTextField(20);
    t3=new JTextField(20);
    t4=new JTextField(20);
    t5=new JTextField(20);
  
  b1=new JButton("click to update records in table");    
    
    
    l1.setBounds(50,50,50,30);
    
   l3.setBounds(50,150,50,30);
   l4.setBounds(50,200,50,30);
   l5.setBounds(50,250,50,30);
   
   t1.setBounds(150,50,380,30);
 
  t3.setBounds(150,150,380,30);
  t4.setBounds(150,200,380,30);
  t5.setBounds(150,250,380,30);
  
 b1.setBounds(150,300,240,30);
  
    p1.add(l1);
    p1.add(t1);
   
 
    p1.add(l3);
    p1.add(t3);
    p1.add(l4);
    p1.add(t4);
    p1.add(l5);
    p1.add(t5);
     p1.add(b1);
   
    f.setVisible(true);
   b1.addActionListener(this);
 
    }
    public void actionPerformed(ActionEvent e){
         if(e.getSource()== b1){
      String a1,a2,a3,a4;
      a1=t1.getText();
      a2=t2.getText();
      a3=t3.getText();
      a4=t4.getText();
    
       try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
           PreparedStatement stat=con.prepareStatement("Update student1 set class=?,address=?,city=? where id=?");
           stat.setString(1,a2);
           stat.setString(2,a3);
           stat.setString(3,a4);
           stat.setString(4,a1);
           stat.executeUpdate();
           JOptionPane n1= new JOptionPane();
           n1.showMessageDialog(null,"data updated successfull","msg box",1);
       }
       catch(Exception ew){
           System.out.println(ew);
       }

         }
    }
    public static void main(String p[]){
    updation v=new updation();
    }
}