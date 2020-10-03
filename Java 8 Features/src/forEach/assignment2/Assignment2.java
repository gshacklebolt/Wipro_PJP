package forEach.assignment2;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();

		Employee emp1 = new Employee(1, "Ghazali", "Munger, Bihar", 29167);
		empList.add(emp1);

		Employee emp2 = new Employee(2, "Md Kasif", "Ranchi, Jharkhand", 45000);
		empList.add(emp2);

		Employee emp3 = new Employee(3, "Ajit Roy", "Hajipur, Bihar", 32000);
		empList.add(emp3);

		Employee emp4 = new Employee(4, "Tauseef Reza", "Kolkata, West Bengal", 15000);
		empList.add(emp4);

		Employee emp5 = new Employee(5, "Rishabh Shukla", "Varanasi, Uttar Pradesh", 12000);
		empList.add(emp5);

		empList.forEach(emp -> {
			System.out.println(emp);
		});
	}

}
