package com.wipro.sales.service;

import com.wipro.sales.bean.*;
import com.wipro.sales.dao.*;
import java.util.*;

public class Administrator {
	StockDao stockdao=new StockDao();
	SalesDao salesdao=new SalesDao();
	
	public String insertStock(Stock stockobj) {
		if((stockobj!=null) && (stockobj.getProductName().length()>2)) 
		{
			stockobj.setProductID(stockdao.generateProductID(stockobj.getProductName()));
			
			if(stockdao.insertStock(stockobj)==1)
				return stockobj.getProductID();
			else 
				return "Data not Valid for insertion";
		}
		else {
			return "Data not Valid for insertion";
		}
	}
	
	public String deleteStock(String ProductID) {
		
		if(stockdao.deleteStock(ProductID)==1) {
			return "deleted";
		}
		else
		{
			return "record cannot be deleted";
		}
	}
	
	public String insertSales(Sales salesobj) {
		if(salesobj!=null) {
			Stock stock=stockdao.getStock(salesobj.getProductID());
			if(stock!=null) {
				if(stock.getQuantityOnHand()>salesobj.getQuantitySold()) {
					if(salesobj.getSalesDate().before(new Date())) {
						salesobj.setSalesID(salesdao.generateSalesID(salesobj.getSalesDate()));	
						if(salesdao.insertSales(salesobj)==1) {
							if(stockdao.updateStock(salesobj.getProductID(), salesobj.getQuantitySold())==1)
								return "Sales Completed";
							else
								return "Error";
						}else {
							return "Error";
						}
						
					}else {
						return "Invalid date";
					}
				}else {
					return "Not enough stock on hand for sales";
				}
			}else {
				return "Unknown Product for sales";
			}
		}else {
			return "Object not valid for insertion";
		}
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		ArrayList<SalesReport> list;
		list=salesdao.getSalesReport();
		return list;
	}
}
