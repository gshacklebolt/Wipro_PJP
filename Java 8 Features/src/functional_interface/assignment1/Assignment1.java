package functional_interface.assignment1;

import java.util.ArrayList;
import java.util.function.Function;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Ghazali", "Bhopal",350000));
		empList.add(new Employee(2, "Sakshi", "Pune",320000));
		empList.add(new Employee(3, "Ayush Thakur", "Kolkata",750000));
		empList.add(new Employee(4, "Ritu Raj", "Munger",1200000));
		empList.add(new Employee(5, "Atul Anand", "Pune",300000));
		
		Function<ArrayList<Employee>,ArrayList<String>> function=(ArrayList<Employee> emp)->{
			ArrayList<String> loc=new ArrayList<String>();
			emp.forEach(x->loc.add(x.getLocation()));
			return loc;
		};
		
		ArrayList<String> locationArray=function.apply(empList);
		locationArray.forEach(System.out::println);
	}

}