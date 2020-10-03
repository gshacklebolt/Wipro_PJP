import java.io.*;
public class CopyCharacterStream {

	public static void main(String[] args) throws IOException{
		File inputFile=new File("D:\\input.txt");
		File outputFile=new File("D:\\output.txt");
		FileReader in=new FileReader(inputFile);
		FileWriter out=new FileWriter(outputFile);
		int c;
		while((c=in.read())!=-1) {
			out.write((char)c);
		}
		in.close();
		out.close();
	}

}
