
public class Assignment11 {

	public static void main(String[] args) {
		String a="XY1XY";
		String b="XY";
		StringBuffer sb=new StringBuffer();
		int pos=0;
		
		while(a.indexOf(b,pos)>=0)
		{
			//When b occurs at the starting
			if(a.indexOf(b,pos)==0) {
				sb.append(a.charAt(b.length()));
			}
			//When b occurs at the end
			else if(a.indexOf(b,pos)==(a.length()-b.length())){
				sb.append(a.charAt(a.length()-b.length()-1));
			}
			//When b occurs in the middle
			else
			{
				sb.append(a.charAt(a.indexOf(b,pos)-1));
				sb.append(a.charAt(a.indexOf(b,pos)+b.length()));
			}
			pos=a.indexOf(b,pos)+1;
		}
		System.out.print(sb);
	}
}