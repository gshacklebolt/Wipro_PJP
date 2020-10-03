package lambda_expressions.assignment2;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Selenophile");
		a1.add("Reticent");
		a1.add("Tannenbaum");
		a1.add("Borborygmi");
		a1.add("Laconic");
		a1.add("Fabulist");
		a1.add("Bibliosmia");
		a1.add("Bimble");
		a1.add("Alexithymia");
		a1.add("Nabob");

		a1.forEach(n -> {
			System.out.println(new StringBuffer(n).reverse());
		});
	}

}
