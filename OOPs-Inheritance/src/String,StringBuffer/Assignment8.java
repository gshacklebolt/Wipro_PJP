
public class Assignment8 {

	public static void main(String[] args) {
		String str="ab*cd";
		StringBuffer sb=new StringBuffer(str);
		int pos=str.indexOf('*');
		
		if(pos>0) {
			sb.delete(pos-1, pos+2);
		}else if(pos==0) {
			sb.delete(pos, pos+2);
		}
		
		System.out.print(sb);
	}

}
