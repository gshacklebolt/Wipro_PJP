//4. Initialize an integer array with ascii values and print the corresponding character values in a single row.
package Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		int[] arr= {56,57,65,66,67,93,94,120,121};
		
		for(int i=0;i<arr.length;i++)
			System.out.print((char)arr[i]+" ");
	}

}
