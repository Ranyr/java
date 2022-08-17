import java.sql.*;
public class fetch {
    public static void main(String p[]){
    String a1;
    try{
   Class.forName("org.apache.derby.jdbc.ClientDriver");
     Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        PreparedStatement stat=con.prepareStatement("Select * from student1 ");
     ResultSet res=stat.executeQuery();
     while(res.next()){
         System.out.println("id is"+res.getString(1));
         System.out.println("name is"+res.getString(2));
         System.out.println("city is"+res.getString(3));
         System.out.println("***************************************");

     }
    }
    catch(Exception ee){
    System.out.println(ee);
    }
    }
}
