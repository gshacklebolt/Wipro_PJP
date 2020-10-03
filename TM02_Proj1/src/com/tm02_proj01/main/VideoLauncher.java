package com.tm02_proj01.main;

import java.util.Scanner;

import com.tm02_proj01.bean.*;

public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int rating;
		VideoStore vs=new VideoStore();
		int choice;
		do {
			System.out.println("\nMAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos:");
			System.out.println("2.Check Out Video :");
			System.out.println("3.Return Video :");
			System.out.println("4.Receive Rating :");
			System.out.println("5.List Inventory :");
			System.out.println("6.Exit :");
			System.out.print("Enter your choice (1..6): ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("\nEnter the name of the video you want to add: ");
				sc.nextLine();
				name=sc.nextLine();
				vs.addVideo(name);
				break;
				
			case 2:
				System.out.print("Enter the name of the video you want to check out: ");
				sc.nextLine();
				name=sc.nextLine();
				vs.doCheckout(name);
				break;
				
			case 3:
				System.out.print("Enter the name of the video you want to Return: ");
				sc.nextLine();
				name=sc.nextLine();
				vs.doReturn(name);
				break;
				
			case 4:
				System.out.print("\nEnter the name of the video you want to Rate: ");
				sc.nextLine();
				name=sc.nextLine();
				System.out.print("Enter the rating for this video: ");
				rating=sc.nextInt();
				vs.receiveRating(name, rating);
				break;
				
			case 5:
				vs.listInventory();
				break;
			}
		}while(choice!=6);
		System.out.println("Exiting...!! Thanks for using the application.");
		
		sc.close();
	}

}
