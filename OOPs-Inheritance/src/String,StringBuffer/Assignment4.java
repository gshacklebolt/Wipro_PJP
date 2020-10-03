
public class Assignment4 {

	public static void main(String[] args) {
		String str="Apron";
		StringBuffer sb=new StringBuffer();
		
		if(str.length()%2==0) {
			sb.append(str.substring(0,(str.length()/2)));
		}else {
			sb=null;
		}
		
		System.out.print(sb);
	}

}
