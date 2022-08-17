import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class login1 implements ActionListener{
JFrame f1;
    JPanel p1;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    login1(){
        
    JFrame f1=new JFrame("my app");
    f1.setSize(700,700);
    JPanel p1=new JPanel ();
    p1.setLayout(null);
    f1.add(p1);
    
    l1=new JLabel("id");
    l2=new JLabel("class");
l3=new JLabel("address");
l4=new JLabel("city");


t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);


b1=new JButton("submit");

l1.setBounds(50,100,100,50);
l2.setBounds(50,150,50,50);
l3.setBounds(50,200,50,50);
l4.setBounds(50,250,50,50);


t1.setBounds(150,110,290,30);
t2.setBounds(150,160,290,30);
t3.setBounds(150,210,290,30);
t4.setBounds(150,260,290,30);


b1.setBounds(100,360,100,30);
p1.add(l1);
p1.add(t1);

p1.add(l2);
p1.add(t2);

p1.add(l3);
p1.add(t3);

p1.add(l4);
p1.add(t4);
 


p1.add(b1);
f1.setVisible(true);
b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
    String a1,a2,a3,a4,a5;
    a1=t1.getText();
    a2=t2.getText();
    a3=t3.getText();
    a4=t4.getText();
   

    try{
 

    
        Class.forName("org.apache.derby.jdbc.ClientDriver");//  driver
Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
PreparedStatement stat=con.prepareStatement("insert into student1 values(?,?,?,?)");

stat.setString(1,a1);
stat.setString(2,a2);
stat.setString(3, a3);
stat.setString(4, a4);

stat.executeUpdate();

JOptionPane n1=new JOptionPane();
n1.showMessageDialog(null,"data inserted successfull","msg box",1);
   // }
    }
  catch(Exception ew){
    System.out.println(ew);
    }
    
    }
    }

    public static void main(String p[]){
        login1 k=new login1();
    }

}