import java.io.*;

public class BufferedConsoleReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer content=new StringBuffer();
		try {
			String str;
			do {
				str=br.readLine();
				if(!str.equals("exit"))
					content.append(str);
			}while(!str.equals("exit"));
		}
		finally {
			if(br!=null)
				br.close();
		}
		System.out.println(content);
	}

}
