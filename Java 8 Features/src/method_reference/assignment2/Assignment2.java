package method_reference.assignment2;

public class Assignment2 {
	static int digitCount(int n) {
		int noOfDigits = 0;
		while (n > 0) {
			n /= 10;
			noOfDigits++;
		}
		return noOfDigits;
	}

	public static void main(String[] args) {
		MyReference reference = Assignment2::digitCount;

		System.out.println("interfaceObj.countDigits(563578) = " + reference.countDigits(563578));
	}

}
