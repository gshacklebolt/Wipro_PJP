package com.tm07_proj05.main;

import java.util.*;

import com.tm07_proj05.bean.Box;

public class SetOfBoxes {

	public static void main(String[] args) {
		TreeSet<Box> set=new TreeSet<Box>();
		Scanner sc=new Scanner(System.in);
		int noOfBoxes;
		
		System.out.println("Enter the number of Box");
		noOfBoxes=sc.nextInt();
		
		for(int i=1;i<=noOfBoxes;i++) {
			Box box=new Box();
			System.out.println("Enter the Box "+i+" details");
			
			System.out.println("Enter Length");
			box.setLength(sc.nextDouble());
			System.out.println("Enter Width");
			box.setWidth(sc.nextDouble());
			System.out.println("Enter Height");
			box.setHeight(sc.nextDouble());
			
			set.add(box);
		}
		
		System.out.println("Unique Boxes in the Set are");
		for(Box box:set) {
			System.out.println(box);
		}
		
		sc.close();
	}

}