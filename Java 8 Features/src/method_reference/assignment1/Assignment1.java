package method_reference.assignment1;

public class Assignment1 {
	int factorial(int n) {
		if (n < 2) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();

		MyReference reference = obj::factorial;

		System.out.println("reference.getFactorial(7) = " + reference.getFactorial(7));
	}

}
