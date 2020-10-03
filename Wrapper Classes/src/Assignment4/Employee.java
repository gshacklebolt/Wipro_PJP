package Assignment4;

public class Employee implements Cloneable {
	public String name;
	public int age;
	
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Employee getClone() {
		try {
			return (Employee)super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed");
			return this;
		}
	}
	
}
