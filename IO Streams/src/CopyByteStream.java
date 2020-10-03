import java.io.*;
public class CopyByteStream {

	public static void main(String[] args) throws IOException{
		File inputFile=new File("D:\\input.txt");
		File outputFile=new File("D:\\output.txt");
		FileInputStream in=new FileInputStream(inputFile);
		FileOutputStream out=new FileOutputStream(outputFile);
		int c;
		while((c=in.read())!=-1) {
			out.write((char)c);
		}
		in.close();
		out.close();
	}

}
