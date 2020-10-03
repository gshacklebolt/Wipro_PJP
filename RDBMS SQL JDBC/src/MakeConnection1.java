import java.sql.*;

public class MakeConnection1 {
	Connection con;
	Statement stmt;
	ResultSet rs;
	ResultSetMetaData rsmd;
	DatabaseMetaData dbmd;
	
	MakeConnection1(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ghazali","mypassword");
			String sql="SELECT * FROM emp";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			dbmd=con.getMetaData();
			rsmd=rs.getMetaData();
			int noc=rsmd.getColumnCount();
			for(int i=1;i<=noc;i++) {
				System.out.print("Column "+i+" ="+rsmd.getColumnName(i)+"; ");
				System.out.print("Column Type ="+rsmd.getColumnType(i)+"; ");
				System.out.println("Column Type Name ="+rsmd.getColumnTypeName(i));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MakeConnection1();
	}

}
