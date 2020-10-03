
public class Assignment6 {

	public static void main(String[] args) {
		String a="hi";
		String b="hello";
		StringBuffer sb=new StringBuffer();
		
		if(a.length()>b.length()) {
			sb.append(b+a+b);
		}else {
			sb.append(a+b+a);
		}
		
		System.out.print(sb);
	}

}
