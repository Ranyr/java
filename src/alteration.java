import java.sql.*;
public class alteration {
   public static void main(String p[]){
   String a1;
   try{
   Class.forName("org.apache.derby.jdbc.ClientDriver");
   Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
   a1=("alter table student add country char(20)");
   Statement stat=con.createStatement();
   stat.execute(a1);
   System.out.println("table created");
   }
  catch(Exception e){
  System.out.println(e);
  } 
   
   } 
}
