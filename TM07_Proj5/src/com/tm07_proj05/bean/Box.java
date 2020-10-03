package com.tm07_proj05.bean;

public class Box implements Comparable<Box>{
	private double length;
	private double width;
	private double height;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return String.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f",length,width,height,(length*width*height));
	}
	
	@Override
	public boolean equals(Object arg0) {
		Box obj=(Box)arg0;
		return (length*width*height)==(obj.length*obj.width*obj.height);
	}
	
	@Override
	public int compareTo(Box obj) {
		if((length*width*height)>(obj.length*obj.width*obj.height))
			return 1;
		else if((length*width*height)<(obj.length*obj.width*obj.height))
			return -1;
		else
			return 0;
	}
}
