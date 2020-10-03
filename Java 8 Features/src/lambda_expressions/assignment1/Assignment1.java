package lambda_expressions.assignment1;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i <= 25; i++) {
			int random = (int) (Math.random() * 1000);
			a1.add(random);
		}

		a1.forEach(n -> {
			boolean flag = true;
			for (int i = 2; i < (n / 2); i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true && n > 1) {
				System.out.print(n + " ");
			}
		});
	}

}
