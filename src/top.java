import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class top implements ActionListener{
    JFrame f;
    JPanel p1;
    JLabel l,l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    JOptionPane o;
    Font n1;
    
    top(){
    JFrame f=new JFrame("my project");
    f.setSize(500,500);
    
    JPanel p1=new JPanel();
    p1.setLayout(null);
    f.add(p1);
    
    l=new JLabel("login form");
    l1=new JLabel("username");
    l2=new JLabel("password");
    
   
    t1=new JTextField(20);
    t2=new JPasswordField(20);
    b1=new JButton("SUBMIT");
    b2=new JButton("RESET");
    
    n1=new Font("brush script mt",Font.BOLD,28);// font name,style,size
    l.setFont(n1);
    l.setBounds(150,50,180,50);
    l1.setBounds(30,100,80,30);
    l2.setBounds(30,150,80,30);
    
    t1.setBounds(150,100,180,30);
    t2.setBounds(150,150,180,30);
    b1.setBounds(200,200,80,30);
    b2.setBounds(200,250,80,30);
    p1.add(l);
    p1.add(l1);
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(b1);
    p1.add(b2);
    
    f.setVisible(true);
    b1.addActionListener(this);
   b2.addActionListener(this);
}
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
        String a1,a2;
        a1=t1.getText();
        a2=t2.getText();
         if(a1.equals("radhika")&&a2.equals("radhu123"))
             {  new app();}
         else 
                 { o.showMessageDialog(null,"u are trying to login with incorrect data","msg box",1);}
                                                        
    
    }
    if(e.getSource()==b2){
    t1.setText("");
    t2.setText("");
    
    }
    
}
    public static void main (String p[]){
top x=new top();
}
}