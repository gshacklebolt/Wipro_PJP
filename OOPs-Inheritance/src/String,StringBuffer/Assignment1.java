
public class Assignment1 {

	public static void main(String[] args) {
		String toCheck="TOD A DOT";
		StringBuffer temp=new StringBuffer(toCheck);
		
		if(toCheck.contentEquals(temp.reverse()))
			System.out.println("Yes, "+toCheck+" is a palindrome");
		else
			System.out.println("No, "+toCheck+" is not a palindrome");
	}
}
