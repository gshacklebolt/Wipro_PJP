package com.tm06_proj01.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee  implements Serializable{
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return this.getId()+" "+this.getName()+" "+this.getAge()+" "+this.getSalary();
	}
}
