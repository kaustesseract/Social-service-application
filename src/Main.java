
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static java.util.Calendar.SEPTEMBER;

public class Main {

   
   public static void main(String[] args) {
  
       try{
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con = ConnectUtil.connect("jdbc:oracle:thin:@localhost:1521:XE","krupal","krupal");
       String query = "insert into STUDENT(stdnt_id,stdnt_name,datest) values(?,?,?)";
       PreparedStatement ps = con.prepareStatement(query);
       ps.setString(1,"104");
       ps.setString(2,"kaustubh");
       ps.setString(3,"12-sep-15");
       if(ps.executeUpdate()>0)
	 System.out.println("Student record inserted successfully");
       else
	 System.out.println("error in insertion");
       }
       catch(Exception exe){
           exe.printStackTrace();
           
       }
   }
    
}
