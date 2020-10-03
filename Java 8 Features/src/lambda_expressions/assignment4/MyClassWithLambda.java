package lambda_expressions.assignment4;

public class MyClassWithLambda {

	public static void main(String[] args) {
		WordCount obj = (String str) -> {
			return str.split(" ").length;
		};

		String str = "Hi my name is Ghazali";
		System.out.println(str + " : " + obj.count(str));

		str = "Today is the 14th of August";
		System.out.println(str + " : " + obj.count(str));
	}

}
