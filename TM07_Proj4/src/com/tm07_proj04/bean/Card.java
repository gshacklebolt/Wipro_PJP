package com.tm07_proj04.bean;


public class Card implements Comparable<Card>{
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
	public int compareTo(Card arg0) {
		return Character.compare(symbol, arg0.symbol);
	}
}
