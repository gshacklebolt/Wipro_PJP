package stream_api.assignment2;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();

		// 1. Add 5 employees objects into an ArrayList
		empList.add(new Employee(1, "Ghazali", 23, "Bhopal"));
		empList.add(new Employee(2, "Sakshi", 22, "Pune"));
		empList.add(new Employee(3, "Ayush Thakur", 22, "Kolkata"));
		empList.add(new Employee(4, "Ritu Raj", 23, "Munger"));
		empList.add(new Employee(5, "Atul Anand", 23, "Pune"));

		// 2. Filter the employee objects whose location is Pune
		Stream<Employee> streamObj = empList.stream().filter(x -> x.getLocation().equals("Pune"));

		// 3. Store them in a separate ArrayList and print their details
		ArrayList<Employee> newEmpList = (ArrayList<Employee>) streamObj.collect(Collectors.toList());
		newEmpList.forEach(System.out::println);
	}
}
