import java.io.*;
public class CreateDirs {

	public static void main(String[] args) throws IOException{
		StringBuffer msg=new StringBuffer();
		String path="D:/JavaFiles/tmp/gshacklebolt/java/bin/";
		String filename;
		File file=new File(path);
		file.mkdirs();
		
		InputStreamReader cin=null;
		try {
			cin=new InputStreamReader(System.in);
			
			System.out.print("Enter the name of file: ");
			char s;
			do {
				s=(char)cin.read();
				if(s!='\n' && s!='\r')
					msg.append(s);
			}while(s!='\n');
			filename=msg.toString();
			
			msg=new StringBuffer();
			System.out.println("Start typing. (Press ~ to exit)");
			do {
				s=(char)cin.read();
				if(s!='~')
					msg.append(s);
			}while(s!='~');
		}finally {
			if(cin!=null)
				cin.close();
		}
		
		OutputStream os;
		try {
			os=new FileOutputStream(path+filename+".txt");
			for(int i=0;i<msg.length();i++) {
				os.write(msg.charAt(i));
			}
			os.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
