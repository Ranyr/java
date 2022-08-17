import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class exist implements ActionListener{
    JFrame f;
    JPanel p;
    JLabel l1;
    JTextField t1;
    JButton b1;
    
    exist(){
    f=new JFrame("my app");
    f.setSize(500,500);
    
    p=new JPanel();
    f.add(p);
     
    l1=new JLabel("id");
   /* l2=new JLabel("name");
    l3=new JLabel("city");*/

    t1=new JTextField(20);
   /* t2=new JTextField(20);
    t3=new JTextField(20);*/
    
    b1=new JButton("submit");
    p.add(l1);
    p.add(t1);
   /* p.add(l2);
    p.add(t2);
    p.add(l3);
    p.add(t3);*/
    p.add(b1);
    f.setVisible(true);
    b1.addActionListener(this);
    }
   public void actionPerformed(ActionEvent e){
   
   if(e.getSource()==b1){
       String a1;
       a1=t1.getText();
   try{
   Class.forName("org.apache.derby.jdbc.ClientDriver");
   Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
   PreparedStatement stat=con.prepareStatement("Select ID from student1 ");
 // stat.setString(1, a1);
   ResultSet res=stat.executeQuery();
   while(res.next()){
      if(a1.equals (res))
       {
         JOptionPane o=new JOptionPane();
         o.showMessageDialog(null,"id exists","dialog box",2);
       }
      else{
         JOptionPane k=new JOptionPane();
         k.showMessageDialog(null,"id does not exists","dialog box",1);
         }
   }
   }
   catch(Exception ee){
   System.out.println(ee);
   }
   
   } 
   }
  public static void  main(String p[]){
  exist s=new exist();
  }
    
}
