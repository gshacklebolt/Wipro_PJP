package assignment1;

import java.sql.*;

public class Assignment1 {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement stm=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ghazali","mypassword");
			
			System.out.println("\nEMPNO\tENAME\tNETSALARY\n");//LABEL
			
			stm=con.createStatement();
			rs=stm.executeQuery("SELECT empno,ename FROM emp");
			while(rs.next()) {
				int empNum=rs.getInt(1);
				String eName=rs.getString(2);
				
				cstm=con.prepareCall("{call CAL_NETSALARY(?,?)}");
				cstm.setInt(1, empNum);
				cstm.registerOutParameter(2, Types.FLOAT);
				
				cstm.execute();
				float netSal=cstm.getFloat(2);
				System.out.println(empNum+"\t"+eName+"\t"+netSal);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(rs!=null)
				rs.close();
			if(cstm!=null)
				cstm.close();
			if(stm!=null)
				stm.close();
			if(con!=null)
				con.close();
		}
	}

}
