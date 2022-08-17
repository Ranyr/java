

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class app implements ActionListener {
    JFrame f;
    JPanel p1,p2,p3,p4;
    JButton b1,b2,b3,b4;
    JTabbedPane e1;
    app(){
    f=new JFrame("my app");
    f.setSize(500,500);
    
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    p4=new JPanel();
    
   
    b1=new JButton("click to insert");     
    b2=new JButton(" click to update");
    b3=new JButton("click to delete");
    b4=new JButton("click to create new table");
    
  
   
    p1.add(b1);
    p2.add(b2);
    p3.add(b3);
    p4.add(b4);
      ///when i ll click on tab - insert-----
    e1=new JTabbedPane();////////////////////////////////////////////
    e1.addTab("insert",null,p1,"insert tab clicked");
    e1.addTab("update",null,p2,"update tab clicked");
    e1.addTab("delete",null,p3,"delete tab clicked");
    e1.addTab("t_create",null,p4,"t_create tab clicked");
    f.add(e1);///////////////////////////////////////here tab is added into frame so only tabs will be visible when we run program
    f.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);


    }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==b1)  //by using tab  if i clicked on button 1-click to insert---- then i ll will move to login1()application
           new login1();
   
    if(e.getSource()==b2)
        new updation();
    if (e.getSource()==b3)
        new deletion();
    if(e.getSource()==b4)
        new tback();
   }
   public static void main(String p[]){
       app a=new app();
   }
    
}

