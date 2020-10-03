import java.io.*;
public class ReadAndCopy {

	public static void main(String[] args) throws IOException{
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("D:\\input.txt");
			out=new FileOutputStream("E:\\output.txt");
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally{
			if(in!=null) {
				in.close();
			}
			
			if(out!=null) {
				out.close();
			}
		}
	}

}
