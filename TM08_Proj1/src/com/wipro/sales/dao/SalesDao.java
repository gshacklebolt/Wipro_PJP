package com.wipro.sales.dao;

import com.wipro.sales.bean.*;
import com.wipro.sales.util.DBUtil;
import java.sql.*;
import java.util.ArrayList;

public class SalesDao {
	
	public int insertSales(Sales sales) {
		String qry="INSERT INTO tbl_sales VALUES (?,?,?,?,?)";
		
		try (Connection con=DBUtil.getDBConnection();
				PreparedStatement ps=con.prepareStatement(qry)){
			
			ps.setString(1, sales.getSalesID());
			ps.setDate(2, new Date(sales.getSalesDate().getTime()));
			ps.setString(3, sales.getProductID());
			ps.setInt(4, sales.getQuantitySold());
			ps.setDouble(5, sales.getSalesPricePerUnit());
			
			if(ps.executeUpdate()>0) {
				return 1; 
			}
		}catch(SQLException e) {
			System.out.println("Insertion failed. "+e.getMessage());
		}
		
		return 0;
	}
	
	public String generateSalesID(java.util.Date salesDate) {
		
		String salesID=salesDate.toString();
		salesID=salesID.substring(salesID.length()-2,salesID.length());
		
		String qry="SELECT seq_sales_id.nextval from dual";
		
		try (Connection con=DBUtil.getDBConnection();
				Statement stm=con.createStatement()){
			
			ResultSet rs=stm.executeQuery(qry);
			rs.next();
			salesID+=rs.getInt(1);
			rs.close();
			return salesID;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		ArrayList<SalesReport> list=new ArrayList<SalesReport>();
		String qry="SELECT * FROM v_sales_report";
		
		try(Connection con=DBUtil.getDBConnection();
				Statement stm=con.createStatement()){
			
			ResultSet rs=stm.executeQuery(qry);
			
			while(rs.next()) {
				SalesReport sReport=new SalesReport();
				sReport.setSalesID(rs.getString(1));
				sReport.setSalesDate(rs.getDate(2));
				sReport.setProductID(rs.getString(3));
				sReport.setProductName(rs.getString(4));
				sReport.setQuantitySold(rs.getInt(5));
				sReport.setProductUnitPrice(rs.getDouble(6));
				sReport.setSalesPricePerUnit(rs.getDouble(7));
				sReport.setProfitAmount(rs.getDouble(8));
				
				list.add(sReport);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
