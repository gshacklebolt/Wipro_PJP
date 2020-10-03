package com.wipro.sales.util;

import java.sql.*;

public class DBUtil {
	
	public static Connection getDBConnection() {
		Connection con=null;
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ghazali","mypassword");
			
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Error in establishing connection.");
			}
		
		return con;
	}
}
