package com.tm06_proj01.main;

import java.io.*;

import java.util.Scanner;

import com.tm06_proj01.bean.Employee;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option = 0;

        String filename = "EmpData.bin";
        try (FileOutputStream fos= new FileOutputStream(filename);
        		ObjectOutputStream oos= new ObjectOutputStream(fos);
        		FileInputStream fis =new FileInputStream(filename);
        		ObjectInputStream ois= new ObjectInputStream(fis)){
	        
	        do {
				System.out.println("Main Menu");
				System.out.println("1. Add an Employee");
				System.out.println("2. Display All");
				System.out.println("3. Exit");
				option=sc.nextInt();
				
				switch(option) {
				case 1:
					Employee emp=new Employee();
					System.out.print("Enter Employee ID: ");
					emp.setId(sc.nextInt());
					System.out.print("Enter Employee Name: ");
					sc.nextLine();
					emp.setName(sc.nextLine());
					System.out.print("Enter Employee Age: ");
					emp.setAge(sc.nextInt());
					System.out.print("Enter Employee Salary: ");
					emp.setSalary(sc.nextDouble());
					try {
						oos.writeObject(emp);
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 2:
					System.out.println("----Report-----");
					emp=null;
					try {
						while(true) {
							emp=(Employee)ois.readObject();
							System.out.println(emp);
						}
					}catch(EOFException eof) {
						System.out.println("----End of Report-----");
					} catch (ClassNotFoundException e) {
						System.out.println(e.getMessage());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 3:
					System.out.println("Exiting the System");
				}
			}while(option!=3);
        }catch(IOException ioe) {
        	System.out.println(ioe.getMessage());
        }
        sc.close();
	}

}
