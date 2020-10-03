package functional_interface.assignment4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4 {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Ghazali",29000));
		empList.add(new Employee(2, "Sakshi",26666));
		empList.add(new Employee(3, "Ayush Thakur",150000));
		empList.add(new Employee(4, "Jyoti", 8000));
		empList.add(new Employee(5, "Ritu Raj",100000));
		empList.add(new Employee(6, "Atul Anand",4000));
		empList.add(new Employee(7, "Md Kasif", 20000));
		empList.add(new Employee(8, "Ajit Roy", 7000));
		empList.add(new Employee(9, "Aarsha", 5000));
		
		Predicate<Employee> predicate=(emp)->emp.getSalary()<10000;
		
		empList.stream().filter(predicate).forEach(x->System.out.println(x.getName()));
	}

}