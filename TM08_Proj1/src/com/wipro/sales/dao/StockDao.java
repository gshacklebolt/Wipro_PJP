package com.wipro.sales.dao;

import java.sql.*;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.util.DBUtil;

public class StockDao {
	
	public int insertStock(Stock sales){
		String qry="INSERT INTO tbl_stock VALUES (?,?,?,?,?)";
		
		try (Connection con=DBUtil.getDBConnection();
				PreparedStatement ps=con.prepareStatement(qry)){
			
			ps.setString(1, sales.getProductID());
			ps.setString(2, sales.getProductName());
			ps.setInt(3, sales.getQuantityOnHand());
			ps.setDouble(4, sales.getProductUnitPrice());
			ps.setInt(5, sales.getReorderLevel());
			
			if(ps.executeUpdate()>0) {
				return 1; 
			}
		}catch(SQLException e) {
			System.out.println("Insertion failed. "+e.getMessage());
		}
		
		return 0;
	}
	
	public String generateProductID(String productName) {
		String prodID=productName.substring(0,2);
		
		String qry="SELECT seq_product_id.nextval FROM dual";
		
		try (Connection con=DBUtil.getDBConnection();
				Statement stm=con.createStatement()){
			
			ResultSet rs=stm.executeQuery(qry);
			rs.next();
			prodID+=rs.getInt(1);
			rs.close();
			return prodID;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateStock(String productID,int soldQty) {
		String qry="UPDATE tbl_stock SET quantity_on_hand=quantity_on_hand-? WHERE product_id=?";
		
		try(Connection con=DBUtil.getDBConnection();
				PreparedStatement ps=con.prepareStatement(qry)){
			
			ps.setInt(1, soldQty);
			ps.setString(2, productID);
			
			if(ps.executeUpdate()>0) {
				return 1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public Stock getStock(String productID) {
		Stock stock=new Stock();
		String qry="SELECT * FROM tbl_stock WHERE product_id=?";
		
		try(Connection con=DBUtil.getDBConnection();
				PreparedStatement ps=con.prepareStatement(qry)){
			
			ps.setString(1, productID);
			ResultSet rs=ps.executeQuery();
			rs.next();
			stock.setProductID(rs.getString(1));
			stock.setProductName(rs.getString(2));
			stock.setQuantityOnHand(rs.getInt(3));
			stock.setProductUnitPrice(rs.getDouble(4));
			stock.setReorderLevel(rs.getInt(5));
			rs.close();
			
			return stock;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return  null;
		}
	}
	
	public int deleteStock(String productID){
		String qry="DELETE FROM tbl_stock WHERE PRODUCT_ID=?";
		
		try(Connection con=DBUtil.getDBConnection();
				PreparedStatement ps=con.prepareStatement(qry)){
			
			ps.setString(1, productID);
			if(ps.executeUpdate()>0) {
				return 1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}




