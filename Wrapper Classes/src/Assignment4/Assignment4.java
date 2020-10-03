package Assignment4;

public class Assignment4 {

	public static void main(String[] args) {
		Employee employee=new Employee("Ghazali",23);
		Employee clone=employee.getClone();
		
		employee.name="Sundar Pichai";
		employee.age=47;
		
		System.out.println("Name: "+employee.name+", age: "+employee.age);
		System.out.println("Name: "+clone.name+", age: "+clone.age);
	}

}
