package com.tm07_proj01.main;

import java.util.*;

import com.tm07_proj01.bean.Employee;

public class EmployeeRegister {

	public static void main(String[] args) {
		TreeSet<Employee> empArr=new TreeSet<Employee>();
		Scanner sc=new Scanner(System.in);
		int noOfEmp;
		
		System.out.println("Enter the Number of Employees");
		noOfEmp=sc.nextInt();
		
		for(int i=1;i<=noOfEmp;i++) {
			Employee newEmp=new Employee();
			
			System.out.println("Enter Employee "+i+" Details:");
			System.out.println("Enter the Firstname");
			newEmp.setFirstName(sc.next());
			System.out.println("Enter the Lastname");
			newEmp.setLastName(sc.next());
			System.out.println("Enter the Mobile");
			newEmp.setMobNo(sc.next());
			System.out.println("Enter the Email");
			newEmp.setEmail(sc.next());
			System.out.println("Enter the Address");
			newEmp.setAddress(sc.next());
			
			empArr.add(newEmp);
		}
		
		System.out.println("\nEmployee List:\n");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n\n","Firstname","Lastname","Mobile","Email","Address");
		
		for(Employee emp:empArr) {
			System.out.println(emp);
		}
		sc.close();
	}

}
