package optional_class.assignment1;

import java.util.Optional;

public class Assignment1 {

	public static void main(String[] args) {
		String names[] = new String[5];
		// names[0]=new String("Hi my name is Ghazali");

		Optional<String> op = Optional.ofNullable(names[0]);
		if (op.isPresent())
			System.out.println(names[0].length());
	}

}
