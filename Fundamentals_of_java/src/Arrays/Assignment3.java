/*
 3. Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
 */
package Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,34,56,7};
		int flag=0;
		int i;
		int searchElement=56;
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]==searchElement) {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.print(i);
		}else {
			System.out.print("-1");
		}
	}

}
