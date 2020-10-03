import java.io.*;

public class fileStreamTest {

	public static void main(String[] args) {
		try {
			byte bWrite[]= {11,21,3,40,5};
			OutputStream os=new FileOutputStream("D:/test.txt");
			for(int x=0;x<bWrite.length;x++) {
				os.write(bWrite[x]);
			}
			os.close();
			
			InputStream is=new FileInputStream("D:/test.txt");
			int size=is.available();
			
			for(int i=0;i<size;i++)
			{
				System.out.print((byte)is.read()+" ");
			}
			is.close();
		}
		catch(IOException ex) {
			System.out.print("Exception");
		}
	}

}
