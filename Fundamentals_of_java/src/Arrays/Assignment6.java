//6.  Write a program to initialize an array and print them in a sorted order.
package Arrays;

import java.util.Arrays;
public class Assignment6 {

	public static void main(String[] args) {
		int[] arr=new int[] {27,34,12,87,45,2,6,1,99,20};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
