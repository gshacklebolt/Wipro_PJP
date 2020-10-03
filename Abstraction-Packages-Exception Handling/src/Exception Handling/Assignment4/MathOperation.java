package Assignment4;

public class MathOperation {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		int average;
		
		try {
			for(int i=0;i<5;i++) {
				arr[i]=Integer.parseInt(args[i]);
				sum+=arr[i];
			}
			average=sum/5;
			
			System.out.println("Sum: "+sum);
			System.out.println("Average: "+average);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
