package Assignment1;

public class Demo2 {
	boolean palindromeCheck(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		
		if(str.equals(sb.toString()))
			return true;
		else
			return false;
	}
}
