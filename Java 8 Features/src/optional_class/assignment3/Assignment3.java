package optional_class.assignment3;

import java.util.Optional;

public class Assignment3 {

	public static void main(String[] args) {
		// For null value condition
		Employee emp1 = null;
		Optional<Employee> op1 = Optional.ofNullable(emp1);
		try {
			System.out.println(op1.orElseThrow(InvalidEmployeeException::new));
		} catch (InvalidEmployeeException e) {
			e.printStackTrace();
		}

		// For NOT NULL condition
		Employee emp2 = new Employee(1, "Ghazali", "Munger, Bihar");
		Optional<Employee> op2 = Optional.ofNullable(emp2);
		try {
			System.out.println(op2.orElseThrow(InvalidEmployeeException::new));
		} catch (InvalidEmployeeException e) {
			e.printStackTrace();
		}
	}

}
