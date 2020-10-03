//2. Write a program to initialize an integer array and find the maximum and minimum value of the array.
package Arrays;

public class Assignment2 {

	public static void main(String[] args) {
		int[] arr=new int[] {55,45,35,65,75,85,25,15,95,5};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
	}

}
