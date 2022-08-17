import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tabss /*implements ActionListener */{
    JFrame f;
    JPanel p1,p2;
    JLabel l1,l2;
    JTextField t1,t2;
    JTabbedPane e;
   // JButton b1;
    
    tabss(){
        f=new JFrame("my app");
        f.setSize(500,500);
        
        p1=new JPanel();
        p2=new JPanel();
        
        l1=new JLabel("enter name");
        l2=new JLabel("enter password");
                
                t1=new JTextField(20);
                t2=new JTextField(20);
                
              //  b1=new JButton("click for insertion");
               
                
p1.add(l1);
p1.add(t1);

p2.add(l2);
p2.add(t2);
//p1.add(b1);

 //b1.addActionListener(this);
 
e=new JTabbedPane();
e.addTab("insert",null, p1," click to insert");
e.addTab("update",null, p2,"click to update");

f.add(e);
f.setVisible(true);

}
    /*public void actionPerformed(ActionEvent e){
       if(e.getSource()==b1) 
   new login1();
    }*/
    public static void main(String p[]){
        tabss q=new tabss();
    }
}