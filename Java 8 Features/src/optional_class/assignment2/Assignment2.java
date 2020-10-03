package optional_class.assignment2;

import java.util.Optional;

public class Assignment2 {
	String address;

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();

		Optional<String> op = Optional.ofNullable(obj.address);
		System.out.println(op.orElse("India"));

		obj.address = "Munger, Bihar";
		op = Optional.ofNullable(obj.address);
		System.out.println(op.orElse("India"));
	}

}
