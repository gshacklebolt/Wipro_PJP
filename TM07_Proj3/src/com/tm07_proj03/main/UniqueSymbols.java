package com.tm07_proj03.main;

import java.util.*;

import com.tm07_proj03.bean.Card;

public class UniqueSymbols {

	public static void main(String[] args) {
		HashSet<Card> tree=new HashSet<Card>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=8;i++) {
			Card card=new Card();
			System.out.println("Enter a card :");
			card.setSymbol(sc.next().charAt(0));
			card.setNumber(sc.nextInt());
			
			tree.add(card);
		}
		System.out.println("Four symbols gathered in 8 cards.");
		System.out.println("Cards in Set are :");
		
		
		for (Card card : tree) 
			System.out.println(card);		
		
		sc.close();
	}

}
