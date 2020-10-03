import java.sql.*;

public class ConnectionClass {
	Connection con=null;
	
	Connection connectionFactory() 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ghazali","mypassword");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
