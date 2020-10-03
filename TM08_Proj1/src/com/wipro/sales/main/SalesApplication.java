package com.wipro.sales.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import com.wipro.sales.bean.*;
import com.wipro.sales.service.Administrator;

public class SalesApplication {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		Administrator admin=new Administrator();
		int option;
		do {
			System.out.println("\nMain Menu");
			System.out.println("=============");
			System.out.println("1. Insert Stock");
			System.out.println("2. Delete Stock");
			System.out.println("3. Insert Sales");
			System.out.println("4. View Sales Report");
			System.out.print("Enter your Choice: ");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				Stock stock=new Stock();
				System.out.print("Enter Product Name: ");
				sc.nextLine();
				stock.setProductName(sc.nextLine());
				System.out.print("Qunatity on hand: ");
				stock.setQuantityOnHand(sc.nextInt());
				System.out.print("Product unit price: ");
				stock.setProductUnitPrice(sc.nextDouble());
				System.out.print("Reorder level: ");
				stock.setReorderLevel(sc.nextInt());
				
				System.out.println(admin.insertStock(stock));
				break;
				
			case 2:
				System.out.print("Enter the product id to delete stock: ");
				sc.nextLine();
				System.out.println(admin.deleteStock(sc.nextLine()));
				break;
				
			case 3:
				Sales sales=new Sales();
				System.out.print("Enter date (dd-MM-yyyy): ");
				sc.nextLine();
				sales.setSalesDate(new SimpleDateFormat("dd-MM-yyyy").parse(sc.nextLine()));
				System.out.print("Enter product id: ");
				sales.setProductID(sc.nextLine());
				System.out.print("Enter quantity sold: ");
				sales.setQuantitySold(sc.nextInt());
				System.out.print("Sales price per unit: ");
				sales.setSalesPricePerUnit(sc.nextDouble());
				System.out.println(admin.insertSales(sales));
				break;
				
			case 4:
				ArrayList<SalesReport> list=admin.getSalesReport();
				
				String header=String.format("\n%-10s %-12s %-12s %-20s %-15s %-20s %-18s %-15s",
						"Sales ID","Sales Date","Product ID","Product Name",
						"Qty Sold","Product Price(P.U)","Sales Price (P.U)","Profit \n");
				
				String separator="";
				for(int i=0;i<125;i++)
					separator+="=";
				
				System.out.println("\nSales Report:");
				System.out.println(separator);
				System.out.println(header);
				System.out.println(separator);
				
				for(SalesReport rep:list) {
					System.out.println(rep);
				}
				System.out.println(separator);
				break;
				
			default:
				System.out.println("Exiting...!! Thanks for using the application.");
			}
		}while(option==1||option==2||option==3|option==4);
		
		sc.close();
	}

}
