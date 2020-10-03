package method_reference.assignment3;

public class Assignment3 {

	// Parameterized Constructor
	public Assignment3(int n) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

	public static void main(String[] args) {
		MyReference reference = Assignment3::new;

		System.out.print("interfaceObj.checkprime(53) = ");
		reference.checkprime(53);

		System.out.print("interfaceObj.checkprime(25) = ");
		reference.checkprime(25);
	}

}
