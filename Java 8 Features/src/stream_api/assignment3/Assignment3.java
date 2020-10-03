package stream_api.assignment3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		// 1. Add five Student objects into an ArrayList
		students.add(new Student(1, "Md Kasif", 44));
		students.add(new Student(2, "Ghazali", 83));
		students.add(new Student(3, "Ajit Roy", 72));
		students.add(new Student(4, "Jyoti", 90));
		students.add(new Student(5, "Aarsha", 35));

		// 2. Filter the Student objects who have cleared the test with minimum 50 marks.
		Stream<Student> clearStudent = students.stream().filter(x -> x.getMark() >= 50);

		// 3. Get the count of how many have cleared and print it.
		long count = clearStudent.count();
		System.out.println(count);
	}

}
