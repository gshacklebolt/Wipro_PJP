package com.tm07_proj06.main;

import java.util.*;

public class StringOperationsWithArrayList {
	
	static ArrayList<String> operate(String S1,String S2){
		
		ArrayList<String> list=new ArrayList<String>();
		StringBuffer sb=new StringBuffer();
		
		//Operation 1
		for(int i=0;i<S1.length();i++) {
			if(i%2==0) {
				sb.append(S2);
			}else {
				sb.append(S1.charAt(i));
			}
		}
		list.add(sb.toString());
		sb=new StringBuffer();
		
		//Operation 2
		if(S1.split(S2,-1).length>2) {
			sb.append(S1.substring(0,S1.lastIndexOf(S2)));
			sb.append(new StringBuffer(S2).reverse());
			sb.append(S1.substring((S1.lastIndexOf(S2)+S2.length()), S1.length()));
		}else {
			sb.append(S1+S2);
		}
		list.add(sb.toString());
		sb=new StringBuffer();
		
		//Operation 3
		if(S1.split(S2,-1).length>2) {
			sb.append(S1.replaceFirst(S2, ""));
		}else
		{
			sb.append(S1);
		}
		list.add(sb.toString());
		sb=new StringBuffer();
		
		//Operation 4
		if(S2.length()%2==0) {
			sb.append(S2.substring(0, S2.length()/2));
			sb.append(S1);
			sb.append(S2.substring(S2.length()/2, S2.length()));
		}
		else {
			sb.append(S2.substring(0, (S2.length()/2)+1));
			sb.append(S1);
			sb.append(S2.substring((S2.length()/2)+1, S2.length()));
		}
		list.add(sb.toString());
		
		//Operation 5
		String[] charList=S2.split("");
		for(int i=0;i<charList.length;i++) {
			if(S1.contains(charList[i])) {
				S1=S1.replace(charList[i], "*");
			}
		}
		list.add(S1);
			
		return list;
	}
	
	public static void main(String[] args) {
		String S1="JAVAJAVA";
		String S2="VA";
		
		ArrayList<String> list=operate(S1,S2);
		
		System.out.print("Output:{");
		for(String str:list) {
			System.out.print("\""+str+"\",");
		}
		System.out.println("\b}");
		
	}

}
