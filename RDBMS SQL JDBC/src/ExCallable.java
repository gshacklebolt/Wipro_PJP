import java.sql.*;
public class ExCallable {

	public static void main(String[] args) {
		new ExCall();
	}

}

class ExCall{
	Connection con;
	CallableStatement cst;
	ExCall()
	{
		try {
			con=new ConnectionClass().connectionFactory();
			cst=con.prepareCall("{call LASTORDERNUMBER (?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.execute();
			
			int orderid=cst.getInt(1);
			System.out.println("Last order number: "+orderid);
			cst.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
