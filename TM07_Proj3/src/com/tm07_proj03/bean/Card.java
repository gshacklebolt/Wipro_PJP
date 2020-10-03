package com.tm07_proj03.bean;

public class Card {
	private char symbol;
	private int number;
	
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return symbol+" "+number;
	}
	
	@Override
	public int hashCode() {
        return String.valueOf(symbol).hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Card) {
			Card card = (Card) obj;
			return symbol == card.symbol;
		} else {
			return false;
		}
	}
}
