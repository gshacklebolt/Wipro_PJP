
public class Assignment9 {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		int length=(a.length()<b.length()?a.length():b.length());
		int i;
		StringBuffer sb=new StringBuffer();
		
		for(i=0;i<length;i++) {
			sb.append(a.charAt(i));
			sb.append(b.charAt(i));
		}
		
		if(a.length()>i)
			sb.append(a.substring(i));
		if(b.length()>i)
			sb.append(b.substring(i));
		
		System.out.print(sb);
	}

}
