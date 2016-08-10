
import java.sql.*;

public class ConnectUtil {
    public static Connection connect(String url, String username, String password) throws Exception
    {
       Class.forName("oracle.jdbc.OracleDriver");
       return DriverManager.getConnection(url,username,password);
    }       
    
}
