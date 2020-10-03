package Assignment6;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] name=new String[2];
		int sub1;
		int sub2;
		int sub3;
		float[] avg=new float [2];
		
		
		try {
			for(int i=0;i<2;i++) {
				System.out.print("Name: ");
				name[i]=sc.nextLine();
				
				System.out.println("Marks: ");
				sub1=Integer.parseInt(sc.next());
				sub2=Integer.parseInt(sc.next());
				sub3=Integer.parseInt(sc.next());
				sc.nextLine();
				
				if(sub1>100)
					throw new OutOfRangeException(sub1);
				else if(sub1<0)
					throw new NegativeValueException(sub1);
				
				if(sub2>100)
					throw new OutOfRangeException(sub2);
				else if(sub2<0)
					throw new NegativeValueException(sub2);
				
				if(sub3>100)
					throw new OutOfRangeException(sub3);
				else if(sub3<0)
					throw new NegativeValueException(sub3);
				
				//Calculating average marks
				avg[i]=(float)(sub1+sub2+sub3)/3;
			}
			
			//Printing average marks
			System.out.println("Average marks of "+name[0]+" is: "+avg[0]);
			System.out.println("Average marks of "+name[1]+" is: "+avg[1]);
			
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Input: Marks should be Integer");
		}
		catch(OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeValueException e) {
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}

}
