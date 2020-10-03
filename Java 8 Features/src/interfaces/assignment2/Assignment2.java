package interfaces.assignment2;

public class Assignment2 {

	public static void main(String[] args) {
		Test t1;
		Test t2;

		t1 = (int x, int y, int z) -> x + y + z;
		t2 = (int x, int y, int z) -> x * y * z;

		System.out.println("t1.myFunction(10, 20, 30) = " + t1.myFunction(10, 20, 30));
		System.out.println("t2.myFunction(10, 20, 30) = " + t2.myFunction(10, 20, 30));
	}

}
