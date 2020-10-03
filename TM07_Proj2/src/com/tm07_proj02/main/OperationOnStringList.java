package com.tm07_proj02.main;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationOnStringList {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int option=0;
		String item;
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice :");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter the item to be inserted:");
				sc.nextLine();
				item=sc.nextLine();
				arr.add(item);
				System.out.println("Inserted successfully");
				break;
				
			case 2:
				System.out.println("Enter the item to search :");
				sc.nextLine();
				item=sc.nextLine();
				if(arr.contains(item))
					System.out.println("Item found in the list.");
				else
					System.out.println("Item not found in the list.");
				break;
				
			case 3:
				System.out.println("Enter the item to delete :");
				sc.nextLine();
				item=sc.nextLine();
				if(arr.contains(item)) {
					arr.remove(item);
					System.out.println("Deleted successfully");
				}
				else
				{
					System.out.println("Item does not exist.");
				}
				break;
				
			case 4:
				System.out.println("The Items in the list are :");
				for(String obj:arr)
					System.out.println(obj);
				break;
			}
			
		}while(option!=5);
		sc.close();
	}

}
