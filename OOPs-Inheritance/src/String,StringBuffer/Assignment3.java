
public class Assignment3 {

	public static void main(String[] args) {
		String str="Wipro";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
			sb.append(str.substring(0,2));
		
		System.out.println(sb);
	}

}
