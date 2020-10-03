package com.tm07_proj01.bean;

public class Employee implements Comparable<Employee>{
	private String firstName;
	private String lastName;
	private String mobNo;
	private String email;
	private String address;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-30s %-15s\n",this.firstName,this.lastName,this.mobNo,this.email,this.address);
	}
	
	@Override
	public int compareTo(Employee emp) {
		int retVal=firstName.compareTo(emp.firstName);
		if(retVal==0) {
			retVal=lastName.compareTo(emp.lastName);
		}
		
		return retVal;
	}
}
