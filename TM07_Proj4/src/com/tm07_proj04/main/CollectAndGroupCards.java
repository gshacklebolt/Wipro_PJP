package com.tm07_proj04.main;

import java.util.*;

import com.tm07_proj04.bean.Card;

public class CollectAndGroupCards {

	public static void main(String[] args) {
		TreeMap<Character,ArrayList<Card>> map=new TreeMap<Character,ArrayList<Card>>(); 
		Scanner sc=new Scanner(System.in);
		int noOfCards;
		
		System.out.println("Enter Number of Cards :");
		noOfCards=sc.nextInt();
		
		for(int i=1;i<=noOfCards;i++) {
			Card card=new Card();
			System.out.println("Enter card "+i+":");
			card.setSymbol(sc.next().charAt(0));
			card.setNumber(sc.nextInt());
			
			if(map.containsKey(card.getSymbol())) {
				ArrayList<Card> list=map.get(card.getSymbol());
				list.add(card);
			}else {
				ArrayList<Card> list=new ArrayList<Card>();
				list.add(card);
				map.put(card.getSymbol(), list);
			}
		}
		
		System.out.println("Distinct Symbols are :");
		Iterator<Map.Entry<Character,ArrayList<Card>>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next().getKey()+" ");
		}
		System.out.println();
		
		itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Character,ArrayList<Card>> me=itr.next();
			int sum=0;
			System.out.println("Cards in "+me.getKey()+" Symbol");
			ArrayList<Card> list=me.getValue();
			
			for(Card card:list) {
				System.out.println(card);
				sum+=card.getNumber();
			}
			
			System.out.println("Number of cards : "+list.size());
			System.out.println("Sum of Numbers : "+sum);
		}
		
		sc.close();
	}

}
