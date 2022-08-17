import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class page {
    JFrame f1;
    JPanel p;
    JLabel l1,l2;
    JTextField t1,t2;
    Font o;
    public page()
    {
    f1=new JFrame("my frame");
    f1.setSize(500,500);
    
    Image img=Toolkit.getDefaultToolkit().getImage("D:\\bg2.jpg");
    
    p=new BackgroundPanel(img);
    p.setLayout(null);
    o=new Font("Monotype Corsiva",Font.BOLD,25);
    
    l1=new JLabel("name");
    l2=new JLabel("Password");
    t1=new JTextField(20);
    t2=new JTextField(20);
    
        l1.setForeground(Color.WHITE);
        l1.setFont(o);
        l1.setBounds(70,50,100,30);
        l2.setBounds(70,150,100,30);
        l2.setFont(o);
        t1.setBounds(200,50,100,25);
        t2.setBounds(200,150,100,25);
        
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        f1.add(p);
f1.setVisible(true);
    }
}


class BackgroundPanel extends JPanel{
protected Image bgImage;

public BackgroundPanel(Image image){
super(true);
bgImage=image;
setOpaque(false);
}

public void paint(Graphics g){
g.drawImage(bgImage, 0, 0, this);
super.paint(g);
}

public static void main(String p[]){
page k=new page();
}
}    

