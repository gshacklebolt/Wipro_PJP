import java.io.*;
public class ConsoleReader {

	public static void main(String[] args) throws IOException{
		InputStreamReader cin=null;
		
		try {
			cin=new InputStreamReader(System.in);
			
			System.out.println("Enter characters, ~ to quit.");
			char c;
			do {
				c=(char) cin.read();
				if(c!='~')
					System.out.print(c);
			}while(c!='~');
		}finally {
			if(cin!=null) {
				cin.close();
			}
		}
	}

}
